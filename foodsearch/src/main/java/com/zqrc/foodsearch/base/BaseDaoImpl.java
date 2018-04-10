package com.zqrc.foodsearch.base;


import java.lang.reflect.ParameterizedType;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import com.zqrc.foodsearch.unil.HqlHelper;
import com.zqrc.foodsearch.unil.PageBean;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.transaction.annotation.Transactional;

/**
 * 数据访问接口
 * @author java_one
 *
 * @param <T>
 */
@Transactional
public abstract class BaseDaoImpl<T> implements BaseDao<T>{
	@Resource
	private SessionFactory sessionFactory;
	private Class<T> clazz;

	public BaseDaoImpl() {
		// 反射获取实体类对象
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass(); // 获取当前new的对象的 泛型的父类型
		this.clazz = (Class<T>) pt.getActualTypeArguments()[0]; // 获取第一个类型参数的真实类型
	}

	/**
	 * 获取当前可用的Session
	 * 
	 * @return
	 */
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	/**
	 * 保存实体
	 */
	public void save(T entity) {
		getSession().save(entity);
	}
	/**
	 * 更新实体
	 */
	public void update(T entity) {
		getSession().update(entity);
	}
	/**
	 * 删除实体
	 */
	public void delete(Integer id) {
		Object obj = getById(id);
		if (obj != null) {
			getSession().delete(obj);
		}
	}
	
	/**
	 * 通过id获得实体
	 */
	public T getById(Integer id) {
		if (id == null) {
			return null;
		} else {
			return (T) getSession().get(clazz, id);
		}
	}
	
	/**
	 * 通过  Integer[] 获取 实体 List
	 */
	public List<T> getByIds(Integer[] ids) {
		if (ids == null || ids.length == 0) {
			return Collections.EMPTY_LIST;
		} else {
			return getSession().createQuery(//
					"FROM " + clazz.getSimpleName() + " WHERE id IN (:ids)")//
					.setParameterList("ids", ids)//
					.list();
		}
	}
	
	/**
	 * 获取全部实体
	 */
	public List<T> findAll() {
		return getSession().createQuery(//
				"FROM " + clazz.getSimpleName())//
				.list();
	}

	/**
	 * 分页查询
	 */
	public PageBean getPageBean(int pageNum, int Pagesize, HqlHelper hqlHelper) {
		int pageSize = Pagesize;
		List<Object> parameters = hqlHelper.getParameterList();

		// 查询数据列表
		Query query = getSession().createQuery(hqlHelper.getQueryListHql()); // 生成查询对象
		if (parameters != null) {// 设置参数
			for (int i = 0; i < parameters.size(); i++) {
				query.setParameter(i, parameters.get(i));
			}
		}
		query.setFirstResult((pageNum - 1) * pageSize);
		query.setMaxResults(pageSize);
		List list = query.list(); // 执行查询

		// 查询总记录数
		Query countQuery = getSession().createQuery(hqlHelper.getQueryCountHql()); // 生成查询对象
		if (parameters != null) {// 设置参数
			for (int i = 0; i < parameters.size(); i++) {
				countQuery.setParameter(i, parameters.get(i));
			}
		}
		Integer count = (Integer) countQuery.uniqueResult(); // 执行查询

		return new PageBean(pageNum, pageSize, count.intValue(), list);
	}
	
	/**
	 * 通过hql语句查询 返回list<T>
	 */
	public List<T> findEntitysByHQL(String hql, Object... objects) {
		Query q = getSession().createQuery(hql);
		for(int i = 0 ; i < objects.length ; i ++){
			q.setParameter(i, objects[i]);
		}
		return q.list();
	}
	
	/**
	 * 通过hql语句查询 返回T
	 */
	public T findEntityByHQL(String hql, Object... objects){
		Query q = getSession().createQuery(hql);
		for(int i = 0 ; i < objects.length ; i ++){
			q.setParameter(i, objects[i]);
		}
		return (T) q.uniqueResult();
	}
	
	/**
	 * 按照HQL语句进行批量更新
	 */
	public void batchEntityByHQL(String hql, Object... objects) {
		Query q = getSession().createQuery(hql);
		for(int i = 0 ; i < objects.length ; i ++){
			q.setParameter(i, objects[i]);
		}
		q.executeUpdate();
	}
	
	
	
	/**
	 * 通过原生sql进行查询  可以对视图进行查询
	 * 返回list
	 */
	public List<T> findViewsBySQL(String SQL){
		Session session = getSession();
		List<T> list = session
				.createSQLQuery(//
						SQL)//
				.setResultTransformer(Transformers.aliasToBean(clazz))//
				.list();
		return list;
	}
	
	/**
	 * 通过原生sql进行查询  可以对视图进行查询
	 * 返回唯一结果
	 */
	public T findViewBySQL(String SQL){
		Session session = getSession();
		T entity = (T) session
				.createSQLQuery(//
						SQL)//
				.setResultTransformer(Transformers.aliasToBean(clazz))//
				.uniqueResult();
		return entity;
	}
	
	/**
	 * 执行原生SQL  查询  返回lit
	 */
    public List querysBySql(String SQL) {  
        List<Object[]> list = getSession().createSQLQuery(SQL).list();  
        return list;  
    }  
	/**
	 * 执行原生SQL  查询  返回唯一结果
	 */
    public T queryBySql(String SQL) {  
        T entity = (T) getSession().createSQLQuery(SQL).uniqueResult();  
        return entity;  
    } 
    
    /**
     * 原生SQL执行  更新操作
     */
    public int excuteBySql(String SQL)  
    {  
        int result ;  
        SQLQuery query = this.getSession().createSQLQuery(SQL);  
        result = query.executeUpdate();  
        return result;  
    }  
}
	


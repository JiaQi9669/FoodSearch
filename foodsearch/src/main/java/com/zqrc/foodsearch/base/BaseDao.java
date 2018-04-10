package com.zqrc.foodsearch.base;


import com.zqrc.foodsearch.unil.HqlHelper;
import com.zqrc.foodsearch.unil.PageBean;

import java.util.List;

/**
 * 数据访问接口
 * @author java_one
 *
 * @param <T>
 */
public interface BaseDao<T> {
	/**
	 * 保存实体
	 */
	void save(T entity);

	/**
	 * 删除实体
	 */
	void delete(Integer id);

	/**
	 * 更新实体
	 */
	void update(T entity);

	/**
	 * 按id查询
	 */
	T getById(Integer id);

	/**
	 * 按id查询
	 */
	List<T> getByIds(Integer[] ids);

	/**
	 * 查询
	 */
	List<T> findAll();
	/**
	 * 分页信息，传进来的参数为  起始页，显示多少
	 */
	PageBean getPageBean(int pageNum, int Pagesize, HqlHelper hqlHelper);
	
	/**
	 * 执行hql语句 返回值为空
	 */
	void batchEntityByHQL(String hql, Object... objects);
	
	/**
	 * 执行hql语句  返回T
	 */
	T findEntityByHQL(String hql, Object... objects);
	
	/**
	 * 执行hql语句  返回list<T>
	 */
	List<T> findEntitysByHQL(String hql, Object... objects);
	
	/**
	 * 通过原生sql进行查询  可以对视图进行查询
	 * 返回唯一结果
	 */
	T findViewBySQL(String SQL); 
	
	/**
	 * 通过原生sql进行查询  可以对视图进行查询
	 * 返回list
	 */
	List<T> findViewsBySQL(String SQL);
	
	/**
	 * 执行原生SQL  查询  返回唯一结果
	 */
    T queryBySql(String SQL);
    
	/**
	 * 执行原生SQL  查询 list
	 */
    List querysBySql(String SQL);
    
    /**
     * 原生SQL执行  更新操作
     */
    int excuteBySql(String SQL);
}

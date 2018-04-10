package com.zqrc.foodsearch.base;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;
import java.lang.reflect.ParameterizedType;
import java.util.Map;


import com.zqrc.foodsearch.entity.User;
import com.zqrc.foodsearch.pro.service.StandardService;
import com.zqrc.foodsearch.pro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * BaseAction  
 * 所有Action都必须继承BaseAction
 * 改Action 包含常用的操作
 * 同时注入所有Service
 * 继承ActionSupport
 * 实现 ModelDriven 模型驱动接口
 * @author guo
 *
 */
public abstract class BaseAction<T> extends ActionSupport implements ModelDriven<T>{
//	模型驱动
	protected T model;
	/**
	 *获取模型驱动
	 */
	public T getModel(){
		return model;
	}
	
//	构造方法 通过反射获取实体类对象
	public BaseAction(){
		try{
//			通过反射获取实体类对象
			ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
			Class<T> clazz = (Class<T>) pt.getActualTypeArguments()[0];
			model = clazz.newInstance();
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 	分页算法
	 */
	protected int pageNum = 1;//	当前页
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	
	/**
	 * 获取当前登录用户
	 */
	public User getAdmin(){
		return (User) ActionContext.getContext().getSession().get("admin");
	}
//	/**
//	 * 放置登录用户
//	 */
	public void setAdmin(User user){
		ActionContext.getContext().getSession().put("admin", user);
	}
	
	
	/**
	 * 获取session
	 */
	public Map<String, Object> getActionSession(){
		return ActionContext.getContext().getSession();
	}
	/**
	 * 获取值栈
	 */
	public ValueStack getActionValueStack(){
		return ActionContext.getContext().getValueStack();
	}
	
	/**
	 * 放置提示信息
	 */
	public void setMessage(String msg){
		getActionValueStack().set("msg", msg);
	}

//	注入service
	@Autowired
	protected UserService userService;
	@Autowired
	protected StandardService standardService;
}

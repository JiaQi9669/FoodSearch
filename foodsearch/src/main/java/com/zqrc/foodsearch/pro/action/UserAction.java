package com.zqrc.foodsearch.pro.action;

import com.opensymphony.xwork2.ActionContext;
import com.zqrc.foodsearch.base.BaseAction;
import com.zqrc.foodsearch.entity.Standard;
import com.zqrc.foodsearch.entity.User;
import com.zqrc.foodsearch.pro.service.UserService;
import com.zqrc.foodsearch.unil.HqlHelper;
import com.zqrc.foodsearch.unil.PageBean;
import org.apache.struts2.ServletActionContext;

/**
 * Created by JiaQi on 2018/4/10.
 */
public class UserAction extends BaseAction<User> {
    /**
     * 登陆操作
     */
    public String login(){
//        查询登陆用户
        User user = userService.findByUNPW(getModel().getUserName(),getModel().getPassword());
        if(user != null){
            setAdmin(user);
            return "toIndex";
        }else{
            return "toLogin";
        }
    }

    /**
     * 跳转至首页 main.jsp
     */
    public String toMain(){
        return "toMain";
    }

    /**
     * 跳转至main_table
     */
    public String toMainTable(){
        HqlHelper hqlHelper = new HqlHelper(Standard.class,"s");
        hqlHelper.addWhereCondition("s.type = ?",1);
        PageBean pageBean = standardService.getPageBean(pageNum,10,hqlHelper);
        pageBean.setCurrentPage(pageNum);
        ServletActionContext.getContext().getValueStack().set("pageBean",pageBean);
        System.out.print(pageBean.getRecordList().size());
        return "toMainTable";
    }
}

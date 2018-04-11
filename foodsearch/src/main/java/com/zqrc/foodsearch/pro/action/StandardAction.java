package com.zqrc.foodsearch.pro.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.zqrc.foodsearch.base.BaseAction;
import com.zqrc.foodsearch.entity.Standard;
import com.zqrc.foodsearch.pro.service.StandardService;

/**
 * Created by JiaQi on 2018/4/11.
 */
public class StandardAction extends BaseAction<Standard> {

    /**
     * 通过UUID查询 standard
     */
    public String findStandard(){
        Standard standard = standardService.findEntityByHQL("from Standard where uuid = ?",getModel().getUuid());
        ActionContext.getContext().getValueStack().set("standard",standard);
        return "toShowTable";
    }

    /**
     * 通过Id删除
     */
    public String delById(){
        standardService.delete(getModel().getId());
        return "toMainTable";
    }

    /**
     * 跳转到新增界面
     */
    public String toAddStandard(){
        return "toAddStandard";
    }

    /**
     * 新增
     */
    public String addStandard(){
        standardService.save(getModel());
        return "toAddStandard";
    }
}

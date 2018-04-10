package com.zqrc.foodsearch.pro.service;

import com.zqrc.foodsearch.base.BaseDaoImpl;
import com.zqrc.foodsearch.entity.Standard;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by JiaQi on 2018/4/10.
 */
@Service
@Transactional
public class StandardServiceImpl extends BaseDaoImpl<Standard> implements StandardService {
}

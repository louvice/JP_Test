package com.itheima.service;

import com.itheima.entity.EmpQueryParam;
import com.itheima.entity.PageBean;

public interface EmpService {
    /**
     * 分页查询
     * @return
     */
    PageBean page(EmpQueryParam param);

}

package com.macro.mall.service;

import com.macro.mall.model.CmsPrefrenceArea;

import java.util.List;

/**
 * 优选专区管理Service
 * Created by qiulin.
 */
public interface CmsPrefrenceAreaService {
    /**
     * 获取所有优选专区
     */
    List<CmsPrefrenceArea> listAll();
}

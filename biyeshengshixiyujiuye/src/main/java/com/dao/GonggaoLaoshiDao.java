package com.dao;

import com.entity.GonggaoLaoshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GonggaoLaoshiView;

/**
 * 老师发布的公告 Dao 接口
 *
 * @author 
 */
public interface GonggaoLaoshiDao extends BaseMapper<GonggaoLaoshiEntity> {

   List<GonggaoLaoshiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

package com.dao;

import com.entity.DiscussjingpaishangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjingpaishangpinVO;
import com.entity.view.DiscussjingpaishangpinView;


/**
 * 竞拍商品评论表
 * 
 * @author 
 * @email 
 * @date 2022-05-03 10:36:55
 */
public interface DiscussjingpaishangpinDao extends BaseMapper<DiscussjingpaishangpinEntity> {
	
	List<DiscussjingpaishangpinVO> selectListVO(@Param("ew") Wrapper<DiscussjingpaishangpinEntity> wrapper);
	
	DiscussjingpaishangpinVO selectVO(@Param("ew") Wrapper<DiscussjingpaishangpinEntity> wrapper);
	
	List<DiscussjingpaishangpinView> selectListView(@Param("ew") Wrapper<DiscussjingpaishangpinEntity> wrapper);

	List<DiscussjingpaishangpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjingpaishangpinEntity> wrapper);
	
	DiscussjingpaishangpinView selectView(@Param("ew") Wrapper<DiscussjingpaishangpinEntity> wrapper);
	

}

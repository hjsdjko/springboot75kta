package com.dao;

import com.entity.JingpaishangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingpaishangpinVO;
import com.entity.view.JingpaishangpinView;


/**
 * 竞拍商品
 * 
 * @author 
 * @email 
 * @date 2022-05-03 10:36:54
 */
public interface JingpaishangpinDao extends BaseMapper<JingpaishangpinEntity> {
	
	List<JingpaishangpinVO> selectListVO(@Param("ew") Wrapper<JingpaishangpinEntity> wrapper);
	
	JingpaishangpinVO selectVO(@Param("ew") Wrapper<JingpaishangpinEntity> wrapper);
	
	List<JingpaishangpinView> selectListView(@Param("ew") Wrapper<JingpaishangpinEntity> wrapper);

	List<JingpaishangpinView> selectListView(Pagination page,@Param("ew") Wrapper<JingpaishangpinEntity> wrapper);
	
	JingpaishangpinView selectView(@Param("ew") Wrapper<JingpaishangpinEntity> wrapper);
	

}

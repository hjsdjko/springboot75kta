package com.dao;

import com.entity.PingjiadingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PingjiadingdanVO;
import com.entity.view.PingjiadingdanView;


/**
 * 评价订单
 * 
 * @author 
 * @email 
 * @date 2022-05-03 10:36:55
 */
public interface PingjiadingdanDao extends BaseMapper<PingjiadingdanEntity> {
	
	List<PingjiadingdanVO> selectListVO(@Param("ew") Wrapper<PingjiadingdanEntity> wrapper);
	
	PingjiadingdanVO selectVO(@Param("ew") Wrapper<PingjiadingdanEntity> wrapper);
	
	List<PingjiadingdanView> selectListView(@Param("ew") Wrapper<PingjiadingdanEntity> wrapper);

	List<PingjiadingdanView> selectListView(Pagination page,@Param("ew") Wrapper<PingjiadingdanEntity> wrapper);
	
	PingjiadingdanView selectView(@Param("ew") Wrapper<PingjiadingdanEntity> wrapper);
	

}

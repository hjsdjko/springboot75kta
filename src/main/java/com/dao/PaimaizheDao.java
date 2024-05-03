package com.dao;

import com.entity.PaimaizheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PaimaizheVO;
import com.entity.view.PaimaizheView;


/**
 * 拍卖者
 * 
 * @author 
 * @email 
 * @date 2022-05-03 10:36:54
 */
public interface PaimaizheDao extends BaseMapper<PaimaizheEntity> {
	
	List<PaimaizheVO> selectListVO(@Param("ew") Wrapper<PaimaizheEntity> wrapper);
	
	PaimaizheVO selectVO(@Param("ew") Wrapper<PaimaizheEntity> wrapper);
	
	List<PaimaizheView> selectListView(@Param("ew") Wrapper<PaimaizheEntity> wrapper);

	List<PaimaizheView> selectListView(Pagination page,@Param("ew") Wrapper<PaimaizheEntity> wrapper);
	
	PaimaizheView selectView(@Param("ew") Wrapper<PaimaizheEntity> wrapper);
	

}

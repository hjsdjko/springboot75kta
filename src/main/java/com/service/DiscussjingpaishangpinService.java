package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjingpaishangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjingpaishangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjingpaishangpinView;


/**
 * 竞拍商品评论表
 *
 * @author 
 * @email 
 * @date 2022-05-03 10:36:55
 */
public interface DiscussjingpaishangpinService extends IService<DiscussjingpaishangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjingpaishangpinVO> selectListVO(Wrapper<DiscussjingpaishangpinEntity> wrapper);
   	
   	DiscussjingpaishangpinVO selectVO(@Param("ew") Wrapper<DiscussjingpaishangpinEntity> wrapper);
   	
   	List<DiscussjingpaishangpinView> selectListView(Wrapper<DiscussjingpaishangpinEntity> wrapper);
   	
   	DiscussjingpaishangpinView selectView(@Param("ew") Wrapper<DiscussjingpaishangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjingpaishangpinEntity> wrapper);
   	

}


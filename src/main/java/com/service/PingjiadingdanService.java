package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PingjiadingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PingjiadingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PingjiadingdanView;


/**
 * 评价订单
 *
 * @author 
 * @email 
 * @date 2022-05-03 10:36:55
 */
public interface PingjiadingdanService extends IService<PingjiadingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PingjiadingdanVO> selectListVO(Wrapper<PingjiadingdanEntity> wrapper);
   	
   	PingjiadingdanVO selectVO(@Param("ew") Wrapper<PingjiadingdanEntity> wrapper);
   	
   	List<PingjiadingdanView> selectListView(Wrapper<PingjiadingdanEntity> wrapper);
   	
   	PingjiadingdanView selectView(@Param("ew") Wrapper<PingjiadingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PingjiadingdanEntity> wrapper);
   	

}


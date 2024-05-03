package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.PingjiadingdanDao;
import com.entity.PingjiadingdanEntity;
import com.service.PingjiadingdanService;
import com.entity.vo.PingjiadingdanVO;
import com.entity.view.PingjiadingdanView;

@Service("pingjiadingdanService")
public class PingjiadingdanServiceImpl extends ServiceImpl<PingjiadingdanDao, PingjiadingdanEntity> implements PingjiadingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PingjiadingdanEntity> page = this.selectPage(
                new Query<PingjiadingdanEntity>(params).getPage(),
                new EntityWrapper<PingjiadingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PingjiadingdanEntity> wrapper) {
		  Page<PingjiadingdanView> page =new Query<PingjiadingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PingjiadingdanVO> selectListVO(Wrapper<PingjiadingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PingjiadingdanVO selectVO(Wrapper<PingjiadingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PingjiadingdanView> selectListView(Wrapper<PingjiadingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PingjiadingdanView selectView(Wrapper<PingjiadingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

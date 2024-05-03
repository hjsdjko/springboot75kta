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


import com.dao.DiscussjingpaishangpinDao;
import com.entity.DiscussjingpaishangpinEntity;
import com.service.DiscussjingpaishangpinService;
import com.entity.vo.DiscussjingpaishangpinVO;
import com.entity.view.DiscussjingpaishangpinView;

@Service("discussjingpaishangpinService")
public class DiscussjingpaishangpinServiceImpl extends ServiceImpl<DiscussjingpaishangpinDao, DiscussjingpaishangpinEntity> implements DiscussjingpaishangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjingpaishangpinEntity> page = this.selectPage(
                new Query<DiscussjingpaishangpinEntity>(params).getPage(),
                new EntityWrapper<DiscussjingpaishangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjingpaishangpinEntity> wrapper) {
		  Page<DiscussjingpaishangpinView> page =new Query<DiscussjingpaishangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjingpaishangpinVO> selectListVO(Wrapper<DiscussjingpaishangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjingpaishangpinVO selectVO(Wrapper<DiscussjingpaishangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjingpaishangpinView> selectListView(Wrapper<DiscussjingpaishangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjingpaishangpinView selectView(Wrapper<DiscussjingpaishangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

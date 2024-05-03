package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscussjingpaishangpinEntity;
import com.entity.view.DiscussjingpaishangpinView;

import com.service.DiscussjingpaishangpinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 竞拍商品评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-03 10:36:55
 */
@RestController
@RequestMapping("/discussjingpaishangpin")
public class DiscussjingpaishangpinController {
    @Autowired
    private DiscussjingpaishangpinService discussjingpaishangpinService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussjingpaishangpinEntity discussjingpaishangpin,
		HttpServletRequest request){
        EntityWrapper<DiscussjingpaishangpinEntity> ew = new EntityWrapper<DiscussjingpaishangpinEntity>();
		PageUtils page = discussjingpaishangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussjingpaishangpin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussjingpaishangpinEntity discussjingpaishangpin, 
		HttpServletRequest request){
        EntityWrapper<DiscussjingpaishangpinEntity> ew = new EntityWrapper<DiscussjingpaishangpinEntity>();
		PageUtils page = discussjingpaishangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussjingpaishangpin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussjingpaishangpinEntity discussjingpaishangpin){
       	EntityWrapper<DiscussjingpaishangpinEntity> ew = new EntityWrapper<DiscussjingpaishangpinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussjingpaishangpin, "discussjingpaishangpin")); 
        return R.ok().put("data", discussjingpaishangpinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussjingpaishangpinEntity discussjingpaishangpin){
        EntityWrapper< DiscussjingpaishangpinEntity> ew = new EntityWrapper< DiscussjingpaishangpinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussjingpaishangpin, "discussjingpaishangpin")); 
		DiscussjingpaishangpinView discussjingpaishangpinView =  discussjingpaishangpinService.selectView(ew);
		return R.ok("查询竞拍商品评论表成功").put("data", discussjingpaishangpinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussjingpaishangpinEntity discussjingpaishangpin = discussjingpaishangpinService.selectById(id);
        return R.ok().put("data", discussjingpaishangpin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussjingpaishangpinEntity discussjingpaishangpin = discussjingpaishangpinService.selectById(id);
        return R.ok().put("data", discussjingpaishangpin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussjingpaishangpinEntity discussjingpaishangpin, HttpServletRequest request){
    	discussjingpaishangpin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussjingpaishangpin);
        discussjingpaishangpinService.insert(discussjingpaishangpin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussjingpaishangpinEntity discussjingpaishangpin, HttpServletRequest request){
    	discussjingpaishangpin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussjingpaishangpin);
        discussjingpaishangpinService.insert(discussjingpaishangpin);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DiscussjingpaishangpinEntity discussjingpaishangpin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussjingpaishangpin);
        discussjingpaishangpinService.updateById(discussjingpaishangpin);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussjingpaishangpinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscussjingpaishangpinEntity> wrapper = new EntityWrapper<DiscussjingpaishangpinEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discussjingpaishangpinService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}

package com.entity.view;

import com.entity.JingpaishangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 竞拍商品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-03 10:36:54
 */
@TableName("jingpaishangpin")
public class JingpaishangpinView  extends JingpaishangpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JingpaishangpinView(){
	}
 
 	public JingpaishangpinView(JingpaishangpinEntity jingpaishangpinEntity){
 	try {
			BeanUtils.copyProperties(this, jingpaishangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

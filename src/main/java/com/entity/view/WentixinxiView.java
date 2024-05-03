package com.entity.view;

import com.entity.WentixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 问题信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-27 16:31:40
 */
@TableName("wentixinxi")
public class WentixinxiView  extends WentixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WentixinxiView(){
	}
 
 	public WentixinxiView(WentixinxiEntity wentixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, wentixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

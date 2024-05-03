package com.entity.view;

import com.entity.WentibaobiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 问题报表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-27 16:31:40
 */
@TableName("wentibaobiao")
public class WentibaobiaoView  extends WentibaobiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WentibaobiaoView(){
	}
 
 	public WentibaobiaoView(WentibaobiaoEntity wentibaobiaoEntity){
 	try {
			BeanUtils.copyProperties(this, wentibaobiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

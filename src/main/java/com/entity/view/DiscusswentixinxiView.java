package com.entity.view;

import com.entity.DiscusswentixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 问题信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-27 16:31:40
 */
@TableName("discusswentixinxi")
public class DiscusswentixinxiView  extends DiscusswentixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusswentixinxiView(){
	}
 
 	public DiscusswentixinxiView(DiscusswentixinxiEntity discusswentixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discusswentixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

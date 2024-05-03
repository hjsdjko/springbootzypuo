package com.entity.view;

import com.entity.DiscussjishuwendangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 技术文档评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-27 16:31:40
 */
@TableName("discussjishuwendang")
public class DiscussjishuwendangView  extends DiscussjishuwendangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjishuwendangView(){
	}
 
 	public DiscussjishuwendangView(DiscussjishuwendangEntity discussjishuwendangEntity){
 	try {
			BeanUtils.copyProperties(this, discussjishuwendangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

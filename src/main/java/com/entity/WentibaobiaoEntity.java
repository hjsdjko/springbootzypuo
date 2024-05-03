package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 问题报表
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-27 16:31:40
 */
@TableName("wentibaobiao")
public class WentibaobiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WentibaobiaoEntity() {
		
	}
	
	public WentibaobiaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 报表编号
	 */
					
	private String baobiaobianhao;
	
	/**
	 * 问题类型
	 */
					
	private String wentileixing;
	
	/**
	 * 新增数量
	 */
					
	private Integer xinzengshuliang;
	
	/**
	 * 解决数量
	 */
					
	private Integer jiejueshuliang;
	
	/**
	 * 统计日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date tongjiriqi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：报表编号
	 */
	public void setBaobiaobianhao(String baobiaobianhao) {
		this.baobiaobianhao = baobiaobianhao;
	}
	/**
	 * 获取：报表编号
	 */
	public String getBaobiaobianhao() {
		return baobiaobianhao;
	}
	/**
	 * 设置：问题类型
	 */
	public void setWentileixing(String wentileixing) {
		this.wentileixing = wentileixing;
	}
	/**
	 * 获取：问题类型
	 */
	public String getWentileixing() {
		return wentileixing;
	}
	/**
	 * 设置：新增数量
	 */
	public void setXinzengshuliang(Integer xinzengshuliang) {
		this.xinzengshuliang = xinzengshuliang;
	}
	/**
	 * 获取：新增数量
	 */
	public Integer getXinzengshuliang() {
		return xinzengshuliang;
	}
	/**
	 * 设置：解决数量
	 */
	public void setJiejueshuliang(Integer jiejueshuliang) {
		this.jiejueshuliang = jiejueshuliang;
	}
	/**
	 * 获取：解决数量
	 */
	public Integer getJiejueshuliang() {
		return jiejueshuliang;
	}
	/**
	 * 设置：统计日期
	 */
	public void setTongjiriqi(Date tongjiriqi) {
		this.tongjiriqi = tongjiriqi;
	}
	/**
	 * 获取：统计日期
	 */
	public Date getTongjiriqi() {
		return tongjiriqi;
	}

}

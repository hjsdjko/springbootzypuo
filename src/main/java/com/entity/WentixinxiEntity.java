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
 * 问题信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-27 16:31:40
 */
@TableName("wentixinxi")
public class WentixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WentixinxiEntity() {
		
	}
	
	public WentixinxiEntity(T t) {
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
	 * 问题名称
	 */
					
	private String wentimingcheng;
	
	/**
	 * 问题类型
	 */
					
	private String wentileixing;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 问题状态
	 */
					
	private String wentizhuangtai;
	
	/**
	 * 问题描述
	 */
					
	private String wentimiaoshu;
	
	/**
	 * 反馈时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fankuishijian;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 电话
	 */
					
	private String dianhua;
	
	
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
	 * 设置：问题名称
	 */
	public void setWentimingcheng(String wentimingcheng) {
		this.wentimingcheng = wentimingcheng;
	}
	/**
	 * 获取：问题名称
	 */
	public String getWentimingcheng() {
		return wentimingcheng;
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
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
	/**
	 * 设置：问题状态
	 */
	public void setWentizhuangtai(String wentizhuangtai) {
		this.wentizhuangtai = wentizhuangtai;
	}
	/**
	 * 获取：问题状态
	 */
	public String getWentizhuangtai() {
		return wentizhuangtai;
	}
	/**
	 * 设置：问题描述
	 */
	public void setWentimiaoshu(String wentimiaoshu) {
		this.wentimiaoshu = wentimiaoshu;
	}
	/**
	 * 获取：问题描述
	 */
	public String getWentimiaoshu() {
		return wentimiaoshu;
	}
	/**
	 * 设置：反馈时间
	 */
	public void setFankuishijian(Date fankuishijian) {
		this.fankuishijian = fankuishijian;
	}
	/**
	 * 获取：反馈时间
	 */
	public Date getFankuishijian() {
		return fankuishijian;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：电话
	 */
	public void setDianhua(String dianhua) {
		this.dianhua = dianhua;
	}
	/**
	 * 获取：电话
	 */
	public String getDianhua() {
		return dianhua;
	}

}

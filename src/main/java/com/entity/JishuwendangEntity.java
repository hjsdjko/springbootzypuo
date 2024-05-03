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
 * 技术文档
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-27 16:31:40
 */
@TableName("jishuwendang")
public class JishuwendangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JishuwendangEntity() {
		
	}
	
	public JishuwendangEntity(T t) {
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
	 * 文档编号
	 */
					
	private String wendangbianhao;
	
	/**
	 * 文档名称
	 */
					
	private String wendangmingcheng;
	
	/**
	 * 文档图片
	 */
					
	private String wendangtupian;
	
	/**
	 * 技术文档
	 */
					
	private String jishuwendang;
	
	/**
	 * 上传时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shangchuanshijian;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	
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
	 * 设置：文档编号
	 */
	public void setWendangbianhao(String wendangbianhao) {
		this.wendangbianhao = wendangbianhao;
	}
	/**
	 * 获取：文档编号
	 */
	public String getWendangbianhao() {
		return wendangbianhao;
	}
	/**
	 * 设置：文档名称
	 */
	public void setWendangmingcheng(String wendangmingcheng) {
		this.wendangmingcheng = wendangmingcheng;
	}
	/**
	 * 获取：文档名称
	 */
	public String getWendangmingcheng() {
		return wendangmingcheng;
	}
	/**
	 * 设置：文档图片
	 */
	public void setWendangtupian(String wendangtupian) {
		this.wendangtupian = wendangtupian;
	}
	/**
	 * 获取：文档图片
	 */
	public String getWendangtupian() {
		return wendangtupian;
	}
	/**
	 * 设置：技术文档
	 */
	public void setJishuwendang(String jishuwendang) {
		this.jishuwendang = jishuwendang;
	}
	/**
	 * 获取：技术文档
	 */
	public String getJishuwendang() {
		return jishuwendang;
	}
	/**
	 * 设置：上传时间
	 */
	public void setShangchuanshijian(Date shangchuanshijian) {
		this.shangchuanshijian = shangchuanshijian;
	}
	/**
	 * 获取：上传时间
	 */
	public Date getShangchuanshijian() {
		return shangchuanshijian;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}

}

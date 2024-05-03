package com.entity.model;

import com.entity.JishuwendangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 技术文档
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-27 16:31:40
 */
public class JishuwendangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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

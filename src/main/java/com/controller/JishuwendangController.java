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

import com.entity.JishuwendangEntity;
import com.entity.view.JishuwendangView;

import com.service.JishuwendangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 技术文档
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-27 16:31:40
 */
@RestController
@RequestMapping("/jishuwendang")
public class JishuwendangController {
    @Autowired
    private JishuwendangService jishuwendangService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JishuwendangEntity jishuwendang,
		HttpServletRequest request){
        EntityWrapper<JishuwendangEntity> ew = new EntityWrapper<JishuwendangEntity>();
		PageUtils page = jishuwendangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jishuwendang), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JishuwendangEntity jishuwendang, 
		HttpServletRequest request){
        EntityWrapper<JishuwendangEntity> ew = new EntityWrapper<JishuwendangEntity>();
		PageUtils page = jishuwendangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jishuwendang), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JishuwendangEntity jishuwendang){
       	EntityWrapper<JishuwendangEntity> ew = new EntityWrapper<JishuwendangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jishuwendang, "jishuwendang")); 
        return R.ok().put("data", jishuwendangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JishuwendangEntity jishuwendang){
        EntityWrapper< JishuwendangEntity> ew = new EntityWrapper< JishuwendangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jishuwendang, "jishuwendang")); 
		JishuwendangView jishuwendangView =  jishuwendangService.selectView(ew);
		return R.ok("查询技术文档成功").put("data", jishuwendangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JishuwendangEntity jishuwendang = jishuwendangService.selectById(id);
        return R.ok().put("data", jishuwendang);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JishuwendangEntity jishuwendang = jishuwendangService.selectById(id);
        return R.ok().put("data", jishuwendang);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        JishuwendangEntity jishuwendang = jishuwendangService.selectById(id);
        if(type.equals("1")) {
        	jishuwendang.setThumbsupnum(jishuwendang.getThumbsupnum()+1);
        } else {
        	jishuwendang.setCrazilynum(jishuwendang.getCrazilynum()+1);
        }
        jishuwendangService.updateById(jishuwendang);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JishuwendangEntity jishuwendang, HttpServletRequest request){
    	jishuwendang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jishuwendang);
        jishuwendangService.insert(jishuwendang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JishuwendangEntity jishuwendang, HttpServletRequest request){
    	jishuwendang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jishuwendang);
        jishuwendangService.insert(jishuwendang);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JishuwendangEntity jishuwendang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jishuwendang);
        jishuwendangService.updateById(jishuwendang);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jishuwendangService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<JishuwendangEntity> wrapper = new EntityWrapper<JishuwendangEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = jishuwendangService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}

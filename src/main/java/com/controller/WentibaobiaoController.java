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

import com.entity.WentibaobiaoEntity;
import com.entity.view.WentibaobiaoView;

import com.service.WentibaobiaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 问题报表
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-27 16:31:40
 */
@RestController
@RequestMapping("/wentibaobiao")
public class WentibaobiaoController {
    @Autowired
    private WentibaobiaoService wentibaobiaoService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WentibaobiaoEntity wentibaobiao,
                @RequestParam(required = false) Double jiejueshuliangstart,
                @RequestParam(required = false) Double jiejueshuliangend,
		HttpServletRequest request){
        EntityWrapper<WentibaobiaoEntity> ew = new EntityWrapper<WentibaobiaoEntity>();
                if(jiejueshuliangstart!=null) ew.ge("jiejueshuliang", jiejueshuliangstart);
                if(jiejueshuliangend!=null) ew.le("jiejueshuliang", jiejueshuliangend);
		PageUtils page = wentibaobiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wentibaobiao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WentibaobiaoEntity wentibaobiao, 
                @RequestParam(required = false) Double jiejueshuliangstart,
                @RequestParam(required = false) Double jiejueshuliangend,
		HttpServletRequest request){
        EntityWrapper<WentibaobiaoEntity> ew = new EntityWrapper<WentibaobiaoEntity>();
                if(jiejueshuliangstart!=null) ew.ge("jiejueshuliang", jiejueshuliangstart);
                if(jiejueshuliangend!=null) ew.le("jiejueshuliang", jiejueshuliangend);
		PageUtils page = wentibaobiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wentibaobiao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WentibaobiaoEntity wentibaobiao){
       	EntityWrapper<WentibaobiaoEntity> ew = new EntityWrapper<WentibaobiaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wentibaobiao, "wentibaobiao")); 
        return R.ok().put("data", wentibaobiaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WentibaobiaoEntity wentibaobiao){
        EntityWrapper< WentibaobiaoEntity> ew = new EntityWrapper< WentibaobiaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wentibaobiao, "wentibaobiao")); 
		WentibaobiaoView wentibaobiaoView =  wentibaobiaoService.selectView(ew);
		return R.ok("查询问题报表成功").put("data", wentibaobiaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WentibaobiaoEntity wentibaobiao = wentibaobiaoService.selectById(id);
        return R.ok().put("data", wentibaobiao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WentibaobiaoEntity wentibaobiao = wentibaobiaoService.selectById(id);
        return R.ok().put("data", wentibaobiao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WentibaobiaoEntity wentibaobiao, HttpServletRequest request){
    	wentibaobiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wentibaobiao);
        wentibaobiaoService.insert(wentibaobiao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WentibaobiaoEntity wentibaobiao, HttpServletRequest request){
    	wentibaobiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wentibaobiao);
        wentibaobiaoService.insert(wentibaobiao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody WentibaobiaoEntity wentibaobiao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wentibaobiao);
        wentibaobiaoService.updateById(wentibaobiao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wentibaobiaoService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<WentibaobiaoEntity> wrapper = new EntityWrapper<WentibaobiaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = wentibaobiaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	






    /**
     * （按值统计）
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}")
    public R value(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        EntityWrapper<WentibaobiaoEntity> ew = new EntityWrapper<WentibaobiaoEntity>();
        List<Map<String, Object>> result = wentibaobiaoService.selectValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * （按值统计）时间统计类型
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}/{timeStatType}")
    public R valueDay(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName, @PathVariable("timeStatType") String timeStatType,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        params.put("timeStatType", timeStatType);
        EntityWrapper<WentibaobiaoEntity> ew = new EntityWrapper<WentibaobiaoEntity>();
        List<Map<String, Object>> result = wentibaobiaoService.selectTimeStatValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * 分组统计
     */
    @RequestMapping("/group/{columnName}")
    public R group(@PathVariable("columnName") String columnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("column", columnName);
        EntityWrapper<WentibaobiaoEntity> ew = new EntityWrapper<WentibaobiaoEntity>();
        List<Map<String, Object>> result = wentibaobiaoService.selectGroup(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

}

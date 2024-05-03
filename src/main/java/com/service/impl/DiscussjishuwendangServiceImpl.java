package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussjishuwendangDao;
import com.entity.DiscussjishuwendangEntity;
import com.service.DiscussjishuwendangService;
import com.entity.vo.DiscussjishuwendangVO;
import com.entity.view.DiscussjishuwendangView;

@Service("discussjishuwendangService")
public class DiscussjishuwendangServiceImpl extends ServiceImpl<DiscussjishuwendangDao, DiscussjishuwendangEntity> implements DiscussjishuwendangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjishuwendangEntity> page = this.selectPage(
                new Query<DiscussjishuwendangEntity>(params).getPage(),
                new EntityWrapper<DiscussjishuwendangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjishuwendangEntity> wrapper) {
		  Page<DiscussjishuwendangView> page =new Query<DiscussjishuwendangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjishuwendangVO> selectListVO(Wrapper<DiscussjishuwendangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjishuwendangVO selectVO(Wrapper<DiscussjishuwendangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjishuwendangView> selectListView(Wrapper<DiscussjishuwendangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjishuwendangView selectView(Wrapper<DiscussjishuwendangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

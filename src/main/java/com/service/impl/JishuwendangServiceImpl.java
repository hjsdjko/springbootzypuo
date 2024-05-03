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


import com.dao.JishuwendangDao;
import com.entity.JishuwendangEntity;
import com.service.JishuwendangService;
import com.entity.vo.JishuwendangVO;
import com.entity.view.JishuwendangView;

@Service("jishuwendangService")
public class JishuwendangServiceImpl extends ServiceImpl<JishuwendangDao, JishuwendangEntity> implements JishuwendangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JishuwendangEntity> page = this.selectPage(
                new Query<JishuwendangEntity>(params).getPage(),
                new EntityWrapper<JishuwendangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JishuwendangEntity> wrapper) {
		  Page<JishuwendangView> page =new Query<JishuwendangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JishuwendangVO> selectListVO(Wrapper<JishuwendangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JishuwendangVO selectVO(Wrapper<JishuwendangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JishuwendangView> selectListView(Wrapper<JishuwendangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JishuwendangView selectView(Wrapper<JishuwendangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

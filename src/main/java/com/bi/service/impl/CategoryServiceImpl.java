package com.bi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bi.mapper.CategoryMapper;
import com.bi.pojo.Category;
import com.bi.service.CategoryService;

@Service
public class CategoryServiceImpl  implements CategoryService{
	@Autowired
	CategoryMapper categoryMapper;
	
	
	public List<Category> list(){
		return categoryMapper.list();
	}


}

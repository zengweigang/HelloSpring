package com.gang.dev.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gang.dev.dao.BlogDao;
import com.gang.dev.service.BlogService;
@Service
public class BlogServiceImpl implements BlogService {
	@Autowired
	BlogDao dao;
	@Override
	public int getBlogCount() {
		// TODO Auto-generated method stub
		return dao.getBlogCount();
	}

}

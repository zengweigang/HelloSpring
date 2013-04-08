package com.gang.dev.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gang.dev.dao.BlogDao;
import com.gang.dev.model.Blog;
import com.gang.dev.service.BlogService;
@Service
public class BlogServiceImpl implements BlogService {
	@Autowired
	BlogDao dao;
	@Override
	public int getBlogCount() {
		return dao.getBlogCount();
	}
	@Override
	public int addBlog(Blog blog) {
		return dao.addBlog(blog);
	}

}

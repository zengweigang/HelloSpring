package com.gang.dev.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gang.dev.dao.BlogDao;
import com.gang.dev.model.Blog;
@Repository
public class BlogDaoImpl implements BlogDao {
	
	@Autowired
	JdbcTemplate jt;
	@Override
	public int getBlogCount() {
		String sql="select count(*) from blog";
		return jt.queryForInt(sql);
	}
	@Override
	public int addBlog(Blog blog) {
		return 0;
	}
	
}

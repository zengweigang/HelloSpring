package com.gang.dev.dao;

import com.gang.dev.model.Blog;

public interface BlogDao {
	public int getBlogCount();

	public int addBlog(Blog blog);
}

package com.gang.dev.service;

import com.gang.dev.model.Blog;

public interface BlogService {
	public int getBlogCount();
	public int addBlog(Blog blog);
}

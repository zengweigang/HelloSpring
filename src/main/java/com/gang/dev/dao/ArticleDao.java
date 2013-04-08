package com.gang.dev.dao;

import java.util.List;

import com.gang.dev.model.Article;

public interface ArticleDao {
	public List<Article> findArticleListPage(int pageIndex,int pageSize);

	public void i1();

	public void i2();
}

package com.gang.dev.service;

import java.util.List;

import com.gang.dev.model.Article;

public interface ArticleService {
	public List<Article> findArticleListPage(int pageIndex,int pageSize);
}

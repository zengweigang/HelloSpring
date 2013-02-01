package com.gang.dev.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gang.dev.dao.ArticleDao;
import com.gang.dev.model.Article;
import com.gang.dev.util.DbUtilsTemplate;
@Repository
public class ArticleDaoImpl implements ArticleDao {
	@Autowired
	DbUtilsTemplate dt;
	@Override
	public List<Article> findArticleListPage(int pageIndex, int pageSize) {
		return dt.find(Article.class, "select * from t_article");
	}

}

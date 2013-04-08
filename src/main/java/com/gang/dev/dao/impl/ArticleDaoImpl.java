package com.gang.dev.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gang.dev.dao.ArticleDao;
import com.gang.dev.model.Article;
@Repository
public class ArticleDaoImpl implements ArticleDao {
	@Autowired
	JdbcTemplate jt;
	@Override
	public List<Article> findArticleListPage(int pageIndex, int pageSize) {
//		return dt.find(Article.class, "select * from t_article");
		return null;
	}
	@Override
	public void i1()  {
		jt.update("insert into a (content) values('1')");
		
	}
	@Override
	public void i2() {
		jt.update("insert into b (content) values('3')");
	}

}

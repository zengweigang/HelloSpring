package com.gang.dev.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gang.dev.dao.ArticleDao;
import com.gang.dev.model.Article;
import com.gang.dev.service.ArticleService;
@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	ArticleDao dao;
	@Override
	public List<Article> findArticleListPage(int pageIndex, int pageSize) {
		return dao.findArticleListPage(pageIndex, pageSize);
	}
	@Transactional(rollbackFor=SQLException.class)
	public void demoS(){
		dao.i2();
		dao.i1();
	}

}

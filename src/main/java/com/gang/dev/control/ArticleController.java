package com.gang.dev.control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gang.dev.model.Article;
import com.gang.dev.service.ArticleService;

@Controller
@RequestMapping("/article")
public class ArticleController {
	@Autowired
	ArticleService as;

	private static final Logger logger = LoggerFactory
			.getLogger(ArticleController.class);

	@RequestMapping(value = "/list{cid}.html", method = RequestMethod.GET)
	public String list(Model model, HttpServletRequest request,
			HttpSession session, @PathVariable Integer cid) {
		logger.info("分类id是 {}", cid);
		List<Article> articles = as.findArticleListPage(0, 5);
		model.addAttribute("articles", articles);

		return "article/articleList";
	}
	@RequestMapping(value = "/demo.html", method = RequestMethod.GET)
	public String demo(Model model, HttpServletRequest request,
			HttpSession session){
		as.demoS();	
		return "article/demo";
	}
}

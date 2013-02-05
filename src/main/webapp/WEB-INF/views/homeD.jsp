<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" %>
<html lang="en">
  
  <head>
    <meta charset="utf-8">
    <title>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Le styles -->
    <link href="resources/css/bootstrap.css" rel="stylesheet">
    <style>
      body { padding-top: 60px; /* 60px to make the container go all the way
      to the bottom of the topbar */ }
    </style>
    <link href="resources/css/bootstrap-responsive.css" rel="stylesheet">
    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js">
      </script>
    <![endif]-->
    <!-- Le fav and touch icons -->
    <link rel="shortcut icon" href="resources/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="resources/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="resources/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="resources/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="resources/ico/apple-touch-icon-57-precomposed.png">
    <style>
    </style>
  </head>
  <body>
    <div class="navbar navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <a class="brand" href="#">
            Brand
          </a>
          <ul class="nav">
            <li class="active">
              <a href="#">
                Link 1
              </a>
            </li>
            <li>
              <a href="#">
                Link 2
              </a>
            </li>
            <li>
              <a href="#">
                Link 3
              </a>
            </li>
          </ul>
        </div>
      </div>
    </div>
    <div class="container-fluid">
    </div>
    <div class="well">
      <div class="row-fluid">
        <div class="span4">
          <i class="icon-signal">
          </i>
          <div>
          </div>
          <div>
            <p>
              最热吐槽
            </p>
          </div>
          <div>
            <ol>
            <c:forEach items="${articles}" var="article">
              <li>
                ${article.id}${article.title}${article.content}
              </li>
              </c:forEach>
            </ol>
          </div>
        </div>
        <div class="span4">
          <i class="icon-time">
          </i>
          <div>
            <p>
              最新吐槽
            </p>
          </div>
          <div>
            <ol>
              <li>
                内容
              </li>
            </ol>
          </div>
        </div>
        <div class="span4">
          <i class="icon-glass">
          </i>
          <div>
            <p>
              最冷吐槽
            </p>
          </div>
          <div>
            <ol>
              <li>
                内容
              </li>
            </ol>
          </div>
        </div>
      </div>
    </div>

    <style>
      
    </style>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js">
    </script>
    <script src="resources/js/bootstrap.js">
    </script>
  </body>
</html>

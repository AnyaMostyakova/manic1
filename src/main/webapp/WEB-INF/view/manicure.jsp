<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

st:mainlayout title= "Book list"s
‹div class="text-info">Books in DB: N</div> ‹div class= "books-list">
<c:forEach items="${books}" var="book"s <div class="Dook-card"?
                                             ‹div class= book-header"
<h3 class-"book-name"><a href-"/book/1">Spring in Action</a></h3> «span class-"book-url"><a href-"http://google.
com target-"_blank"><i class="glyphicon glyphicon-new-window"></i></a></span>
‹span class="book-info">2005, APress</ spans <div class-"pook-action-icon" 3<a hrer-"/book/delete/1 class-"text-danger"><i class="glyphicon glyphicon-remove"></i></a></div>
<div class= book-action-icon href="/book/edit/1'
class= text-success"><i class=
                                                                   "glyphicon glyphicon-edit"></i></a></div>
<diy Ctass-cteantxse/d>
< div> ‹div class= "book-description">Some description for
the first books/div>
</diva </c:forEach>
< div>
</t:mainLayout>

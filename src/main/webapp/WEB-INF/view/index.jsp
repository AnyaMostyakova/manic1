<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:mainLayout title="Main">
    <h1>Магазин молочной продукции</h1>


    <div>Ваше имя: ${clientname!}</div>
    <div>Ваш Id: ${clientid!}</div>

    <a href="/lab10/merchlist">Список продуктов</a>
</t:mainLayout>

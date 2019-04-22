<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<fmt:setLocale value="${param.lang}" />
<fmt:setBundle basename="properties.string"/>

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title> <fmt:message key="label.appname" /> </title>
    <link href="<c:url value='/web/static/css/bootstrap.css' />" rel="stylesheet"></link>
    <link href="<c:url value='/web/static/css/app.css' />" rel="stylesheet"></link>
</head>

<body>
<div class="generic-container">
    <div class="well lead"> <fmt:message key="label.appname" /> </div>
    <div class="row">
        <div class="form-group col-md-12">
            <label class="col-md-3 control-lable" for="search"><fmt:message key="label.search" /></label>
            <div class="col-md-7">
                <form:input type="text" path="search" id="search" class="form-control input-sm"/>
                <div class="has-error">
                    <form:errors path="search" class="help-inline"/>
                </div>
            </div>
        </div>
    </div>
    <table class="table table-hover">
        <tbody>
        <tr>
            <td> <a href="<c:url value='/image/list' />" class="btn btn-success custom-width"> <fmt:message key="label.images"/> </a> </td>
            <td> <a href="<c:url value='/image/add' />" class="btn btn-success custom-width"> <fmt:message key="label.addimage"/> </a> </td>
            <td> <a href="<c:url value='/slide-show/list' />" class="btn btn-success custom-width"> <fmt:message key="label.slideshows"/> </a> </td>
            <td> <a href="<c:url value='/slide-show/create' />" class="btn btn-success custom-width"> <fmt:message key="label.addslideshow"/> </a> </td>
        </tr>
        </tbody>
    </table>
    <div class="panel-heading"><span class="lead"> <fmt:message key="label.listofslideshow"/> </span></div>
    <table class="table table-hover">
        <thead>
        <tr>
            <th></th>
            <th width="15%"> <fmt:message key="label.name"/> </th>
            <th width="10%"> <fmt:message key="label.size"/> </th>
            <th width="10%"> <fmt:message key="label.speed"/> </th>
            <th width="10%"></th>
            <th width="10%"></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${slideShowList}" var="slideshow">
            <tr>
                <td> <img src="data:image/jpg;base64,${slideshow.presentation.base64Image}"/> </td>
                <td>${slideshow.name}</td>
                <td>${slideshow.size}</td>
                <td>${slideshow.speed}</td>
                <td><a href="<c:url value='/slide-show/play/${slideshow.id}' />" class="btn btn-success custom-width"> <fmt:message key="label.play"/> </a></td>
                <td><a href="<c:url value='/slide-show/delete/${slideshow.id}' />" class="btn btn-danger custom-width"> <fmt:message key="label.delete"/> </a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
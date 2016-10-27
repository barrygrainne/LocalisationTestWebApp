<%@ page language="java" contentType="text/html; charsest=ISO-8859-1"
	pageEncoding="UTF-8" %>
<%@ page import="ie.rccourse.*, java.util.*" %>

<h1>${lm.getMessage("heading")}</h1>
<% LocalMessage lm = (LocalMessage)
 request.getAttribute("lm"); %>

${prompt}

${lm.getMessage("depart")}
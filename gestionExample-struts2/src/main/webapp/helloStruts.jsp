<%@page import="java.util.Date" %>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html>
<html lang="fr">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <link href="css/style.css" rel="stylesheet" id="bootstrap-css">
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <title>Examples Servlet</title>
   	<s:head/>
</head>

<body>
	<div class="sidenav">
		<div class="login-main-text">
			<h2>
				Application<br>Java EE
			</h2>
			<br>
			<%= new Date()%>
		</div>
	</div>
	<div class="main">
		<div class="col-md-6 col-sm-12">
			
				<h3><s:property value="getText('global.heading')"/></h3>
				
				<s:url action="locale" var="indexEN">
					<s:param name="request_locale">en</s:param>
					<s:param name="uri">helloStruts</s:param>
					<s:param name="personne.firstName" value="personne.firstName"/>
					<s:param name="personne.lastName" value="personne.lastName"/>
				</s:url>
				<s:a href="%{indexEN}">English</s:a>
				
				<s:url action="locale" var="indexFR">
					<s:param name="request_locale">fr</s:param>
					<s:param name="uri">helloStruts</s:param>
					<s:param name="personne.firstName" value="personne.firstName"/>
					<s:param name="personne.lastName" value="personne.lastName"/>
				</s:url>
				<s:a href="%{indexFR}">Français</s:a>
				
				<br><br>
				<h3><s:property value="getText('global.success')"/></h3>
				<b><s:property value="personne.firstName"/> <s:property value="personne.lastName"/></b>
				<%-- <br><br>
				<b><s:property value="uri"/></b> --%>
				
				<!-- <br> -->
				<%-- <s:set var="personne1" value="%{'test'}" scope="application"/>
				<b><s:property value="#personne1"/></b> --%>
				
				    <%-- <p>I've said hello to you <s:property value="#session.helloCount" /> times!</p> --%>
				
				
				
		</div>
	</div>
</body>

</html>









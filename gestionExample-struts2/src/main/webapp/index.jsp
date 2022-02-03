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
    <style>
    
    </style>
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
			<div class="login-form">
				<h1><a href="<s:url action="hello"/>">Hello Struts 2!</a></h1>
			</div>
		</div>
	</div>
</body>

</html>
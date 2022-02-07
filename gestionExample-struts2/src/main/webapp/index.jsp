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
			
				<%-- <h1><a href="<s:url action="hello"/>">Message</a></h1>
				<br>
				
				<h2>form</h2>
				<form action="hello" method="post">
					<input type="text" name="messageStore.message" placeholder="Prénom"><br>
					<input type="submit" value="Hello">
					
				</form>
				<br>
				
				<h2>s:form</h2>
				<s:form action="hello">
  					<s:textfield name="messageStore.message" label="Prénom " />
  					<s:submit value="Hello" />
				</s:form>
				<br> --%>
				
				<h3><s:property value="getText('global.heading')"/></h3>
				
				<s:url action="locale" var="indexEN">
					<s:param name="request_locale">en</s:param>
				</s:url>
				<s:a href="%{indexEN}">English</s:a>
				
				<s:url action="locale" var="indexFR" >
					<s:param name="request_locale">fr</s:param>
				</s:url>
				<s:a href="%{indexFR}">Français</s:a>
				
				<br><br>
				<i><s:property value="getText('global.required')"/></i>
				<s:form action="hello">
					<s:radio name="personne.genre" list="{'M', 'F'}" key="global.gender"/>
  					<s:textfield name="personne.firstName" key="global.firstname" />
  					<s:textfield name="personne.lastName" key="global.lastname" />
  					<s:textfield name="personne.age"  key="global.age"/>
  					<s:textfield name="personne.email" key="global.email" />
  					<s:textfield name="personne.title" key="global.title" />
  					
  					<s:textfield type="date" name="personne.startDate" key="global.startdate" />
  					<s:select name="personne.dept" list="{'', 'Admin', 'Loans', 'Operations', 'IT'}" key="global.dept"/>
  					<s:checkboxlist name="personne.options" list="{'A', 'B', 'C', 'D'}" key="global.options"/>
 					
 					
 					
 					
  					<s:submit key="global.submit" />
				</s:form>
				
				
				
		</div>
	</div>
</body>

</html>
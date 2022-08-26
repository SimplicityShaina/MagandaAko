<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
		<title>Struts 2 date validator example</title>
	</head>
	<body>
		<h3>This is a date validator example.</h3>
			 
		<s:form action="Login">
			<s:textfield name="userName" label="UserName" />
			<s:textfield name="dateOfBirth" label="DOB (dd/mm/yy)" /> 
			<s:submit value="login" align="center"/>
		</s:form>
		
	 
	</body>
</html>

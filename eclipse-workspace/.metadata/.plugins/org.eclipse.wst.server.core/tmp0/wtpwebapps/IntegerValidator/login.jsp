<%@ taglib uri="/struts-tags" prefix="s"%>
<html>

<head>
<title>Register Now</title>
	<!-- CSS only -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"></script>
	<link href="css/design.css" rel="stylesheet" type="text/css"/>
</head>
<body class="text-center">
		<div class="container">
		<h3>Voter Verifier</h3>
		<s:form class="form-signin" action="Login">
			<s:textfield name="userName" label="Voter Name" />
			<s:textfield name="age" label="Age" />
			<s:submit value="Submit" class="btn" align="center" />
		</s:form>
		</div>
	

</body>
</html>

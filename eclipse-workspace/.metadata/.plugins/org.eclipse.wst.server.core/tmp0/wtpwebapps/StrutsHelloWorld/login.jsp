<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
		<title>Server Time</title>
		<!-- CSS only -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet">
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"></script>
		<link href="css/design.css" rel="stylesheet" type="text/css"/>
	</head>
	<body class="text-center">
	<div class="container">
	<s:form class="form-signin" action="Login">
      <h1 class="h3 mb-3 font-weight-normal">This will display current server time.</h1>
      
	  <s:textfield name="userName" label="Username" class="form-control" />
      <s:submit class="btn btn-lg btn-primary btn-block"  value="Sign in" align="center"/>
    </s:form>
	</div>
	 
	</body>
</html>

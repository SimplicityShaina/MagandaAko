<%@ taglib uri="/struts-tags" prefix="s"%>

<html>
	<head>
		<title>Server Time</title>
		<!-- CSS only -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet">
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"></script>
		<link href="css/design.css" rel="stylesheet" type="text/css"/>
	</head>
	<body  class="text-center">
	<div class="container">
		<h3>This will display current server time</h3>
		<h4> Hello <s:property value="userName" /></h4>
		<h4>The time is now </h4>
	 `<% java.util.Date d = new java.util.Date();
                out.println(d.toString()); %>
	</div>
		
	</body>
</html>

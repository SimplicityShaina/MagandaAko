<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>


<!DOCTYPE html>
<html>
<head>


<title> WELCOME FORM </title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<style type="text/css" >
		.error{color:Red;}
		.navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
    
  .carousel-inner img {
      width: 100%; /* Set width to 100% */
      margin: auto;
      min-height:200px;
  }

  /* Hide the carousel text when the screen is less than 600 pixels wide */
  @media (max-width: 600px) {
    .carousel-caption {
      display: none; 
    }
  }

</style>
	
	</head>
<body>


<h1> Welcome to Dashboard</h1>

<h1>Logged as: ${user.username}</h1>
<div>
	<form action="/set-dashboard" method="get">
		<div> <h2> My Account</h2></div>
	<div><input type="button" value="My Account" onclick="goToMyAccount()" style="color: red;"></div>
	<div><br></div>
	<div><input type="button" value="Add Account" onclick="goToAddAccount()" style="color: blue;"></div>
	<div><br></div>
	<div><input type="button" value="Deposit" onclick="goToDeposit()" style="color: blue;"></div>
	<div><br></div>
	<div><input type="button" value="Transfer " onclick="goToTransfer()" style="color: black;"></div>
	<div><br></div>
	<div><input type="button" value="Withdraw " onclick="goToWithdraw()" style="color: black;"></div>
	<div><br></div>
	<div><input type="button" value="Transaction Logs " onclick="goToTransactionLogs()" style="color: black;"></div>
	</form>
</div>

	<script type="text/javascript">
		function goToMyAccount(){
			window.location.href="/set-myaccount";  
		}
	
		function goToAddAccount(){
			window.location.href="/addAccount";
		}
	
		function goToTransfer(){
			window.location.href="/transamt";
		}
		
		function goToTransactionLogs(){
			window.location.href="/transactionlogs";
		}
		
		function goToDeposit(){
			window.location.href="/depositform";
		}
		
		function goToWithdraw(){
			window.location.href="/withdrawform";
		}
	</script>
    
   
</body>
<!--<ul class="nav navbar-nav navbar-right">
        <li class="active"><a href="/login?logout"> LOGOUT</a></li>
        </ul>   -->

  

</html>
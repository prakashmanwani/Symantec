<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>SymDonate</title>
<link href="<c:url value="/resources/css/reset.css"/>" rel="stylesheet" type="text/css">
<link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet" type="text/css">
<!--[if IE]><style type="text/css">.pie {behavior:url(PIE.htc);}</style><![endif]-->
</head>

<body>
	<!-- Adding Clothes Service for Donors-->
	<form>
		<!--wrapper-->
		<div id="wrapper">
			<!--header_container-->
			<div class="header_container">
				<!--logo-->
				<div class="logo fl-lt">
					<a href="#"><img src="<c:url value="/resources/img/symDonate.jpg"/>" alt="logo" width="70"
						height="50"> SymDonate</a>
				</div>
				<!--logo-->
				<!--nav-->
				<div class="nav fl-rt">
					<ul>
						<li><a href="#">Home</a></li>
						<li><a href="#">About Us</a></li>
						<li><a href="#">Getting Involved</a></li>
						<li class="last"><a href="#">Contact Us</a></li>
					</ul>
					<div class="clrflt"></div>
				</div>
				<!--nav-->
			</div>
			<!--header_container-->
			<!--banner_container-->
			<div class="container">
				<h2>Donor</h2>
				<p>No one has ever become poor by giving</p>
			</div>

			<div class="Social Service" id="home-content4">
				Name: <input type="text" name="Name" placeholder="Full Name"><br>
				Address: <input type="text" name="Address"><br>
				Zipcode:<input type="integer" name="zipcode"><br>
				State: <select name="Choose State">
					<option value="Choose state">Choose state</option>
					<option value="California">CA</option>
					<option value="Texas">TX</option>
				</select><br> Contact Number:<input type="integer" name"ContactNumber"><br>
				Email:<input type="varchar"name"email"><br> Age:<input
					type="integer"name"age"><br> Id Type: <select
					name="Choose Id Type">
					<option value="Choose Id">Choose ID</option>
					<option value="SSN">SSN</option>
					<option value="Passport No.">Passport No.</option>
					<option value="Driver's License">License No</option>
				</select><br> Id No:<input type="integer" name="id"><br>
				Quantity:<input type="integer" name="quantity"><br> <input
					type="checkbox" name="Pick UP" value="Pick UP">Pick UP <input
					type="checkbox" name="Drop" value="Drop">Drop <br>
				Description:<input type="text"
					name"description" placeholder="description"><br> <input
					type="submit" value="Submit"> <input type="submit"
					value="Cancel">
	</form>
</body>
</html>
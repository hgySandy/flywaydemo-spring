<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html ng-app="flywayDemoApp" ng-controller="MainCtrl">
<head>
    <title>{{title}}</title>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
	<script type="text/javascript">
	    var _contextPath = "${pageContext.request.contextPath}" + "/";
	</script>    
    <script src="libraries/js/jquery-1.11.2.min.js" type="text/javascript"></script>
    <script src="libraries/js/angular.min.js" type="text/javascript"></script>
    <script src="libraries/js/angular-route.min.js" type="text/javascript"></script>
    <script src="libraries/js/angular-resource.min.js" type="text/javascript"></script>
    <script src="libraries/js/bootstrap.min.js" type="text/javascript"></script>
    <script src="angular/app.js" type="text/javascript"></script>
    <script src="angular/controllers.js" type="text/javascript"></script>
    <script src="angular/restservices.js" type="text/javascript"></script>
    <script src="angular/controllers/MainCtrl.js" type="text/javascript"></script>
    <script src="angular/controllers/HomeCtrl.js" type="text/javascript"></script>
    <script src="angular/controllers/DetailsCtrl.js" type="text/javascript"></script>
    <script src="angular/controllers/FavoritesCtrl.js" type="text/javascript"></script>
    <link type="text/css" rel="stylesheet" href="libraries/css/bootstrap.css" />
    <link type="text/css" rel="stylesheet" href="resources/css/site.css" />
</head>
<body>
<div class="container">
	<!-- Views -->
    <div ng-view></div>
</div>
</body>
</html>
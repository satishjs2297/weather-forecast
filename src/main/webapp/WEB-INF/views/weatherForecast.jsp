<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <title>Weather Forecast Report</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="icon" type="image/png" href="<spring:url value="/resources/css/weather-forecase.png"/>"> <link
        rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

    <link href='<spring:url value="/resources/css/style.css"/>' rel="stylesheet" />

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"> </script>

    <script type="text/javascript" src="<spring:url value="/resources/js/weather-forecast.js"/>"> </script> </head>
<header>
    <!-- Fixed navbar -->
    <nav class="navbar navbar-expand-md navbar-light" style="background-color: #ddeeff;">
        <a href="#" class="navbar-brand">Weather Forecast</a>
        <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarCollapse">
            <div class="navbar-nav">
                <a href="#" class="nav-item nav-link active">Home</a>
                <a href="#" class="nav-item nav-link">Profile</a>
            </div>
            <div class="navbar-nav ml-auto">
                <a href="#" class="nav-item nav-link">Login</a>
            </div>
        </div>
    </nav>
</header>

<body>
    <!-- Begin page content -->
    <main role="main" class="container" style="margin-top: 2%">
        <div class="jumbotron text-center py-4">
            <h1><spring:message code="weather.header"/></h1>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-md-6 offset-md-3">
                    <form id="weather-report-form" action="#">
                        <div class="form-group">
                            <label class="font-weight-bold" for="cities"><spring:message code="weather.cityName"/></label>
                            <input type="text" class="form-control" id="cities" name="cities"
                                placeholder="Eg: Washington, Houston, New York " required />
                            <div class="invalid-feedback">Please enter city name(s).</div>
                            <div id="errorDiv" class="text-danger"><spring:message code="weather.errorMsg"/></div>	
                        </div>
                        <button class="btn btn-primary" id="get-report"><spring:message code="weather.getReport"/></button>
                    </form>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="weather-widgets d-flex justify-content-center flex-wrap" >

            </div>
        </div>
        <div class="progress">
            <div class="progress-bar progress-bar-striped" style="min-width: 20px;"></div>
        </div>        
    </main>
</body>

<footer class="footer">
    <!-- Copyright -->
    <div class="footer-copyright text-center py-3 font-small blue "> 2019 Copyright: <a href="#"> Weather Forecasting Site</a>
    </div>
    <!-- Copyright -->
</footer>

</html>

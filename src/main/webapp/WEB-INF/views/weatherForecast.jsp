<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>	

<!DOCTYPE html>
<html lang="en">

<head>
    <title>Weather Forecast Report</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="icon" type="image/png" href="<spring:url value="/resources/css/weather-forecase.png"/>">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

    <link href='<spring:url value="/resources/css/style.css"/>' rel="stylesheet" />
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"> </script>
    
    <script type="text/javascript" src="<spring:url value="/resources/js/weather-forecast.js"/>"> </script>
</head>

<body>
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
        <div class="report-widgets d-flex justify-content-center flex-wrap" >

        </div>
    </div>
</body>

</html>
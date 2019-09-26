$(document).ready(function () {
            $("#errorDiv").hide();  
            $(".progress").hide();      	
            $("#get-report").click(function (event) {  
                event.preventDefault()
        		var form = $("#weather-report-form")
        		var cities = $("#cities").val();
        		if(!validateInput(cities)) {
                    $("#errorDiv").show();                   
        			return;
        		}

        		$("#errorDiv").hide();
                form.addClass('was-validated');               
                $(".progress").show(); 
                makeProgress();                
                $.get("/weather-forecast/getWeatherForecastByCities/"+cities, function(data, status){
                    $(".progress").hide(); 
        		    if(status === 'success' && data.length > 0) {        			 
        				 createWidgets(data);
        		    } else {
        		    	alert('No Data found for the city :: '+ cities);
        		    }
          		});	                
                return;               
            });
        });

        function createWidgets(reports) {
            $(".report-widgets").empty();
            $(reports).each(function(index,report){
                $(".report-widgets").append(createWidget(report));
            });
            $(".report-widgets").find(".report-widget").each(function(index, element){
                $(element).delay((index + 1) * 200).animate(
                		{ 
                            width: "100",
                            opacity: 2.0,
                            marginLeft: "0in",
                            fontSize: "100%", 
                            borderWidth: "1px"
                         }, 1500 
                		
                ); 
            });
        }

        function createWidget(report) {
            $report_widget = $("<div />").addClass("report-widget").addClass("col-md-2");
            $city = $("<div />").addClass("city").text(report.name);
            $data_holder = $("<div />").addClass("data-holder");
            $primary_data_holder = $("<div />").addClass("primary-data-holder");
            $temperature = $("<div />").addClass("data").append($("<div />").addClass("temperature").addClass("pt-3").text(report.main.temp));
            $clouds = $("<div />").addClass("clouds").append("Clouds: ").append(report.clouds.all);
            $humidity = $("<div />").addClass("humidity").append("Humidity: ").append(report.main.humidity);
            $wind = $("<div />").addClass("wind").append("Wind: ").append(report.wind.speed);
            $pressure = $("<div />").addClass("pressure").append("Pressure: ").append(report.main.pressure);

            $report_widget.append($city);
            $report_widget.append($data_holder);
            $data_holder.append($primary_data_holder);
            $primary_data_holder.append($temperature);
            $report_widget.append($clouds).append($humidity).append($wind).append($pressure);
            return $report_widget;
        }

        /*Validate City Name*/
        function validateInput(inputtxt) {
         var characterReg = /^\s*[a-zA-Z,\s]+\s*$/;
         if(characterReg.test(inputtxt)) {
            return true;
           } else {
          	 return false;
           }
        }

        var i = 0;
        function makeProgress() {
            if (i < 100) {
                i = i + 1;
                $(".progress-bar").css("width", i + "%").text(i + " %");
            }
            setTimeout("makeProgress()", 100);
        }

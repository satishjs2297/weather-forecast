# Weather Forecast

Weather Forecast Display the weather information on the page.

  - It takes city names as common separatted values
  - It makes the Async Ajax call with selected city names and get the weather information from https://api.openweathermap.org/data/2.5/weather
  - Display the infromation as a widget on the screen.
  - Enabled i18n and default to English and french is also enabled (lang=fn)

### Technology Stack

Weather forecast built on following technology stacks:

* Spring MVC - Spring MVC enabled Configuration!
* jQuery - Used JQuery lib for Validation, Animation & Ajax Calls .
* Bootstrap - Used for CSS styling.
* Maven - Maven build tool for project building and deployment.
* Junit - JUnit & Mockito for unit Testing

### Installation

Weather forecast requires Java 8 need to be installed.

Install the dependencies and devDependencies and start the server.

```sh
$ git clone <Weather forecast git url> weather-forecast
$ cd weather-forecast
$ mvn clean install 
$ On success of clean build. Run this ::-->  mvn tomcat7:run
$ Open web browser & hit the url: http://localhost:8080/weather-forecast/home?lang=en
```

### Development
- Clone the project and Import the project as Maven project in eclipse IDE.
- Clean and Reslove the maven dependency
- Add tomcat server under eclipse server tab.
- Add the imported weather-forecast project 
- Run the server into debug mode.

### Contributors
- Priyanka

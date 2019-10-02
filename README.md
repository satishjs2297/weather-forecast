
# Weather Informer

####  Weather Informer displays weather information by interacting with Open weather interface.

  - It takes city names as inputs with common separated values
  - It shows the weather information widget for each city.
  - Enabled i18n and default to English and french is also enabled (lang=fn)

## Getting Started

Please follow the following steps to setup and run weather-informer

### Prerequisites

- Weather Informer requires Java 8 need to be installed.
- Install any Java IDE (Eclipse, STS, Intellij etc..) and ensure you are able to launch
-  Clone/Checkout the project from version control system (git) and follow below steps

```
$ cd weather-informer
$ mvn clean install 
$ mvn jetty:run -e
$ Open web browser & hit the url: http://localhost:8080/weather/?lang=en
```
## Development Setup

- Clone weather-informer project. (git clone <repo url>)
- Open eclipse and import this project under (Existing Maven project)

## Tech stack

- Java 8
- jQuery
- Spring Web MVC
- Jsp

## Running the tests
```
$ cd <path/to/weather-informer>
$ mvn test -e
```

## Authors

*  Swami

## Acknowledgments

* [https://www.baeldung.com/spring-dispatcherservlet](https://www.baeldung.com/spring-dispatcherservlet)
* [https://www.journaldev.com/2610/spring-mvc-internationalization-i18n-and-localization-l10n-example](https://www.journaldev.com/2610/spring-mvc-internationalization-i18n-and-localization-l10n-example)

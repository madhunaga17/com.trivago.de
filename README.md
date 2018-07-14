# basic-selenium-project
This project is written in java and will serve an example of implementing a Selenium test project with Selenium 3, TestNG and Maven.
Everything is set up and tests can be added straight away.
To execute the tests just browse testNG.xml(https://github.com/madhunaga17/com.trivago.de/blob/master/testng.xml).

## Implemented Browsers
Thanks to the awesome [webdrivermanager]it supports the following browsers and automatically downloads OS specific binaries for:
* Chrome
* Firefox

#### The Webdriver Setup
The webdriver setup is based on the [WebDriverBuilder]and the [DesiredCapabilitiesFactory]
to have a separation between driver instantiation and browser specific settings.

## Page Objects Pattern
page object pattern is used to have reusable WebElements/small helper methods seperated from actual test classes and give the opportunity to have nice structured and easily readable tests (without the overhead of BDD-Frameworks like Cucumber or JBehave).

## Annotations
Beside a bunch of [Convenient Methods] the basic-selenium-project provides some nice custom annotations to comfortably set some test conditions and/or assumptions
Example test that uses several annotations

#### @Browser
The `@Browser` annotation includes or excludes certain browsers from the test execution


## Convenient Methods
you can find a couple of convenient methods like waits, windowshandle

## Import Project
Download and Import the project in EclipseIDE. Start executing the testNG.xml for all the four test cases execution

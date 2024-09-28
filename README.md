# API Automation RestAssured (in Java)

#### Author - Pramod Dutta

API Automation Framework with the CRUD of Restful Booker

`mvn test -Dsurefire.suiteXmlFiles=testng.xml`

<img width="1130" alt="Screenshot 2023-10-31 at 12 25 55 PM" src="https://github.com/PramodDutta/APIAutomationRestAssured/assets/1409610/69f398b3-8798-4fba-a091-3b1e321dcc7d">



## Tech Stack

1. Java ( JDK > 21)
2. Rest Assured
3. Apache POI, TestNG, Maven.
4. AssertJ (Advance assertions)
5. Jackson and GSON
6. Log4j
7. Allure Report
8. Full Folder Structure(Hybrid) Framework.
9. Jenkins File

#### API Framework Important Components
![Screenshot 2024-06-29 at 12 44 29](https://github.com/PramodDutta/APIAutomationFramworkATB6x/assets/1409610/98bbc62d-7837-4bdc-900b-b214c675af6d)

#### Running via CI/CD
<img width="1262" alt="Screenshot 2023-10-31 at 12 26 07 PM" src="https://github.com/PramodDutta/APIAutomationRestAssured/assets/1409610/2d58bf82-0ffb-4fcb-a2d9-cf26920fa7b5">


Run

### Basic Create Test
* Install Maven
* add config to run the suite or testng

```<build>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>3.3.0</version>
        <configuration>
          <suiteXmlFiles>
            <suiteXmlFile>${suiteXmlFile}</suiteXmlFile>
          </suiteXmlFiles>
        </configuration>
      </plugin>
    </plugins>
  </build>
```
to **pom.xml**

```mvn clean test -DsuiteXmlFile=testng.xml ```


### Parallel Execution

To run tests in parallel, add the parallel attribute to your testng.xml file:

```<suite name="All Test Suite" parallel="methods" thread-count="2">```


### Integration Test (Create BookinG and Create Token , Update and Delete Booking)

``` mvn clean test -DsuiteXmlFile=testng-integration.xml```

### Allure Report Generated.


```allure serve allure-results/```

![image](https://github.com/PramodDutta/APIAutomationFramworkATB6x/assets/1409610/79ba2093-a1b7-4b36-ba16-9a6827af7afe)


Certainly! I'll guide you through the steps to install Allure and generate a report for a Java project using TestNG. Here's a step-by-step process:

#### 1. Install Allure

First, you need to install Allure Command Line Tool. If you're using a Mac, you can use the following Brew command:

```
brew install allure
```

For other operating systems, please refer to the official Allure documentation for installation instructions.

#### 2. Set up your Java project

Ensure you have a Java project set up with TestNG. If not, create a new Maven project and add the necessary dependencies.

#### 3. Add Allure dependencies

Add the following dependencies to your `pom.xml` file:

```xml
<dependency>
    <groupId>io.qameta.allure</groupId>
    <artifactId>allure-testng</artifactId>
    <version>2.13.0</version>
</dependency>
```

#### 4. Configure Allure in your project

Update the `<build>` section of your `pom.xml` to include the Allure Maven plugin:

```xml
<build>
    <plugins>
        <plugin>
            <groupId>io.qameta.allure</groupId>
            <artifactId>allure-maven</artifactId>
            <version>2.10.0</version>
            <configuration>
                <reportVersion>2.13.0</reportVersion>
            </configuration>
        </plugin>
    </plugins>
</build>
```


#### 5. Run your tests

Execute your TestNG tests using Maven:

```
mvn clean test
```

This will run your tests and generate the Allure results in the `target/allure-results` directory.

#### 6. Generate the Allure report

After running your tests, use the following command to generate the Allure report:

```
allure generate target/allure-results --clean -o allure-report
```

This command will create an `allure-report` folder containing the generated report.

#### 7. View the report

To view the report, you can use the following command:

```
allure open allure-report
```

This will start a local web server and open the report in your default browser.

#### Additional Tips

- You can use the `@Severity` annotation to indicate the importance of your tests.
- Allure supports attaching screenshots, which can be useful for UI tests.
- For more advanced configurations and features, refer to the official Allure documentation.

By following these steps, you should be able to successfully install Allure, run your TestNG tests, and generate a comprehensive Allure report for your Java project.


#### Try these Cases also

POSTMAN Assignments
 Assignment  1

Create the Collections for the This Test cases :

App - Restful Booker with(Auth)

1. Create a Booking, Update the Booking Name, Get the Booking by Id and verify.
2.  Create a Booking, Delete the Booking with Id and Verify using GET request that it should not exist.
3. Get an Existing Booking from Get All Bookings Ids , Update a Booking and Verify using GET by id.
4. Create a BOOKING, Delete It
5. Invalid Creation - enter a wrong payload or Wrong JSON.
6. Trying to Update on a Delete Id


Test for the Single Req
1. Response
2. Status Code
3. Headers

———

Create Collection
- [ ] RestfulBooker CRUD operation.
- [ ] Add from Snippets , Test cases
- [ ] Integration Scenarios (Hard Coded)



Assert. - Should not happen (9%)
Expect. - Actual Result == Expected ( 90%)
Should - Hard it should happen (1%)



Assignments 2

Full CRUD Test cases for the Github Repo API with Integration Scenarios

1. Create a Test Cases on Template.
2. Submit the Postman Collection with Test cases Added
3. Add the Test cases and integration scenarios also
4. Write Better Advance Postman Test cases.


Assignments 3

1. Get Token ( 2 Step)
2. Upload image on Imgur with OAuth 2.0 ( hash will be generated)
3. Get that image and verify the link hash


Assignments 4

Try the Complex JSON Parsing with the Map and Filters
On Assignment Tab.

Assignments 5

Add JSON Schema Validation for POST, PUT Request for the Restful BOOker.
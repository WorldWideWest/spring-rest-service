# Spring REST service implementation

The REST service implementation where we store students based on their first name, last name & faculty.

To make it easier to manipulate with the data I implemented a smiple form where you can submit students and make changes to their data or delete them. But as the name of the project suggests we have a REST API implemented so you can make these API calls to Create, Retrive, Update or Delete the student data.

Before you run the application run the SQL script:
`sql\db-init.sql`,

Only part of configuration is to update the data in your  `application.properties` file:

```properties
spring.datasource.url=jdbc:mysql://127.0.0.1:3306/spring_api?useSSL=false&serverTimezone=UTC
spring.datasource.username=username
spring.datasource.password=password
```



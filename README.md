# Module Info Readme

---

**Module Info** is a library providing endpoints for sharing current application build details and the authors' contact
information.

The library is intended for use in Spring based applications as the returned data is being gathered from the Spring
application properties.

---

## Endpoints

The library shares an additional REST controller:

**InfoController**

1. (*GET*) */api/info/build-info*; Returns:
    1. name : (*String*) - A name of the application.
    2. version : (*String*) - Version.
    3. date : (*LocalDate*) - A date of build.
    4. os : (*String*) - The os on which the application has been built.
2. (*GET*) */api/info/build-env-info*; Returns:
    1. jdkDistribution : (*String*) - A distribution of the JDK used for compilation.
    2. jdkVersion : (*String*) - A version of the JDK used for compilation.
    3. dockerDistribution : (*String*) - A distribution of docker used for creating the image.
    4. dockerVersion : (*String*) - A version of docker used for creating the image.
3. (*GET*) */api/info/contact-info*; Returns:
    1. authors : (*List<String>*) - A list of authors.
    2. emailAddresses : (*List<String>*) - A list of contact email addresses.
    3. githubLink : (*String*) - An url to GitHub.
4. (*GET*) */api/info/module-info*; Returns:
    1. **BuildInfoDto**
        1. name : (*String*) - A name of the application.
        2. version : (*String*) - Version.
        3. date : (*LocalDate*) - A date of build.
        4. os : (*String*) - The os on which the application has been built.
    2. **BuildEnvInfoDto**
        1. jdkDistribution : (*String*) - A distribution of the JDK used for compilation.
        2. jdkVersion : (*String*) - A version of the JDK used for compilation.
        3. dockerDistribution : (*String*) - A distribution of docker used for creating the image.
        4. dockerVersion : (*String*) - A version of docker used for creating the image.
    3. **ContactInfoDto**
        1. authors : (*List<String>*) - A list of authors.
        2. emailAddresses : (*List<String>*) - A list of contact email addresses.
        3. githubLink : (*String*) - An url to GitHub.

---

## Configuration

To enable the endpoints provided by **ModInfo**, after adding dependency to your *pom.xml* file, there is a need of
importing configuration to your Spring application context.
To do that use the annotation:

```java
@Import( value = { ModuleInfoConfiguration.class } )
```

in your Spring application or configuration class.

---

The library uses application properties which need to be defined before usage:

**build.name** = *A name of the application.*  
**build.version** = *Version.*  
**build.date** = *A date of build.*  
**build.os** = *The os on which the application has been built.*  

**build-env.jdk-distribution** = *A distribution of the JDK used for compilation.*  
**build-env.jdk-version** = *A version of the JDK used for compilation.*  
**build-env.docker-distribution** = *A distribution of docker used for creating the image.*  
**build-env.docker-version** = *A version of docker used for creating the image.*  

**contact.authors** = *A list of authors.*   
**contact.email-addresses** = *A list of contact email addresses.*  
**contact.github-link** = *An url to GitHub.*

---

## Requirements

- JDK 17
- [pp-base](https://github.com/Pplociennik/pp-base) project installed in the local maven repository (You can check the
  required version in the *pom.xml* file in the **parent** section)

---

## Changelog

### 1.0.0

- Created Rest Controller, configuration, service and mapping utility.
 


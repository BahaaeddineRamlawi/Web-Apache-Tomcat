# MyServlet Web Application

## Overview

This is a simple web application demonstrating the use of a servlet in Apache Tomcat. The servlet displays a greeting message with the provided name and surname.

## Prerequisites

Before running this application, ensure you have the following installed:

- Java Development Kit (JDK)
- Apache Tomcat

## Getting Started

1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/BahaaeddineRamlawi/Web-Apache-Tomcat.git
   ```

2. Compile the servlet using the following command:
    ```bash
   javac -source 1.8 -target 1.8 -cp "TOMCAT-HOME/lib/servlet-api.jar;lib/javax.servlet-api-3.1.0.jar" MyServlet.java
    ```
    Make sure the TOMCAT_HOME environment variable is set to the Tomcat installation directory.
   
3. Copy the compiled MyServlet.class to the Tomcat webapps/ROOT/WEB-INF/classes directory.

4. Start Tomcat.
   ```bash
   catalina run
   ```

5.Open your web browser and navigate to http://localhost:8080/MyServlet?nom=YourLastName&prenom=YourName to test the servlet.

    

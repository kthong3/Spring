# Spring
   
 ### Creating a Spring application with Maven
 System requirements:  
 - Java Development Kit (JDK) 1.7+
 - Integrated Development Environment(IDE) or text editor
 
 ### Steps
 - Create new Maven project in the IDE.  
 - In the pom.xml file, add the following build information after the version tags:    
     `<build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compilier-plugin</artifactId>
                <version>3.2</version>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                 </configuration>
             </plugin>
        </plugins>
    </build>`   
 - Create Customer, CustomerRepository, and CustomerService classes  
 - Implement interfaces for CustomerRepository and CustomerService  
 - Create Application
 
 ### Sources
 - [pluralsight](https://www.pluralsight.com/)
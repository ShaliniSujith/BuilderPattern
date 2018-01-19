# Builder Pattern

Assignment: Write a program to understand the concept of “Builder Pattern”

#Demonstrates:
+ Concept of builder pattern

#Overview

Builder pattern makes object construction more readable and more usable
In builder pattern you write a dedicated class to create an instance of the class you want to build

```
#StudentDetail
1.	In the example ‘StudentDetail’ class have some attributes which are required and some are optional.
2.	All attributes are declared as final so you have to set them all in constructor
3.	Also give the clients of this class an option to ignore the optional attributes

First option
Create the below:
-	Constructor that takes required attributes as parameters
-	Constructor that take required attributes + one optional
-	Constructor that takes optional attributes and so on

This approach works well when the attribute are less. But as the number of attributes increases it becomes difficult to read and maintain.
```

1.	Builder pattern is implemented by a class which have several methods to configure the final product.
2.	These methods return builder object.
3.	These methods can be called one after the other
4.	Once the product is completely configured a build() method is called to construct the object

# CreateStudentRecord – Uses a builder class to create a student record
`````
First call create the builder instance

Student student = new Student.called("Tom")
        .withLastName("Harry")
        .setAge(12)
        .setRollNumber(2)
        .build();
```

# Student – Class contains the attributes and getters of the class which you want to create

# StudentBuilder – Dedicated class used to create instance of ‘Student’ class
-	In this define the attributes
-	Builder methods
"# BuilderPattern" 

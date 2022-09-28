<a href="https://aws.amazon.com/cloudformation/" target="_blank"> <img src="https://www.vectorlogo.zone/logos/java/java-icon.svg" alt="aws" width="120" height="120"/> </a> 

# java2022 
<br>


### [Basics](https://github.com/kzs61/java2022/tree/master/intro/src/w01/day01)

* Variables, Data Types, String methods, Array, Control Flow Statements

* Resources
  * [Java Basics](https://dev.java/learn/java-language-basics)

<br>

### [W02 OOP1](https://github.com/kzs61/java2022/tree/master/w02-oop1)

* Objects, Classes, Packages, Inheritances

* Resources
  * [OOP](https://dev.java/oop/)

<br>

### [W02 Methods](https://github.com/kzs61/java2022/tree/master/w02-methods/src)

* [Method reusability](https://github.com/kzs61/java2022/tree/master/w02-methods/src)
* [Classes with attributes, Encapsulation and Constructor](https://github.com/kzs61/java2022/tree/master/w02-methods/src/w02_25_34/classes_with_attributes)
* [Constructor examples](https://github.com/kzs61/java2022/tree/master/w02-methods/src/constructors)
* [Classes recap](https://github.com/kzs61/java2022/tree/master/w02-methods/src/w02_25_34/recap_classes)
* [w02-25-34](https://github.com/kzs61/java2022/tree/master/w02-methods/src/w02_25_34)


#### w2 Notes:

_A [class](https://dev.java/oop/#class) is the blueprint from which individual objects are created._
_Objects are stored in heap memory and when not used collected by the Java garbage collector._
_In Java, all objects and arrays are reference types, and all primitives are value types._
<br>
[additional info](https://cs.lmu.edu/~ray/notes/javaclasses/)

 * [SOLID: Single responsibility policy](https://www.freecodecamp.org/news/solid-principles-single-responsibility-principle-explained/)
 * [JDBC](https://docs.oracle.com/javase/tutorial/jdbc/basics/index.html) Java Database Connectivity: standard Java API for database-independent connectivity between the Java programming language and a wide range of databases.

 * [fields/class variables](https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html)
_Sometimes, you want to have variables that are common to all objects. This is accomplished with the static modifier. Fields that have the static modifier in their declaration are called static fields or class variables. They are associated with the class, rather than with any object. Every instance of the class shares a class variable, which is in one fixed location in memory. Any object can change the value of a class variable, but class variables can also be manipulated without creating an instance of the class._


_public class fields are public by default:_ int id; String name;

[Encapsulation](https://www.codejava.net/java-core/the-java-language/what-is-encapsulation-in-java-the-what-why-and-how)
_Access modifier "private" is used to protect data and behaviors from outside_
_Increased security of data_
_Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)_

#### Encapsulation has a number of advantages that increase the reusability, flexibility and maintainability of the code.
##### Flexibility: 
_It’s more flexible and easy to change the encapsulated code with new requirements. For example, if the requirement for setting the price of a product changes, we can easily update the logic in the setter method setPrice()_  
##### Reusability: 
_Encapsulated code can be reused throughout the application or across multiple applications. For example, the Product class can be reused whenever such type of object is required_ 
##### Maintainability: 
_Application ode is encapsulated in separate units (classes, interfaces, methods, setters, getters, etc) so it’s easy to change or update a part of the application without affecting other parts, which reduces the time of maintenance_


#### Resources
  * [defining-methods](https://dev.java/learn/defining-methods/)
  * [java-methods](https://www.baeldung.com/java-methods)

<br>

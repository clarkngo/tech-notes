# Java
- created in 1995 by James Gosling from Sun Microsystems (now a subsidiary of Oracle).
- open-source
- objected-oritented (OO)

Note: *"Does that also mean that my Java skills will be easily replaceable?" To improve your value and employability you need to master not only the syntax of the language, but also the right set of Java-related technologies that are in demand."*

Life Cycle of a Java Program
- requires source code of your program to be compiled first.
- then gets converted to machine-specific code or a bytecode that is understood by a run-time engine or a virtual machine.
- syntax errors checked by a Java compiler.
- libraries of Java code can be added (linked) to your program after compilation is complete (deployment stage).

Java Development Kit (JDK)
- if you plan to develop Java programs
- Two types of download
  - Java Standard Edition (SE)
  - Java Standard Enteprise Edition (EE)
    - includes server-side tools and libraries
- Note: already preinstalled on Mac OS X

Java Runtime Environment (JRE)
- if you only want to run Java programs

`javac` compiler
- part of JDK
- you need to add the directory in which the `javac` compiler resides to the system variable `PATH`.

Eclipse IDE
- open-source product donated by IBM
- has Rich Client Platform (RCP) to develop user interfaces (UIs) for applications.
- supports plug-ins such as displaying UML diagrams.

# Object-Oriented Programming
```
class Car{
  String color;
    int numberOfDoors;

    void startEngine {
    // Some code goes here
  }
    void stopEngine {
    int tempCounter=0;
    // Some code goes here
  }
}
```

class named `Car`
- has methods:
  - `startEngine`
  - `stopEngine`

```
class JamesBondCar extends Car{
    int currentSubmergeDepth;
    boolean isGunOnBoard=true;
    final String MANUFACTURER;

    void submerge {
        currentSubmergeDepth = 50;
        // Some code goes here
    }
    void surface {
      // Some code goes here
    }
}
```

`class JamesBondCar extends Car``
- inherits properties of class named `Car`

To instantiate a class (to put one more car on the road)
- `JamesBondCar car1 = new JamesBondCar();`
- `JamesBondCar car2 = new JamesBondCar();`

# VARIABLES, CONSTANTS, AND DATA TYPES

Variables
- can change over time

Constants
- remain the same
- add `final` to the declaration line:
  - `final String MANUFACTURER`
- can only be assigned once and can't change during the life span of this object:
  - `MANUFACTURER = "J.B. Limited";`
- best practice is to initialize the final variables duration declaration:
  - `final String MANUFACTURER = "J.B. Limited";`

Declaring variables
- Java is a statically typed language: The program variables must be declared (named and typed) first, and then you can assign them values 

8 Primitive Data Types
- integer values
  - byte
  - short
  - int
  - long
- values with decimal point
  - float
  - double
- storing single characters
  - char
- for Boolean data
  - boolean

Variable Scope
- variable declare inside a method means that the variable has a local scope.

- when a method completes it execution, all local variables are automatically removed from memory by Java's *garbage collector**.

- scope is tighter
  - variables declared in a `for` loop will not be accessible outside the `for` loop even if inside the same method.

- declare variable on a class level
  - if need to be accessible for more than one class method

# WRAPPERS, AUTOBOXING, AND UNBOXING
Primitive data types have their corresponding `wrapper classes` that contain useful methods dealng with respective data types.

Useful functions like:
- conversion of String into an int
- turning an int into a float
- `Integer` class allows you to set minimum and maximum values for the number in question.

Some Java collections can't store primitives (such as `ArrayList`) and so primitives have to be wrapped into objects
```
ArrayList myLotteryNumbers = new ArrayList();
myLotteryNumbers.add(new Integer(6));
myLotteryNumbers.add(new Integer(15));
```
You don't need to explicitly create a new instance for every primitive as in the preceding code snippet. You can simply write `myLotteryNumbers.add (6);` and the primitive value 6 will automatically be wrapped into an instance of the `Integer` class. This feature is called autoboxing.

This is also valid:
```
int luckyNumber= myLotteryNumber.get(23);
```

Even though get (23) will return the value of the 24th element (the numbering in Java collections starts with zero) as an Integer object, that object will automatically be converted into a primitive. This is called unboxing.

First Useful Program
```
    class Tax{
               double grossIncome;
              String state;
              int dependents;

              public double calcTax() {

                  return 234.55;
              }
    }
```

The `calcTax()` method signature tells the following:
- Any external class can access this method (public).
- This method will return a value of type double.
- The name of the method is calcTax.
- empty parentheses means it does not have any arguments. Meaning, it coes not need any values from outside `Tax` to perform any data for calculation
- Also doesn't use any data. tax value of $234.55 is hard-coded

Inheritance in OO
- Ability to define a new class based on an existing one.

Method Overriding in OO
Handy in the following situations
- The source code of superclass is not available, but you still need to change its functionality.
- The original version of the method is still valid in some cases and you want to keep it intact.
- You use method overriding to enable polymorphism.

Method Overloading 
- having a class with more than one method having the same name but different argument lists.
- JDK function `println()` declared in the class `PrintStream`
  - http://java.sun.com/javase/6/docs/api/java/io/PrintStream.html

Constructors
- When a program creates an instance of a class, Java invokes the class's constructor - a special method that is called only once when the instance is being built with the operator `new`.
  -`Tax t = new Tax();`
- called when class is being instatiated.
- must have the same name as the class they're in.
- can't return a value.
- can't specify keyword `void` as a return type.

Keyword `super`
- enables you to explicitly call the method or a constructor from the ancestor's class.
  - `super.calcTax()`

Keyword `this`
- useful when you need to refer to the instance of the class from its method.
  - `this.grossIncome = 50000;`
- If there were only one `grossIncome` variable in the class `Tax`, you could omit `this` prefix.

Passing By Value or By Reference
- Calling a method with arguments enables you to pass some required data to the method. The question is how JVM passes these values to the method. Does it create a copy of a variable in a calling program and give it to the method?
- The primitive values are passed by value (meaning that an extra copy will be created in memory for each variable).

Keyword `static`
- Java has a special keyword, `static`, that indicates that the class variable will be shared by all instances of the same class.
- If the class Tax had the declaration static double grossIncome; then this variable's value would be shared by all instances of the class Tax, which doesn't make sense. Besides, after the creation of two instances (t1 and t2), as in the preceding code, the first value of the variable (50000) would be overwritten with the second one (65000).
- Example:
  - The following function converts Fahrenheit to Celsius and returns the result:
  - ``` 

     class WeatherReport{
           static double convertToCelsius(double far){
                return ((far - 32) * 5 / 9);
         }
     }
     ```
  - You can call this function from another class without the need to instantiate WeatherReport first:
  - `double centigrees=WeatherReport.convertToCelsius(98.7);`

# Java Basics
Arrays
- data storage used to store multiple values of the same type.
```
  String [] friends = new String [20]; // Declare and instantiate array
  friends[0] = "Masha"; //Initialize the first element
  friends[1] = "Matilda"; //Initialize the second element
  friends[2] = "Rosa";

  // Keep initializing the elements of the array here

  friends[19] = "Natasha";               //Initialize the last element
```

Two formats of declarations:
```
  String friends[];
  String[] friends;
```
- You must know the size of the array before assigning values to its elements. 
- If you want to be able to dynamically change the size of an array during the run time, consider other Java collection classes from the package java.util, such as Vector and ArrayList. 
- Java has lots of collection classes that can store multiple related values, for example HashMap, List, and LinkedList.

- length of array `.length`
- declare, instantiate, and populate array:
  - `String [] friends = {"Masha", "Matilda", "Rosa", "Sharon"};`
- two-dimensional array
```
    String friends [][] = new String [20][2];
    friends[0][0] = "Masha";
    friends[0][1] = "732 111-2222";
    friends[1][0] = "Matilda";
    friends[1][1] = "718 111-2222";
    ...
    friends[19][0] = "Sharon";
    friends[19][1] = "212 111-2222"
```

Loops
- repeat the same actions multiple times.
```
      int totalElements = friends.length;

      for (int i=0; i < totalElements;i++){
          System.out.println("I love " + friends[i]);
      }
```
Example:
```
 public class Girlfriends2 {

       public static void main(String[] args) {
              String [] friends = new String [20];
              friends[0] = "Masha";
              friends[1] = "Matilda";
              friends[2] = "Rosa";
              friends[18] = "Hillary";
              friends[19] = "Natasha";

              int totalElements = friends.length;
              int i;
              for (i=0; i<totalElements;i++){
                  System.out.println("I love " + friends[i]);
              }
       }
 }
 ```
 Output:
 ```
     I love Masha
    I love Matilda
    I love Rosa
    I love null
    I love null
    I love null
    I love null
    I love null
    I love null
    I love null
    I love null
    I love null
    I love null
    I love null
    I love null
    I love null
    I love null
    I love null
    I love Hillary
    I love Natasha
```

- The keyword null represents an absence of any value in an object. Even though the size of this array is 20, only five elements were initialized.

`for-each` loop
- elegant and short loop notation
```
  for (String girl: friends){
      System.out.println("I love " + girl);
  }
```

While loop
- use when you don't know the size of array but just the condition of exit from the loop
```
  int totalElements = friends.length;
  int i =0;
  while (i<totalElements){
     System.out.println("I love " + friends[i]);
      i++; // the same as i=i+l;
  }
```
- Keyword `break` on while loop
  - prematurely jump out of the loop
- Keyword `continue` on while loop
  - force the loop to jump up

do-while
- guarantees that the code written in the body of the loop will be executed at least once.
```
 do {
      System.out.println("Reading the element" + i +" of array friends");
      if (friends[i]==null){
          i++;
          continue;
      }
      System.out.println("I love " + friends[i]);
      i++;
                      }
 } while (i<totalElements);
```

# Debudding Java Programs
Bug is an error in a program that causes the program to work in an unexpected way.
  - run-time enemies
Don't confuse a bug with a syntax error
  - this is caught by the Java compiler before you even start the program

Ways to debug
  - printing the value of *suspicious variables* with `System.out.println()`.
  - use of logging API with Java package `java.util.logging`.

# IF and Switch
# Command-Line Arguments
 After development in Eclipse or another IDE is done, Java programs are deployed in production and will be started from a command line — usually you get an icon to click that runs a command to start a program, but under the hood the operating system executes a command that starts your program.
- run a program
  - `java TestTax`
- run a program with String array as argument
  - java TestTax 5000 NJ 2
    - the method main(String[] args) of the class TestTax receives this data as a String array that I decided to call args.
      - args[0] = "50000";
      - args[1] = "NJ";
      - args [2] = "2";

# Packages, Interfaces, and Encapsulation
Java Packages
- A decently size project can have hundreds of Java classes and you need to organize them in packages (think file directories). This will allow you to categorize files, control access to your classes (see the section "Access Levels" later in this chapter), and avoid potential naming conflicts: If both you and your colleague coincidentally decide to call a class Util, this won't be a problem as long as these classes are located in different packages.
- Sometimes you'll be using third-party libraries of Java classes written in a different department or even outside your firm. To minimize the chances that package names will be the same, it's common to use so-called reverse domain name conventions. For example, if you work for a company called Acme, which has the website acme. com, you can prefix all package names with com. acme. To place a Java class in a certain package, add the package statement at the beginning of the class (it must be the first non-comment statement in the class). For example, if the class Tax has been developed for the Accounting department, you can declare it as follows:
```
  package com.acme.accounting;
  class Tax {
     // the class body goes here
  }
```
- If you declare the class Tax as shown in the preceding code, the file Tax.java must be stored in the corresponding directory
```
      Com
            Acme
               Accounting
```
- Let's say your Tax class needs to connect to some URL on the Net with the help of the class URL located in the java.net package. You can write code containing the fully qualified name of this second class:
```
java.net.URL myURL = new java.net.URL ("http://www.acme.com");
```
- But instead of using this rather long notation, include the import statement right above the class declaration, and then use just the name of the class:

```
   import java.net.URL;
   class Tax{
      URL myURL = new URL("http://www.acme.com");
      ...
   }
```
- If you need to import several classes from the same package, use the wild card in the import statement rather then listing each of the classes on a separate line:
```
   import java.net.*;
```

Encapsulation
- Encapsulation is the ability to hide and protect data stored in Java objects. You may ask, "Who are the bad guys who want to illegally access my data?" It's not about bad guys. When a developer creates a Java class, he or she plans for a certain use pattern of this code by other classes. For example, the variable grossIncome should not be modified directly, but via a method that performs some validation procedures to ensure that the value to be assigned meets application-specific rules.
- A Java developer may decide to "hide" 15 out of 20 variables, say, so other classes can't access them. Imagine how many parts exist in a car and how many functions those parts can perform. Does the driver need to know about all of them? Of course not. The driver needs to know how to start and stop the car, how to indicate turns, open the windows, turn on the wipers, and do a few dozen other simple operations, which in programming jargon can be called the car's public interface.

- Access Levels
  - Java classes, methods, and member variables can have public, private, protected, and package access levels, for example:
```
   public class Tax {
      private double grossIncome;
      private String state;
      private int dependents;
      protected double calcTax(...) {...)
   }
```
  - The keyword `public` means that this element (a class, a method, or a variable) can be accessed from any other Java class.
  - The keyword `protected` makes the element "visible" not only from the current class, but from its subclasses too.
  - The keyword `private` is the most restrictive one, as it makes a member variable or a method accessible only inside this class.
  - If you do not specify any access level, the default is package, which means that only classes located in the same package will have access to this method or variable.
  - If you are not sure which access level to give to methods or variables, just make them all private; if later on during development some other class needs to access them, you can always change the access level to be less restrictive. 

# Keyword `Final`
- `final` Variables
  - A final variable becomes a constant that can be initialized only once and can't change its value during the run time. Some people may argue that a constant and a variable that can get initialized only once are not the same thing, but the fact that you can't change their values makes them very similar.
- `final` Methods
  - method can't be overridden if someone decides to extend the class.
- `final` Classes
  - no one will be able to subclass.

# Interfaces
There are different approaches to how to start designing a class. Some people think of the behavior it should support. The behavior is implemented in a class in the form of methods, which can be declared in a separate entity called an interface. Then have your class implement this interface. 

- Marker Interfaces
  - Marker interfaces are those that don't have any methods declared. One example of such an interface is Serializable
# CASTING
All Java classes form an inheritance tree with the class Object on top of the hierarchy — all Java classes are direct or indirect descendants of Object. When you declare a non-primitive variable, you are allowed to use either the exact data type of this variable or one of its ancestor data types. For example, if the class NJTax extends Tax, each of the following lines is correct.

```
        NJTax myTax1 = new NJTax();
        Tax myTax2 = new NJTax(); // upcasting
        Object myTax3 = new NJTax(); // upcasting
```
- Java is smart enough to automatically cast an instance of the class to its ancestor. When the variable has more generic type than an instance of the object this is called upcasting. Let's say the class object has 10 methods and class variables defined, the class Tax (an implicit subclass of Object) adds five more methods and variables (making 15), and NJTax adds another two (total 17). The variable myTaxl will have access to all 17 methods and variables, myTax2 will see only 15, and myTax3 just 10. Why not always use exact types in variable declarations?

# Programming with Abstract Classes and Interfaces
- ABSTRACT CLASSES
  - If a class is declared abstract it can't be instantiated. The keyword abstract has to be placed in the declaration of a class. The abstract class may have abstract method(s). The question is "Who needs a class that can't be instantiated??"
- Assignment
  - A company has employees and contractors. Design the classes without using interfaces to represent the people who work for this company. The classes should have the following methods:
```
       changeAddress()
       promote()
       giveDayOff()
       increasePay()
```



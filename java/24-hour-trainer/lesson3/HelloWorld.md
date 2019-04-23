```
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
```

`public static void main`
- access level `public`
  - means the method `main()` can be accessed by any other Java class
- instructions on usage `static`
  - means you don't have to create an instance of this class to use this method
- return value `void`
  - doesn't return any value to the calling program
- name of the method `main`
  - starting point of your program
- argument list `string[] args`
  - tells us this method will receive an array of characters as the argument


`System.out.println("Hello World");`
- `System` represents another Java class
- The dot notation `System.out` means the variable out is defined inside the class `System`.
- `out.println()` tells you that there is an object represented by a variable and it has a method called `println()`.



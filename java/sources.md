# Vectors
https://beginnersbook.com/2013/12/vector-in-java/



# Why should the static field be accessed in a static way?
Source: https://stackoverflow.com/questions/5642834/why-should-the-static-field-be-accessed-in-a-static-way

Because when you access a static field, you should do so on the class (or in this case the enum). As in
```
MyUnits.MILLISECONDS;
```
Not on an instance as in
```
m.MILLISECONDS;
```
Edit To address the question of why: In Java, when you declare something as static, you are saying that it is a member of the class, not the object (hence why there is only one). Therefore it doesn't make sense to access it on the object, because that particular data member is associated with the class.
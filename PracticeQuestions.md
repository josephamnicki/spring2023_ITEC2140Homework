#  Answer to each question in details (You can google to find answers)
Joseph Amnicki

- What is Java and what are its key features?
  Java is a programming language that utilizes object-oriented programming as one of its key features.
- How do you declare and use variables in Java?
  Variables in Java area declared by stating the type first then the variable name.
- What is a class in Java and how do you define one?
  A class in Java is a blueprint for a group of object. Classes are defined by writing the word
class, then writing a class name (ex: class Main).
- What is encapsulation and how is it achieved in Java?
Encapsulation occurs when data is wrapped into a single unit. Encapsulation can be achieved
by declaring instance variables as private in order to prevent outside access to these variables.
To use these variables outside, getters and setters can be created for these variables.
- How do you create objects in Java and what is their role in the program?
Objects are used to improve run time and optimize code in a program.
Objects are created by first declaring a variable with a name and type, then using the new name to create an object.
Afterwards, the object name can be called to a constructor to initialize the object.
- What is the difference between a method and a constructor in Java?
  Constructors are used to initialize objects whereas methods can be used on their own to
  perform actions.
- How do you implement inheritance in Java and what are its benefits?
Inheritance is implemented through the extends keyword. From the base class, the objects and methods used in this class
can be used in another class, leading to inheritance into a subclass. Inheritance allows for code to be reused as well as
allowing for abstraction.
- What is abstraction and how is it achieved in Java?
Abstraction is a property of data where only essential details are shown in a program. Abstraction can be 
achieved by using abstract classes (however, these classes can not be created as objects).
- How do you work with arrays and ArrayLists in Java and what are their differences?
  Arrays have a fixed length which cannot be modified while the length of an ArrayList can be modified.
- How do you use control statements such as if, else, and switch in Java?
Control statements operate based on an input condition. Depending on the current conditions and if they match with the control statement 
conditions, an action will be carried out based on how conditions are met.
- What is a loop and how do you implement it in Java?
A loop is a block of code which will continue to be carried out until a condition is met. To implement a loop, first a variable to loop through must be created (ex:i = 0).
Afterwards, a condition based on this variable needs to be created to determine the number of times the loop is completed. Finally, the actions done in the loop and loop update are created.
- What is a method signature in Java and why is it important?
  A method signature is the combination of a method's name and its parameters. This is important since a method signature allows
  for differentiation between the same method with different parameters.
- What is a package in Java and how do you create one?  
  A package is a group of classes which can be created by declaring the word package then the package name (ex: package firstPackage;).
- How do you use the String class in Java and what are some of its useful methods?
The String class is used to create a sequence of characters which cannot be changed. Some useful methods for the 
String class are length(), charAt(), contains(), substring(), and indexOf().
- What is a constructor in Java and how is it used to create objects?
A constructor is a method which is used to initialize objects. Once an object is created, a constructor will be called to initialize the object
and set the initial value for any attributes in the object.
- How do you implement encapsulation in Java and why are they important in OOP?
Encapsulation is implemented by declaring instance variables as private to only access them within the class they are declared in. If these
variables wish to be used outside, public getters and setters can be created to allow access while maintaining consistency.
Encapsulation is important since it allows for greater flexibility in variables and how they are read or written as well as 
hiding data details within code.
- What is object-oriented programming and what are its main principles?
Object-oriented programming is a form of programming which uses objects as the main source of implementing data.
The four main principles are abstraction, encapsulation, polymorphism, and inheritance.
- What is the difference between a class and an object in OOP?
  In OOP, classes serve as a blueprint for creating objects whereas objects are instances of a class.
- What are the access modifiers in Java and how are they used to control access to class members?
Access modifiers are keywords which control the visibility of methods and constructors within a class. 
The private modifier only allows for access from within the same class, not outside. A public modifier allows for access from anywhere.
- How do you implement method overloading and overriding in Java?
Method overloading can be implemented through changing the number of arguments a method takes or changing the data type taken by a method.
Method overriding can be implemented by calling a method from the base class in a subclass through an object of the subclass.
- How do you create and manipulate String objects in Java?
  Strings can be created by declaring a String type variable. To manipulate a string, StringBuilder is needed to manipulate
  the same string multiple times.
- What is the purpose of the length() method in the String class?
  The length() method will give you the number of characters in a String.
- How do you concatenate Strings in Java and what is the most efficient way to do so?
  Strings can be concatenated by using the + operator or using the concat() method.
- What is a substring in Java and how do you extract it from a String?
  A substring is a part of a string which is extracted using the substring() method.
- How do you compare Strings in Java and what is the difference between == and equals()?
  Strings can be compared using == or the .equals() method. The main difference between these two
  is that == is an operator that checks the initial locations of a String while .equals() is a method that checks the current value for a String.
- What is the role of the char data type in Java and how is it used?
  The char data type is used to store characters and can be used to determine matching characters within a String.
- What is Unicode and how does it relate to the char data type in Java?
  Unicode is a standard which assigns a unique number for each character in Java, using two bytes per character.
- How do you convert a char to a String in Java and vice versa?
  A character can be converted into a String using the toString() method.
- What is the difference between char and Character in Java?
  Character is an object which is used to wrap around methods while char is a primitive type to
  represent a character.
- What are escape sequences and how are they used with characters in Java?
  Escape sequences are used for formatting in Java within a text by using a \ with a character.
- How do you create a char array in Java and what are its uses?
A char array can be created by writing char[] <array name> = new char[n]; with n representing the length of the array, or by listing characters in curly
brackets on the right side of the array creation. A char array can be used to store values that can be overwritten and create Strings.
- What is the ASCII code and how is it related to the char data type?
ASCII code is the most common encoding standard which assigns unique values to 128 characters. Originally, characters used the 
ASCII format, now the char type follows the Unicode system.
- How do you convert a character to its corresponding ASCII value in Java?
A character can be converted to its ASCII value by assigning a character to an int type variable.
- What is a Unicode character and how is it represented in Java?
A Unicode character is a type of character which is assigned a unique number value for each character. In Java,
Unicode characters are represented as hexadecimal values.
- How do you determine the type of a character in Java?
The type of a character can be determined by using the getType() method or other methods such as
 isDigit() and isLetter().
- How do you perform case conversion on a character in Java?
Case conversion can be done on characters using the toUpperCase() and toLowerCase() methods,
changing characters to upper case and lower case characters.
- What are some of the useful methods available in the Character class in Java?
Some useful Character methods are toLowerCase() (changes character to lowercase if there is an uppercase character),
toUpperCase() (uppercase characters become lowercase), and toString() (represents a character as a String). 
- How do you compare characters in Java and what is the difference between == and equals() when used with characters?
Characters can be compared using operators (>, <, ==) or by using the equals() method. The difference between == and equals()
is that == checks if both objects being compared share the same memory location. The equals() method
checks if the content of both objects being compared are the same.

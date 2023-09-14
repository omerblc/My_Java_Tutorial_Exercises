class _1_helloWorld {
  public static void main(String[] args) {
    System.out.println("hello world");
  }
}

// A class — in the context of Java — is a template used to create objects and to define object data types and methods. Classes are categories, and objects are items within each category.
//public is a Java keyword which declares a member's access as public. Public members are visible to all other classes. This means that any other class can access a public field or method. Further, other classes can modify public fields unless the field is declared as final .
// What does static mean? When you declare a variable or a method as static, it belongs to the class, rather than a specific instance. This means that only one instance of a static member exists, even if you create multiple objects of the class, or if you don't create any.
// Void used at method declaration and definition to specify that the method does not return any type, the method returns void .
// main(): It is a default signature which is predefined in the JVM. It is called by JVM to execute a program line by line and end the execution after completion of this method. We can also overload the main() method.
// String args[]: The main() method also accepts some data from the user. It accepts a group of strings, which is called a string array. It is used to hold the command line arguments in the form of string values.
// System. out. println is a method in Java that prints a message to the standard output (typically the console) and appends a newline character. It's widely used to display messages, data, and the results of operations during the execution of a program.

class AnotherClass {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}
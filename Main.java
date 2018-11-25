// Created by Gianni Perez
/** This program is a basic example of object oriented programming in the Java language,
 * It will cover many of the basics within the language and provide examples and descriptive
 * explanations regarding their uses and capabilities. As well as interactive segments.
 * **/

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    boolean sentinel = true;
    
      System.out.println("Hello, welcome to my program! Enter your name.");
      Scanner in = new Scanner(System.in);
      String user = in.nextLine();
      System.out.println("Hello " + user + "!");
      System.out.println("This program will go over some of the basic Java concepts.");
      System.out.println();
    
    DataTypes.main(user);
    StringMethods.main();
    FormatStrings.main();
    Casting.main();
    Methods.main();
    Random.main();
    MathClass.main();
    Ternary.main();
    Switch.main();
    CompareStrings.main();
    MathOperators.main();
    PlusPlus.main();
    PlusEquals.main();
    WhileLoops.main();
    ForLoops.main();
    BreakAndContinue.main();
    Overload2.main();
    Inheritance.main();
    Polymorphism.main();
    MyCar.showMake();
    Ford.showMake();
    Sub.main();
    OneDimensionalArrays.main();
    EnhancedForLoop.main();
    MultiDimensionalArrays.main();
    ArrayLists.main();


  }
}
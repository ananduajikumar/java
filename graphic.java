Graphic Package
------------------

rectangle.java
------------------
package Graphic;
public class rectangle {
 private double length;
 private double width;
 public rectangle(double len, double wid) {
 length = len;
 width = wid;
 }
 public double calculateArea() {
 return length * width;
 }
}

Triangle.java
--------------
package Graphic;
public class Triangle {
 private double base;
 private double height;
 public Triangle(double b, double h) {
 base = b;
 height = h;
 }
 public double calculateArea() {
 return 0.5 * base * height;
 }
}

Square.java
--------------
package Graphic;
public class Square {
 private double side;
 public Square(double s) {
 side = s;
 }
 public double calculateArea() {
 return side * side;
 }
}

Circle.java
----------------
package Graphic;
public class Circle {
 private double radius;
 public Circle(double r) {
 radius = r;
 }
 public double calculateArea() {
 return Math.PI * radius * radius;
 }
}

TestShape.java
------------------

import Graphic.rectangle;
import Graphic.Triangle;
import Graphic.Square;
import Graphic.Circle;
public class TestShapes {
 public static void main(String[] args) {
 
 rectangle rectangle = new rectangle(5, 3);
 Triangle triangle = new Triangle(4, 6);
 Square square = new Square(4);
 Circle circle = new Circle(3);
 System.out.println("Area of Rectangle: " + rectangle.calculateArea());
 System.out.println("Area of Triangle: " + triangle.calculateArea());
 System.out.println("Area of Square: " + square.calculateArea());
 System.out.println("Area of Circle: " + circle.calculateArea());
 }
}



                   output
--------------------------------------------
C:\Users\mlm\.jdks\openjdk-21.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\lib\idea_rt.jar=60734:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\mlm\IdeaProjects\matrixaddd
Area of Rectangle: 15.0
Area of Triangle: 12.0
Area of Square: 16.0
Area of Circle: 28.274333882308138

Process finished with exit code 0
==============================================================



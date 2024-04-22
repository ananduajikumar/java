Arithmetic package
-------------------
Add.java:
------------
package Arithmetic;
public class Add
{
    public int sum(int x,int y)
    {
        return x+y;
    }
}

div.java
------------
package Arithmetic;
public class div
{
    public double Quotient(int x, int y)
    {

        return  x/y;
    }
}

mult.java
-----------------
package Arithmetic;
public class Mult
{
    public int Product(int x,int y)
    {
        return x*y;
    }
}


Subtract.java
-------------------------
package Arithmetic;
public class Subtract
{
    public int diff(int x,int y)
    {
        return x-y;
    }
}package Arithmetic;
public class Subtract
{
    public int diff(int x,int y)
    {
        return x-y;
    }
}

operations.java
---------------------------
import Arithmetic.*;
class Operations
{
    public static void main(String[] args)
    {
        Add ob1 = new Add();

        Subtract ob2 = new Subtract();
        int a= ob2.diff(5,3);
        Mult ob3 = new Mult();
        int b= ob3.Product(5,3);
        div ob = new div();
        double c= ob.Quotient(2,2);
        int s=ob1.sum(1,2);
        System.out.println("Subtracted value:" + a ) ;
        System.out.println("Multiplied  value:" + b ) ;
        System.out.println("sum value:" + s ) ;
        System.out.println("Divided value:" + c ) ;

    }
}



                               output
==========================================================
C:\Users\mlm\.jdks\openjdk-21.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\lib\idea_rt.jar=61043:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\mlm\IdeaProjects\j2\out\production\j2 Operations
Subtracted value:2
Multiplied  value:15
sum value:3
Divided value:1.0

Process finished with exit code 0

------------------------------------------------

import java.util.Scanner;
class UsernameException extends Exception
{
    public UsernameException(String msg) {
        super(msg);
    }
}
class PasswordException extends Exception
{
    public PasswordException(String msg) {
        super(msg);
    }
}
class DemoExcp
{
    public static void main(String args[])
    {
        String name="bibin";
        String pass="bibin2002";
        Scanner s= new Scanner(System.in);
        System.out.print("Enter username :: ");
        String user=s.nextLine();
        System.out.print("Enter password :: ");
        String pwd=s.nextLine();
        try
        {
            if(!user.equals(name))
                throw new UsernameException("Username incorrect");
            else if(!pwd.equals(pass))
                throw new PasswordException("Password incorrect");
            else
                System.out.println("Login Successful !!!");
        }
        catch(UsernameException u)
        {
            u.printStackTrace();
        }

        catch(PasswordException p)
        {
            p.printStackTrace();
        }
    }
}


                          output
-----------------------------------------------
C:\Users\mlm\.jdks\openjdk-21.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\lib\idea_rt.jar=61168:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\mlm\IdeaProjects\j2\out\production\j2 DemoExcp
Enter username :: bibin
Enter password :: bibin2002
Login Successful !!!

Process finished with exit code 0
=============================================================

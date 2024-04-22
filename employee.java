import java.util.*;
class employee
{
    int eno,esalary;
    String ename;
    employee(String a,int b,int c)
    {
        ename=a;
        eno=b;
        esalary=c;

    }
    int return_id()
    {
        return eno;
    }

}
class company
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        employee E[]=new employee[5];

    int n,id,salary;
    String name1;
    System.out.println("Enter number of employees:");
    n=s.nextInt();
    s.nextLine();
    for(int i=0;i<n;i++)

    {
        System.out.println("Enter the employee details:");
        System.out.println("Enter the employee id:");
        id = s.nextInt();
        s.nextLine();
        System.out.println("Enter the employee name:");
        name1 = s.nextLine();
        System.out.println("Enter the employee salary:");
        salary = s.nextInt();
        s.nextLine();
        E[i] = new employee(name1, id, salary);
    }
        System.out.println("Enter id of the employee to be search:");
    int ele=s.nextInt();
    int h,f=0;
    for(int i=0;i<n;i++)
    {
        h=E[i].return_id();
        if(ele==h)
        {
            f=f+1;

        }
    }
    if(f>0)
    {
        System.out.println("The employee having id"+ele+"is present");

    }else

    {

        System.out.println("The employee having id" + ele + "is not present");
    }


}}



                                               output
                                       =========================

C:\Users\mlm\.jdks\openjdk-21.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\lib\idea_rt.jar=50619:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\mlm\IdeaProjects\j2\out\production\j2 company
Enter number of employees:
3
Enter the employee details:
Enter the employee id:
1
Enter the employee name:
ram
Enter the employee salary:
1200
Enter the employee details:
Enter the employee id:
2
Enter the employee name:
ravi
Enter the employee salary:
1300
Enter the employee details:
Enter the employee id:
3
Enter the employee name:
raman
Enter the employee salary:
1400
Enter id of the employee to be search:
2
The employee having id2is present

Process finished with exit code 0

import java.util.Scanner;
class Arraysearch
{
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the Array Limit :");
        int l =input.nextInt();
        int [] a =new int[l];
        for(int i=0;i<l;i++)
        {
            System.out.printf("Element of a[%d] :",i);
            a[i]=input.nextInt();
        }
        System.out.print("Enter the Search Array Element :");
        int s =input.nextInt();
        int i,f=0;
        for(i=0; i<l; i++)
        {
            if(a[i]==s)
            {
                f=1;
                break;
            }
        }
        if(f==1)
        {
            System.out.printf("The Element is found in the position : %d", i + 1);
            System.out.printf("\nThe Element is found in the index : %d", i);
        }
        else
        {
            System.out.println("The Element is Not found");
        }
    }
}



                                           output

C:\Users\mlm\.jdks\openjdk-21.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\lib\idea_rt.jar=52646:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\mlm\IdeaProjects\j2\out\production\j2 Arraysearch
Enter the Array Limit :4
Element of a[0] :1
Element of a[1] :2
Element of a[2] :3
Element of a[3] :4
Enter the Search Array Element :3
The Element is found in the position : 3
The Element is found in the index : 2
Process finished with exit code 0

C:\Users\mlm\.jdks\openjdk-21.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\lib\idea_rt.jar=52651:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\mlm\IdeaProjects\j2\out\production\j2 Arraysearch
Enter the Array Limit :4
Element of a[0] :1
Element of a[1] :2
Element of a[2] :3
Element of a[3] :4
Enter the Search Array Element :6
The Element is Not found

Process finished with exit code 0

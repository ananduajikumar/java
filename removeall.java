import java.util.LinkedList;
public class RemoveAll {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");

        System.out.println("Initial LinkedList: " + linkedList);

        linkedList.clear();

        System.out.println("LinkedList after removing all elements: " + linkedList);
    }
}


                           output
                    ---------------------

C:\Users\mlm\.jdks\openjdk-21.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\lib\idea_rt.jar=62525:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\mlm\IdeaProjects\j2\out\production\j2 RemoveAll
Initial LinkedList: [Apple, Banana, Cherry, Date]
LinkedList after removing all elements: []

Process finished with exit code 0

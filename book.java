import java.util.Scanner;

class Publisher {
    String publisherName;

    // Parameterized constructor
    Publisher(String publisherName) {
        this.publisherName = publisherName;
    }
}

class Book extends Publisher {
    String bookName;
    int year;

    // Parameterized constructor
    Book(String publisherName, String bookName, int year) {
        super(publisherName);
        this.bookName = bookName;
        this.year = year;
    }
}

class Literature extends Book {
    // Parameterized constructor
    Literature(String publisherName, String bookName, int year) {
        super(publisherName, bookName, year);
    }
}

class Fiction extends Book {
    // Parameterized constructor
    Fiction(String publisherName, String bookName, int year) {
        super(publisherName, bookName, year);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example books
        Literature literatureBook = new Literature("Penguin", "To Kill a Mockingbird", 1960);
        Fiction fictionBook = new Fiction("HarperCollins", "Harry Potter and the Philosopher's Stone", 1997);

        // Display details of books
        System.out.println("Literature Book Details:");
        System.out.println("Publisher: " + literatureBook.publisherName);
        System.out.println("Book Name: " + literatureBook.bookName);
        System.out.println("Year: " + literatureBook.year);

        System.out.println("\nFiction Book Details:");
        System.out.println("Publisher: " + fictionBook.publisherName);
        System.out.println("Book Name: " + fictionBook.bookName);
        System.out.println("Year: " + fictionBook.year);

        scanner.close();
    }
}



                                     OUTPUT
=======================================================================

C:\Users\mlm\.jdks\openjdk-21.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\lib\idea_rt.jar=52031:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\mlm\IdeaProjects\j2\out\production\j2 Main
Literature Book Details:
Publisher: Penguin
Book Name: To Kill a Mockingbird
Year: 1960

Fiction Book Details:
Publisher: HarperCollins
Book Name: Harry Potter and the Philosopher's Stone
Year: 1997

Process finished with exit code 0

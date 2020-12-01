package Interface;

interface Printable {
    void print();
}

class Book implements Printable {
    String name;
    String author;

    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void print() {
        System.out.printf("%s (%s) \n", name, author);
    }
}

class Journal implements Printable {

    private String name;

    String getName() {
        return name;
    }

    Journal(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }
}

public class Inter {
    public static void main(String[] args) {

        Printable printable = createPrintable("Foreign Affairs",false);
        printable.print();

        new Book("Java for impatients", "Cay Horstmann").print();
        new Journal("Java Dayly News").print();
        Printable p =  new Journal("Java Dayly News");
        p.print();
    }

    static Printable createPrintable(String name, boolean option) {
        return option ? new Book(name, "Undefined") : new Journal(name);
    }
}


package Task_8;

public class Reader {
    private String name;
    private int number_of_readers_ticket;
    private String phone_number;
    private String faculty;
    private String birthday;

    public Reader(String name, int number_of_readers_ticket, String phone_number, String faculty, String birthday) {
        this.name = name;
        this.number_of_readers_ticket = number_of_readers_ticket;
        this.phone_number = phone_number;
        this.faculty = faculty;
        this.birthday = birthday;
    }

    public void takeBook(int count) {
        System.out.println(name + " взял " + count + " книги");
    }

    public void takeBook(String... books) {
        System.out.println(name + " взял книги: " + String.join(", ", books));
    }

    public void takeBook(Book... books) {
        String[] bookNames = new String[books.length];
        for (int i = 0; i < books.length; i++) {
            bookNames[i] = books[i].getTitle();
        }
        System.out.println(name + " взял книги: " + String.join(", ", bookNames));
    }

    public void returnBook(int count) {
        System.out.println(name + " вернул " + count + " книги");
    }

    public void returnBook(String... books) {
        System.out.println(name + " вернул книги: " + String.join(", ", books));
    }

    public void returnBook(Book... books) {
        String[] bookNames = new String[books.length];

        for (int i = 0; i < books.length; i++) {
            bookNames[i] = books[i].getTitle();
        }
        System.out.println(name + " вернул книги: " + String.join(", ", bookNames));
    }
}
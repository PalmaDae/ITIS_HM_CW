package Task_8;

public class Main {
    public static void main(String[] args) {
        Reader[] readers = {
                new Reader("Васька А.Д.", 69, "89120530904", "ИВМиИТ", "28.02.2006"),
                new Reader("Майкл Д.Д.", 73, "89393032017", "ФизФак", "30.05.2008")
        };

        Book book1 = new Book("Сапковский Анджей", "Ведьмак");
        Book book2 = new Book("Мартин Джордж", "Игра Престолов");
        Book book3 = new Book("Пелевин Виктор", "Empire V");
        Book book4 = new Book("Озон Великий", "Тихий Ден");
        Book book5 = new Book("Оруэлл Джордж", "1984");


        readers[0].takeBook(3);
        readers[0].takeBook("Это я - Эдичка", "Лунные хроники", "Скотный двор");
        readers[0].takeBook(book1, book2,book3);

        readers[1].returnBook(2);
        readers[1].returnBook("Generation П", "Хроники Нытика");
        readers[1].returnBook(book4, book5);
    }
}

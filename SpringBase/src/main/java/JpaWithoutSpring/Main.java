package JpaWithoutSpring;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("123456789", "Wilk z Wall Street", "Jordan Belfort");
        BookDao bookDao = new BookDaoImpl();
        bookDao.save(book);
        System.out.println("Book saved");

        Book book2 = new Book("1234", "Pan Tadeusz", " Adam Mickiewicz");
        bookDao.save(book2);
        bookDao.cleanUp();

    }

}

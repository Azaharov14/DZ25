//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author oneAuthor = new Author("Петя", "Петухов");
        System.out.println(oneAuthor.getName() + " " + oneAuthor.getSurname());
        Author twoAuthor = new Author("Ольга", "Романова");
        System.out.println(twoAuthor.getName() + " " + twoAuthor.getSurname());
        Book bigBook = new Book(2024, "Я чайник в JAVA", oneAuthor);
        System.out.println(bigBook.getNameBook() + " " + bigBook.getYear() + " " + oneAuthor.getName() + " " + oneAuthor.getSurname());
        Book smallBook = new Book(2024, "Чайнатаун", twoAuthor);
        System.out.println(smallBook.getNameBook() + " " + smallBook.getYear() + " " + twoAuthor.getName() + " " + twoAuthor.getSurname());
        smallBook.setYear(2029);
        System.out.println(smallBook.getYear());
    }
}

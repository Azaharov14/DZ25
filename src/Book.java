public class Book {
    private int year;
    private String nameBook;
    private Author creator;

    public Book(int year,String nameBook, Author creator) {
        this.year = year;
        this.nameBook = nameBook;
        this.creator = creator;
    }
    public int getYear(){
        return this.year;
    }
    public String getNameBook(){
        return this.nameBook;
    }
    public Author getCreator(){
        return this.creator;
    }
    public void setYear(int year){
        this.year = year;
    }
}

package assignmenttillFebJavaEkIS.FIVEprogramsForMethodOverLoading;
class Book {
    void displayInfo(String title) {
        System.out.println("Book Title: " + title);
    }

    void displayInfo(String title, String author) {
        System.out.println("Book Title: " + title + ", Author: " + author);
    }

    void displayInfo(String title, String author, int year) {
        System.out.println("Book Title: " + title + ", Author: " + author + ", Year: " + year);
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.displayInfo("The God of Small Things");
        book.displayInfo("Midnight's Children", "Salman Rushdie");
        book.displayInfo("The White Tiger", "Aravind Adiga", 2008);
    }
}

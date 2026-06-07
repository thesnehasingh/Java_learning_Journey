class Book {
    static int totalNoOfBooks; // static variable
    String author;
    String title; // non static variables
    String isbn;
    boolean isBorrowed;

    static{ //static block
        totalNoOfBooks = 0;
    }

    {
        totalNoOfBooks++; // object initializer
    }

    Book(String isbn, String title, String author){  // parameterized constructor
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn){  // parameterized constructor and we used constructor chaining
        this(isbn, "Unknown", "Unknown");
    }

    static int getTotalNoOfBooks(){ // static method
        return totalNoOfBooks;
    }

    void borrowBook(){ //instance method
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        }
        else{
            this.isBorrowed = true; // we can also use isBorrowed = true
            System.out.println("Enjoy the book");
        }
    }

    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed the " +title +" Please visit us again soon!");
        }
        else{
            System.out.println("This book is already in the library");
        }
    }

    public static void main(String[] args) {
        Book designOfThings = new Book("1", "Design", "TSS");
        Book myBook = new Book("2");
        System.out.println(Book.getTotalNoOfBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        myBook.returnBook();
        designOfThings.returnBook();
    }
}

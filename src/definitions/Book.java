/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String bookName;
    private String authorName;
    private String isbnNumber;

    public Book() {
        this.bookName = "Object Oriented Programming";
        this.authorName = "DS guru";
        this.isbnNumber = "2360145309685";
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String toString() {
        return " Book Name :" + getBookName() + "," + " Author Name :" + getAuthorName() + "," + " ISBN number :" + getIsbnNumber();
    }
}

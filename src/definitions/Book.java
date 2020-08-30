/*  Created by IntelliJ IDEA.
 *  User: Anushka Gupta
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookNames;
    private String authorNames;
    private String isbnNumbers;

    public Book() {
        this.bookNames = "Operating System";
        this.authorNames = "Robert Love";
        this.isbnNumbers = "2563140789632";
    }

    public Book(String bookNames, String authorNames, String isbnNumbers) {
        this.bookNames = bookNames;
        this.authorNames = authorNames;
        this.isbnNumbers = isbnNumbers;
    }

    public Book(String bookNames) {
        this.bookNames = bookNames;
    }

    public String getBookNames() {
        return bookNames;
    }

    public void setBookNames(String bookNames) {
        this.bookNames = bookNames;
    }

    public String getAuthorNames() {
        return authorNames;
    }

    public void setAuthorNames(String authorNames) {
        this.authorNames = authorNames;
    }

    public String getIsbnNumbers() {
        return isbnNumbers;
    }

    public void setIsbnNumbers(String isbnNumbers) {
        this.isbnNumbers = isbnNumbers;
    }

    public String toString() {
        return "Book name :" + getBookNames() + "," + "Author name :" + getAuthorNames() + "," + "ISBN number :" + getIsbnNumbers() + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getBookNames(), book.getBookNames()) &&
                Objects.equals(getAuthorNames(), book.getAuthorNames()) &&
                Objects.equals(getIsbnNumbers(), book.getIsbnNumbers());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookNames(), getAuthorNames(), getIsbnNumbers());
    }
}

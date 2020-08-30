/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] currentlyAvailable;

    public Library() {
        this.currentlyAvailable = new Book[30];
    }

    public Book[] getCurrentlyAvailable() {
        return currentlyAvailable.clone();
    }

    public void setCurrentlyAvailable(Book[] currentlyAvailable) {
        this.currentlyAvailable = currentlyAvailable;
    }

    public String toString() {
        return Arrays.toString(currentlyAvailable);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getCurrentlyAvailable(), library.getCurrentlyAvailable());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getCurrentlyAvailable());
    }

    /**
     * This method is used to issue the book from the library
     *
     * @param bookNames it ask the user to write the book name which you want to issue.
     */
    public void checkBook(String bookNames) {
        System.out.println(bookNames + "you issued the book from the library");
    }
}

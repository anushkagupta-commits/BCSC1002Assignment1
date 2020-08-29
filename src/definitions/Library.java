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
}

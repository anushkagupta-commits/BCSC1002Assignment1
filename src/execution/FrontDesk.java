/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static final int EXIT = 4;
    private static final int NEW_BOOK = 3;
    private static final int PREVIOUSLY_ISSUED_BOOK = 2;
    private static final int ALL1_ISSUED_BOOK = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();
        Library library = new Library();
        Student student = new Student();
    }
}

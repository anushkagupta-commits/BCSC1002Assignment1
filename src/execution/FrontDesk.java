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
    private static final int ALL_ISSUED_BOOK = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chooseNo = scanner.nextInt();
        String bookNames;
        Book book = new Book();
        Library library = new Library();
        Student student = new Student();

        System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
        System.out.println("How may I help you today?");
        System.out.println("1. Issue a new book for me.");
        System.out.println("2. Return a previously issues book for me.");
        System.out.println("3. Show me all my issues books.");
        System.out.println("4. Exit.");

        switch (chooseNo) {
            case NEW_BOOK:
                System.out.println("enter the anme of the book which you want to issue");
                bookNames = scanner.nextLine();
                library.checkBook(bookNames);
                break;
            case PREVIOUSLY_ISSUED_BOOK:
                System.out.println("enter the name of the book which you want to return");
                bookNames = scanner.nextLine();
                break;
            case ALL_ISSUED_BOOK:
                break;
            case EXIT:
                break;
            default:
                System.out.println("the no you entered is invalid please enter the right no");
        }
    }
}

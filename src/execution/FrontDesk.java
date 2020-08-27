/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;

public class FrontDesk {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookName("Object Oriented Programming");
        book.setAuthorName("DS Guru");
        book.setIsbnNumber("2896475103265");
        System.out.println(" Book name : " + book.getBookName() + "," + " Author name : " + book.getAuthorName() + "," + " 13 digit isbn number :" + book.getIsbnNumber());
    }
}

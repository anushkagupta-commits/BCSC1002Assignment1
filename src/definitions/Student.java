/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private String fullName;
    private long universityRollNo;
    private int bookIssued;
    private Book[] names;

    public Student(String firstName, String middleName, String lastName, String fullName, long universityRollNo, int bookIssued) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.universityRollNo = universityRollNo;
        this.bookIssued = bookIssued;
    }

    public Student() {
        this.names = new Book[10];
    }
}

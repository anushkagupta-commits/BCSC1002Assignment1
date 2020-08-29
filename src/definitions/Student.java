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
        this.names = new Book[30];
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public long getUniversityRollNo() {
        return universityRollNo;
    }

    public void setUniversityRollNo(long universityRollNo) {
        this.universityRollNo = universityRollNo;
    }

    public int bookIssued() {
        return bookIssued;
    }

    public void setBookIssued(int bookIssued) {
        this.bookIssued = bookIssued;
    }

    public Book[] getNames() {
        return names.clone();
    }

    public void setNames(Book[] names) {
        this.names = names;
    }
}

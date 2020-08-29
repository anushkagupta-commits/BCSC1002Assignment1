/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

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

    public int getBookIssued() {
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

    public String toString() {
        return "first name :" + getFirstName() + "," + "middle name :" + getMiddleName() + "," + "last name :" + getLastName() + "," + "full name :" + getFullName() + "," + "university roll no :" + getUniversityRollNo() + "," + "no of book issued :" + getBookIssued() + "," + "names of the book issued :" + Arrays.toString(names) + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getUniversityRollNo() == student.getUniversityRollNo() &&
                getBookIssued() == student.getBookIssued() &&
                Objects.equals(getFirstName(), student.getFirstName()) &&
                Objects.equals(getMiddleName(), student.getMiddleName()) &&
                Objects.equals(getLastName(), student.getLastName()) &&
                Objects.equals(getFullName(), student.getFullName()) &&
                Arrays.equals(getNames(), student.getNames());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getFirstName(), getMiddleName(), getLastName(), getFullName(), getUniversityRollNo(), getBookIssued());
        result = 31 * result + Arrays.hashCode(getNames());
        return result;
    }
}

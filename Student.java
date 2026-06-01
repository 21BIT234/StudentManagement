package VERICENCE;
public class Student {

    int stdId;
    String stdName;
    int age;
    String address;
    String contactNo;
    String stdClass;

    Student(int stdId, String stdName, int age,
            String address, String contactNo,
            String stdClass) {

        this.stdId = stdId;
        this.stdName = stdName;
        this.age = age;
        this.address = address;
        this.contactNo = contactNo;
        this.stdClass = stdClass;
    }

    @Override
    public String toString() {

        return "Student ID : " + stdId +
                ", Name : " + stdName +
                ", Age : " + age +
                ", Address : " + address +
                ", Contact No : " + contactNo +
                ", Class : " + stdClass;
    }
}
public class StudentDetail {
    private final String firstName; //required
    private final String lastName; //required
    private final int age; //required
    private final int rollNumber;//required
    private final String address; //optional
    private final String emailID; //optional


    public StudentDetail(String firstName, String lastName, int age, int rollNumber) {
        this(firstName, lastName, age, rollNumber, "", "");
    }

    public StudentDetail(String firstName, String lastName, int age, int rollNumber, String address) {
        this(firstName, lastName, age, rollNumber, address, "");

    }

    public StudentDetail(String firstName, String lastName, int age, int rollNumber, String address, String emailID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.rollNumber = rollNumber;
        this.address = address;
        this.emailID = emailID;
    }
}

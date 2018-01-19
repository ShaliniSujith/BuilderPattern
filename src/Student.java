public class Student {
    private final String firstName; //required
    private final String lastName; //required
    private final int age; //required
    private final int rollNumber;//required
    private String address; //optional
    private String emailID; //optional
    private String hobby; //optional


    public Student(String firstName, String lastName, int age, int rollNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.rollNumber = rollNumber;
        this.address = address;
        this.emailID = emailID;
        this.hobby = hobby;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getEmailID() {
        return emailID;
    }

    public String getHobby() {
        return hobby;
    }

    public static StudentBuilder called(String firstName){
        return new StudentBuilder(firstName);
    }
}

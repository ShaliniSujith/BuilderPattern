public class StudentBuilder {
    private final String firstName; //required
    private String lastName; //required
    private int age; //required
    private int rollNumber;//required


    public StudentBuilder(String firstName) {
        this.firstName = firstName;
    }

    public StudentBuilder withLastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public StudentBuilder setAge(int age){
        this.age = age;
        return this;
    }

    public StudentBuilder setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
        return this;
    }

    public Student build(){
        return new Student(firstName,lastName,age,rollNumber);
    }
}

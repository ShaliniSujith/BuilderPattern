public class CreateStudentRecord {
    public static void main(String[] args) {
        Student student = Student.called("Tom")
                .withLastName("Harry")
                .setAge(12)
                .setRollNumber(2)
                .build();
        System.out.println(student);
    }
}

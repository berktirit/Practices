package FifthWeek.StudentRecords;

// Record: Student
public record Student(String firstName, String lastName, String studentNumber) {
    public Student {
        if (firstName == null || lastName == null || studentNumber == null) {
            throw new IllegalArgumentException("Fields cannot be null");
        }
    }
}
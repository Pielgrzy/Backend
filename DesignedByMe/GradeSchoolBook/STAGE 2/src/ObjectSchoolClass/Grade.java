package ObjectSchoolClass;

public class Grade {

    private Subject subject;
    private Student student;
    private Double grade;

    public Grade(Subject subject, Student student, Double grade) {
        this.subject = subject;
        this.student = student;
        this.grade = grade;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Grade: " + grade + ", student: " + student.toString() + ", in subject: " + subject;

    }
}

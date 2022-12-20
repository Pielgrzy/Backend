package ObjectSchoolClass;

public class Grade {

    private Subject subject;
    private Student student;
    private double grade;

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

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Grade(Subject subject, Student student, double grade) {
        this.subject = subject;
        this.student = student;
        this.grade = grade;
    }
}

package Logic;

import ObjectSchoolClass.Grade;
import ObjectSchoolClass.Student;
import ObjectSchoolClass.Subject;

public class GradeSystem {
    private static String outOfRange = "No space for new grade";
    private static String emptyTable = "Grade table is empty";
    private static final int MAX_GRADE_RANGE = 10;
    private static Grade[] grades = new Grade[MAX_GRADE_RANGE];
    private static int currentGradeIndex = 0;

    public static void addGrade(Subject subject, Student student, double value) {

        if (currentGradeIndex <= MAX_GRADE_RANGE - 1) {
            Grade grade = new Grade(subject, student, value);
            grades[currentGradeIndex] = grade;
            currentGradeIndex++;
        } else {
            System.out.println(outOfRange);
        }
    }

    public static String printGradesAll() {
        StringBuilder gradesBuilder = new StringBuilder();
        if (currentGradeIndex == 0) {
            return emptyTable;
        }
        for (Grade grade : grades) {
            if (grade == null) {
                return gradesBuilder.toString();
            }
            gradesBuilder
                    .append(grade.getSubject())
                    .append(" ")
                    .append(grade.getStudent())
                    .append(" grade:")
                    .append(grade.getGrade()).append("\n");
        }
        return gradesBuilder.toString();
    }

    public static String printGradesForSubject(Subject subject) {
        StringBuilder gradesBuilder = new StringBuilder();
        if (currentGradeIndex == 0) {
            return emptyTable;
        }
        for (Grade grade : grades) {
            if (grade == null) {
                return subject + ":\n" + gradesBuilder.toString();
            } else if (subject.equals(grade.getSubject()))
                gradesBuilder
                        .append(grade.getStudent())
                        .append(" grade:")
                        .append(grade.getGrade()).append("\n");
        }
        return subject + ":\n" + gradesBuilder.toString();
    }

    public static String printGradeForStudent(Student student) {
        StringBuilder gradesBuilder = new StringBuilder();
        if (currentGradeIndex == 0) {
            return emptyTable;
        }
        for (Grade grade : grades) {
            if (grade == null) {
                return student + ":\n" + gradesBuilder.toString();
            } else if (student.equals(grade.getStudent()))
                gradesBuilder
                        .append(grade.getSubject())
                        .append(" grade:")
                        .append(grade.getGrade()).append("\n");
        }
        return student + ":\n" + gradesBuilder.toString();
    }
}


package TextAndEnumOptions;

public enum UserPrintOptionList {

    OPTION_PRINT_CLASS_BOOK("Print class book"),
    OPTION_PRINT_ALL_GRADES("Print all grades"),
    OPTION_PRINT_GRADES_FOR_SUBJECT("Print grades for subject"),
    OPTION_PRINT_GRADES_FOR_STUDENT("Print grades for student");

    String description;

    UserPrintOptionList(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

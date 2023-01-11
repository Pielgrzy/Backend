package TextAndEnumOptions;

public enum UserClassOptionList {
    OPTION_SUBJECT("Subject"),
    OPTION_STUDENT("Student"),
    OPTION_GRADE("Grade");

    String description;

    UserClassOptionList(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

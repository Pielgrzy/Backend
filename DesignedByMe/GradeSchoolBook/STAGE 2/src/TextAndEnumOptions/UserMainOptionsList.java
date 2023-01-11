package TextAndEnumOptions;

public enum UserMainOptionsList {
    OPTION_CREATE_CLASS_BOOK("Create new class book"),
    OPTION_ADD("Add"),
    OPTION_DELETE("Delete"),
    OPTION_PRINT("Print"),
    OPTION_CREATE_PREDEFINE_CLASS_BOOK("Create test class book"),
    OPTION_EXIT("Exit program");

    String description;

    UserMainOptionsList(String description) {

        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}


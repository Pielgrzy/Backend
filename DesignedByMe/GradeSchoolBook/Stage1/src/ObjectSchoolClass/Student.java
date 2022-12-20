package ObjectSchoolClass;

public class Student {
    private String name;
    private String lastname;
    private int index;

    public Student(String name, String lastname, int index) {
        this.name = name;
        this.lastname = lastname;
        this.index = index;
    }
//region ---GET/SET---
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;

    }
    //endregion


    @Override
    public String toString() {
        return name + " " + lastname + ", index: " + index;
    }
}

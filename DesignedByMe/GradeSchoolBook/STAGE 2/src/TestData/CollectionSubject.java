package TestData;
import ObjectSchoolClass.Subject;

import java.util.ArrayList;
import java.util.List;

public class CollectionSubject {
    public static List<Subject> subjects(){
        List<Subject> subjects = new ArrayList<>();
        subjects.add(new Subject("Programming"));
        subjects.add( new Subject("Logic"));
        subjects.add( new Subject("English"));
        return subjects;
    }
}

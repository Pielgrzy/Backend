package Data;
import ObjectSchoolClass.Subject;

public class CollectionSubject {
    public static Subject[] subjects(){
        Subject[] subjects = new Subject[3];
        subjects[0] = new Subject("Programming");
        subjects[1] = new Subject("Logic");
        subjects[2] = new Subject("English");
        return subjects;
    }
}

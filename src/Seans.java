import java.lang.instrument.ClassDefinition;
import java.time.LocalTime;
import java.util.Date;
import java.util.HashMap;

public class Seans {
    // Zmienne
    String title;
    Date day;
    LocalTime time;
    int ageRestrictions;
    HashMap<Character, HashMap<Integer, Boolean>> liczbaMiejsc;

    public Seans(String title, Date day, LocalTime time, int ageRestrictions,HashMap<Character, HashMap<Integer, Boolean>> liczbaMiejsc){
        this.title = title;
        this.day = day;
        this.time = time;
        this.ageRestrictions = ageRestrictions;
        this.liczbaMiejsc = liczbaMiejsc;
    }


}

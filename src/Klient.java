import java.io.Serializable;
import java.util.List;

public class Klient implements Serializable {
    private static final long serialVersionUID = -7887612267521882048L;
    String nazwisko;
    String email;
    String telefon;
    Seans seans;
    List<String> miejsca;

    public Klient(String nazwisko, String email, String telefon, Seans seans, List<String> miejsca){
        this.nazwisko = nazwisko;
        this.email = email;
        this.telefon = telefon;
        this.seans = seans;
        this.miejsca = miejsca;
        System.out.print("");
    }
}

import java.util.ArrayList;
import java.util.List;

public class Combattants {
    //Attributs
    private String idCombattant;
    private String nomCombattant;
    private String PrenomCombattant;
    private String nomDeCombat;
    private int poids;
    private List<String> titres= new ArrayList<>();

    //constructeur sans titre

    public Combattants(String idCombattant, String nomCombattant, String prenomCombattant, String nomDeCombat, int poids) {
        this.idCombattant = idCombattant;
        this.nomCombattant = nomCombattant;
        PrenomCombattant = prenomCombattant;
        this.nomDeCombat = nomDeCombat;
        this.poids = poids;
    }
    //constructeur sans titre

    public Combattants(String idCombattant, String nomCombattant, String prenomCombattant, String nomDeCombat, int poids, List<String> titres) {
        this.idCombattant = idCombattant;
        this.nomCombattant = nomCombattant;
        PrenomCombattant = prenomCombattant;
        this.nomDeCombat = nomDeCombat;
        this.poids = poids;
        this.titres = titres;
    }
    //getter

    public String getIdCombattant() {
        return idCombattant;
    }

    public String getNomCombattant() {
        return nomCombattant;
    }

    public String getPrenomCombattant() {
        return PrenomCombattant;
    }

    public String getNomDeCombat() {
        return nomDeCombat;
    }

    public int getPoids() {
        return poids;
    }

    public List<String> getTitres() {
        return titres;
    }
}

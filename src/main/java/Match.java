public abstract class Match {
    //Attribut
    private String idMatch;
    private String Date;
    private String Endroit;

    public Match(String idMatch, String date, String endroit) {
        this.idMatch = idMatch;
        Date = date;
        Endroit = endroit;
    }

    public String getIdMatch() {
        return idMatch;
    }

    public String getDate() {
        return Date;
    }

    public String getEndroit() {
        return Endroit;
    }
    public void terminer(){

    }
}

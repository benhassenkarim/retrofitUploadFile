package org.example;




public class SS_Arret {



    private Long  numArret ;
    private String   nomArret;
    private String   nonarabe;

    private int  numordre  ;
    private int km;



    public SS_Arret() {

    }

    public SS_Arret(String nomArret,String nonarabe ,int numordre, int km) {
        this.nomArret = nomArret;
        this.nonarabe = nonarabe;
        this.numordre = numordre;
        this.km = km;
    }

    public Long getNumArret() {
        return numArret;
    }

    public String getNomArret() {
        return nomArret;
    }

    public int getNumordre() {
        return numordre;
    }

    public int getKm() {
        return km;
    }

    public void setNumArret(Long numArret) {
        this.numArret = numArret;
    }

    public void setNomArret(String nomArret) {
        this.nomArret = nomArret;
    }

    public String getNonarabe() {
        return nonarabe;
    }

    public void setNonarabe(String nonarabe) {
        this.nonarabe = nonarabe;
    }

    public void setNumordre(int numordre) {
        this.numordre = numordre;
    }

    public void setKm(int km) {
        this.km = km;
    }
}

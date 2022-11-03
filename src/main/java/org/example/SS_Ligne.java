package org.example;


import java.util.List;


public class SS_Ligne  {

   private Long numssli;

    private int noarret;
    private float km;
    private String   h_aller;
    private String   h_retour;

    private String libel_ssli;
    private int code;

   private Ligne ligne;

    private List<SS_Arret> arretListe;

    public SS_Ligne() {
    }

    public SS_Ligne(int noarret, float km, String h_aller, String h_retour, String libel_ssli, int code, Ligne ligne, List<SS_Arret> arretListe) {
        this.noarret = noarret;
        this.km = km;
        this.h_aller = h_aller;
        this.h_retour = h_retour;
        this.libel_ssli = libel_ssli;
        this.code = code;
        this.ligne = ligne;
        this.arretListe = arretListe;
    }

    public Long getNumSsli() {
        return numssli;
    }

    public int getCode() {
        return code;
    }

    public List<SS_Arret> getArretListe() {
        return arretListe;
    }

    public int getNoarret() {
        return noarret;
    }

    public float getKm() {
        return km;
    }

    public String getH_aller() {
        return h_aller;
    }

    public String getH_retour() {
        return h_retour;
    }

    public String getLibel_ssli() {
        return libel_ssli;
    }

    public int getCodessli() {
        return code;
    }

    public Ligne getLigne() {
    return ligne;
    }

}

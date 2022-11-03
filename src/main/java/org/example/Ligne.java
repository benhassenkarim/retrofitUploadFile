package org.example;


import java.util.List;


public class Ligne {

    private Long idligne;
    private String  nomligne;
    private int  sens;
    private int  code;
    private boolean  climatise ;


    private List<SS_Ligne> sous_ligne;

    public Ligne() {
    }

    public Long getIdligne() {
        return idligne;
    }

    public String getNomligne() {
        return nomligne;
    }

    public int getSens() {
        return sens;
    }

    public int getCode() {
        return code;
    }

    public boolean isB_climatise() {
        return climatise;
    }

    public List<SS_Ligne> getSous_ligne() {
        return sous_ligne;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Ligne{" +
                "idligne=" + idligne +
                ", nomligne='" + nomligne + '\'' +
                ", sens=" + sens +
                ", code=" + code +
                ", climatise=" + climatise +
                ", sous_ligne=" + sous_ligne +
                '}';
    }
}

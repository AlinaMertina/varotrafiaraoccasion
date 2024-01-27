package com.pack.varotrafiaraoccasion.Work;

public class ValideAnnonceAdmin {
    Long idetat;
    Long idcaracteristique;
    Long idadmin;
    public Long getIdadmin() {
        return idadmin;
    }
    public void setIdadmin(Long idadmin) {
        this.idadmin = idadmin;
    }
    public Long getIdetat() {
        return idetat;
    }
    public void setIdetat(Long idetat) {
        this.idetat = idetat;
    }
    public Long getIdcaracteristique() {
        return idcaracteristique;
    }
    public void setIdcaracteristique(Long idcaracteristique) {
        this.idcaracteristique = idcaracteristique;
    }
    public ValideAnnonceAdmin(Long idetat, Long idcaracteristique) {
        this.idetat = idetat;
        this.idcaracteristique = idcaracteristique;
    }
    public ValideAnnonceAdmin(Long idetat, Long idcaracteristique, Long idadmin) {
        this.idetat = idetat;
        this.idcaracteristique = idcaracteristique;
        this.idadmin = idadmin;
    }
    public ValideAnnonceAdmin() {
    }

}

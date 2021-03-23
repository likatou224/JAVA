package sn.isi.entities;

public class Ecole {
    private int id;
    private String nomE;
    private Specialite specialite;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomEcole() {
        return nomE;
    }

    public void setNomEcole(String nomEcole) {
        this.nomE = nomEcole;
    }

    public Specialite getSpecialite() {
        return specialite;
    }

    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }
}

package sn.isi.enitities;

public class User {
    private int idU;
    private String nom;
    private String prenom;
    private String mail;
    private String password;

    public int getIdU() {
        return idU;
    }

    public void setIdU(int id) {
        this.idU = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

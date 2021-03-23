package sn.isi.services;

import sn.isi.entities.User;

import java.util.Scanner;

public class UserImp implements IUser{
    private Scanner sca = new Scanner(System.in);
    @Override
    public User saisie() {
        User u =new User();
        System.out.println("Entrer l'id");
        u.setId(Integer.parseInt(sca.nextLine()));
        System.out.println("Entrer le Prenom");
        u.setPrenom(sca.nextLine());
        System.out.println("Entrer le Nom");
        u.setNom(sca.nextLine());
        System.out.println("Entrer le Mail");
        u.setMail(sca.nextLine());
        System.out.println("Entrer le Mot de passe");
        u.setPassword(sca.nextLine());
        return u;
    }

    @Override
    public void afficher(User u){
        System.out.println("L'id est : "+u.getId());
        System.out.println("Nom est: "+u.getNom());
        System.out.println("Prenom  est: "+u.getPrenom());
        System.out.println("Mail est: "+u.getMail());
        System.out.println("Mot de passe est: "+u.getPassword());
    }
}

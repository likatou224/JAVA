package sn.isi.services;

import sn.isi.entities.Montre;

import java.util.Scanner;

public class MontreImp implements  IMontre{
    Montre montre = new Montre();
    private Scanner sca= new Scanner(System.in);
    @Override
    public Montre saisie() {
        System.out.println("Entrer l'Id : ");
        montre.setId(Integer.parseInt(sca.nextLine()));
        System.out.println("Entrer le Libeller : ");
        montre.setLib(sca.nextLine());
        System.out.println("Entrer la nature : ");
        montre.setNature(sca.nextLine());
        return montre;
    }

    @Override
    public void affiche(Montre montre) {
        System.out.println("l'ID est : "+montre.getId());
        System.out.println("le libelle est : "+montre.getLib());
        System.out.println("la nature est : "+montre.getNature());

    }
}

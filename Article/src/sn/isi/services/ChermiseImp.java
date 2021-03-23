package sn.isi.services;

import sn.isi.entities.Chemise;

import java.util.Scanner;

public class ChermiseImp implements IChemise{
    private Scanner sc=new Scanner(System.in);
    Chemise chemise = new Chemise();
    @Override
    public Chemise saisie() {
        System.out.println("Entrer l'id");
        chemise.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("Entrer le libelle");
        chemise.setLib(sc.nextLine());
        System.out.println("Entrer la couture");
        chemise.setCouture(sc.nextLine());
        return chemise;
    }

    @Override
    public void affiche(Chemise chemise) {
        System.out.println("L'id est : "+chemise.getId());
        System.out.println("Le libelle est : "+chemise.getLib());
        System.out.println("La couture est : "+chemise.getCouture());
    }
}

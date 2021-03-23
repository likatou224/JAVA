package main;

import sn.isi.dao.ProduitImp;
import sn.isi.enitities.Produit;

import java.util.List;

public class Main {
        public static void main(String[] args) throws Exception {

            ProduitImp produitImp = new ProduitImp();

            List<Produit> liste= produitImp.liste();
            for (Produit p: liste)
            {
                System.out.println("Ref: "+p.getRef()+"nom : "+p.getNomProd());
            }
        }
    }



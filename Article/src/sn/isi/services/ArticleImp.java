package sn.isi.services;

import sn.isi.entities.Article;

import java.util.Scanner;

public class ArticleImp implements  IArticle{
    private Scanner sc = new Scanner(System.in);
    Article article = new Article();
    @Override
    public Article saisie() {
        System.out.println("Entrer l'id ");
        article.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("Entrer le Libeller");
        article.setLib(sc.nextLine());
        return article;
    }

    @Override
    public void affiche(Article article) {
        System.out.println("Affichage de l'article");
        System.out.println("Id est: "+article.getId());
        System.out.println("Libelle est: "+article.getLib());
    }
}

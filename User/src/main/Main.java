package main;

import sn.isi.entities.User;
import sn.isi.services.IUser;
import sn.isi.services.UserImp;

public class Main {

        public static void main(String[] args){
            IUser iseur = new UserImp();
            User u= new User();
            u=iseur.saisie();
            iseur.afficher(u);
        }

}

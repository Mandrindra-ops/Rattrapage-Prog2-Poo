package NGL;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter

public class UtilisateurReel extends UtilisateurAnonyme{
    private String nom;
    private String prenom;

    public  UtilisateurReel(String nom, String prenom, int id) {
        super(id);
        this.nom = nom;
        this.prenom = prenom;
    }
}

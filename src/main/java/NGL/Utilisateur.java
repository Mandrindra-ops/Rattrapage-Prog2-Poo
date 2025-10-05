package NGL;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class Utilisateur extends UtilisateurAnonyme{
    private String nom;
    private String prenom;

    public  Utilisateur(String nom, String prenom, int id) {
        super(id);
        this.nom = nom;
        this.prenom = prenom;
    }
}

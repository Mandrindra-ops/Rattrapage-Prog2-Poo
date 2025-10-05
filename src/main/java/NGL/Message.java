package NGL;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter

public class Message {
    private Utilisateur utilisateur;
    private String texte;
    private LocalDate dateDeCreaction;
    private String email;
    private boolean confidentiel;
}


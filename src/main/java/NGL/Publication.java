package NGL;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class Publication{
    private int id;
    private Utilisateur lien;
}

public List<Message> ListOfmessagePublier() {
    Publication = ArrayList<Message>
}


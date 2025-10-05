import NGL.*;


import org.junit.jupiter.api.Test;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GradeServiceTest {

         @Test
    void TestPublication(){
             Message message1 = new Message("Messi", "thank you", LocalDate.of(2000, 10, 11),"Messi@gmail.com",true);
             Message message2 = new Message(2, "Jirama",LocalDate.of(1980, 10, 11));
             Publication publication1 = new Publication(1, "Rabe");


    }
    @Test
    void ajoutDePlusieursMessagesAunePublication(){
        Message message1 = new Message("Koto", "Miala RAJOELINA", LocalDate.of(1980, 10, 11),;
        Message message2 = new Message(2, "Jirama",LocalDate.of(1980, 10, 11);

        List<Message> messages = new ArrayList<>();
        messages.add(message1);
        messages.add(message2);

        UtilisateurAnonyme grade = new UtilisateurAnonyme(messages);


        double result = grade.getCourseGrade(course, etudiants, Instant.now());
        assertEquals(12, result);
    }
}



       /*

        double result = grade.getCourseGrade(course, etudiants, Instant.now());
        assertEquals(12, result);
    }
}*/

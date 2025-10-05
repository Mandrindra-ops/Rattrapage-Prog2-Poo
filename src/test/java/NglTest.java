import NGL.*;

import NGL.Publication
import org.junit.jupiter.api.Test;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GradeServiceTest {

         @Test
    void TestPublication(){
             Publication publication1 = new Publication(1, "Rabe");
             Publication publication2 = new Publication(2, "Expression Ecrite");

    }
    @Test
    void ajoutDePlusieursMessagesAunePublication(){
        Message message1 = new Message("Koto", "Miala RAJOELINA", LocalDate.of(1980, 10, 11, "");
        Message message2 = new Message(2, "Jirama",LocalDate.of(1980, 10, 11);


        Message note1 = new Message(etudiants, exam1, 10);
        Message note2 = new Message(etudiants, exam2, 15);

        List<Message> messages = new ArrayList<>();
        messages.add(note1);
        messages.add(note2);

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

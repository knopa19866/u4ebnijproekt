import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    @Test
    public void createAndWorkWithListe() {
        Student valera = new Student();
        valera.setFirstName("Valera");
        valera.setLastName("The Tester");
        valera.setEmail("valerunchik@test.lv");
        valera.setPhone("+371344557775");

        Student Liga = new Student("Liga", "Ivanova", "liga@inbox.lv", "+37123232");
        Student Dimko = new Student("Dimko", "Skatinka", "omg@test.lv", "+371666223");
        Student Artis = new Student("Artis", "Greatest", "test@inbox.lv", "+37432");

        List<Student> students = new ArrayList<>();
        students.add(valera);
        students.add(Liga);
        students.add(Dimko);
        students.add(Artis);

        //--------------------FOR--------------//

        for (int i = 0; i < 2; i++) {  // i = i++
            System.out.println(students.get(i).getFirstName());

        }

        //-------------FOREACH------------
        for (int i = 0; i < students.size(); i++) {   // i = i + 1 ->> i++
            System.out.println(students.get(i).getFirstName());
        }
        //-------------------FOREACH---------------------
        for (Student s : students) {
//            System.out.println(s.getFirstName() + " " + s.getLastName());
            System.out.println(s.getFirstName());
        }

        //------------------FOREACH with IF--------------
        System.out.println("Printing students with phone nr starting with +371:");
        for (Student s : students) {
            if (s.getPhone().startsWith("+371")) {
                System.out.println(s.getFirstName());
            }
        }
    }

    }




import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    @Test
    public void createWorkWithLists(){
        Student valara = new Student();
        valara.setFirstName("Valera");
        valara.setLastName("The Tester");
        valara.setEmail("valerun4ik@test.lv");
        valara.setPhone("+371273245");

     Student liga = new Student("Liga", "Ivanova", "liga@test.lv", "+3713224876" );
     Student dimka = new Student("Dimka", "Petrov", "petrov@inbox.lv", "+3715498765");
     Student artis = new Student("Artis", "Sakstis", "null","null");


        List<Student> students = new ArrayList<>();
        students.add(valara);
        students.add(liga);
        students.add(artis);

        //-------------------FOR-----------------------------//

        for (int i = 0 ; i < students.size(); i++){
            System.out.println(students.get(i).getFirstName());

        }

        //-------------FOREACH----------------//

        for (Student s :students){
            System.out.println(s.getFirstName() + " "+ s.getLastName());

        }






    }
}

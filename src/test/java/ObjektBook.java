import org.junit.jupiter.api.Test;

public class ObjektBook {
    @Test
    public void workingwithbook(){
    Book firstbook = new Book();

    firstbook.setName("Alhimik");
    firstbook.setGenre("Anton Grumer ");
    firstbook.setNumberPages(320);

    System.out.println(firstbook.getName());
    System.out.println(firstbook.getGenre());
    System.out.println(firstbook.getNumberPages());



    }
}

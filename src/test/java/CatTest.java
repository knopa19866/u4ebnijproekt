import org.junit.jupiter.api.Test;

public class CatTest {
    @Test
    public void workingWithCat(){
       Cat firstCat = new Cat();

       firstCat.setName("Murka");
       firstCat.setRase("sfinks");
       firstCat.setAge(12);

       System.out.println(firstCat.getAge());
       System.out.println(firstCat.getRase());
       System.out.println(firstCat.getName());

    }
}

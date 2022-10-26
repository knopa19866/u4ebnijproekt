import org.junit.jupiter.api.Test;

public class DogTest {
    @Test
    public void workingwithDog(){
     Dog firstDog  = new Dog();

     firstDog.setVetirinary("Muler");
     firstDog.setAge(17);
     firstDog.setWeight(23);
     firstDog.setName("Molli");

     System.out.println(firstDog.getName());
     System.out.println(firstDog.getAge());
     System.out.println(firstDog.getVetirinary());
     System.out.println(firstDog.getWeight());
    }
}

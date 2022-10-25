import org.junit.jupiter.api.Test;

public class ObjektCar {
    @Test
    public void workingWithCar(){
      Car firstCar = new Car();

      firstCar.setMarke("Audi");
      firstCar.setSpeed(370.70);
      firstCar.setTotalPrice(670.99);

        System.out.println(firstCar.getTotalPrice());
        System.out.println(firstCar.getMarke());
        System.out.println(firstCar.getSpeed());
    }
}

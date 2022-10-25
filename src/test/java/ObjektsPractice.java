import org.junit.jupiter.api.Test;

public class ObjektsPractice {
    @Test
    public void workingWithorders() {
        Order firstOrder = new Order();

        firstOrder.setTotalPrice(12.34);
        firstOrder.setAddress("Rigas street 22");
        firstOrder.setItemCount(9);

        Order secondOrder = new Order();
        secondOrder.setTotalPrice(55.67);
        secondOrder.setAddress("Lubanas str.43-13");
        secondOrder.setItemCount(3);

        System.out.println("Hallo World");
        System.out.println("first order:*");
        System.out.println(firstOrder.getTotalPrice());
        System.out.println(secondOrder.getTotalPrice());
    }
}


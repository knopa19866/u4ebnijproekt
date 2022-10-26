import org.junit.jupiter.api.Test;

public class TelephoneTest {
    @Test
    public void workingWithTelephone() {
        Telephone firstTelephone = new Telephone();

        firstTelephone.setModel("Apple");
        firstTelephone.setColor("blu");
        firstTelephone.setModelNamber(1234);


        System.out.println("Hallo Anja");
        System.out.println(firstTelephone.getModel());
        System.out.println(firstTelephone.getModelNamber());





    }

}

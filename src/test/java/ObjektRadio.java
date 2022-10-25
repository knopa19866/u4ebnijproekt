import org.junit.jupiter.api.Test;

public class ObjektRadio {
    @Test
    public void workingwithRadio(){
    Radio firstRadio = new Radio();


        firstRadio.setFirma("Samsung");
        firstRadio.setVoltage(156.376);
        firstRadio.setPlugType("Belka");

        System.out.println(firstRadio.getFirma());
        System.out.println(firstRadio.getPlugType());
        System.out.println(firstRadio.getVoltage());


    }
}

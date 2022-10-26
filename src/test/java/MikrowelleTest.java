import org.junit.jupiter.api.Test;

public class MikrowelleTest {
    @Test
    public void workingwithMikrowelle(){
     Mikrowelle firstmikrowave = new Mikrowelle();

     firstmikrowave.setPower(800);
     firstmikrowave.setWidth(27);
     firstmikrowave.setFirma("Neldi");

     System.out.println(firstmikrowave.getPower());
     System.out.println(firstmikrowave.getWidth());
     System.out.println(firstmikrowave.getFirma());



    }
}


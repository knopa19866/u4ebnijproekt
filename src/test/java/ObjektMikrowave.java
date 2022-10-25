import org.junit.jupiter.api.Test;

public class ObjektMikrowave {
    @Test
    public void workingwithmirrowave(){
     Mikrowave  firstmikrowave = new Mikrowave();

     firstmikrowave.setPower(800);
     firstmikrowave.setWidth(27);
     firstmikrowave.setFirma("Neldi");

     System.out.println(firstmikrowave.getPower());
     System.out.println(firstmikrowave.getWidth());
     System.out.println(firstmikrowave.getFirma());



    }
}


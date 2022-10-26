import org.junit.jupiter.api.Test;

public class WashingmachineTest {
    @Test
    public void WorkingWithWashingmachine(){
      WashingMachine firstWashingMachine =  new WashingMachine();

      firstWashingMachine.setTimeWash(3.43);
      firstWashingMachine.setTemp(1000);
      firstWashingMachine.setVoltage(7999);

      System.out.println(firstWashingMachine.getTimeWash());
      System.out.println(firstWashingMachine.getTemp());
      System.out.println(firstWashingMachine.getVoltage());
    }
}

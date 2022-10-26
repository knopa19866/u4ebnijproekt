import org.junit.jupiter.api.Test;

public class Tabletest {
    @Test
    public void workingwithTable(){
     Table  firstTable = new Table();

     firstTable.setColor("black");
     firstTable.setAmount(5555);
     firstTable.setWeight(33.33);

     System.out.println(firstTable.getColor());
     System.out.println(firstTable.getAmount());
     System.out.println(firstTable.getWeight());
    }
}

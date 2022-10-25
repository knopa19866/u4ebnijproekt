import org.junit.jupiter.api.Test;

public class ObjektFitnessCustomer {
    @Test
    public void workingwithfitnesscustomer(){
     FitnessCustomer firstFitnesscustomer = new FitnessCustomer();

     firstFitnesscustomer.setLastName("Nadja");
     firstFitnesscustomer.setTame(15.30);
     firstFitnesscustomer.setAge(23);
     firstFitnesscustomer.setAdress("Paulstr 35-132");

     System.out.println(firstFitnesscustomer.getLastName());
     System.out.println(firstFitnesscustomer.getTame());
     System.out.println(firstFitnesscustomer.getAdress());
     System.out.println(firstFitnesscustomer.getAge());
    }

}

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

    Niedostateczny  Niedostateczny = new Niedostateczny("niedostateczny",1);
    Dopuszczajacy Dopuszczajacy =new Dopuszczajacy("Dopuszczajacy",2);
    Dostateczny Dostateczny = new Dostateczny("Dostateczny",3);
    Dobry Dobry = new Dobry("Dobry",4);
    BardzoDobry BardzoDobry = new BardzoDobry("BardzoDobry",5);

     int [] oceny = new int[5];
     for (int i = 1;i <5;i++ ){
         oceny [i] = i + 1;
     }
     for (int x : oceny){
         System.out.println(x);
     }


    }


}
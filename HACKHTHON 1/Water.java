import java.util.Scanner;
public class Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter water consumption in litres: ");
        double consumption = sc.nextDouble();

        double bill;
        if(consumption <=500) {
            bill = 100;
        } else {
            bill = 200;
        }
          System.out.println("The total water bill is Rs " + bill);
          sc.close();
    }
}
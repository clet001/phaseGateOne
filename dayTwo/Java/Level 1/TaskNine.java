import java.util.Scanner;

public class TaskNine{
    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        System.out.println("Enter Price of An Item: ");
        int price = input.nextInt();

        


int tax = (10/100) * price;

System.out.println("Your tax is  " + tax);


}
    
}

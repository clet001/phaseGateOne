import java.util.Scanner;

public class TaskTen{
    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        System.out.println("Enter Number ");
        int number = input.nextInt();

        

        if( number % 3 == 0){
        System.out.println(" The number is divisible by 3");
}       
        else if( number % 5 == 0){
        System.out.println(" The number is divisible by 5");
}       

        else{
        System.out.println(" Invalid");

}




    }
    
}

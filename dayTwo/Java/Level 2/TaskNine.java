import java.util.Scanner;

public class TaskNine{
    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        System.out.println("Enter Age ");
        int age = input.nextInt();

        

        if( age <= 10){
        System.out.println(" You are a child");
}       
        else if( age <= 17){
        System.out.println(" You are a Teen");
}       

        else{
        System.out.println(" You are an Adult");

}




    }
    
}

import java.util.Random;
import java.util.Scanner;

public class RandomProgram{

    public static void main(String[] args){

Scanner input = new Scanner(System.in);

Random random = new Random();
//int number = random.nextInt(100);
int number;

for(int count = 1; count <= 5; count++){

 System.out.println("Enter Number from 1 to 100, you have 5 attempts only");
    int numb = input.nextInt();   
    int randNumber = random.nextInt(100);


for(int counter =1; counter <= randNumber; counter++){

}
if(count < randNumber){
        System.out.println("lower");
    
    }
    else if(count >= randNumber){
        System.out.println("higher");
    }
    else {System.out.println("Stop immediately");
}
break;
    
    if(numb == " "){
    System.out.println("do not count it as an attempt");

}



}











    }



}

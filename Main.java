import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int myNumber = 100;
        if(myNumber == 100){
        	System.out.println("100!!");
        }else if(myNumber > 0){
        	System.out.println("My number is positive");
        }else{
        	System.out.println("My number is negative");
        }

        /*for(int i = 0; i < 10; i++){
        	System.out.println("Battlefield 4 : " + i);
        }

        int i = 0;
        while(i < 10){
        	i = i + 1;
        	System.out.println("Battlefield 5 : " + i);
        }*/

        Scanner user_input = new Scanner( System.in );
        String first_name;
		first_name = user_input.next();



		Voiture myCar = new Voiture(4, 2);
		Voiture myCar2 = new Voiture(6, 8);

		System.out.println("My name is :" + first_name + " i'm driving the car with");
		myCar.GetDetails();
		System.out.println("And i'm driving the second car with");
		myCar2.GetDetails();

    }
}



















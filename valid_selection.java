import java.util.Scanner;

public class valid_selection {
    static Scanner user_input=new Scanner(System.in);
    
   
    public static void main(String[] args) {
        prln("Enter the people number:");
        int numberOfPeople=user_input.nextInt();
        Scanner nameOfPeople=new Scanner(System.in);
        Scanner ageOfPeople=new Scanner(System.in);
        String  [] people=new String  [numberOfPeople];
        int []age=new int[numberOfPeople];
        for(int i=0;i<numberOfPeople;i++){
            prln("Enter Name:");
            people[i]=nameOfPeople.nextLine();
            prln("Enter Age:");
            age[i]=ageOfPeople.nextInt();
        }

        for(int i=0;i<numberOfPeople;i++){
            if(age[i]>=15){
                prln(people[i]+" you can vaccined ");
                prln("the people is now "+age[i]);

            }
        }
        user_input.close();
        




    }
    static void prln(Object anyObject){
        System.out.println(anyObject);
    }
    
}

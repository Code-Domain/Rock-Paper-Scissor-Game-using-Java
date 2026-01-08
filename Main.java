import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        
        boolean proceed = true;
        while(proceed){
            System.out.println("Welcome to Rock , Paper and Scissor Game.");
            System.out.println("Let's start the Game.");
            System.out.printf("Choose your weapon:-\n\t\tRock:- R \t\t\tPaper:- P \n\t\tScissors:- S \t\tExit:- E \n");
            System.out.print("Enter your choice:");
            String choice = sc.next();
            
        
            int random = ran.nextInt(3);
        
            if(choice.equalsIgnoreCase("e")){
                proceed = false;
                System.out.print("Exiting............");
            }
            else{
                String[] value = { "R" , "P" , "S" };
                String[] displayValue = { "Rock" , "Paper" , "Scissor"};
                String comValue = value[random];
                System.out.println("I choose : " +displayValue[random]);
                String result = compare(choice ,comValue);
                System.out.print(result);
                System.out.printf("\n\n");
            }
        }
        sc.close();
        
    }
    
    public static String compare(String choice , String comValue){
        if (choice.equalsIgnoreCase(comValue)){
            return "The match got tie.";
        }
        else if(choice.equalsIgnoreCase("r") && comValue.equalsIgnoreCase("s")){
          return "Congratulation you win the match.";  
        }
        else if(choice.equalsIgnoreCase("p") && comValue.equalsIgnoreCase("r")){
          return "Congratulation you win the match.";  
        }
        else if(choice.equalsIgnoreCase("s") && comValue.equalsIgnoreCase("p")){
          return "Congratulation you win the match.";  
        }
        else{
          return "You Lose I win the match.";  
        }
        
    }
    
}

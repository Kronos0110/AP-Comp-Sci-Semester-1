/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc= new Scanner(System.in);
        System.out.println("A fearsome dragon has terrorized your village, demanding tribute in exchange for peace");
        System.out.println("What way should we deal with dragon?: ");
        System.out.println("1. Choose to confront with dragon.");
        System.out.println("2. Attempt to negotiate peace with dragon.");
        System.out.println("3. Seek for legendary weapon");
        
        int a_1 = sc.nextInt();
        if(a_1==1){
            System.out.println("You chose to confront the dragon by fighting.");
            System.out.println("What should you use to defeat the dragon.");
            System.out.println("1. Long sword");
            System.out.println("2. Bow");
            System.out.println("3. Shield");
            
            int a_1_1 = sc.nextInt();
            if(a_1_1==1){
                System.out.println("You picked up the long sword to fight.");
                System.out.println("Dragon is preparing a breathe toward you.");
                System.out.println("What should you do now?");
                System.out.println("1. Try blocking with sword.");
                System.out.println("2. Try cutting the breathe with the sword.");
                System.out.println("3. Try dodging the breathe");
                int a_1_1_1=sc.nextInt();
                if(a_1_1_1==1){
                    System.out.println("You chose to block the breathe toward you.");
                    System.out.println("Breathe melted your sword and your body.");
                    System.out.println("Bad Ending #1: Melted Sword");
                }
                else if(a_1_1_1==2){
                    System.out.println("You tried cutting the breath with the sword.");
                    System.out.println("Did you really think you could cut a breathe?");
                    System.out.println("Breathe melted your sword and did not have time to dodge.");
                    System.out.println("Bad Ending #2: Cutting? Breathe?");
                }
                else if(a_1_1_1==3){
                    System.out.println("You tried dodging the breathe");
                    System.out.println("Which way will you dodge?");
                    System.out.println("1. Lie down");
                    System.out.println("2. Jump");
                    System.out.println("3. Roll to left");
                    int a_1_1_1_3=sc.nextInt();
                    if(a_1_1_1_3==1){
                        System.out.println("You tried to lie down on ground");
                        System.out.println("You barely missed the breathe");
                        System.out.println("It's your turn now");
                        System.out.println("Where will you attack?");
                        System.out.println("1. head");
                        System.out.println("2. eye");
                        System.out.println("3. wing");
                        int a_1_1_1_3_1 =sc.nextInt();
                        if(a_1_1_1_3_1==1){
                            System.out.println("You chose to attack head \nHow will you attack \n1. jump \n2. Throw the sword\n3. Try climbing up dragon.");
                            int a_1_1_1_3_1_1=sc.nextInt();
                            if(a_1_1_1_3_1_1){
                                System.out.println("You chose to jump and jumped\nYou did not jump high enough and in mid air dragon's claw slaughter you");
                                System.out.println("Bad Ending 5: Ouch... That hurts");
                            }
                       
                        }
                    }
                    else if(a_1_1_1_3==2){
                        System.out.println("You tried to Jump");
                        System.out.println("Breathe striked right at you");
                        System.out.println("Bad Ending #3: Turn to Ashes");
                    }
                    else if(a_1_1_1_3==3){
                        System.out.println("You tried to roll to left");
                        System.out.println("Dragon turns his head and burn you");
                        System.out.println("Bad Ending #4: Turning head? Was that possible?");
                    }
                    else{
                        System.out.println("Error");
                    }
                }
                
            }
            if(a_1_1==2){
                
            }
        }
        
        
        
        
        else if(a_1==2){
            
        }
        else if(a_1==3){
            
        }
        else{
            System.out.println("Error");
        }
        
	}
}
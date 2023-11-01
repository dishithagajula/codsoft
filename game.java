import java.util.*;
public class game{
    public static void main(String[] args) {
        Random r = new Random();
        int rand,score,user_guess,i;
        Scanner s = new Scanner(System.in);
        System.out.println("1.Play for limited attempts(10) \n2.Play until your guess is correct\n3.Play again");
        int choice;
        do {
            System.out.println("Enter user choice:");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    rand = r.nextInt((100));
                    score=10;
                    for(i=0;i<10;i++){
                        user_guess = s.nextInt();
                        if(guess(rand, user_guess)){
                            break;
                        }
                        score--;
                    }
                    System.out.println("user score is :"+score);
                    System.out.println("YOU LOOSE THE GAME");
                    break;
                case 2:
                    rand = r.nextInt((100));
                    i=0;
                    do {
                        user_guess = s.nextInt();
                        i++;
                    }
                    while(!guess(rand, user_guess));
                    System.out.println("You WON the game at "+i+"th attempt");
                    break;
                case 3:
                    rand = r.nextInt((100));
                    user_guess = s.nextInt();
                    if(guess(rand, user_guess))
                        System.out.println("YOU WON");
                    else
                        System.out.println("YOU LOSE");
                    break;
                case 4:
                    System.out.println("*******GAME OVER********");
                    break;
                default:
                    System.out.println("Please enter a valid choice(1/2/3/4)");
            }

        } while (choice != 4);
    }

    static boolean guess(int rand, int user_guess) {
        if (rand == user_guess) {
            System.out.println("your guess is correct");
            return true;
        }
        if (rand > user_guess) {
            System.out.println("your guess is too low");
        }
        if (rand < user_guess) {
            System.out.println("your guess is too high");
        }
        return false;
    }
}

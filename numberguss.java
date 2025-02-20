import java.util.*;
class numberguss{

    public static void main(String[] args) {
        System.out.println("<----------WELCOME TO NUMBER GUESSING-------->");
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100);
        int userNumber;
        boolean guessed = false;
        int score=0;

        do {
            System.out.print("Guess the number: ");
            userNumber = sc.nextInt();
            score++;

            if (userNumber == myNumber) {
                System.out.println("You guessed it!");
                guessed = true;
            } else if (userNumber > myNumber) {
                System.out.println("Too high");
            } else {
                System.out.println("Too low");
            }
        } while (!guessed);
        System.out.print("your score is  --->"+ score);
        sc.close();
    }
}
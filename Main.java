import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalQuestions = 5;
        int questionsAnswered = 0;
        int questionsCorrect = 0;
        int questionsWrong = 0;
        double grade = 0.00;

        //Header
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("Welcome to Capital Quiz");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        // Code not ready for this question
        // System.out.println("How many question would you like?");
        //totalQuestions = Integer.parseInt(scanner.next());
        System.out.println();
        System.out.println();
        //System.out.println("You have chosen " + totalQuestions + " questions. Lets get started!");
        System.out.println("There are a total of 5 questions, good luck!");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        //Question 1
        System.out.println("Question 1: What is the capital of Oklahoma?");
        System.out.println("a) Tulsa b) Oklahoma City c) Norman d) Lawton");
            char answer1 = scanner.next().charAt(0);
            if (answer1 == 'b' || answer1 == 'B') {
                System.out.println("That is correct!");
                System.out.println();
                questionsCorrect++;
                totalQuestions--;
                questionsAnswered++;

                if (totalQuestions == 0){
                    System.out.println("You have completed the quiz!");
                } else {
                    System.out.println(totalQuestions + " questions left.");
                }

            } else {
                System.out.println("That is not correct.");
                System.out.println();
                questionsWrong++;
                totalQuestions--;
                questionsAnswered++;
                if (totalQuestions == 0){
                    System.out.println("You have completed the quiz!");
                } else {
                    System.out.println(totalQuestions + " questions left.");
                }
            }

        //Space between questions
        System.out.println();
        System.out.println();
        System.out.println();

        //Question 2
        System.out.println("Question 2: What is the capital of Texas?");
        System.out.println("a) Lewisville b) Paris c) Dallas d) Austin");
        char answer2 = scanner.next().charAt(0);
        if (answer2 == 'd' || answer2 == 'D') {
            System.out.println("That is correct");
            System.out.println();
            questionsCorrect++;
            totalQuestions--;
            questionsAnswered++;
            if (totalQuestions == 0){
                System.out.println("You have completed the quiz!");
            } else {
                System.out.println(totalQuestions + " questions left.");
            }
        } else {
            System.out.println("That is not correct");
            System.out.println();
            questionsWrong++;
            totalQuestions--;
            questionsAnswered++;

            if (totalQuestions == 0){
                System.out.println("You have completed the quiz!");
            } else {
                System.out.println(totalQuestions + " questions left.");
            }
        }


        //Space between questions
        System.out.println();
        System.out.println();
        System.out.println();



        //Question 3
        System.out.println("Question 3: What is the capital of Washington?");
        System.out.println("a) Seattle b) Spokane c) Tacoma d) Olympia");
        char answer3 = scanner.next().charAt(0);
        if (answer3 == 'd' || answer3 == 'D') {
            System.out.println("That is correct");
            System.out.println();
            questionsCorrect++;
            totalQuestions--;
            questionsAnswered++;
            if (totalQuestions == 0){
                System.out.println("You have completed the quiz!");
            } else {
                System.out.println(totalQuestions + " questions left.");
            }
        } else {
            System.out.println("That is not correct");
            System.out.println();
            questionsWrong++;
            totalQuestions--;
            questionsAnswered++;

            if (totalQuestions == 0){
                System.out.println("You have completed the quiz!");
            } else {
                System.out.println(totalQuestions + " questions left.");
            }
        }



        //Space between questions
        System.out.println();
        System.out.println();
        System.out.println();



        //Question 4
        System.out.println("Question 4: What is the capital of Montana?");
        System.out.println("a) Helena b) Bozeman c) Missoula d) Big Sky");
        char answer4 = scanner.next().charAt(0);
        if (answer4 == 'a' || answer4 == 'A') {
            System.out.println("That is correct");
            System.out.println();
            questionsCorrect++;
            totalQuestions--;
            questionsAnswered++;
            if (totalQuestions == 0){
                System.out.println("You have completed the quiz!");
            } else {
                System.out.println(totalQuestions + " questions left.");
            }
        } else {
            System.out.println("That is not correct");
            System.out.println();
            questionsWrong++;
            totalQuestions--;
            questionsAnswered++;

            if (totalQuestions == 0){
                System.out.println("You have completed the quiz!");
            } else {
                System.out.println(totalQuestions + " questions left.");
            }
        }



        //Space between questions
        System.out.println();
        System.out.println();
        System.out.println();



        //Question 5
        System.out.println("Question 5: What is the capital of South Carolina?");
        System.out.println("a) Greenville b) Hilton Head c) Columbia d) Myrtle Beach");
        char answer5 = scanner.next().charAt(0);
        if (answer5 == 'c' || answer5 == 'C') {
            System.out.println("That is correct");
            System.out.println();
            questionsCorrect++;
            totalQuestions--;
            questionsAnswered++;
            if (totalQuestions == 0){
                System.out.println("You have completed the quiz!");
            } else {
                System.out.println(totalQuestions + " questions left.");
            }
        } else {
            System.out.println("That is not correct");
            System.out.println();
            questionsWrong++;
            totalQuestions--;
            questionsAnswered++;

            if (totalQuestions == 0){
                System.out.println("You have completed the quiz!");
            } else {
                System.out.println(totalQuestions + " questions left.");
            }
        }




            //Footer
            grade = (double) questionsCorrect / questionsAnswered * 100;
            int finalGrade = (int) Math.round(grade);
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Thank you for using Captial Quiz");
            System.out.println("-------------------------------------------");
            System.out.println("Total questions answered " + questionsAnswered + ".     Total questions correct " + questionsCorrect +".      Final grade " + finalGrade + "%");

    }
}
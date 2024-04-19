import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Question {
    ArrayList<String> choiceList;

    static Scanner in = new Scanner(System.in);
    public MultipleChoice(String ask, ArrayList<String> choiceList){
        super(ask);
        this.ask = ask;
        this.choiceList = choiceList;
    }


    public ArrayList<String> getChoiceList() {
        return choiceList;
    }

    public void setChoiceList(ArrayList<String> choiceList) {
        this.choiceList = choiceList;
    }

    public void displayMultipleChoice(MultipleChoice question, String correctAnswer) {
        System.out.println("*****");
        System.out.println(question.getAsk());
        System.out.println("A. " + getChoiceList().get(0));
        System.out.println("B. " + getChoiceList().get(1));
        System.out.println("C. " + getChoiceList().get(2));
        System.out.println("D. " + getChoiceList().get(3));
        System.out.println("*****");

        String answer = in.nextLine();
        if (answer.equalsIgnoreCase(correctAnswer)) {
            System.out.println("Right!\n");
        } else {
            System.out.println("Wrong!\n");
        }
    }
    public void displayMultipleChoice(MultipleSelections question, String correctAnswer1, String correctAnswer2, String correctAnswer3
    , String wrongAnswer){
        System.out.println("*****");
        System.out.println(question.getAsk());
        System.out.println("A. " + getChoiceList().get(0));
        System.out.println("B. " + getChoiceList().get(1));
        System.out.println("C. " + getChoiceList().get(2));
        System.out.println("D. " + getChoiceList().get(3));
        System.out.println("*****");

        String answer = in.nextLine();
        if (answer.toLowerCase().contains(wrongAnswer.toLowerCase())) {
            System.out.println("Wrong!\n");
        } else if (answer.toLowerCase().contains(correctAnswer1.toLowerCase())
                && answer.toLowerCase().contains(correctAnswer2.toLowerCase())
                && answer.toLowerCase().contains(correctAnswer3.toLowerCase())){
            System.out.println("Right!\n");
        }
    }

}

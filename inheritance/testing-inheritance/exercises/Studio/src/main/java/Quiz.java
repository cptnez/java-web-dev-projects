import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<String> multipleChoiceOptions1 = new ArrayList<String>();
        multipleChoiceOptions1.add("Han Solo");
        multipleChoiceOptions1.add("The Three Little Pigs");
        multipleChoiceOptions1.add("Indiana Jones");
        multipleChoiceOptions1.add("Jack Ryan (as portrayed by Harrison Ford)");

        ArrayList<String> multipleSelectionsOptions1 = new ArrayList<String>();
        multipleSelectionsOptions1.add("GameBoy");
        multipleSelectionsOptions1.add("Xbox 360");
        multipleSelectionsOptions1.add("N64");
        multipleSelectionsOptions1.add("GameCube");


        MultipleChoice multiple1 = new MultipleChoice("Who's afraid of the big bad wolf?", multipleChoiceOptions1);
        MultipleSelections selections1 = new MultipleSelections("Which of these video game consoles have been made by Nintendo?", multipleSelectionsOptions1);
        TrueFalse trueFalse1 = new TrueFalse("Green means go");


        multiple1.displayMultipleChoice(multiple1, "B");
        selections1.displayMultipleChoice(selections1, "A", "C", "D", "B");
        trueFalse1.displayTrueFalse(trueFalse1, "true");

        }
    }


import java.util.HashMap;
import java.util.Map;

public class HiddenFigures {
    public static void main(String[] args){
        String quote = "If the product of two terms is zero then common sense says " +
                "at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored " +
                "allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = quote.toCharArray();

        HashMap<Character, Integer> characterHashMap = new HashMap<>();

        //Prints number of occurrences
//        int numberOfOcc = 0;
//        for (char letter : charactersInString){
//            if (letter == ' ') {
//                numberOfOcc++;
//            }
//        }

        //Prints individual letters in hashmap
        for (char letter : charactersInString){
            if (characterHashMap.containsKey(letter)){
            characterHashMap.put(letter, characterHashMap.get(letter)+1);
            } else {
                characterHashMap.put(letter, 1);
            }
        }

        for (Map.Entry<Character, Integer> letter : characterHashMap.entrySet()) {
            System.out.println(letter.getKey() + ": " + letter.getValue() );
        }


    }

}

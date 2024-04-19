import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class QuizTest {

    MultipleSelections test_multipleSelections;

    @Test
    public void selectionsTest() {
        ArrayList<String> selectionsArray = new ArrayList<>();

        selectionsArray.add("Chicken");
        selectionsArray.add("Corn");
        selectionsArray.add("Tacos");
        selectionsArray.add("Pickles");

        MultipleSelections selectionsTest = new MultipleSelections("What is hip?", selectionsArray);
//

    }
}

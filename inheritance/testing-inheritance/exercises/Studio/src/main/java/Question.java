import java.util.Scanner;

public abstract class Question {

    String ask;

    String answer;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Question(String ask) {
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }

//    public void passOrFail() {
//
//    };

}

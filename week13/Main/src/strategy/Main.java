package strategy;

public class Main {
    public static void main(String[] args){
        TextEditor textEditor = new TextEditor();
        textEditor.setFormatter(new CamelCaseFormatter());
        System.out.println(textEditor.formatText("If you are unsure who is going to win always bet on Hakari"));
    }
}

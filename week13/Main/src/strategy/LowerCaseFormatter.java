package strategy;

public class LowerCaseFormatter implements TextFormatter {
    public String formatText(String text){
        return text.toLowerCase();
    }
}

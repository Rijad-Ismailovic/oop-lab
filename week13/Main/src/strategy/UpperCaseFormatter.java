package strategy;

public class UpperCaseFormatter implements TextFormatter {
    public String formatText(String text){
        return text.toUpperCase();
    }
}

package strategy;

public class CamelCaseFormatter implements TextFormatter {
    public String formatText(String text){
        String[] words = text.split("\\s+");
        String camelCaseWord = null;
        for(String word : words){
            char[] arrayOfLetters = word.toCharArray();
            String newWord = Character.toUpperCase(arrayOfLetters[0]) + word.substring(1);;
            camelCaseWord += newWord;
        }
        return camelCaseWord;
    }
}

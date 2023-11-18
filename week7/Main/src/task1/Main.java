package task1;
public class Main {
    public static void main(String[] args){
        RecordLogger rl = new RecordLogger("Rijad");
        ClassLogger cl = new ClassLogger("Dino");
        System.out.println(rl.logMessage("Ja sam Rijaldinjo"));
        System.out.println(cl.logMessage("Ja sam Dinosaur"));

        
        
    }
}



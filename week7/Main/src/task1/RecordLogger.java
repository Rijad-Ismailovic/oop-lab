package task1;
public record RecordLogger(String name) implements Logger{
    public String logMessage(String message){
        return this.name + " - " + message;
    }
}

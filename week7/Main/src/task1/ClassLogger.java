package task1;
public class ClassLogger implements Logger {
    private String name;
    public ClassLogger(String n){
        this.name = n;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String logMessage(String message){
        return getName() + " - " + message;
    }
}

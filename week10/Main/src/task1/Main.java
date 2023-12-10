package task1;
public class Main {
    public static void main(String[] args){
        MessangingSystem messangingSystem = new MessangingSystem();
        Admin admin = new Admin("rijad");
        User user = new User("Ismet");

        messangingSystem.sendMessage(user, "Hello!!!!!");
        messangingSystem.sendMessage(admin, "TISINA");
    }
}

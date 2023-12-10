package task1;

import task1.annotations.CanSendMessage;
import task1.annotations.RequiresPermission;

public class MessangingSystem {

    @CanSendMessage
    @RequiresPermission("ADMIN")
    public void sendMessage(Admin admin, String message){
        System.out.println("User is a admin: " + message);
    }

    @CanSendMessage
    @RequiresPermission("USER")
    public void sendMessage(User user, String message){
        System.out.println("User is a regular user: " + message);
    }
}

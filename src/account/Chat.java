package account;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ofk on 11/25/17.
 */
public class Chat {
    private String key;
    private String sender;
    MessageManager messageManager;
    public Chat(String sender){
        this.sender = sender;
        messageManager = new MessageManager();
    }
    public Chat(String sender, String key){
        this.sender = sender;
        this.key = key;
    }
    public void setKey(String key){
        this.key = key;
    }
    public String getSender(){
        return sender;
    }
    public void addMessage(String message, String sender, long time){
        Message mes = new Message(message, sender, time);
        messageManager.addMessage(mes);
    }
}

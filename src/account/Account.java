package account;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ofk on 11/25/17.
 */
public class Account {
    private String adress;
    ChatManager chatManager = new ChatManager();

    public Account(String adress){
        this.adress = adress;
    }
    void addChat(String message, String sender, String data, long time){
        chatManager.addMessage(data,sender,time);
    }
}

package account;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ofk on 11/25/17.
 */
public class Account {
    private String adress;
    private List<Chat> chats;

    public Account(String adress){
        this.adress = adress;
        chats = new ArrayList<Chat>();
    }
    void addChat(String sender, String data){

    }
}

package account;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ofk on 11/25/17.
 */
public class ChatManager {
    private List<Chat> chats;
    public ChatManager(){
        chats = new ArrayList<>();
    }
    public void addChat(String sender){
        Chat chat = new Chat(sender);
    }
    public void addChat(String sender, String key){
        Chat chat = new Chat(sender,key);
    }
}

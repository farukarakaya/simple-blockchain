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
    public void addMessage(String message, String sender,long time){
        boolean check = false;
        for (int i = 0; i < chats.size(); i++){
            if(chats.get(i).getSender().equals(sender)){
                chats.get(i).addMessage(message,sender,time);
                check = true;
            }
        }
        if(check){
            Chat chat =addChat(sender);
            chat.addMessage(message,sender,time);
        }
    }
    private Chat addChat(String sender){
        Chat chat = new Chat(sender);
        chats.add(chat);
        return chat;
    }
    private Chat addChat(String sender, String key){
        Chat chat = new Chat(sender,key);
        chats.add(chat);
        return chat;
    }
}

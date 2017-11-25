package account;

import java.util.*;

public class MessageManager {

    private List<Message> messageList;

    public MessageManager(){
        messageList = new ArrayList<Message>(0);
    }

    void addMessage(Message newMessage){
        messageList.add(newMessage);
    }


}

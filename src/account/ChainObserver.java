package account;

import chain.Blockchain;
import java.util.ArrayList;
import java.util.List;

public class ChainObserver {
    private String receiver;

    public ChainObserver( String receiver){
        this.receiver = receiver;
    }

    public String getReceiver(){
        return this.receiver;
    }

    public List<Message> findMessages(Blockchain chain){
        ArrayList<Message> chainOfMessage = new ArrayList<Message>();
        int size = chainOfMessage.size();
        ArrayList<Message> receiverMessages = new ArrayList<>();
        for(int i = 0 ; i < size ; i ++){
            if(chainOfMessage.get(i).getSender() == receiver){
                receiverMessages.add(chainOfMessage.get(i));
            }
        }
        return receiverMessages;
    }
}

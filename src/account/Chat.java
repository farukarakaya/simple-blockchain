package account;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ofk on 11/25/17.
 */
public class Chat {
    private String key;
    private String sender;

    public Chat(String sender){
        this.sender = sender;
    }
    public Chat(String sender, String key){
        this.sender = sender;
        this.key = key;
    }
    public void setKey(String key){
        this.key = key;
    }
}

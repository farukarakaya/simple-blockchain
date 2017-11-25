package account;

/**
 * Created by ofk on 11/25/17.
 */
public class Message {

    private String message;
    private long time;
    private String sender;

    public Message(String message, String sender, long time){
        this.sender = sender;
        this.message = message;
        this.time = time;
    }
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}

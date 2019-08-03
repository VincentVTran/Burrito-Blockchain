package BlockChainService;



import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class TransactionBlock {
    private String hash;
    private String previousHash;

    private String sender;
    private String recipient;

    private long time;
    private int amount;

    public TransactionBlock(String previousHash, String sender, String recipient, int amount){
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("SHA-256");
        }
        catch(NoSuchAlgorithmException e){
            System.out.println(e);
        }
        this.hash = org.apache.commons.codec.digest.DigestUtils.sha256Hex(stringText);
        this.previousHash = previousHash;
        this.sender = sender;
        this.recipient = recipient;
        this.time = System.currentTimeMillis();
        this.amount = amount;
    }
    public void manipulateHash(){
        this.hash = null;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

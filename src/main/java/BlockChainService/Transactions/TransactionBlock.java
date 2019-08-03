package BlockChainService.Transactions;

public class TransactionBlock {
    private String hash;
    private String previousHash;

    private String sender;
    private String recipient;

    private String date;
    private double amount;

    public TransactionBlock(String previousHash, String sender, String recipient, String date, double amount){
        this.previousHash = previousHash;
        this.sender = sender;
        this.recipient = recipient;
        this.date = date;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

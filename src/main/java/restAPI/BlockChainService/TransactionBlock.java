package restAPI.BlockChainService;

import java.util.Arrays;

public class TransactionBlock {
    private int hash;
    private int previousHash;

    private String sender;
    private String recipient;

    private long time;
    private int amount;

    public TransactionBlock(int previousHash, String sender, String recipient, int amount){
        this.previousHash = previousHash;
        this.sender = sender.replaceAll("-"," ");
        this.recipient = recipient.replaceAll("-"," ");
        this.time = System.currentTimeMillis();
        this.amount = amount;

        this.hash = hashAlgorithm();
    }
    public int hashAlgorithm(){
        //If any data inside of the transaction data is manipulated, the hashcode will be altered
        String[] transactionData = {this.sender,this.recipient,Integer.toString(this.amount),Long.toString(time)};
        Object[] blockHash = {this.previousHash, Arrays.hashCode(transactionData)};
        return blockHash.hashCode();
    }

    public int getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(int previousHash) {
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

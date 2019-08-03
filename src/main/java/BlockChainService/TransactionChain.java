package BlockChainService;

import java.util.LinkedList;

public class TransactionChain {

    LinkedList<TransactionBlock> chain = new LinkedList<TransactionBlock>();

    public LinkedList<TransactionBlock> getAllTransactions(){
        return chain;
    }

    //LinkedList Note
    /*

    [1,2,3,4,5]
    .push(6)

    [6,1,2,3,4,5]
    .pop()

    [1,2,3,4,5]
    */
    public void addTransactions(String sender,String recipient,String date,int amount){
        String previousHash;
        if(chain.getLast() != null){
            previousHash = chain.getFirst().getHash();
        }
        else {
            previousHash = "0";
        }
        TransactionBlock newOrder = new TransactionBlock(previousHash,sender,recipient,date,amount);
        chain.push(newOrder);
        System.out.println("New transaction added- Hash #: " + newOrder.getHash());
    }
}

package restAPI.BlockChainService;

import org.springframework.stereotype.Service;

import java.util.LinkedList;

@Service
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
    public void addTransactions(String sender,String recipient,int amount){
        int previousHash;
        if(chain.size() != 0){
            previousHash = chain.getFirst().getHash();
        }
        else {
            previousHash = 0;
        }
        TransactionBlock newOrder = new TransactionBlock(previousHash,sender,recipient,amount);
        chain.push(newOrder);
        System.out.println("New transaction added - Hash #: " + newOrder.getHash());
    }

    public LinkedList<TransactionBlock> getAllTransactions(String sender, String recipient, int amount){
        return chain;
    }

    public TransactionBlock getTransaction(int Hash){
        for(TransactionBlock currentBlock:chain){
            if(currentBlock.getHash() == Hash){
                return currentBlock;
            }
        }
        return null;
    }
}

package BlockChainService.Chain;

import BlockChainService.Transactions.TransactionBlock;
import java.util.LinkedList;

public class TransactionChain {

    LinkedList<TransactionBlock> chain = new LinkedList<TransactionBlock>();

    public LinkedList<TransactionBlock> getAllTransactions(){
        return chain;
    }
}

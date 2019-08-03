package restAPI;

//BlockChain Imports
import BlockChainService.TransactionBlock;

//SpringBoot imports
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.LinkedList;
import java.util.List;

public class blockchainController {

    //private TransactionChain
    @RequestMapping(method = RequestMethod.GET, value = "/transactions")
    public List<TransactionBlock> getAllTransactions(){
        return new LinkedList<TransactionBlock>();
    }
}

package restAPI;

//BlockChain Imports
import restAPI.BlockChainService.TransactionBlock;

//SpringBoot imports
import restAPI.BlockChainService.TransactionChain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class blockchainController {

    @Autowired
    private TransactionChain database;

    //private TransactionChain
    @RequestMapping(method = RequestMethod.GET, value = "/transactions")
    public List<TransactionBlock> getAllBurritoTransactions(){
        return database.getAllTransactions();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{sender}/{reciever}/{amount}")
    public void addBurritoTransaction(@PathVariable String sender, @PathVariable String reciever, @PathVariable int amount){
        database.addTransactions(sender,reciever,amount);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{hash}")
    public TransactionBlock getBurritoTransaction(@PathVariable int hash){
        return database.getTransaction(hash);
    }
}

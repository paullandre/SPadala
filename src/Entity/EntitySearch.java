package Entity;

import Entity.Entity;
import java.math.BigDecimal;

/**
 *
 * @author Paul Andre Francisco
 */
public class EntitySearch {

    protected int smartNumber;
    protected String refNo;
    protected String type;
    protected BigDecimal amount;
    protected BigDecimal balance;    
    protected String sender;
    protected int senderNo;
    protected String senderAddress;
    protected String receiver;
    protected int receiverNo;
    protected String receiverAddress;
    protected String createDate;   
    
    public EntitySearch(int smartNumber, String refNo, String type, BigDecimal amount, BigDecimal balance, String sender, int senderNo, 
            String receiver, int receiverNo, String createDate)
    {
        this.smartNumber = smartNumber;
        this.refNo = refNo;
        this.type = type;
        this.amount = amount;
        this.balance = balance;        
        this.sender = sender;
        this.senderNo = senderNo;        
        this.receiver = receiver;
        this.receiverNo = receiverNo;        
        this.createDate = createDate;        
    }           
    
    public int getSmartNo(){
        return this.smartNumber;
    }        
    
    public String getRefNo(){
        return this.refNo;
    }        
    
    public BigDecimal getAmount(){
        return this.amount;
    }   
    
    public BigDecimal getBalance(){
        return this.balance;
    }
        
    public String getType(){
        return this.type;
    }
    
    public String getSender(){
        return this.sender;
    }

    public int getSenderNo()
    {
        return this.senderNo;
    }
    
    public String getSenderAdd(){
        return this.senderAddress;
    }
    
    public String getReceiver(){
        return this.receiver;
    }
    
    public int getReceiverNo()
    {
        return this.receiverNo;
    }
    
    public String getReceiverAdd(){
        return this.receiverAddress;
    }
    
    public String getCreateDate()
    {
        return this.createDate;
    }
}

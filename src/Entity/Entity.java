package Entity;

import java.math.BigDecimal;

/** 
 * @author Paul Andre Francisco
 * @date 03/03/2018
 */

public class Entity 
{
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
    
    public Entity(int smartNumber, String refNo, String type, BigDecimal amount, BigDecimal balance, String sender, int senderNo, 
            String senderAddress, String receiver, int receiverNo, String receiverAddress, String createDate)
    {
        this.smartNumber = smartNumber;
        this.refNo = refNo;
        this.type = type;
        this.amount = amount;
        this.balance = balance;        
        this.sender = sender;
        this.senderNo = senderNo;
        this.senderAddress = senderAddress;
        this.receiver = receiver;
        this.receiverNo = receiverNo;
        this.receiverAddress = receiverAddress;
        this.createDate = createDate;        
    }        
    
    public void setSmartNo(int smartNumber){
        this.smartNumber = smartNumber;
    }
    
    public int getSmartNo(){
        return this.smartNumber;
    }
    
    public void setRefNo(String refNo){
        this.refNo = refNo;
    }
    
    public String getRefNo(){
        return this.refNo;
    }
    
    public void setAmount(BigDecimal amount){
        this.amount = amount;
    }
    
    public BigDecimal getAmount(){
        return this.amount;
    }
    
    public void setBalance(BigDecimal balance){
        this.balance = balance;
    }
    
    public BigDecimal getBalance(){
        return this.balance;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public String getType(){
        return this.type;
    }
    
    public void setSender(String sender){
        this.sender = sender;
    }
    
    public String getSender(){
        return this.sender;
    }

    public void setSenderNo(int senderNo){
        this.senderNo = senderNo;
    }
    
    public int getSenderNo()
    {
        return this.senderNo;
    }
    
    public void setSenderAdd(String senderAddress){
        this.senderAddress = senderAddress;
    }
    
    public String getSenderAdd(){
        return this.senderAddress;
    }
    
    public void setReceiver(String receiver){
        this.receiver = receiver;
    }
    
    public String getReceiver(){
        return this.receiver;
    }
    
    public void setReceiverNo(int receiverNo){
        this.receiverNo = receiverNo;
    }
    
    public int getReceiverNo()
    {
        return this.receiverNo;
    }
    
    public void setReceiverAdd(String receiverAddress){
        this.receiverAddress = receiverAddress;
    }
    
    public String getReceiverAdd(){
        return this.receiverAddress;
    }
    
    public void setCreateDate(){
        this.createDate = "now()";
    }
    
    public String getCreateDate()
    {
        return this.createDate;
    }
}

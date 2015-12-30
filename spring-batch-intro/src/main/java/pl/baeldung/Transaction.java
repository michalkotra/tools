package pl.baeldung;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@SuppressWarnings("restriction")
@XmlRootElement(name = "transactionRecord")
public class Transaction {

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    private int userId;
    private Date transactionDate;
    private double amount;

    @Override
    public String toString() {
        return "Transaction [username=" + username + ", userId=" + userId
                + ", transactionDate=" + transactionDate + ", amount=" + amount
                + "]";
    }
}

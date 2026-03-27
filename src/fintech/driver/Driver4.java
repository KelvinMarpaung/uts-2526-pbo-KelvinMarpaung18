package fintech.driver;

import java.util.*;
/**
 * @author 12S24018 Kelvin yohanes putra
 
 */
public class Driver4 {

    public static void main(String[] _args) {

        
    protected int id;
    protected String username;
    protected double amount;
    protected String timestamp;
    protected String description;

    public Transaction(int id, String username, double amount, String timestamp, String description) {
        this.id = id;
        this.username = username;
        this.amount = amount;
        this.timestamp = timestamp;
        this.description = description;
    }

    public abstract String getType();

}

    }

}
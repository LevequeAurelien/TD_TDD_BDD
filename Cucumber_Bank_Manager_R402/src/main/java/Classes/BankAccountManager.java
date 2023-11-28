package Classes;

import Classes.BankAccount;

import java.util.HashMap;
import java.util.Map;

public class BankAccountManager {

    public Map<Integer, BankAccount> accounts;

    public BankAccountManager() {
        accounts = new HashMap<>();
    }

    public void create(int accountId) {
        accounts.put(accountId, new BankAccount(0,100));
    }

    public void deposit(int accountId, double amount) throws Exception {
        accounts.get(accountId).deposit(amount);
    }

    public void withdraw(int accountId, double amount) throws Exception {
        accounts.get(accountId).withdraw(amount);
    }

    public double getBalance(int accountId) {
        return accounts.get(accountId).checkBalance();
    }
}

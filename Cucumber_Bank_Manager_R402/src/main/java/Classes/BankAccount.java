package Classes;

public class BankAccount {
    private double balance;
    private double decouvert;

    public BankAccount(double i, double somme){
        this.balance = i;
        decouvert = somme;
    }

    private void exeption_balance_negatif() throws Exception {
        if (balance < 0-decouvert){
            throw new Exception("Le compte est négatif");
        }
    }

    public void deposit(double amount) throws Exception {
        exeption_balance_negatif();
        if (amount >= 0) {
            balance += amount;
        }
        else {
            throw new Exception("La montant doit être positif");
        }
        return;
    }

    public void withdraw(double amount) throws Exception{
        exeption_balance_negatif();
        if (amount <= balance + decouvert){
            balance -= amount;
        }  else {
            throw new Exception("Vous avez pas assez sur le compte");
        }
        if (amount < 0) {
            throw new Exception("Le montant doit être positif");
        }
        return;
    }

    public double checkBalance() {
        return balance;

    }
}


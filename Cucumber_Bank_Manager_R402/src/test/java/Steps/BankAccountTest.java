package Steps;

import Classes.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    BankAccount BA = new BankAccount(500,100);

    @Test
    void deposit() throws Exception {
        BA.deposit(50);
        assertEquals(550,BA.checkBalance(),0.01);
    }

    @Test
    void deposit2() throws Exception {
        assertThrows(Exception.class, () ->{
            BA.deposit(-5);
        });
    }

    @Test
    void withdraw() throws Exception {
        BA.withdraw(550);
        assertEquals(-50,BA.checkBalance(),0.01);
    }

    @Test
    void withdraw2() throws Exception {
        assertThrows(Exception.class, () ->{
            BA.withdraw(601);
        });
    }

}

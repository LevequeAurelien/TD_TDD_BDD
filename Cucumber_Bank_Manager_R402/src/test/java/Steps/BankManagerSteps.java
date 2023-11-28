package Steps;

import Classes.BankManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankManagerSteps {

    private BankManager bankManager;

    @Given("Un nouveau compte bancaire {int} est cree avec un solde initial de {double}")
    public void je_cree_un_compte_initial_1000(int Id_compte, double solde_deb){
        System.out.println("Dand Given");
        bankManager = new BankManager();
        bankManager.create(Id_compte);
        bankManager.deposit(Id_compte, solde_deb);
    }

    @When("Je depose {double} dans le compte {int}")
    public void je_depose_de_l_argent_dans_le_compte(double solde_add, int Id_compte){
        System.out.println("Dand When");
        bankManager.deposit(Id_compte, solde_add);
    }

    @Then("Le solde du compte {int} est de {double}")
    public void je_devrais_voir_le_resultat(int Id_compte, double resultat){
        System.out.println("Dans Then");
        assertEquals(resultat, bankManager.getBalance(Id_compte));
    }



    @Given("Un nouveau compte bancaire {int} est cree")
    public void je_cree_un_compte(int Id_compte){
        System.out.println("Dand Given");
        bankManager = new BankManager();
        bankManager.create(Id_compte);
    }

    @When("Je recois {double} dans le compte {int}")
    public void je_recois_de_l_argent_dans_le_compte(double solde_add, int Id_compte){
        System.out.println("Dans When");
        bankManager.deposit(Id_compte, solde_add);
    }

    @And("Je retire {double} dans le compte {int}")
    public void je_retire_de_l_argent_dans_le_compte(double solde_supp, int Id_Compte){
        System.out.println("Dans And");
        bankManager.withdraw(Id_Compte, solde_supp);
    }

    @Then("Le solde du compte {int} a comme {double}")
    public void je_devrais_voir_le_bon_resultat(int Id_compte, double resultat){
        System.out.println("Dans Then");
        assertEquals(resultat, bankManager.getBalance(Id_compte));
    }

    @Given("Un nouveau compte bancaire {int} avec un solde initial de {double} et un autre nouveau compte bancaire {int} doit etre cree")
    public void je_cree_un_compte(int Id_compte, double solde_deb, int Id_compte3){
        System.out.println("Dand Given");
        bankManager = new BankManager();
        bankManager.create(Id_compte);
        bankManager.deposit(Id_compte, solde_deb);
        bankManager.create(Id_compte3);
    }

    @When("Le compte {int} retire {double}")
    public void je_retire_de_l_argent_dans_le_compte1(int Id_compte, double Account){
        System.out.println("Dans When");
        bankManager.withdraw(Id_compte, Account);
    }

    @And("Le compte {int} recois {double}")
    public void je_recois_de_l_argent_venant_du_compte1(int Id_Compte3, double Account){
        System.out.println("Dans And");
        bankManager.deposit(Id_Compte3, Account);
    }

    @Then("Le solde du compte {int} a comme resultat {double}")
    public void je_devrais_voir_le_bon_resultat_du_compte_1(int Id_compte, double resultat){
        System.out.println("Dans Then");
        assertEquals(resultat, bankManager.getBalance(Id_compte));
    }

    @Then("Le solde du compte {int} a donc comme resultat {double}")
    public void je_devrais_voir_le_bon_resultat_du_compte_3(int Id_compte3, double resultat){
        System.out.println("Dans Then");
        assertEquals(resultat, bankManager.getBalance(Id_compte3));
    }
}


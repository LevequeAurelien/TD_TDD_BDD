Feature: Gestion manager
En tant que manager
Je veux pouvoir gerer les comptes
Afin de controler les depenses

@depot
Scenario Outline: Creation et depot sur un compte
  Given Un nouveau compte bancaire <Id_compte> est cree avec un solde initial de <solde_deb>
  When Je depose <solde_add> dans le compte <Id_compte>
  Then Le solde du compte <Id_compte> est de <resultat>
  Examples:
    | Id_compte | solde_deb | solde_add | resultat |
    | 1         | 1000      | 500       | 1500     |

@retrait
Scenario Outline: Creation et retrait sur un compte
  Given Un nouveau compte bancaire <Id_compte> est cree
  When Je recois <solde_add> dans le compte <Id_compte>
  And Je retire <solde_supp> dans le compte <Id_compte>
  Then Le solde du compte <Id_compte> a comme <resultat>
  Examples:
    | Id_compte | solde_add | solde_supp | resultat |
    | 3         | 1000      | 500        | 500      |


@retrait_depot
Scenario Outline: Creation et retrait sur un compte
  Given Un nouveau compte bancaire <Id_compte> avec un solde initial de <solde_deb> et un autre nouveau compte bancaire <Id_compte3> doit etre cree
  When Le compte <Id_compte> retire <account>
  And Le compte <Id_compte3> recois <account>
  Then Le solde du compte <Id_compte> a comme resultat <resultat>
  Then Le solde du compte <Id_compte3> a donc comme resultat <resultat3>
  Examples:
    | Id_compte | solde_deb | Id_compte3 | account | resultat | resultat3 |
    | 1         | 1000      | 3          | 500     | 500      | 500       |


#  @retrait_compte_découvert
#  Scenario Outline: Creation et retrait sur un compte dans le but d'un découvert
#    Given Un nouveau compte bancaire <Id_compte> est cree pour un découvert
#    When Je retire la somme de <solde_add> dans le compte <Id_compte>
#    Then Le solde du compte <Id_compte> a comme le suivant <resultat>
#    Examples:
#      | Id_compte | solde_add | resultat |
#      | 2         | 100       | -100     |


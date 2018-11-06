package BankApp;

public class BankAccount {
    String name = "";
    String animalType = "";
    double balance = 0;
    public BankAccount(String name, String animalType, long balance){
        this.name = name;
        this.animalType = animalType;
        this.balance = balance;
    }
    @Override
    public String toString(){
        return name + " " + animalType + " " + balance + "$";
    }


    public String getName() {
        return name;
    }

    public String getAnimalType() {
        return animalType;
    }

    public double getBalance() {
        return balance;
    }
}

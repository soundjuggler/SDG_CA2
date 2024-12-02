/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marinechallengesapp;

/**
 *
 * @author adamk
 */
public class Donation {
    private String Name;
    private int Amount, Pin, CardNum;

    public Donation() {
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public void setPin(int Pin) {
        this.Pin = Pin;
    }

    public void setCardNum(int CardNum) {
        this.CardNum = CardNum;
    }

    public String getName() {
        return Name;
    }

    public int getAmount() {
        return Amount;
    }

    public int getPin() {
        return Pin;
    }

    public int getCardNum() {
        return CardNum;
    }
    
    public String printDetails(){
        return "name: "+Name+", ID +ID";
    }
    
}

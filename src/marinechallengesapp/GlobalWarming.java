/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marinechallengesapp;

/**
 *
 * @author adamk
 */
public class GlobalWarming {
    private String Affects, Reason;

    public GlobalWarming() {
    }

    public void setAffects(String Affects) {
        this.Affects = Affects;
    }

    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public String getAffects() {
        return Affects;
    }

    public String getReason() {
        return Reason;
    }
    
   
    public String printDetails(){
        return "Affects: "+Affects+", Reason: +Reason+"
                + "";
    }
    
}

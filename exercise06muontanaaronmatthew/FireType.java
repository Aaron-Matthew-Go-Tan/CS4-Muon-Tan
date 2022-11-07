/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise06muontanaaronmatthew;

/**
 *
 * @author MUON
 */
public class FireType extends SimpleMonster{
    
    public FireType(){
        this.strongAgainst = "grass";
        this.weakAgainst = "water";
        this.atk = 1.3 * base;
    }
}

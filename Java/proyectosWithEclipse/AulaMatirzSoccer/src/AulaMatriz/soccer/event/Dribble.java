/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AulaMatriz.soccer.event;

/**
 *
 * @author ksomervi
 */
public class Dribble extends GameEvent {
    
    // At the simplest, if successful dribbling moves towards the other teams goal
    public Dribble(){
    }
    
    public String toString() {
        return "Dribble ";
    }
    
    @Override
    public GameEvent[] getNextEvents() {
        GameEvent theEvent[] = { new GainPossession(), new Shoot(), new Pass()};
        return theEvent;
    }
    
    @Override
    public boolean changePlayer() {
        return false;
    }
    
    @Override
    public boolean changeTeam() {
        return false;
    } 
}

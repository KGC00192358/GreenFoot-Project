import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FightWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FightWorld extends World
{

    /**
     * Builds a FightWorld object.
     * 
     */
    public FightWorld()
    {    
        super(600, 400, 1);
        Fighter fighter = new Fighter();
        addObject(fighter, 50, 350);
    }
    
    /**
     *  
     */
    public void act() {
        
    }
}

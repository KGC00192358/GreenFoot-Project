import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bombbot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bombbot extends enemy
{
    /**
     * Act - do whatever the bombbot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public bombbot() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() + 100, image.getHeight() + 100);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}

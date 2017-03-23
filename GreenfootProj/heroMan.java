import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class heroMan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class heroMan extends Actor
{
    /**
     * Act - do whatever the heroMan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public heroMan() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() + 63, image.getHeight() + 63);
        setImage(image);
    }
    public void act()
    
    {
        // Add your action code here.
        move(-90);
    }    
}

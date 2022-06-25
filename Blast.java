import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blast here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blast extends Actor
{
    GifImage alif = new GifImage("blast.gif");
    
    int count = 0;
    /**
     * Act - do whatever the Blast wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(alif.getCurrentImage());
        
        count++;
        
        if(count >= (15)){
            getWorld().removeObject(this);
        }
    }
}

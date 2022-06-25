import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World_Guide here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World_Guide extends World
{
    static int leftX = 200;
    static int rightX = 400;
    static int mainY = 400;
    
    static Bat_guide bat = new Bat_guide();
    
    /**
     * Constructor for objects of class World_Guide.
     * 
     */
    public World_Guide()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        
        
        addObject(new Door(), 550, 350);
        
        addObject(bat, leftX, mainY);
    }
    
    private void prepare(){
        
        
    }
}

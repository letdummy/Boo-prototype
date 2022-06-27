import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World_Guide here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World_End extends World
{   
    /**
     * Constructor for objects of class World_Guide.
     * 
     */
    public World_End()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        logic();

    }
    
    public void logic(){
        MyWorld.background.stop();
        MyWorld.end.playLoop();
        
        addObject(new BgEnd(), 300, 200);
        addObject(new GameOver(), 295, 150);
        
        //Create empty health look
        addObject(new Hp0(), MyWorld.nyawa3.getX(), 
                             MyWorld.nyawa3.getY());         
        addObject(new Hp0(), MyWorld.nyawa2.getX(), 
                             MyWorld.nyawa2.getY()); 
        addObject(new Hp0(), MyWorld.nyawa1.getX(), 
                             MyWorld.nyawa1.getY());
                             
        //Add graveyard
        addObject(new Rip(), 300, 250);
        
        //Add retry button
        addObject(new Door(), 550, 350);
    }
}

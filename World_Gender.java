import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World_Gender here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World_Gender extends World
{

    
    /**
     * Constructor for objects of class World_Gender.
     * 
     */
    static GifImage gender;
    static GifImage gender_mirror;
    
    public World_Gender()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        
        MyWorld.end.stop();
        MyWorld.background.stop();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        showText("Select Gender",300,100);
        Ghost_f ghost_f = new Ghost_f();
        addObject(ghost_f,200,200);
        Ghost_m ghost_m = new Ghost_m();
        addObject(ghost_m,400,200);
        Help help = new Help();
        addObject(help,556,365);
    }
    
    
}

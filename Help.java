import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Help extends Actor
{
    GifImage help = new GifImage("help.gif");
    /**
     * Act - do whatever the Help wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(help.getCurrentImage());
        
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new World_Guide());
        }
    }
}

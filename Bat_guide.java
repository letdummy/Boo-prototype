import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bat_guide here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bat_guide extends Actor
{
    GifImage bat = new GifImage("bat_guide.gif");
    /**
     * Act - do whatever the Bat_guide wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(bat.getCurrentImage());
        logic_guide();
    }
    
    public void logic_guide(){
        if(getWorld() instanceof World_Guide){
            
            setLocation(getX(), getY()-1);
            
        }
    }    
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ghost_m here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ghost_m extends Actor
{
    
    GifImage male = new GifImage("Ghost M right.gif");
    GifImage male_mirror = new GifImage("Ghost M left.gif");
    /**
     * Act - do whatever the Ghost_m wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(male.getCurrentImage());
        
        if(Greenfoot.mouseClicked(this)){
            MyWorld.menu.play();
            World_Gender.gender = male;
            World_Gender.gender_mirror = male_mirror;
            Greenfoot.setWorld(new MyWorld());
        } 
    }
    
   
}

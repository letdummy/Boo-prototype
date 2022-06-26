import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ghost_f here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ghost_f extends Actor
{
    GifImage female = new GifImage("Ghost F right.gif");
    GifImage female_mirror = new GifImage("Ghost F left.gif");
    
    /**
     * Act - do whatever the ghost_f wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(female.getCurrentImage());

        //to select character female
        //edit gender and gender_mirror value in World_Gender 
        //to new GifImage("Ghost F right.gif");
        //and new GifImage("Ghost F left.gif");
        if(Greenfoot.mouseClicked(this)){
            MyWorld.menu.play();
            World_Gender.gender = female;
            World_Gender.gender_mirror = female_mirror;
            Greenfoot.setWorld(new MyWorld());
        }        
    }
    
}

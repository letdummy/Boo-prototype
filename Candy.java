import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Candy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Candy extends Actor
{
    /**
     * Act - do whatever the Candy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GifImage candy = new GifImage("candy.gif");
    public void act()
    {
        setImage(candy.getCurrentImage());
        
        getScore();
    }
    
    public void getScore(){
        if(isTouching(Ghost.class)){
            MyWorld.point.play();
            getWorld().addObject(new Candy(), Greenfoot.getRandomNumber(600), 
                                206);
            
            getWorld().addObject(new Spark(), getX(), getY());
            
            MyWorld.score.add(5);          
            getWorld().removeObject(this);
            
        }
    }
}

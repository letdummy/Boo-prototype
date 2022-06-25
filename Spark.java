import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spark here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spark extends Actor
{
    GifImage spark = new GifImage("spark.gif");
    
    int count = 0;
    /**
     * Act - do whatever the Spark wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(spark.getCurrentImage());
        
        count++;
        if(count >= (15)){
            getWorld().removeObject(this);
        }
    }
}

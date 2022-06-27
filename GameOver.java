import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    GifImage gameover = new GifImage("gameover.gif");
    
    public void act()
    {
        setImage(gameover.getCurrentImage());
    }
}

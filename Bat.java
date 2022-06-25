import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bat extends Actor
{
    GifImage bat = new GifImage("bat.gif");
    int nyawa = MyWorld.lives.getValue();
    
    
    
    int pending = 15;
    /**
     * Act - do whatever the Bat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(bat.getCurrentImage());
        logic();
        
        
        
    }
    
    public void logic(){
        if(isTouching(Ghost.class)){
            MyWorld.lives.add(-1);
            getWorld().addObject(new Bat(), Greenfoot.getRandomNumber(600),
                                       206);
            checkLives();
            getWorld().addObject(new Blast(), getX(), getY());
            getWorld().removeObject(this);
        }        
    }
    
    public void checkLives(){       
        if(nyawa == (3)){
            getWorld().removeObject(MyWorld.nyawa3);
        }
        
        else if(nyawa ==(2)){
            getWorld().removeObject(MyWorld.nyawa2);
        }
        
        else if(nyawa == (1)){
            MyWorld.background.stop();
            MyWorld.end.playLoop();
            
            getWorld().removeObject(MyWorld.nyawa1);
            
            getWorld().addObject(new BgEnd(), 300, 200);
            getWorld().addObject(new GameOver(), 300, 200);
            
            Greenfoot.stop();
            
            
        }
    }     
    

}

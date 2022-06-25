import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int nyawa = MyWorld.lives.getValue();
    
    
    public void act()
    {
        logic();
         
    }

    public void logic(){
        if(isTouching(Ghost.class)){
            MyWorld.lives.add(-1);
            getWorld().addObject(new Enemy(), Greenfoot.getRandomNumber(600),
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

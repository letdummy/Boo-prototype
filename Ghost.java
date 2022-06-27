import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ghost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 
public class Ghost extends Actor
{
    /**
     * Act - do whatever the Ghost wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int nyawa = MyWorld.lives.getValue();

    GreenfootSound jump = new GreenfootSound("jump.wav");
    GreenfootSound shoot = new GreenfootSound("shoot.wav");
    
    
    /**
     
    !!! 
    Because of gender and gender_mirror value in World_Gender 
    is no longer empty we can use its value here (either its male or female)
    
    */
    public void act()
    {
        GifImage selected = World_Gender.gender; 
        setImage(selected.getCurrentImage());
        move();    
        

    }
    
    public void move(){
        if(Greenfoot.isKeyDown("right")){
            setImage(World_Gender.gender.getCurrentImage());
            setLocation(getX()+4, getY());}
        
        else if(Greenfoot.isKeyDown("left")){
            setImage(World_Gender.gender_mirror.getCurrentImage());
            setLocation(getX()-4, getY());
        }
        
        if(Greenfoot.isKeyDown("up")){
            jump.play();
        }
        
        if(Greenfoot.isKeyDown("space")){
            shoot.play();
        }
    }
}

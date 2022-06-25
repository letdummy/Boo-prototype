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
    
    int level = 0;
    int nyawa = MyWorld.lives.getValue();

    GreenfootSound jump = new GreenfootSound("jump.wav");
    GreenfootSound shoot = new GreenfootSound("shoot.wav");
    public void act()
    {
        GifImage selected = World_Gender.gender; 
        setImage(selected.getCurrentImage());
        move();
        // checkLives();
              
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
    
    public void checkLives(){
        if(nyawa == (2)){
            getWorld().addObject(MyWorld.nyawa1, 500, 20);
            getWorld().addObject(MyWorld.nyawa2, 530, 20);
            getWorld().addObject(MyWorld.nyawa3, 560, 20);
        }        
        else if(nyawa == (2)){
            getWorld().removeObject(MyWorld.nyawa3);
        }
        
        if(isTouching(Enemy.class)){
            MyWorld.lives.add(-1);
        }  
    }

}

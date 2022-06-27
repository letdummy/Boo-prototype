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
        /**Whenever bat(this) touching ghost(our chara): 
         - run checkLives method
         - it will reduce lives value by 1
         - add object new bat in random coodinate
         - add object blast in the same current coordinate (blast effect)
         - play blast sound 
         - and then finally remove current object from MyWorld
        */
        if(isTouching(Ghost.class)){
            checkLives();
            
            MyWorld.lives.add(-1);
            getWorld().addObject(new Bat(), Greenfoot.getRandomNumber(600),
                                       206);
            getWorld().addObject(new Blast(), getX(), getY());
            MyWorld.blast.play();
            getWorld().removeObject(this);
        }        
    }
    
    public void checkLives(){       
        /** This method will run whenever bat touching ghost
         - if lives = 3, then it will replace nyawa3 to Hp0
         - if lives = 2, then it will replace nyawa2 to Hp0
         - if lives = 1, then it will replace nyawa1 to Hp0, 
                         stop background.wav music playLoop, 
                         also start to playLoop end.wav music
                         and end this game.
        */
        if(nyawa == (3)){
            //Replace or menimpa Hp to Hp0 in exact same location
            //to create effect that Hp reduced            
            getWorld().addObject(new Hp0(), MyWorld.nyawa3.getX(), 
                                            MyWorld.nyawa3.getY()); 
        }
        
        else if(nyawa ==(2)){
            //Replace or menimpa Hp to Hp0 in exact same location
            //to create effect that Hp reduced            
            getWorld().addObject(new Hp0(), MyWorld.nyawa2.getX(), 
                                            MyWorld.nyawa2.getY());            
        }
        
        else if(nyawa == (1)){
            Greenfoot.setWorld(new World_End());
            
            /*
            //Replace or menimpa Hp to Hp0 in exact same location
            //to create effect that Hp reduced
            getWorld().addObject(new Hp0(), MyWorld.nyawa1.getX(), 
                                            MyWorld.nyawa1.getY());
            
            //Add this object to MyWorld
            getWorld().addObject(new BgEnd(), 300, 200);
            getWorld().addObject(new GameOver(), 300, 200);
            
            //Change ghost to RIP
            getWorld().addObject(new Rip(), getX(), getY());
            getWorld().removeObject(MyWorld.ghost);
                    
            
            //World finished
            MyWorld.background.stop();
            MyWorld.end.playLoop();            
            Greenfoot.stop();
            */
        }
    }     
    

}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    static Counter lives = new Counter("Lives : ");
    static Counter score = new Counter("Score : ");
    static Hp nyawa1 = new Hp();
    static Hp nyawa2 = new Hp();
    static Hp nyawa3 = new Hp();
    static Door door = new Door();
   
    static GreenfootSound background = new GreenfootSound("bgm.wav");
    static GreenfootSound point = new GreenfootSound("point.wav");
    static GreenfootSound menu = new GreenfootSound("menu.wav");
    static GreenfootSound end = new GreenfootSound("end.wav");
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        MyWorld.lives.setValue(3); 
        MyWorld.score.setValue(0);
        
        prepare();
        
        addObject(lives,55,20);        
        addObject(score,55,50);  
        addObject(nyawa1, 500, 20);
        addObject(nyawa2, 530, 20);
        addObject(nyawa3, 560, 20);
        
        
        started();  

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ghost chara = new Ghost();
        addObject(chara,302,206);
        Bat bat = new Bat();
        addObject(bat,570,206);        

        Candy candy = new Candy();
        addObject(candy, 200, 206);
    }

    public void started(){
        background.playLoop();
    }
}

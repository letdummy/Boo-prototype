import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    //why static? because we want to get and edit its value later
    static Counter lives = new Counter("Lives : ");
    static Counter score = new Counter("Score : ");
    static Ghost ghost = new Ghost();
    
    //why static? because we want remove this later
    static Hp nyawa1 = new Hp();
    static Hp nyawa2 = new Hp();
    static Hp nyawa3 = new Hp();
    
    //why static? because we want to use it multiple time in diff class
    static GreenfootSound background = new GreenfootSound("bgm.wav");
    static GreenfootSound point = new GreenfootSound("point.wav");
    static GreenfootSound menu = new GreenfootSound("menu.wav");
    static GreenfootSound end = new GreenfootSound("end.wav");
    static GreenfootSound blast = new GreenfootSound("blast.wav");
    
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells
        super(600, 400, 1); 
        
        //setting our counter value
        MyWorld.lives.setValue(3); 
        MyWorld.score.setValue(0);
        
        //adding our object to the world, why here? because if we add it in
        //prepare(), we wouldn't be able to manipulate this later
        addObject(lives,55,20);        
        addObject(score,55,50);  
        addObject(ghost,302,206);  
        addObject(nyawa1, 500, 20);
        addObject(nyawa2, 530, 20);
        addObject(nyawa3, 560, 20);
        
              
        prepare();
        started();  

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        

        Bat bat = new Bat();
        addObject(bat,570,206);        

        Candy candy = new Candy();
        addObject(candy, 200, 206);
    }

    public void started(){
        //background music will be played if MyWorld have been started
        background.playLoop();
    }
}

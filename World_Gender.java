import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
   Created by:
   Agus Ardiansyah Nh
   Aldin Nasrun Minalloh
   Hanifah Afkar Nabila
*/

public class World_Gender extends World
{
    //created static empty variable so that we can use/edit its value later
    static GifImage gender;
    static GifImage gender_mirror;
    
    
    public World_Gender()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        
        //if this world(World_Gender) is played(run), 
        //music from MyWorld will be stoped
        MyWorld.end.stop();
        MyWorld.background.stop();
    }

    private void prepare()
    {
        //simply, this will executed before world played(run)
        showText("Select Gender",300,100);
        Ghost_f ghost_f = new Ghost_f();
        addObject(ghost_f,200,200);
        Ghost_m ghost_m = new Ghost_m();
        addObject(ghost_m,400,200);
    }
}

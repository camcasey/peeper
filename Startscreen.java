import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Startscreen extends World
{
    GreenfootSound titlemusic = new GreenfootSound("eterna.mp3");
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public Startscreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 550, 1); 
        setBackground("Startscreen.jpg");
        Peep dummy = new Peep();
        addObject(dummy, 750, 400);
        prepare();
    }
    
    public void act(){
        titlemusic.playLoop();
        if (Greenfoot.isKeyDown("a")){
            Greenfoot.setWorld(new Backstory());
        }
        
        
        
    }
    
    private void prepare(){
        
    }
    
    
    
}

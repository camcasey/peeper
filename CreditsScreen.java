import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditsScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditsScreen extends World
{
    int counter = 0;
    Peep peeper = new Peep();
    Text3 txt = new Text3();
    Text4 txt2 = new Text4();
    /**
     * Constructor for objects of class CreditsScreen.
     * 
     */
    public CreditsScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 550, 1); 
        setBackground("Credits.jpg");
        addObject(peeper, 0, 50);
    }
    
    public void act(){
        counter++;
        if (counter < 950){
            peeper.setLocation(peeper.getX() + 1, peeper.getY());
        }
        if (counter == 950){
            removeObject(peeper);
        }
        if (counter == 300){
            addObject(txt, 700, 170);
        }
        if (counter == 600){
            removeObject(txt);
        }
        if (counter == 600){
            addObject(txt2, 850, 150);
        }
        if (counter == 850){
            removeObject(txt2);
        }
    }
    
}

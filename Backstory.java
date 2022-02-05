import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Backstory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Backstory extends World
{
    
    /**
     * Constructor for objects of class Backstory.
     * 
     */
    public Peep dummy = new Peep();
    Peep dummytwo = new Peep();
    public int counter = 0;
    public Text txt = new Text();
    public Text2 txts = new Text2();
    Peep dummythree = new Peep();
    Tears tear = new Tears();
    public Backstory()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 550, 1); 
        setBackground("Treetop.jpg");
        
        
    }
    
    public void act(){
        counter++;
        addObject(dummy, 250, 400);
        addObject(dummytwo, 190, 400);
        addObject(dummythree, 100, 400);
        if (counter == 125){
            addObject(txt, 260, 300);
            dummytwo.setLocation(dummytwo.getX() + 3, dummytwo.getY());
        }
        if (counter == 200){
            removeObject(txt);
            dummytwo.setLocation(dummytwo.getX() + 3, dummytwo.getY());
        }
        if (counter > 300) {
            if (counter > 670){
                removeObject(dummy);
            } 
            
            if (counter <= 670){
                dummy.setLocation(dummy.getX() + 2, dummy.getY() - 1);
            }
        }
        
        if (counter == 670) {
            addObject(txts, 230, 300);
            dummytwo.setLocation(dummytwo.getX() + 5, dummytwo.getY());
        }
        if (counter == 820) {
            removeObject(txts);
        }
        if (counter > 900) {
            if (counter > 1215) {
                removeObject(dummytwo);
            }
            if (counter <= 1200) {
                dummytwo.setLocation(dummytwo.getX() + 3, dummytwo.getY() - 1);
            } 
            
            }
        if (counter > 1230 && counter < 1300){
            dummythree.setLocation(dummythree.getX() + 3, dummythree.getY());            
        }
        
        if (counter > 1300 && counter < 1350){
            addObject(tear, 315, 400);
        }
        
        if (counter > 1400){
            if (counter == 1401){
                removeObject(tear);
            }
            
            if (counter > 1410){
                dummythree.setLocation(dummythree.getX() + 1, dummythree.getY() + 1);    
            }
            if (counter > 1425){
                removeObject(dummythree);
            }
        }
        
        if (counter == 1450){
            Greenfoot.setWorld(new FirstLevel());
        }
            
        
        
        
    }
}


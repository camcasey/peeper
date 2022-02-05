import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Peep here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peep extends Actor
{
    /**
     * Act - do whatever the Peep wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private GreenfootImage[] images=new GreenfootImage[6];
    private int maxer=8, cur=0, dels=30;
    public void addedToWorld(World Startscreen){
        for (int i=0; i<images.length; i++){
            images[i] = new GreenfootImage("Peep" + i + ".png");
            if (i != 1){
                images[i].scale(images[i].getWidth()/2, images[i].getHeight()/2);
            }
           
        
        }
        setImage(images[0]);
    }
    public void act()
    {
        
        if (maxer==0)maxer=8;
        if (maxer==1){
            setImage(images[cur]);
            cur++;
            if (cur == 6){
                cur = 0;
            }
            
        }
        if(maxer>0)maxer--;
        //GreenfootImage img = new GreenfootImage("Peeper.png");
        //img.scale(img.getWidth()/2, img.getHeight()/2);
        //setImage(img);
        
        
        
    }
    
    public void jumpoff()
    {
        setLocation(getX() + 1, getY() + 1);
    }
}

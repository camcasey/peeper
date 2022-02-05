import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
import java.lang.Math;
/**
 * Write a description of class SecondLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalLevel extends World
{
    GreenfootSound coins = new GreenfootSound("coin.mp3");
    Peep player = new Peep();
    Health h = new Health();
    Health h1 = new Health();
    Health h2 = new Health();
    int counter = 0;
    Penguin airplane = new Penguin();
    Penguin airplane2 = new Penguin();
    Random rand = new Random();
    Coin coiner = new Coin();
    int health = 3;
    int coincounter = 0;
    int coinscollected = 0;
    int counter2 = 0;
    Point p5 = new Point();
    Point p1 = new Point();
    Point p2 = new Point();
    Point p3 = new Point();
    Point p4 = new Point();
    Point p6 = new Point();
    Point p7 = new Point();
    Point p8 = new Point();
    Point p9 = new Point();
    Point p10 = new Point();
    Point p11 = new Point();
    Point p12 = new Point();
    /**
     * Constructor for objects of class SecondLevel.
     * 
     */
    public FinalLevel()
    {    
        super(1000, 550, 1); 
        setBackground("Cavern.jpg");
        addObject(player, 100, 250);
        addObject(h, 25, 50);
        addObject(h1, 100, 50);
        addObject(h2, 175, 50);
        addObject(airplane, 990, 250);
        addObject(coiner, 990, 350);
        addObject(airplane2, 990, 400);
    }
    
    public void act(){
        
        if ((Math.abs(player.getX() - airplane.getX()) < 100) && (Math.abs(player.getY() - airplane.getY()) < 100)){
            health--;
            airplane.setLocation(990, rand.nextInt(500));
            counter = 0;
        }
        if ((Math.abs(player.getX() - coiner.getX()) < 100) && (Math.abs(player.getY() - coiner.getY()) < 100)){
            coinscollected++;
            coiner.setLocation(990, rand.nextInt(500));
            coins.play();
            coincounter = 0;
        }
        if ((Math.abs(player.getX() - airplane2.getX()) < 100) && (Math.abs(player.getY() - airplane2.getY()) < 100)){
            health--;
            airplane2.setLocation(990, rand.nextInt(500));
            counter2 = 0;
        }
        counter2++;
        counter++;
        coincounter++;
        int rander = 0;
        if (health == 2){
            removeObject(h2);
        }
        if (health == 1){
            removeObject(h1);
        }
        if (health == 0){
            Greenfoot.setWorld(new GameOver());
        }
        if (coinscollected == 1){
            addObject(p1, 700, 50);
        }
        if (coinscollected == 2){
            addObject(p2, 750, 50);
        }
        if (coinscollected == 3){
            addObject(p3, 800, 50);
        }
        if (coinscollected == 4){
            addObject(p4, 850, 50);
        }
        if (coinscollected == 5){
            addObject(p5, 900, 50);
        }
        if (coinscollected == 6){
            addObject(p6, 950, 50);
        }
        if (coinscollected == 7){
            addObject(p7, 700, 100);
        }
        if (coinscollected == 8){
            addObject(p8, 750, 100);
        }

        if (coinscollected == 9){
            addObject(p9, 800, 100);
        }

        if (coinscollected == 10){
            addObject(p10, 850, 100);
        }

        if (coinscollected == 11){
            addObject(p11, 900, 100);
        }

        if (coinscollected == 12){
            addObject(p6, 950, 100);
        }

        if (coinscollected == 13){
            Greenfoot.setWorld(new CreditsScreen());
        }
        if (Greenfoot.isKeyDown("up")){
            player.setLocation(player.getX(), player.getY() - 2);
        }
        if (Greenfoot.isKeyDown("down")){
            player.setLocation(player.getX(), player.getY() + 4);
        }
        if (Greenfoot.isKeyDown("right")){
            player.setLocation(player.getX() + 1, player.getY());
        }
        if (Greenfoot.isKeyDown("left")){
            player.setLocation(player.getX() - 1, player.getY());
        }
        
        if (counter < 350){
            airplane.setLocation(airplane.getX() - 3, airplane.getY());
        }
        if (counter == 350){
            counter = 0;
            airplane.setLocation(990, rand.nextInt(500));
        }
        if (coincounter < 250){
            coiner.setLocation(coiner.getX() - 4, coiner.getY());
        }
        if (coincounter == 250){
            coincounter = 0;
            coiner.setLocation(990, rand.nextInt(500));
        }
        if (counter2 < 250){
            airplane2.setLocation(airplane2.getX() - 4, airplane2.getY());
        }
        if (counter2 == 250){
            counter2 = 0;
            airplane2.setLocation(990, rand.nextInt(500));
        }
        
    }
}

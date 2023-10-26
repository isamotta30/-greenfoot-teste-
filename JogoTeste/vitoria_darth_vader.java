import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class vitoria_darth_vader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class vitoria_darth_vader extends World
{
    /**
     * Constructor for objects of class vitoria_darth_vader.
     * 
     */
    public vitoria_darth_vader()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(670, 446, 1); 
    }
    public void act(){
  
    if(Greenfoot.isKeyDown("enter")){
        setBackground(new GreenfootImage("creditos.png"));
        
    }
}
}

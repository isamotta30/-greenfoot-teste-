import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo here.
 * 
 * @author Isabela
 * @version 0.1 Alpha
 */
public class Mundo extends World
{
   private GreenfootSound bgMusic = new GreenfootSound("darthvader.mp3");
   
   public void started()
   {
       bgMusic.playLoop();
   }
    public void stopped()
    {
        bgMusic.pause();
    }
   
   
    /**
     * Constructor for objects of class Mundo.
     * 
     */
    public Mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(670, 446, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {

        Darth_Vader darth_Vader = new Darth_Vader();
        addObject(darth_Vader,486,346);
        Yoda yoda = new Yoda();
        addObject(yoda,138,382);
        Fogo fogo = new Fogo();
        addObject(fogo,296,388);
        yoda.setLocation(166,336);
        Counter counter = new Counter();
        addObject(counter,172,27);
        Counter2 counter2 = new Counter2();
        addObject(counter2,500,23);
        yoda.setLocation(182,340);
        yoda.setLocation(153,388);
    }
}

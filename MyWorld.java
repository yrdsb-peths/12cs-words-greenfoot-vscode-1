import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Avatar hero = new Avatar(); 
        addObject(hero, 300, 200);
    }
}

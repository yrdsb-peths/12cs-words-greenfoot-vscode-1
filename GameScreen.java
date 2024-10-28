import greenfoot.*;
public class GameScreen extends World {
    String myStr;
    public int index = Greenfoot.getRandomNumber(74);
    public GameScreen() {
        super(600, 400, 1);

        if (MenuScreen.themeType==0){
            myStr=AnimalList.animals[1];
            char[] charArray = myStr.toCharArray();
            for (char s : charArray) {
                System.out.println(s);
            
            }
        }

        else if(MenuScreen.themeType==1) {
            myStr=FoodList.food[1];
            char[] charArray = myStr.toCharArray();
            for (char s : charArray) {
                System.out.println(s);
            
            }
        }

        else {
            myStr=CountriesList.countries[1];
            char[] charArray = myStr.toCharArray();
            for (char s : charArray) {
                System.out.println(s);
            
            }
        }
    }
    
}
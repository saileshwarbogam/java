package assignment7;

public class Mouse extends Rodent{
    public Mouse(){
        System.out.println("I am a Mouse");
    }
    @Override
    public void appearance() {
        System.out.println("Mouse has massive ears and long tail");
    }

    @Override
    public void colour() {
        System.out.println("Mice can be brown-tan-white peppery color ");
    }
}

package assignment7;

public class Gerbil extends Rodent{
    public Gerbil(){
        System.out.println("I am a Gerbil");
    }
    @Override
    public void appearance() {
        System.out.println("Gerbils have long tails, smallish ears, and long, flat foreheads/noses");
    }

    @Override
    public void colour() {
        System.out.println("Gerbils are usually brown or sandy, though they can also be black, grey, or white");
    }
}

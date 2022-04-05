package assignment7;

public class Hamster extends Rodent{
    public Hamster(){
        System.out.println("I am a Hamster");
    }
    @Override
    public void appearance() {
        System.out.println("Hamsters have short tails or no tails, and much rounder, stouter faces on average");
    }

    @Override
    public void colour() {
        System.out.println("Hamsters can be reddish, orange, white, grey, brown, black");
    }
}

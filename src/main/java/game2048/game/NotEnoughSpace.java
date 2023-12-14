package game2048.game;

public class NotEnoughSpace extends Exception {
    public NotEnoughSpace(String message){
        super(message);
    }
}
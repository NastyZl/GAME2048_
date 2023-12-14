package game2048.game;

import game2048.board.Board;

public interface Game<K,V> {
    void init();
    boolean canMove();
    boolean  move(Direction direction);
    void addItem() throws NotEnoughSpace;
    Board<K,V> getGameBoard();
    boolean hasWin();
}
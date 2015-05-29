package Fields;

import Fields.Buyable;
import Players.Player;
import org.junit.*;
import Board.*;

public class Tests {


    @Test
    public void testThrowDices() {
        Board testBoard = new Board();
        Player player = new Player ("Jos", testBoard);
        player.throwDices(testBoard);
        player.throwDices(testBoard);
        player.throwDices(testBoard);
        player.throwDices(testBoard);
        player.throwDices(testBoard);

    }



//    @Test
//    public void testEnterField() {
//        Buyable card001 = new Buyable();
//        //Player bank = new Player("bank", this);
//        //card001.setPlayerThatOwnsThisField(bank);
//        card001.enterField();
//    }




}

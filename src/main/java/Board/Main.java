package Board;

import Fields.*;
import Players.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board boardMonopoly = new Board();
        boardMonopoly.initialisePlayers();
        boardMonopoly.initialiseFields();
        int playerThatHasTurn = boardMonopoly.playerWhoBegins();

        boolean endOfGame = false;
        while (endOfGame == false) {
            boardMonopoly.getPlayers()[playerThatHasTurn].throwDices(boardMonopoly);
            if (playerThatHasTurn != (boardMonopoly.getPlayers().length - 1)) {
                playerThatHasTurn++;
            } else {
                playerThatHasTurn = 0;
            }
            System.out.println("-----------");

        }

    }


}

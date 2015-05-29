package Board;

import Fields.Buyable;
import Fields.Field;
import Fields.NotBuyable;
import Players.Player;

import java.util.Random;
import java.util.Scanner;

public class Board {
    private Player bank;
    private Player[] players;
    private Field[] fieldsOnBoard;

    public Board() {
        this.fieldsOnBoard = new Field[20];
        this.bank = new Player("bank", this);
    }


    public void initialisePlayers() {
        boolean correctValue = false;
        while (correctValue == false) {
            try {
                int AANTAL_SPELERS;
                System.out.println("How many players want to join the game?");
                Scanner s = new Scanner(System.in);
                AANTAL_SPELERS = s.nextInt();
                while (!(AANTAL_SPELERS > 1) || !(AANTAL_SPELERS < 11)) {
                    System.out.println("You have to give in a value between 2 and 10");
                    System.out.println("Please give in a correct value");
                    Scanner t = new Scanner(System.in);
                    AANTAL_SPELERS = t.nextInt();
                }
                players = new Player[AANTAL_SPELERS];
                int y = 1;
                while (y != (AANTAL_SPELERS + 1)) {
                    System.out.println("Wat is the name of player " + y + "?");
                    Scanner t = new Scanner(System.in);
                    String name = t.nextLine();
                    players[y - 1] = new Player(name, this);
                    y++;
                }
                System.out.println("-----------");
                correctValue = true;
            } catch (java.util.InputMismatchException exception) {
                System.out.println("The value you gave in is incorrect. Please try again.");
            }
        }

    }

    public void initialiseFields() {
        fieldsOnBoard[0] = new NotBuyable("veld met index 0");
        fieldsOnBoard[1] = new Buyable(bank, 100, 10, "veld met index 1");
        fieldsOnBoard[2] = new NotBuyable("veld met index 2");
        fieldsOnBoard[3] = new Buyable(bank, 100, 10, "veld met index 3");
        fieldsOnBoard[4] = new NotBuyable("veld met index 4");
        fieldsOnBoard[5] = new Buyable(bank, 100, 10, "veld met index 5");
        fieldsOnBoard[6] = new Buyable(bank, 100, 10, "veld met index 6");
        fieldsOnBoard[7] = new NotBuyable("veld met index 7");
        fieldsOnBoard[8] = new NotBuyable("veld met index 8");
        fieldsOnBoard[9] = new Buyable(bank, 100, 10, "veld met index 9");
        fieldsOnBoard[10] = new NotBuyable("veld met index 10");
        fieldsOnBoard[11] = new Buyable(bank, 100, 10, "veld met index 11");
        fieldsOnBoard[12] = new NotBuyable("veld met index 12");
        fieldsOnBoard[13] = new Buyable(bank, 100, 10, "veld met index 13");
        fieldsOnBoard[14] = new NotBuyable("veld met index 14");
        fieldsOnBoard[15] = new Buyable(bank, 100, 10, "veld met index 15");
        fieldsOnBoard[16] = new Buyable(bank, 100, 10, "veld met index 16");
        fieldsOnBoard[17] = new NotBuyable("veld met index 17");
        fieldsOnBoard[18] = new NotBuyable("veld met index 18");
        fieldsOnBoard[19] = new Buyable(bank, 100, 10, "veld met index 19");
    }

    public int playerWhoBegins() {
        System.out.println("The system will pick randomly a player who begins.");
        Random r = new Random();
        int playerWhoBegins = r.nextInt(players.length);
        System.out.println("The player who begins is " + players[playerWhoBegins].getName());
        System.out.println("-----------");
        return playerWhoBegins;
    }

    public Player getBank() {
        return bank;
    }

    public void setBank(Player bank) {
        this.bank = bank;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public Field[] getFieldsOnBoard() {
        return fieldsOnBoard;
    }

    public void setFieldsOnBoard(Field[] fieldsOnBoard) {
        this.fieldsOnBoard = fieldsOnBoard;
    }
}

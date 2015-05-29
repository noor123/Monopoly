package Fields;

import Players.Player;

import java.util.Scanner;

public class Buyable implements Field {
    private Player playerThatOwnsThisField;
    private double cost;
    private double rent;

    public void enterField(Player player) {
        if (playerThatOwnsThisField.getName().equals("bank")) {
            System.out.println("The cost of this card is " + cost + " euro. You have " + player.getMoney() + " euro.");
            System.out.println("Would you like to buy this card? Click \"yes\" if you want to.");
            Scanner s = new Scanner(System.in);
            String x = s.nextLine();
            if (x.toLowerCase().equals("yes")) {
                System.out.println("The card is yours now.");
                player.setMoney(player.getMoney() - cost);
            } else {
                System.out.println("The bidding between the other players start.");
            }
        } else {
            System.out.println("This card is from " + this.playerThatOwnsThisField.getName() + ".");
            System.out.println("You have to pay him " + this.cost + " euro.");
            player.setMoney(player.getMoney() - rent);
            this.playerThatOwnsThisField.setMoney(this.playerThatOwnsThisField.getMoney() + rent);
        }

    }

    public Player getPlayerThatOwnsThisField() {
        return playerThatOwnsThisField;
    }

    public void setPlayerThatOwnsThisField(Player playerThatOwnsThisField) {
        this.playerThatOwnsThisField = playerThatOwnsThisField;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}

package Players;

import Fields.Field;
import Board.*;

import java.util.Random;

public class Player {
    private String name;
    private double money;
    private int fieldWherePionIs;

    public Player(String name, Board b) {
        this.name = name;
        this.money = 2000;
        this.fieldWherePionIs = 0;
    }

    public void throwDices(Board b) {
        Random dice1 = new Random();
        Random dice2 = new Random();
        int result = dice1.nextInt(6)+1 + dice2.nextInt(6)+1;
        System.out.println("worp with dices " + result);
        if ((fieldWherePionIs + result) > (b.getFieldsOnBoard().length - 1)) {
            fieldWherePionIs = result - (b.getFieldsOnBoard().length - fieldWherePionIs);
        } else {
            fieldWherePionIs += result;
        }
        b.getFieldsOnBoard()[fieldWherePionIs].enterField(this);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getFieldWherePionIs() {
        return fieldWherePionIs;
    }

    public void setFieldWherePionIs(int fieldWherePionIs) {
        this.fieldWherePionIs = fieldWherePionIs;
    }
}

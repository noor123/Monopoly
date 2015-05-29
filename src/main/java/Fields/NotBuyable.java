package Fields;

import Players.Player;

public class NotBuyable  implements Field {
    private String name;

    public NotBuyable(String name) {
        this.name = name;
    }

    public void enterField(Player player) {
        System.out.println("The player comes on the field " + this.getName());
        System.out.println("This is a not-buyable field. This is not implemented yet.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package Fields;

import Players.Player;

public class NotBuyable  implements Field {

    public void enterField(Player player) {
        System.out.println("This is a not-buyable field. Do something.");
    }

}

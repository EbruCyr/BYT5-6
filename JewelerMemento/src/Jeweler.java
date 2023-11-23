import java.util.ArrayList;
import java.util.List;
public class Jeweler {
    private List<Gold> golds = new ArrayList<>();

    public void checkGold() {
        System.out.println("Checking gold:");
        for (Gold gold : golds) {
            System.out.println(gold);
        }
    }

    public void addNewGold(Gold gold) {
        System.out.println("New gold added: " + gold);
        golds.add(gold);
    }

    public void sellGold() {
        if (!golds.isEmpty()) {
            Gold soldGold = golds.remove(0);
            System.out.println("Gold sold: " + soldGold);
        } else {
            System.out.println("No gold to sell.");
        }
    }

    public GoldMemento createMemento() {
        return new GoldMemento(new ArrayList<>(golds));
    }

    public void restoreMemento(GoldMemento memento) {
        golds = new ArrayList<>(memento.getSavedGolds());
    }
}

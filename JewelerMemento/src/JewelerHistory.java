import java.util.ArrayList;
import java.util.List;
public class JewelerHistory {
    private List<GoldMemento> mementos = new ArrayList<>();

    public void addMemento(GoldMemento memento) {
        mementos.add(memento);
    }

    public GoldMemento getMemento(int index) {
        return mementos.get(index);
    }
}

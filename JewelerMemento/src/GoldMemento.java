import java.util.ArrayList;
import java.util.List;
public class GoldMemento {
    private List<Gold> savedGolds;

    public GoldMemento(List<Gold> golds) {
        savedGolds = golds;
    }

    public List<Gold> getSavedGolds() {
        return savedGolds;
    }
}

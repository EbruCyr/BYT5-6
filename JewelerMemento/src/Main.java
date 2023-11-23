public class Main {
    public static void main(String[] args) {
        Jeweler jeweler = new Jeweler();
        JewelerHistory history = new JewelerHistory();

        jeweler.addNewGold(new Gold("24 Karat Gold"));
        jeweler.checkGold();

        history.addMemento(jeweler.createMemento());

        jeweler.addNewGold(new Gold("18 Karat Gold"));
        jeweler.addNewGold(new Gold("22 Karat Gold"));
        jeweler.checkGold();

        history.addMemento(jeweler.createMemento());

        jeweler.sellGold();
        jeweler.checkGold();

        jeweler.restoreMemento(history.getMemento(0));
        System.out.println("Restoring to a previous state:");
        jeweler.checkGold();
    }
}
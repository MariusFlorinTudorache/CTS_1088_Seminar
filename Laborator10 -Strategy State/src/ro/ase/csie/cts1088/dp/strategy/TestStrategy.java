package ro.ase.csie.cts1088.dp.strategy;

public class TestStrategy {
    public static void main(String[] args) {
        Jucator jucator= new Jucator(100,"Gigel",7);
        jucator.setStrategieMk(new StrategieJucatorNou());

        jucator.acordaPuncteBonus();

        jucator.setStrategieMk(new StrategieZiuaCopilului());

        jucator.acordaPuncteBonus();
    }
}

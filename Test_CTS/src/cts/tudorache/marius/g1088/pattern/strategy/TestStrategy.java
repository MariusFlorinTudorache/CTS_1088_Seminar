package cts.tudorache.marius.g1088.pattern.strategy;

public class TestStrategy {

    public static void main(String[] args) {

        Trainer trainer1=new Trainer();
        Trainer trainer2=new Trainer();

        trainer1.setStrategie(new StrategieAbdomen());
        trainer1.startExercitiu();
        trainer1.schimbaExercitu(new StrategieFlotare());
        trainer1.startExercitiu();
        trainer1.schimbaExercitu(new StrategieSalt());
        trainer1.startExercitiu();

        trainer2.setStrategie(new StrategieAbdomen());
        trainer2.startExercitiu();
        trainer2.schimbaExercitu(new StrategieFlotare());
        trainer2.startExercitiu();
        trainer2.schimbaExercitu(new StrategieSalt());
        trainer2.startExercitiu();
    }
}

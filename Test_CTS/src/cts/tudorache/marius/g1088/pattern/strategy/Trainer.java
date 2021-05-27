package cts.tudorache.marius.g1088.pattern.strategy;

public class Trainer {
    IChallenge strategie=null;

    public Trainer() {
    }

    public void setStrategie(IChallenge strategie){
        this.strategie=strategie;

    }

    public void startExercitiu(){
        this.strategie.startExercitiu(100);
    }

    public void schimbaExercitu(IChallenge strategie){
        if(this.strategie != null){
            this.strategie=strategie;

        }
        else
        {
            throw new UnsupportedOperationException();
        }
    }
}

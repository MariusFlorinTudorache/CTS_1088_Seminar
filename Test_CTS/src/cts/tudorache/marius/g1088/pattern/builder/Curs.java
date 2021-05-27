package cts.tudorache.marius.g1088.pattern.builder;

public class Curs {
    private String numeAntrenor;
    private int durata;
    private int numarMaximParticipanti;
    private int pret;
    private Dificultate dificultate;
    private InterfataExercitiu exercitiu;

    private Curs(){

    }

    private Curs(String numeAntrenor, int durata, int numarMaximParticipanti, int pret, Dificultate dificultate, InterfataExercitiu exercitiu) {
        this.numeAntrenor = numeAntrenor;
        this.durata = durata;
        this.numarMaximParticipanti = numarMaximParticipanti;
        this.pret = pret;
        this.dificultate = dificultate;
        this.exercitiu = exercitiu;
    }

    public static class CursBuilder{
        Curs curs=null;

        public CursBuilder(String nume, int durata){
            curs=new Curs();
            curs.numeAntrenor=nume;
            curs.durata=durata;

        }

        public CursBuilder setNumarMaximParticipanti(int numar){
            this.curs.numarMaximParticipanti=numar;
            return this;
        }

        public CursBuilder setPret(int pret){
            this.curs.pret=pret;
            return this;
        }

        public CursBuilder setDificultate(Dificultate dificultate){
            this.curs.dificultate=dificultate;
            return this;
        }

        public CursBuilder setExercitiu(InterfataExercitiu exercitiu){
            this.curs.exercitiu=exercitiu;
            return this;
        }

        public Curs build(){
            return curs;
        }

    }
}

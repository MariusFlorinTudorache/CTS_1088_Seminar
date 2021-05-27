package cts.tudorache.marius.g1088.pattern.builder;

public class TestBuilder {

    public static void main(String[] args) {

        Curs flotari=new Curs.CursBuilder("Gigel",50)
                .setNumarMaximParticipanti(10)
                .setExercitiu(new Flotare())
                .build();

        Curs abdomene=new Curs.CursBuilder("Alex",30)
                .setExercitiu(new Abdomene())
                .build();

        Curs salturi=new Curs.CursBuilder("Coco",300)
                .setPret(30)
                .setNumarMaximParticipanti(300)
                .setExercitiu(new Salt())
                .build();

        Curs tractiuni=new Curs.CursBuilder("Pepe",10)
                .setDificultate(Dificultate.INCEPATOR)
                .setExercitiu(new Tractiune())
                .build();



    }
}

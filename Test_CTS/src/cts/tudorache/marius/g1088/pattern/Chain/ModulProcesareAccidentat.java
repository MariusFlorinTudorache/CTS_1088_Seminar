package cts.tudorache.marius.g1088.pattern.Chain;

public abstract class ModulProcesareAccidentat {
    ModulProcesareAccidentat next=null;
    public abstract void procesareAccidentat(FisaAccident accidentat);

    public void setNext(ModulProcesareAccidentat next){
        this.next=next;
    }
}

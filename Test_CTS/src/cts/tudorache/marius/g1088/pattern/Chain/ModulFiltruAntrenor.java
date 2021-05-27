package cts.tudorache.marius.g1088.pattern.Chain;

public class ModulFiltruAntrenor extends ModulProcesareAccidentat{

    @Override
    public void procesareAccidentat(FisaAccident accidentat) {
        boolean esteAccidentat=true;
        if(accidentat.esteConstient || accidentat.areMembreRupte == false ||
        accidentat.sePoateDeplasa || accidentat.areRaniDeschise == false )
        {
            esteAccidentat=false;
        }

        if(esteAccidentat && this.next!=null){
            this.next.procesareAccidentat(accidentat);
        }
        //n-am mai avut timp :(
    }
}

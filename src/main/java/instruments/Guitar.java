package instruments;

public class Guitar {

    InstrumentType instrumentType;

    public Guitar(InstrumentType instrumentType){
        this.instrumentType = instrumentType;
    }

    public InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public String getOrchestraSectionFromInstrumentType() {
        return this.instrumentType.getOrchestraSection();
    }
}

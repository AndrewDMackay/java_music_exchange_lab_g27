package instruments;

public enum InstrumentType {

    KEYS("percussion"),
    STRINGS("strings"),
    PERCUSSION("percussion"),
    WOODWIND("woodwind"),
    BRASS("brass");

    private final String orchestraSection;

    InstrumentType(String orchestraSection){
        this.orchestraSection = orchestraSection;
    }

    public String getOrchestraSection() {
        return this.orchestraSection;
    }
}

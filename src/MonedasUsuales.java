public enum MonedasUsuales {
    ARS("ARS"),
    BRL("BRL"),
    PEN("PEN"),
    USD("USD");


    private final String code;

    // Constructor del enum
    MonedasUsuales(String code) {
        this.code = code;
    }

    // Método para obtener el código
    public String getCode() {
        return code;
    }
}

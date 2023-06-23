package Enum;

public enum Monto {
    MONTO_500(500),
    MONTO_1000(1000),
    MONTO_5000(5000),
    MONTO_10000(10000),
    MONTO_25000(25000),
    MONTO_50000(50000);
    private int monto;

    Monto(int valor){
        monto = valor;
    }
    public int getMonto(){
        return monto;
    }
}

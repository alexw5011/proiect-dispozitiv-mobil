
package ro.ugal.dispozitivmobil;

public abstract class AccesoriiBrataraFitness{
    protected String model;
    protected Data dataFabricarii;
    public abstract void afisareTipAccesoriu();
    public abstract String getMaterial();
    public abstract boolean esteCompatibil(BrataraFitness bratara);
}

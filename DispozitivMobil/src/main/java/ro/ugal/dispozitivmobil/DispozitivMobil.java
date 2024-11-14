package ro.ugal.dispozitivmobil;
public class DispozitivMobil {
    protected int nivelBaterie;
    protected Data dataFabricarii;
    public static void main(String[] args) {
        BrataraFitness bratara = new BrataraFitness("bf200",2009,11,3);
        System.out.println("data fabricarii este: "+bratara.getDataFabricarii());
    }
}

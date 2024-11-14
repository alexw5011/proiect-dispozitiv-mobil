package ro.ugal.dispozitivmobil;
import java.util.ArrayList;
import java.util.List;

public class BrataraFitness extends DispozitivMobil{
    ArrayList<AccesoriiBrataraFitness> accesorii= new ArrayList<>();
    private String model;
    private int nrPasi;
    private float distantaParcursa;
    private float lungimeEcran;
    private float latimeEcran;
    public void afisarePasi(){
        System.out.println("Ai parcurs "+nrPasi+"pasi");
        nivelBaterie--;
    }
    public BrataraFitness(String model,int an,int luna,int zi) {
        this.model = model;
        this.dataFabricarii = new Data(an,luna,zi);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNrPasi(int nrPasi) {
        this.nrPasi = nrPasi;
    }

    public void setDistantaParcursa(float distantaParcursa) {
        this.distantaParcursa = distantaParcursa;
    }

    public void setNivelBaterie(int nivelBaterie) {
        this.nivelBaterie = nivelBaterie;
    }

    public void setDataFabricarii(Data dataFabricarii) {
        this.dataFabricarii = dataFabricarii;
    }

    public String getModel() {
        return model;
    }

    public void setLungimeEcran(float lungimeEcran) {
        this.lungimeEcran = lungimeEcran;
    }

    public void setLatimeEcran(float latimeEcran) {
        this.latimeEcran = latimeEcran;
    }

    public int getNrPasi() {
        return nrPasi;
    }

    public float getDistantaParcursa() {
        return distantaParcursa;
    }

    public int getNivelBaterie() {
        return nivelBaterie;
    }

    public Data getDataFabricarii() {
        return dataFabricarii;
    }

    public float getLungimeEcran() {
        return lungimeEcran;
    }
    public float getLatimeEcran() {
        return latimeEcran;
    }
    
    
    
    
}

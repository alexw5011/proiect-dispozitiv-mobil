package ro.ugal.dispozitivmobil;

public class FolieProtectieBrataraFitness extends AccesoriiBrataraFitness{
    private float lungime;
    private float latime;

    public FolieProtectieBrataraFitness(float lungime, float latime) {
        this.lungime = lungime;
        this.latime = latime;
    }
   
    @Override
    public void afisareTipAccesoriu() {
        System.out.println("Tip Accesoriu: Folie de protectie");
    }
    @Override
    public String getMaterial(){
        return "sticla";
    }
    @Override
    public boolean esteCompatibil(BrataraFitness bratara){
        if(bratara.getLungimeEcran()==lungime || bratara.getLatimeEcran()==latime) return true;
        else return false;
    }
}

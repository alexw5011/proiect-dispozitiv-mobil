
package ro.ugal.dispozitivmobil;

public class IncarcatorBrataraFitness extends AccesoriiBrataraFitness{
    private void incarcaBaterie(int baterie){
        baterie=100;
    }
    private void conecteazaIncarcator(BrataraFitness bratara){
       incarcaBaterie(bratara.getNivelBaterie());
    }

    @Override
    public void afisareTipAccesoriu() {
        System.out.println("Tip Accesoriu: Incarcator");
    }
    @Override
    public String getMaterial(){
        return "plastic";
    }
    @Override
    public boolean esteCompatibil(BrataraFitness bratara){
        return true;
    }
    
}

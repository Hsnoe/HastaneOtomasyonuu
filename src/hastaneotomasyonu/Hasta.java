
package hastaneotomasyonu;

public abstract class Hasta {
    
    public abstract int getHastaİd();
    public abstract int getKimlikNo();
    public abstract String getHastaAdi();
    public abstract String getHastaSoyadı();
    
    @Override
    public String toString(){
        return "HastaİD= " + this.getHastaİd()+","
                + "KimlikNo= "+ this.getKimlikNo()+","
                + "HastaAdi= "+ this.getHastaAdi()+","
                + "HastaSoyadi= "+ this.getHastaSoyadı();
        
    }

   
    
}

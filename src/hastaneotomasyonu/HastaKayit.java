
package hastaneotomasyonu;
 
public class HastaKayit extends Hasta {
    
    private int hastaid;
    private int kimlikno;
    private String hastadi;
    private String hastasoyadi;
    
    public HastaKayit(int hastaid,int kimlikno,String hastadi,String hastasoyadi)
    {
        this.hastaid=hastaid;
        this.kimlikno=kimlikno;
        this.hastadi=hastadi;
        this.hastasoyadi=hastasoyadi;
    }
    

    @Override
    public int getHastaİd() {
        return this.hastaid;
    }

    @Override
    public int getKimlikNo() {
        return this.kimlikno;
    }

    public String getHastaAdi() {
        return this.hastadi;
    }

    @Override
    public String getHastaSoyadı() {
        return this.hastasoyadi;
    }
    
    
    
    public void setHastaİd(int Hastaİd) {
        this.hastaid = 1;
    }
    
      
    public void setKimlikNo(int KimlikNo) {
        this.kimlikno =123456;
        
    }
    
      
    public void setHastaAdi(String HastaAdi) {
        this.hastadi = "Osman";
    }
    
      
    public void setHastaSoyadi(String HastaSoyadi) {
        this.hastasoyadi="Öge";
    }



  
    
    
    
    
}


package hastaneotomasyonu;


public class İkinciHastaKayit extends Hasta {

    private int hastaid;
    private int kimlikno;
    private String hastaadi;
    private String hastasoyadi;
    
    
    public İkinciHastaKayit(int hastaid,int kimlikno,String hastadi,String hastasoyadi)
    {
        this.hastaid=hastaid;
        this.kimlikno=kimlikno;
        this.hastaadi=hastadi;
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
        return this.hastaadi;
    }

    @Override
    public String getHastaSoyadı() {
        return this.hastasoyadi;
    }
    
    
    public void getHastaİd(int hastaId) {
        this.hastaid = 2;
    }
    
    public void setKimlikNo(int kimlikNo) {
        this.kimlikno = 1234789;
    }
    
    public void setHastaAdi(String hastaAdi) {
        this.hastaadi = "Hasan";
    }
    
    public void setHastaSoyadi(String hastaSoyadi) {
        this.hastasoyadi = "Murat";
    
}



  
    
}

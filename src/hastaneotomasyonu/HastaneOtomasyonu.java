package hastaneotomasyonu;

public class HastaneOtomasyonu {
    public static void main(String[] args) {
        // Veritabanından hasta bilgilerini alıyoruz
        Hasta hasta1 = HastaFactory.getHasta(1);
        Hasta hasta2 = HastaFactory.getHasta(2);

        // Hasta bilgilerini ekrana yazdırma
        if (hasta1 != null) {
            System.out.println("Hasta 1 Bilgileri:");
            System.out.println("ID: " + hasta1.getHastaİd());
            System.out.println("Kimlik No: " + hasta1.getKimlikNo());
            System.out.println("Ad: " + hasta1.getHastaAdi());
            System.out.println("Soyad: " + hasta1.getHastaSoyadı());
            System.out.println("ToString: " + hasta1.toString());
        } else {
            System.out.println("Hasta 1 bulunamadı.");
        }

        if (hasta2 != null) {
            System.out.println("\nHasta 2 Bilgileri:");
            System.out.println("ID: " + hasta2.getHastaİd());
            System.out.println("Kimlik No: " + hasta2.getKimlikNo());
            System.out.println("Ad: " + hasta2.getHastaAdi());
            System.out.println("Soyad: " + hasta2.getHastaSoyadı());
            System.out.println("ToString: " + hasta2.toString());
        } else {
            System.out.println("Hasta 2 bulunamadı.");
        }
    }
}

        
        
  


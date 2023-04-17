public class test3 { //  getter setter metodları
    public static void main(String[] args) {
        Ogrenciii o1 = new Ogrenciii("Zeynep","Mutlu",19,1);// tutulan sırada girmen önemli
        Ogrenciii o2=new Ogrenciii("C","Tosun",23,4);
        o1.setYas(250);
        o1.setAd("Ta");
        o1.adiniSoyle();
        o2.adiniSoyle();


    }
}
class Ogrenciii {

    private String ad="isimsiz";
    private String soyad="Soyisimsiz";
    private int yas=-1;
    private int sinif=-1;

    public void setAd(String ad) {
        if(ad.length()>=3){
            this.ad = ad;
        }
        else{
            System.out.println("Belirlediğiniz isim yetersiz");
        }
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setYas(int yas) {
        if (yas<80) {
            this.yas = yas;
        }
        else{
            System.out.println("Atamak istediğiniz yaş uygun değildir");
            this.yas=0;
        }

    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    public Ogrenciii(String ad, String soyad, int yas, int sinif){
        setAd(ad);
        setSoyad(soyad);
        setYas(yas);
        setSinif(sinif);

    }
    public void adiniSoyle(){
        System.out.println("Benim adım->"+this.ad);
    }
    public void yasiniSoyle(){
        System.out.println("Benim yaşım->"+this.yas);
    }
}

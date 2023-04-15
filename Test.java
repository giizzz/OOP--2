public class Test {
    public static void main(String[] args) {
        Ogrenci o1 = new Ogrenci("Zeynep","Mutlu",19,1);// tutulan sırada girmen önemli
        Ogrenci o2=new Ogrenci("Cenk","Tosun",23,4);
        String yeni1=String.valueOf(o2.yas); //int bir değeri tipe zorlayarak string e çevirdik

        yeni1="sınıf yoktur";
        System.out.println(o1.ad);
        System.out.println(o2.soyad);
        System.out.println(yeni1);

    }

}


    class Ogrenci {

        String ad; String soyad; int yas; int sinif;//default olarak da tanımlanabilir = diyip değer girerek

        public Ogrenci(String ad,String soyad, int yas,int sinif){
            this.ad =ad;
            this.soyad=soyad;
            this.yas=yas;
            this.sinif=sinif; //value ismi aynı olduğunda this ile erişilir

        }
    }




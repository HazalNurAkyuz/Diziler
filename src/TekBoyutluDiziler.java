public class TekBoyutluDiziler {
    public static void main(String[] args) {
        // Array
        // VeriTipi diziAdı[] = new VeriTipi[elemanSayisi];
        // VeriTipi[] diziAdi = new VeriTipi[elemanSayisi];
        // VeriTipi diziAdi ={v1,v2,v3};

        int[] liste = new int[4];

        liste[0] = 1;
        liste[1] = 2;
        liste[2] = 3;
        liste[3] = 4;

        //System.out.println(liste[3]);
        for(int i=0; i<liste.length; i++) {
            System.out.println(liste[i]);
        }
    }
}
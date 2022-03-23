public class HitungTarif extends Hotel {

    private int tarif;
    private String kamar;

    //Membuat pengkodisian harga masing-masing kamar
    public int get_harga(){
        if (type == 1){
            tarif = 250000;
        }else if(type == 2){
            tarif = 500000;
        }else if(type == 3){
            tarif = 750000;
        }else{

        }
        return tarif;
    }


    //Membuat kelas setiap kamar
    public String get_kamar(){
        if (type == 1) {
            kamar = "Biasa";
        }else if(type == 2){
            kamar = "Premium";
        }else if(type == 3){
            kamar = "VIP";
        }else{

        }
        return kamar;
    }

    //Hasil harga kamar dikali dengan waktu penginapan
    public int get_total(){
        return tarif*waktu;
    }
}

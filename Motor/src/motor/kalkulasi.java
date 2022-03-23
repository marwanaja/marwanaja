package motor;

public class kalkulasi extends motor
{
    private int harga, harga1, harga2, harga3;
    private String brand,brand1, brand2,brand3;

    public int getHarga(){
        if (type == 1){
            harga = 15000000;
        }else if(type == 2){
            harga = 24000000;
        }else if(type == 3){
            harga = 30000000;
        }else {

        }
        return harga;
    }

    public int getHarga1(){
        if (type == 1){
            harga1 = 10500000;
        }else if (type == 2){
            harga1 = 18000000;
        }else {

        }
        return harga1;
    }

    public int getHarga2(){
        if (type == 1){
            harga2 = 13000000;
        }else if (type == 2){
            harga2 = 26000000;
        }else {

        }
        return harga2;
    }

    public int getHarga3() {
        if (type == 1) {
            harga3 = 22000000;
        } else if (type == 2) {
            harga3 = 25000000;
        } else {

        }
        return harga3;
    }

    public String getMerk(){
        if (type == 1){
            brand = "Beat";
        }else if (type == 2){
            brand = "Aerox";
        }else if (type == 3){
            brand = "PCX";
        }else {

        }
        return brand;
    }

    public String getMerk1(){
        if (type == 1){
            brand1 = "Beat 2016";
        }else if (type == 2){
            brand1 = "Beat 2020";
        }else {

        }
        return brand1;
    }

    public String getMerk2(){
        if (type == 1){
            brand2 = "Aerox 2017";
        }else if (type == 2){
            brand2 = "Aerox 2021";
        }else {

        }
        return brand2;
    }
    public String getMerk3(){
        if (type == 1){
            brand3 = "PCX 2017";
        }else if (type == 2){
            brand3 = "PCX 2020";
        }else {

        }
        return brand3;
    }

    public int get_total(){
        return harga * unit;
    }
    public int get_total1(){
        return harga1 * unit;
    }
    public int get_total2(){
        return harga2 * unit;
    }
    public int get_total3(){
        return harga3 * unit;
    }
}


package com.enigma;

import com.enigma.functional_method.*;

import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //soal no 1

        sampaikanPesan(() -> "Halo Dunia");
        sampaikanPesan(() -> "Apa Kabar");
        sampaikanPesan(() -> "Ini Mencoba");


        //soal no 2
        prosesString((kata) -> kata.toLowerCase());
        prosesString((kata) -> kata.toUpperCase());
        prosesString((kata) -> kata + "sufix");

        //soal no 3
        hitungAngka((x, y) -> x + y);
        hitungAngka((x, y) -> x - y);
        hitungAngka((x, y) -> x * y);

        //soal no 4
        prosesPesan(msg -> msg.toUpperCase());
        prosesPesan(msg -> {
            String hasil = msg.toLowerCase();
            return hasil;
        });

        //soal no 5
        prosesString(String::trim);
        prosesString(String::strip);
        prosesString(String::toString);

        //soal 6
        TextProcessor processor1 = (text) -> text.toUpperCase();// Tulis lambda di sini
        TextProcessor processor2 = (text) -> {
            if (text.equalsIgnoreCase("Hallo")) {
                return "True";
            } else {
                return "False";
            }
        };// Tulis lambda di sini
        TextProcessor processor3 = String::toLowerCase;// Tulis lambda di sini
        TextProcessor processor4 = text -> {
            String hasil = text.replace(" ", "-");
            return hasil.toLowerCase();
        };

        System.out.println(processor1.process("Hello"));
        System.out.println(processor2.process("Hello"));
        System.out.println(processor3.process("Hello"));
        System.out.println(processor4.process("Hello dunia"));

        //soal no 7
        MathOperation prosesAngka;

        int hasil = prosesAngka(10)
                .operation1((a, b) -> a + b /* tulis lambda */)
                .operation2((a, b) -> a - b/* tulis lambda */)
                .operation3((a, b) -> a * b/* tulis lambda */)
                .getHasil();

        System.out.println(hasil);

        //soal no 8
        prosesData(() -> "Data 1", data -> data.length());
        prosesData(() -> "Dataku 2", data -> data.length());
        prosesData(() -> "Dataku ke 3", data -> data.length());


        //soal no 9
        operasi((x)-> {
            System.out.println("Memproses : " + x);
            String result = x.trim();
            result = result.toUpperCase();
            return result;
        });
        operasi((x)-> {
            System.out.println("Memproses : " + x);
            String result = x.trim();
            result = result.toLowerCase();
            return result;
        });
        operasi((x)-> {
            System.out.println("Memproses : " + x);
            String result = x.trim();
            result =String.valueOf(result.length());
            return result;
        });

        //soal no 10
        TextProcessor conditional = text -> {
            if(text.isEmpty()){
                return "Text Kosong";
            } else if(text.isBlank()){
                return "Text juga Kosong";
            } else {
                return "ada isinya : "+ text;
            }
        };

        System.out.println(conditional.process("soal 10"));
    }

    public static void sampaikanPesan(Pesan pesan) {
        System.out.println(pesan.sampaikanPesan());
    }

    public static void prosesString(ProsesString prosesString) {
        System.out.println(prosesString.prosesString("Ini Proses String"));
    }

    public static void hitungAngka(Calculator cal) {
        System.out.println(cal.add(10, 2));
    }

    public static void prosesPesan(ProsesString prosesString) {
        System.out.println(prosesString.prosesString("Ini Soal no 4"));
    }
    public static ChainedCalculator prosesAngka(int nilaiAwal) {
        return new ChainedCalculator(nilaiAwal);
    }
    public static void prosesData(Pesan prosesString, ProsesData prosesData) {
        System.out.println(prosesString.sampaikanPesan());
        System.out.println(prosesData.convert(prosesString.sampaikanPesan()));
    }
    public static void operasi(ProsesString operasi){
        System.out.println(operasi.prosesString("Soal no 9"));
    }
}
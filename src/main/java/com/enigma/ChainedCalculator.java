package com.enigma;

import com.enigma.functional_method.MathOperation;

class ChainedCalculator {
    private int hasil;

    // Constructor untuk inisialisasi nilai awal
    public ChainedCalculator(int nilaiAwal) {
        this.hasil = nilaiAwal;
    }

    // Method operasi berantai 1
    public ChainedCalculator operation1(MathOperation operation) {
        this.hasil = operation.calculate(this.hasil, 5); // Contoh, operasi pertama dengan angka 5
        return this; // Mengembalikan objek ini untuk chaining
    }

    // Method operasi berantai 2
    public ChainedCalculator operation2(MathOperation operation) {
        this.hasil = operation.calculate(this.hasil, 3); // Contoh, operasi kedua dengan angka 3
        return this;
    }

    // Method operasi berantai 3
    public ChainedCalculator operation3(MathOperation operation) {
        this.hasil = operation.calculate(this.hasil, 2); // Contoh, operasi ketiga dengan angka 2
        return this;
    }

    // Getter untuk mendapatkan hasil akhir
    public int getHasil() {
        return this.hasil;
    }
}
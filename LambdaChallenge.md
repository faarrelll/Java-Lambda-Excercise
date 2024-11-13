# Lambda Expression Challenges

## Konsep Dasar

### 1. Apa itu Lambda?
- Cara singkat menulis anonymous function
- Memiliki sintaks khusus dengan operator `->`
- Bisa disimpan dalam variable atau digunakan sebagai parameter

### 2. Bentuk-Bentuk Sintaks Lambda
```java
// Tanpa parameter
() -> "Hello"

// Satu parameter (kurung opsional)
x -> x.toUpperCase()
(str) -> str.toUpperCase()

// Dua parameter (wajib pakai kurung)
(x, y) -> x + y

// Expression langsung (tanpa curly braces)
str -> str.length()

// Block code (dengan curly braces)
(x, y) -> {
    int hasil = x + y;
    return hasil;
}
```

### 3. Method Reference
- Alternatif sintaks lambda untuk method yang sudah ada
- Contoh: `String::length` sama dengan `str -> str.length()`

## Tantangan Sangat Mudah

1. **Mengenal Expression Lambda**
   ```java
   // Perhatikan pola berikut:
   sampaikanPesan(() -> "Halo Dunia");
   sampaikanPesan(() -> "Apa Kabar");
   
   // Buatlah 3 lambda expression dengan pola yang sama
   // Tiap lambda harus mengembalikan string yang berbeda
   // Tulis kode di sini...
   ```

2. **Transform String Pattern**
   ```java
   // Perhatikan pola berikut:
   prosesString(kata -> kata.toUpperCase());
   prosesString(kata -> kata.toLowerCase());
   
   // Buatlah 3 lambda expression berbeda untuk memproses string
   // Contoh operasi: reverse string, tambah prefix, tambah suffix
   // Tulis kode di sini...
   ```

3. **Simple Calculator Pattern**
   ```java
   // Perhatikan pola berikut:
   hitungAngka((x, y) -> x + y);
   hitungAngka((x, y) -> x * y);
   
   // Buatlah 3 lambda expression berbeda untuk operasi matematika
   // Gunakan format yang sama (dua parameter)
   // Tulis kode di sini...
   ```

4. **Block Code vs Expression**
   ```java
   // Perhatikan dua cara penulisan yang berbeda:
   prosesPesan(msg -> msg.toUpperCase());  // Expression
   prosesPesan(msg -> {                    // Block code
       String hasil = msg.toUpperCase();
       return hasil;
   });
   
   // Buatlah masing-masing 2 contoh dengan:
   // 1. Expression langsung (tanpa block)
   // 2. Block code (dengan return)
   // Tulis kode di sini...
   ```

5. **Method Reference Recognition**
   ```java
   // Perhatikan penggunaan method reference:
   prosesString(String::toUpperCase);  // Sama dengan: s -> s.toUpperCase()
   prosesString(String::toLowerCase);  // Sama dengan: s -> s.toLowerCase()
   
   // Ubahlah lambda expression berikut menjadi method reference:
   prosesString(str -> str.trim());
   prosesString(str -> str.strip());
   prosesString(s -> s.toString());
   ```

## Tantangan Mudah

6. **Custom Text Processor**
   ```java
   interface TextProcessor {
       String process(String text);
   }
   
   // Implementasikan 4 TextProcessor berbeda dengan lambda:
   // 1. Menggunakan expression langsung
   // 2. Menggunakan block code dengan logic
   // 3. Menggunakan method reference
   // 4. Menggunakan multiple baris operasi
   
   TextProcessor processor1 = // Tulis lambda di sini
   TextProcessor processor2 = // Tulis lambda di sini
   TextProcessor processor3 = // Tulis lambda di sini
   TextProcessor processor4 = // Tulis lambda di sini
   ```

7. **Chain Calculator**
   ```java
   interface MathOperation {
       int calculate(int x, int y);
   }
   
   // Buatlah beberapa operasi matematika dengan lambda
   // yang bisa digunakan secara berantai:
   
   int hasil = prosesAngka(10)
       .operation1((a, b) -> /* tulis lambda */)
       .operation2((a, b) -> /* tulis lambda */)
       .operation3((a, b) -> /* tulis lambda */)
       .getHasil();
   ```

8. **Pattern Recognition Challenge**
   ```java
   // Perhatikan pola berikut:
   prosesData(() -> "Data 1", data -> data.length());
   prosesData(() -> "Data 2", data -> data.length());
   
   // Buatlah 3 pemanggilan prosesData dengan:
   // - Lambda pertama menghasilkan string
   // - Lambda kedua memproses string tersebut
   // Tulis kode di sini...
   ```

9. **Multiple Operation Pattern**
   ```java
   // Perhatikan pola berikut:
   operasi(x -> {
       System.out.println("Memproses: " + x);
       return x.toUpperCase();
   });
   
   // Buatlah 3 lambda dengan block code yang:
   // - Melakukan minimal 2 operasi
   // - Memiliki minimal 1 print statement
   // - Mengembalikan hasil
   // Tulis kode di sini...
   ```

10. **Conditional Lambda**
    ```java
    // Buatlah lambda yang melakukan operasi berbeda 
    // berdasarkan kondisi:
    
    TextProcessor conditional = text -> {
        // Tulis logic dengan if-else di sini
        // Minimal 3 kondisi berbeda
        // Return hasil yang sesuai
    };
    ```

## Tips Pembelajaran
1. Fokus memahami perbedaan sintaks:
    - `() ->` vs `x ->` vs `(x, y) ->`
    - `->` expression vs `-> { block }`
    - Method reference vs lambda expression

2. Latihan Pattern Recognition:
    - Perhatikan pola yang berulang
    - Identifikasi bagian yang berubah
    - Pahami konteks penggunaan

3. Langkah Belajar:
    - Mulai dari expression sederhana
    - Lanjut ke block code
    - Praktek method reference
    - Gabungkan dalam use case nyata
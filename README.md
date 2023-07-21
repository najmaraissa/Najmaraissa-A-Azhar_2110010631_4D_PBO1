# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data walimurid menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa walimurid dan NISN murid, dan memberikan output berupa informasi detail dari NISN tersebut seperti jurusan,  tahun, dan kelas.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Walimurid`, `WalimuridDetail`, dan `WalimuridBeraksi` adalah contoh dari class.

```bash
public class Walimurid {
    ...
}

public class WalimuridDetail extends Walimurid {
    ...
}

public class WalimuridBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `walimurid[i] = new WalimuridDetail(Walimurid, nisn);` adalah contoh pembuatan object.

```bash
walimurid[i] = new WalimuridDetail(Walimurid, nisn);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `walimurid` dan `nisn` adalah contoh atribut.

```bash
String walimurid;
String nisn;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Walimurid` dan `WalimuridDetail`.

```bash
public Walimurid(String walimurid, String nisn) {
    this.walimurid = walimurid;
    this.nisn = nisn;
}

public WaliMuridDetail(String walimurid, String nisn) {
    super(walimurid, nisn);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setWalimurid` dan `setNisn` adalah contoh method mutator.

```bash
public void setWalimurid(String walimurid) {
    this.walimurid = walimurid;
}

public void setNisn(String nisn) {
    this.nisn = nisn;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getWalimurid`, `getNisn`, `getProdi`, `getTahun`, dan `getKelas` adalah contoh method accessor.

```bash
public String getWalimurid() {
    return walimurid;
}

public String getNisn() {
    return nisn;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `walikelas` dan `nisn` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String walikelas;
private String nisn;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `WalimuridDetail` mewarisi `Walimurid` dengan sintaks `extends`.

```bash
public class WalimuridDetail extends Walimurid {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Walimurid` merupakan overloading method `displayInfo` dan `displayInfo` di `WalimuridDetail` merupakan override dari method `displayInfo` di `Walimurid`.

```bash
public String displayInfo(String alamat) {
    return displayInfo() + "\nAlamat: " + alamat;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getFakultas` dan seleksi `switch` dalam method `getProdi`.

```bash
 public String getProdi(){
        String kodeJurusan = getNisn().substring(0, 4);
        //seleksi swicth
        switch(kodeJurusan) {
            case "1940":
                return "IPA";
            case "5010":
                return "Sosial";
            case "3440":
                return "Bahasa";
            default:
                return "Kelas Lain";
        }
    }
public String getKelas(){
        String kelas = getNisn().substring(8, 10);
        //seleksi swicth
        switch(kelas) {
            case ""
                + "10":
                return "X";
            case "11":
                return "XI";
            case "12":
                return "XII";
            default:
                return "Mahasiswa";
         }
    }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < walimurid.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print(" Masukkan WALIMURID "+(i+1)+" = ");
String Walimurid = scanner.nextLine();
System.out.print(" Masukkan NISN  "+(i+1)+" = ");
String nisn = scanner.nextLine();

System.out.println("====================");
System.out.println("Data Diri = ");
System.out.println(data.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `WalimuridDetail[] walimurid = new WalimuridDetail[2];` adalah contoh penggunaan array.

```bash
WalimuridDetail[] walimurid = new WalimuridDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Najmaraissa A. Azhar
NPM: 2110010631

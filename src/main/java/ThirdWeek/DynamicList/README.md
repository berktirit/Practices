# DynamicArray Java Kütüphanesi

> Basit ama işlevsel bir dinamik dizi (ArrayList benzeri) yapısı. Kapasite gerektiğinde otomatik genişler, temel dizi işlemlerini sağlar.

## Özellikler

- Tür güvenli (`generic`) dinamik dizi yapısı
- Otomatik kapasite genişletme (kapasite gerektiğinde iki katına çıkar)
- Eleman ekleme, silme, güncelleme, okuma
- Alt liste (`subList`) alma
- Arama: ilk ve son indeks, içeriyor mu kontrolü
- Diziye çevirme
- Boş mu kontrolü, temizleme
- `toString()` ile okunabilir çıktı

## Başlangıç

### Gereksinimler

- Java 8 veya daha üstü (JDK yüklü olmalı)
- Herhangi bir ek dış kütüphane yok, sadece standart Java kullanılıyor

### Proje Yapısı

```
ThirdWeek/
└── DynamicList/
    ├── DynamicArray.java
    └── Main.java
```

## Kullanım

Projeyi derleyip çalıştırmak için terminalde proje dizininde şu komutları kullanabilirsin:

```bash
# Derleme
javac ThirdWeek/DynamicList/DynamicArray.java ThirdWeek/DynamicList/Main.java

# Çalıştırma
java ThirdWeek.DynamicList.Main
```

## Örnek Çıktı

```text
Dizideki Eleman Sayısı : 0
Dizinin Kapasitesi : 10
Dizideki Eleman Sayısı : 4
Dizinin Kapasitesi : 10
Dizideki Eleman Sayısı : 11
Dizinin Kapasitesi : 20
2. indisteki değer : 30
2. indisteki değer : 40
[100, 20, 40, 50, 60, 70, 80, 90, 100, 110]
Liste Durumu : Dolu
Indeks : 1
Indeks : 0
Son indeks : 1
Object dizisinin ilk elemanı : 100
Alt liste : [100, 20, 40]
Listemde 20 değeri : true
Listemde 120 değeri : false
Liste temizlendi : []
```

## API (Öne Çıkan Metodlar)

- `add(T data)`: Dizi sonuna eleman ekler. Gerekirse kapasiteyi büyütür.
- `get(int index)`: Belirtilen indisteki elemanı döner. Geçersizse `null`.
- `remove(int index)`: Belirtilen indisteki elemanı siler ve döner.
- `set(int index, T data)`: Belirtilen indeksteki değeri değiştirir, eski değeri döner.
- `size()`: Geçerli eleman sayısını döner.
- `getCapacity()`: Şu anki iç kapasiteyi döner.
- `isEmpty()`: Dizi boşsa `true`.
- `contains(T data)`: Elemanın dizide olup olmadığını kontrol eder.
- `indexOf(T data)`: İlk görünüm indeksini döner.
- `lastIndexOf(T data)`: Son görünüm indeksini döner.
- `toArray()`: Mevcut elemanları yeni bir diziye kopyalar.
- `clear()`: Tüm elemanları temizler.
- `subList(int start, int finish)`: Verilen aralıktaki alt listeyi döner.

## Geliştirme Önerileri / İyileştirmeler

- `Iterator` desteği ekleyerek `for-each` döngüsüne uyum.
- `trimToSize()` ile kapasiteyi mevcut elemana göre küçültme.
- `ensureCapacity(int minCapacity)` metodu ile dışarıdan kapasite kontrolü.
- Hata fırlatma (örneğin `IndexOutOfBoundsException`) yerine `null` dönmek yerine daha belirgin hata yönetimi.
- `equals()` ve `hashCode()` override edilerek nesne karşılaştırma uyumu.
- Çoklu thread desteği için eşzamanlı versiyon (`synchronized` veya `Concurrent` varyant).
- Unit test'ler (JUnit ile) eklenmesi.

## Örnek Kullanım (Kod Parçası)

```java
DynamicArray<String> list = new DynamicArray<>();
list.add("Elma");
list.add("Armut");
System.out.println(list); // [Elma, Armut]
list.set(1, "Muz");
System.out.println(list.get(1)); // Muz
DynamicArray<String> alt = list.subList(0, 1);
System.out.println(alt); // [Elma]
```
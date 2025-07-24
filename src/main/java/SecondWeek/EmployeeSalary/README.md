
# 👩‍💼 Çalışan Maaş Hesaplayıcı – Java Projesi

Bu proje, Java kullanılarak geliştirilen basit bir **çalışan maaşı hesaplama uygulamasıdır**. Kullanıcıdan alınan veriler doğrultusunda çalışanın vergi, bonus, maaş artışı gibi değerleri hesaplanır ve özet bir rapor sunulur.

## 🧾 Özellikler

- Kullanıcıdan çalışan adı, maaşı, haftalık çalışma saati ve işe başlama yılı alınır.
- Geçersiz girişler için kullanıcı dostu hata mesajları gösterilir.
- Aşağıdaki değerler hesaplanır:
  - **Vergi (%3):** 1000 TL üzeri maaşlara uygulanır.
  - **Bonus:** Haftalık 40 saatin üzerindeki her saat için 30 TL eklenir.
  - **Maaş Zammı:**
    - 10 yıldan az deneyime %5
    - 10–19 yıl arası %10
    - 20 yıl ve üzeri %15 zam yapılır.
- Sonuçlar özet halinde konsola yazdırılır.

## 📁 Proje Yapısı

```
├── Employee.java     // Hesaplamaları yapan sınıf
├── Main.java         // Kullanıcıdan input alan ve uygulamayı çalıştıran sınıf
└── README.md         // Proje açıklaması
```

## 🛠 Kurulum ve Kullanım

### 1. Gereksinimler:
- Java JDK 8 veya üzeri
- Herhangi bir Java IDE'si (IntelliJ IDEA, Eclipse, NetBeans...) veya terminal

### 2. Derleme ve Çalıştırma

**IDE kullanarak:**
- `Employee.java` ve `Main.java` dosyalarını aynı klasöre koyun.
- IDE'de projeyi açın ve `Main.java` dosyasını çalıştırın.

**Komut satırından:**
```bash
javac Employee.java Main.java
java Main
```

## 📌 Giriş Doğrulama Kuralları

| Girdi             | Doğrulama Kuralları |
|------------------|----------------------|
| Ad-Soyad         | Sadece harf ve boşluk içermeli |
| Maaş             | Sayısal değer olmalı |
| Çalışma Saati    | Sayısal (tam sayı) olmalı |
| İşe Giriş Yılı   | Sayısal ve **1970 sonrası** olmalı |

💬 1970 öncesi yıllar için:  
> `1970 yılı öncesine ait çalışan kayıtlarımız arşivde yer almamaktadır.`

## 🧪 Örnek Girdi & Çıktı

### Girdi:
```
Ad: Berk
Maaş: 2000
Çalışma Saati: 45
İşe Giriş Yılı: 1985
```

### Çıktı:
```
Adı : Berk
Maaşı : 2000.0
Çalışma Saati : 45
Başlangıç Yılı : 1985
Vergi : 60.0
Bonus : 150.0
Maaş Artışı : 300.0
Vergi ve Bonuslar ile birlikte maaş : 2090.0
Toplam Maaş : 2390.0
```
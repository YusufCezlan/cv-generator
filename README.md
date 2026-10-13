# Java PDF Özgeçmiş (CV) Oluşturucu

Bu proje, Java programlama dili ve iText7 kütüphanesi kullanılarak otomatik PDF formatında özgeçmiş (CV) üreten bir yazılımdır.

## Kullanılan Teknolojiler ve Bileşenler
- **Java SE 17**: Temel programlama dili.
- **Maven**: Bağımlılık ve kütüphane yönetim sistemi.
- **iText7 Core (7.2.5)**: PDF belgesi oluşturma, metin biçimlendirme ve görsel işleme kütüphanesi.

## Proje Mimarisi ve Sınıf Yapısı
Proje, Nesne Yönelimli Programlama (OOP) ilkelerine uygun olarak modüler bir yapıda tasarlanmıştır:

- `Experience.java`: İş deneyimi verilerini (Şirket, Pozisyon, Tarih, Açıklama) kapsülleyen (Encapsulation) veri modeli sınıfı.
- `ResumeData.java`: Kişisel bilgileri, vesikalık fotoğraf yolunu ve iş deneyimleri listesini (`List<Experience>`) tutan ana veri modeli.
- `PdfResumeGenerator.java`: PDF belgesinin akışını oluşturan, iText nesnelerini (`PdfWriter`, `PdfDocument`, `Document`, `Paragraph`, `Image`) yöneten ve belgeyi diske yazan iş mantığı sınıfı.
- `Main.java`: Veri modellerini örnekleyen ve PDF oluşturucuyu tetikleyen çalıştırma sınıfı.

## Projenin Çalıştırılması
1. Projeyi bir Java IDE'sinde (IntelliJ IDEA / Eclipse / VS Code) açın.
2. Maven bağımlılıklarının (`pom.xml`) yüklenmesini sağlayın.
3. `src/main/java/com/odev/Main.java` sınıfını çalıştırın.
4. Oluşan `Ozgecmis.pdf` dosyası proje kök dizininde yer alacaktır.

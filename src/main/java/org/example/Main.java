package com.odev;

public class Main {
    public static void main(String[] args) {
        try {
            ResumeData myCv = new ResumeData(
                    "Zekeriya Yusuf Cezlan",
                    "Yazılım Mühendisliği Öğrencisi",
                    "zekeriya@example.com",
                    "+90 555 000 11 22",
                    "assets/vesikalik.jpg"
            );

            myCv.addExperience(new Experience(
                    "Tech Software A.Ş.",
                    "Junior Java Developer",
                    "2025 - Halen",
                    "Spring Boot ve REST API geliştirme süreçlerinde rol alındı."
            ));

            myCv.addExperience(new Experience(
                    "Ağ ve Veri Çözümleri Ltd.",
                    "Veritabanı Stajyeri",
                    "2024 - 2025",
                    "SQL sorgularının optimizasyonu ve veritabanı tasarımı yapıldı."
            ));

            myCv.addExperience(new Experience(
                    "Dijital Dönüşüm Ofisi",
                    "Yazılım Stajyeri",
                    "2024 - 2024",
                    "Java SE ile masaüstü modüllerinin dokümantasyonu sağlandı."
            ));

            PdfResumeGenerator generator = new PdfResumeGenerator("Ozgecmis.pdf");
            generator.generatePdf(myCv);

        } catch (Exception e) {
            System.err.println("Hata oluştu: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
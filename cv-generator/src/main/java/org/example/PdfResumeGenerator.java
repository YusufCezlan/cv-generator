package com.odev;

import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileNotFoundException;

public class PdfResumeGenerator {

    private String outputPath;

    public PdfResumeGenerator(String outputPath) {
        this.outputPath = outputPath;
    }

    public void generatePdf(ResumeData data) throws FileNotFoundException {
        PdfWriter writer = new PdfWriter(this.outputPath);
        PdfDocument pdfDoc = new PdfDocument(writer);
        Document document = new Document(pdfDoc);

        try {
            Image profileImg = new Image(ImageDataFactory.create(data.getImagePath()));
            profileImg.setWidth(100);
            profileImg.setHeight(100);
            document.add(profileImg);
        } catch (Exception e) {
            System.err.println("Resim yüklenirken hata oluştu: " + e.getMessage());
        }

        document.add(new Paragraph(data.getFullName()).setBold().setFontSize(20));
        document.add(new Paragraph(data.getTitle()).setItalic().setFontSize(14));
        document.add(new Paragraph("E-posta: " + data.getEmail() + " | Tel: " + data.getPhone()));
        document.add(new Paragraph("\n--------------------------------------------------\n"));

        document.add(new Paragraph("İŞ DENEYİMLERİ").setBold().setFontSize(16));

        for (Experience exp : data.getExperiences()) {
            document.add(new Paragraph(exp.getPosition() + " - " + exp.getCompany()).setBold());
            document.add(new Paragraph(exp.getDateRange()).setItalic().setFontSize(10));
            document.add(new Paragraph(exp.getDescription()));
            document.add(new Paragraph("\n"));
        }

        document.close();
        System.out.println("PDF başarıyla oluşturuldu: " + outputPath);
    }
}
package org.biglelegal.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

public class HtmlToPdfConverter {

    public void htmlToPdf(String inputHtmlFile, String outputPdfFile) {

        Document document = new Document();
        PdfWriter writer;
        try {
            writer = PdfWriter.getInstance(document, new FileOutputStream(outputPdfFile));
            document.open();
            XMLWorkerHelper.getInstance().parseXHtml(writer, document, new FileInputStream(inputHtmlFile));
            document.close();
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }
        System.out.println("PDF Created!");
    }
}
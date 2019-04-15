package org.biglelegal.com;

import java.io.InputStream;
import java.io.OutputStream;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import fr.opensagres.poi.xwpf.converter.pdf.PdfOptions;
import fr.opensagres.poi.xwpf.converter.pdf.PdfConverter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

/* We need several jars: 

    fr.opensagres.poi.xwpf.converter.core-2.0.2.jar, 
    fr.opensagres.poi.xwpf.converter.pdf-2.0.2.jar,
    fr.opensagres.xdocreport.itext.extension-2.0.2.jar,
    itext-2.1.7.jar */

public class DocxToPdfConverter {

    public void docxToPDf(String docPath, String pdfPath) {

        InputStream inputStreamDocx;
        try {
            inputStreamDocx = new FileInputStream(new File(docPath));
            XWPFDocument document = new XWPFDocument(inputStreamDocx);
            PdfOptions options = PdfOptions.create();
            OutputStream outputStreamPdf = new FileOutputStream(new File(pdfPath));
            PdfConverter.getInstance().convert(document, outputStreamPdf, options);
            document.close();
            outputStreamPdf.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
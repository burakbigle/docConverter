package org.biglelegal.com;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.fit.pdfdom.PDFDomTree;

public class PdfToHtmlConverter {

    public void pdftoHtml(String inputPdfFileName, String outputHtmlFile) {
    // WILL WORK ON MONDAY..
        PDDocument pdfInput;
        Writer output;
        try {
            pdfInput = PDDocument.load(new File(inputPdfFileName));
            output = new PrintWriter(outputHtmlFile, "utf-8");
            new PDFDomTree().writeText(pdfInput, output);
            output.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
         
       
    }
}
package org.biglelegal.com;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * Initialized to create a document converter HTML-PDF-DOCX!
 *
 */
public class Main 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Initial Document Converting!" );
        
       // Base64Constructer.decodeToDesiredOutput(args[0], args[1]);
        
       new PdfToDocxConverter().transformerToDocx("Untitled.pdf","doc.docx");
       new DocxToPdfConverter().convertToPDF("valid-docx.docx", "converted-pdf.pdf");
        System.out.println("The conversion has been completed");
         
        
    }
}

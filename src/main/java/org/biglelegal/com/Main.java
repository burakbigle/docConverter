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

        /* The idea is to create multiple if statements to initiate functions,
         * based on the input and output style. 
         *      One could be: if the input extension is .pdf and output is .docx then
         *      execute the A algorithm else if... execute B algorithm etc.
         * 
         *      The parameters can pass by arguments external input and outputs in the file direction.
         *      Auto file creation in each algorithm and exception handling for errors. For each function.
         *      Will be supported by JUnit unit testing once it is agreed to proceed.
         *  */

       // Base64Constructer.decodeToDesiredOutput(args[0], args[1]);
        new PdfToHtmlConverter().pdftoHtml("Untitled.pdf", "outputHTML.html");
        new PdfToDocxConverter().pdftoDocx("Untitled.pdf", "pdf_docxConverted.docx");
       //new DocxToPdfConverter().pdfConverter("valid-docx.docx", "converted-pdf.pdf");
       
       System.out.println("The conversion has been completed");
         
        
    }
}

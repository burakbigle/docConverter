package org.biglelegal.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Initialized to create a document converter HTML-PDF-DOCX!
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Document Converting has started!");

        SpringApplication.run(Main.class, args);

        /* The idea is to create multiple if statements to initiate functions,
         * based on the input and output style.
         *      One could be: if the input extension is .pdf and output is .docx then
         *      execute the A" algorithm else if... execute "B" algorithm etc.
         *
         *      The parameters can pass by arguments external input and outputs in the file direction.
         *      Auto file creation in each algorithm and exception handling for errors. For each function.
         *      Will be supported by JUnit unit testing once it is agreed to proceed.
         *  */

        //Base64Constructer.decodeToDesiredOutput(args[0], args[1]);
        //new HtmlToDocxConverter().htmlToDocx("./Output/example.html", "./Output/converted-html-docx.docx");
        //new HtmlToPdfConverter().htmlToPdf("./Output/example.html", "./Output/converted-html-pdf.pdf");
        //new PdfToHtmlConverter().pdftoHtml("./Output/Untitled.pdf", "./Output/outputHTML.html");
        //new PdfToDocxConverter().pdftoDocx("./Output/Untitled.pdf", "./Output/pdf_docxConverted.docx");
        //new DocxToPdfConverter().docxToPDf("./Output/valid-docx.docx", "./Output/converted-pdf.pdf");
        //new DocxToHtmlConverter().docxToHtml("./Output/valid-docx.docx","./Output/converted-docx-html.html");

        System.out.println("The conversion has been completed");


    }
}

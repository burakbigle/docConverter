package org.biglelegal.com;

import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfReaderContentParser;
import com.itextpdf.text.pdf.parser.SimpleTextExtractionStrategy;
import com.itextpdf.text.pdf.parser.TextExtractionStrategy;
import org.apache.poi.xwpf.usermodel.BreakType;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class PdfToDocxConverter {

    public void pdftoDocx(String inputPdfFileName, String outputDocxFile) {

        XWPFDocument documentInitiator = new XWPFDocument();
        // Why would you do this assignment?
        String pdfFileName = inputPdfFileName;
        PdfReader readerPdf;
        try {
            readerPdf = new PdfReader(pdfFileName);
            PdfReaderContentParser parser = new PdfReaderContentParser(readerPdf);
            for (int numberOfPages = 1; numberOfPages <= readerPdf.getNumberOfPages(); numberOfPages++) {
                TextExtractionStrategy strategy = parser.processContent(numberOfPages,
                        new SimpleTextExtractionStrategy());
                String textExtracted = strategy.getResultantText();
                /*
                 * XWPFRun object defines a region of text with a common set of properties
                 */
                XWPFParagraph analyzingParagraphs = documentInitiator.createParagraph();
                XWPFRun run = analyzingParagraphs.createRun();
                run.setText(textExtracted);
                run.addBreak(BreakType.PAGE);

            }
            FileOutputStream out = new FileOutputStream(outputDocxFile);
            documentInitiator.write(out);
            documentInitiator.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
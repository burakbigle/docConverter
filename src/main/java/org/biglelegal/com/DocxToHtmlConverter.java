package org.biglelegal.com;

import fr.opensagres.poi.xwpf.converter.core.*;
import org.apache.poi.xwpf.converter.xhtml.XHTMLConverter;
import org.apache.poi.xwpf.converter.xhtml.XHTMLOptions;
import org.apache.poi.xwpf.usermodel.XWPFDocument;


import java.io.*;

public class DocxToHtmlConverter {

    public void docxToHtml(String inputDocxFile, String outputHtmlFile) throws FileNotFoundException {

        /*
            The class is not found error for the dependency.. Will be checked.
         */
        try {
            InputStream doc = new FileInputStream(new File(inputDocxFile));
            XWPFDocument document = new XWPFDocument(doc);
            XHTMLOptions options = XHTMLOptions.create();
            OutputStream out = new FileOutputStream(new File(outputHtmlFile));
            XHTMLConverter.getInstance().convert(document, out, options);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

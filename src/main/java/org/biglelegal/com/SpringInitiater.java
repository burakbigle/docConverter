package org.biglelegal.com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringInitiater {

    @RequestMapping("/")
    public String index() {
        System.out.println("Transformations is starting");
        new DocxToPdfConverter().docxToPDf("./Output/valid-docx.docx", "./Output/converted-pdf.pdf");
        return "Congratulations from docConverter";
    }

}

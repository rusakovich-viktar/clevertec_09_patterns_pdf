package by.clevertec.pdf;

import by.clevertec.pdf.impl.PdfCanvasImpl;
import by.clevertec.service.DocumentService;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class PdfCreator {
    private final String outputPath;

    public PdfCreator(String outputPath) {
        this.outputPath = outputPath;
    }

    public void createPdf(String templatePath, DocumentService documentService) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
            LocalDateTime now = LocalDateTime.now();
            String formattedNow = now.format(formatter);
            String filename = outputPath + "output_" + formattedNow + ".pdf";

            PdfReader reader = new PdfReader(templatePath);
            PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(filename));

            PdfCanvas canvas = new PdfCanvasImpl(stamper.getOverContent(1));

            documentService.processDocument(canvas);
            stamper.close();
            reader.close();
        } catch (IOException | DocumentException e) {
            log.error(e);
        }
    }
}
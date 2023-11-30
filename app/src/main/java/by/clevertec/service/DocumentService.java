package by.clevertec.service;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfContentByte;

public interface DocumentService {
    void processDocument(PdfContentByte canvas) throws DocumentException;
}

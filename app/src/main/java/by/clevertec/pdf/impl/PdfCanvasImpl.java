package by.clevertec.pdf.impl;

import by.clevertec.pdf.PdfCanvas;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;

public class PdfCanvasImpl implements PdfCanvas {
    private final PdfContentByte canvas;

    public PdfCanvasImpl(PdfContentByte canvas) {
        this.canvas = canvas;
    }

    @Override
    public void showTextAligned(int alignment, Phrase phrase, float x, float y, float rotation) {
        ColumnText.showTextAligned(canvas, alignment, phrase, x, y, rotation);
    }
}

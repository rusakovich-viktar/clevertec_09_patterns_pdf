package by.clevertec.service.impl;

import by.clevertec.dto.UserDto;
import by.clevertec.pdf.PdfCanvas;
import by.clevertec.service.DocumentService;
import com.itextpdf.text.Element;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import java.util.List;

public class UserDocumentService implements DocumentService {
    private final List<UserDto> users;

    public UserDocumentService(List<UserDto> users) {
        this.users = users;
    }

//    @Override
//    public void processDocument(PdfContentByte canvas) {
//        int yPosition = 500;
//        for (UserDto user : users) {
//            String text = "ID: " + user.getId() + ", Имя: " + user.getName() + ", Email: " + user.getEmail() + ", Телефон: " + user.getPhoneNumber();
//            ColumnText.showTextAligned(canvas, Element.ALIGN_LEFT, new Phrase(text), 50, yPosition, 0);
//            yPosition -= 50;
//        }
//    }
@Override
public void processDocument(PdfCanvas canvas) {
    int yPosition = 560;
    for (UserDto user : users) {
        String text = "ID: " + user.getId() + ", Имя: " + user.getName() + ", Email: " + user.getEmail() + ", Телефон: " + user.getPhoneNumber();
        canvas.showTextAligned(Element.ALIGN_LEFT, new Phrase(text), 50, yPosition, 0);
        yPosition -= 20;
    }
}
}

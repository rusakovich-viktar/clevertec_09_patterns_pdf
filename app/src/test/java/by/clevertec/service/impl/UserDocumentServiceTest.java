package by.clevertec.service.impl;

import by.clevertec.dto.UserDto;
import by.clevertec.pdf.PdfCanvas;
import com.itextpdf.text.Element;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfContentByte;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class UserDocumentServiceTest {
    private UserDocumentService userDocumentService;
    private List<UserDto> users;
    private PdfCanvas canvas;

    @Test
    public void testProcessDocument() {
        // Given
        users = new ArrayList<>();
        users.add(new UserDto(1, "Пользователь 1", "user1@example.com", "+375291234567"));
        users.add(new UserDto(2, "Пользователь 2", "user2@example.com", "+375441234568"));
        users.add(new UserDto(3, "Пользователь 3", "user3@example.com", "+375331234569"));

        userDocumentService = new UserDocumentService(users);
        canvas = Mockito.mock(PdfCanvas.class);

        // When
        userDocumentService.processDocument(canvas);

        // Then
        // Проверяем, что метод showTextAligned был вызван для каждого пользователя
        for (UserDto user : users) {
            Mockito.verify(canvas, Mockito.times(users.size())).showTextAligned(Mockito.anyInt(), Mockito.any(), Mockito.anyFloat(), Mockito.anyFloat(), Mockito.anyFloat());
        }
    }

}



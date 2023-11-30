package by.clevertec;

import static by.clevertec.util.Constants.Paths.OUTPUT_PATH;
import static by.clevertec.util.Constants.Paths.TEMPLATE_PDF;

import by.clevertec.dto.UserDto;
import by.clevertec.pdf.PdfCreator;
import by.clevertec.service.DocumentService;
import by.clevertec.service.impl.UserDocumentService;
import java.util.ArrayList;
import java.util.List;

public class MainPdf {

    public static void main(String[] args) {
        // Создаем список пользователей
        List<UserDto> users = new ArrayList<>();
        users.add(new UserDto(1, "Пользователь 1", "user1@example.com", "+375хх1234567"));
        users.add(new UserDto(2, "Пользователь 2", "user2@example.com", "+375хх1234568"));
        users.add(new UserDto(3, "Пользователь 3", "user3@example.com", "+375хх1234569"));

        DocumentService documentService = new UserDocumentService(users);

        PdfCreator pdfCreator = new PdfCreator(OUTPUT_PATH);
        pdfCreator.createPdf(TEMPLATE_PDF, documentService);

    }
}

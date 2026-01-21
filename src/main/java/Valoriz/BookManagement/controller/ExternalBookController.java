package Valoriz.BookManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Valoriz.BookManagement.service.ExternalBookService;

@RestController
@RequestMapping("/api/external")
public class ExternalBookController {

    @Autowired
    private ExternalBookService externalBookService;

    @GetMapping("/google-books/{isbn}")
    public Object getGoogleBook(@PathVariable String isbn) {
        return externalBookService.getBookByIsbn(isbn);
    }
}


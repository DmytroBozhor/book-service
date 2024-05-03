package dmytro.bozhor.libraryservice.controller;

import dmytro.bozhor.libraryservice.dto.BookReadDto;
import dmytro.bozhor.libraryservice.dto.BookSaveDto;
import dmytro.bozhor.libraryservice.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @ResponseStatus(HttpStatus.OK)
    @PostMapping
    public BookReadDto save(@RequestBody @Valid BookSaveDto bookSaveDto) {
        return bookService.save(bookSaveDto);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<BookReadDto> findAll() {
        return bookService.findAll();
    }

}

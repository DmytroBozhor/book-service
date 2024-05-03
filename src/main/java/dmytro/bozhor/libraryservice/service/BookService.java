package dmytro.bozhor.libraryservice.service;

import dmytro.bozhor.libraryservice.dto.BookReadDto;
import dmytro.bozhor.libraryservice.dto.BookSaveDto;
import dmytro.bozhor.libraryservice.entity.Book;
import dmytro.bozhor.libraryservice.mapper.BookMapper;
import dmytro.bozhor.libraryservice.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    public BookReadDto save(BookSaveDto bookSaveDto) {
        var book = bookMapper.toBookEntity(bookSaveDto);
        return bookMapper.toBookReadDto(bookRepository.save(book));
    }

    @Transactional(readOnly = true)
    public List<BookReadDto> findAll() {
        return bookMapper.toBookReadDtoList(bookRepository.findAll());
    }
}

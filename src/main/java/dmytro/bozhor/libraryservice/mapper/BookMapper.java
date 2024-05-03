package dmytro.bozhor.libraryservice.mapper;

import dmytro.bozhor.libraryservice.dto.BookReadDto;
import dmytro.bozhor.libraryservice.dto.BookSaveDto;
import dmytro.bozhor.libraryservice.entity.Author;
import dmytro.bozhor.libraryservice.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = AssociationMapper.class)
public interface BookMapper {
    Book toBookEntity(BookSaveDto bookSaveDto);

    BookReadDto toBookReadDto(Book book);

    List<BookReadDto> toBookReadDtoList(List<Book> books);

}

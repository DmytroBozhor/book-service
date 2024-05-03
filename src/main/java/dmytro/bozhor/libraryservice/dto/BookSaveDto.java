package dmytro.bozhor.libraryservice.dto;

import jakarta.validation.constraints.NotNull;

public record BookSaveDto(

        @NotNull
        String name,

        Long author

) {
}

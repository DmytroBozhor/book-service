package dmytro.bozhor.libraryservice.mapper;

import dmytro.bozhor.libraryservice.entity.BaseEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.TargetType;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class AssociationMapper {

    private final EntityManager entityManager;

    public <T extends BaseEntity<Long>> T findAssociationEntity(Long entityIdentifier, @TargetType Class<T> entityClass) {
        if (entityIdentifier == null) return null;
        return Optional.ofNullable(entityManager.find(entityClass, entityIdentifier))
                .orElseThrow(() -> new EntityNotFoundException("No entity found by id " + entityIdentifier));
    }

    public Long getEntityIdentifier(BaseEntity<Long> entity) {
        if (entity == null) return null;
        return entity.getId();
    }

}

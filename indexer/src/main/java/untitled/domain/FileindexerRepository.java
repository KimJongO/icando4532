package untitled.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "fileindexers",
    path = "fileindexers"
)
public interface FileindexerRepository
    extends PagingAndSortingRepository<Fileindexer, Long> {}

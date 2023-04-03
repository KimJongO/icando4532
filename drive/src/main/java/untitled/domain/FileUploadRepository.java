package untitled.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "fileUploads",
    path = "fileUploads"
)
public interface FileUploadRepository
    extends PagingAndSortingRepository<FileUpload, Long> {}

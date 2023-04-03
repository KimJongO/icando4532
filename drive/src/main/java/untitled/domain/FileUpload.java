package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.DriveApplication;
import untitled.domain.FileUploaded;

@Entity
@Table(name = "FileUpload_table")
@Data
public class FileUpload {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String path;

    private Integer size;

    private Integer type;

    @PostPersist
    public void onPostPersist() {
        FileUploaded fileUploaded = new FileUploaded(this);
        fileUploaded.publishAfterCommit();
    }

    public static FileUploadRepository repository() {
        FileUploadRepository fileUploadRepository = DriveApplication.applicationContext.getBean(
            FileUploadRepository.class
        );
        return fileUploadRepository;
    }
}

package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private String path;
    private Integer type;
    private Integer size;

    public FileUploaded(FileUpload aggregate) {
        super(aggregate);
    }

    public FileUploaded() {
        super();
    }
}

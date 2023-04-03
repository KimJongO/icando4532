package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class Videostreamed extends AbstractEvent {

    private Long id;
    private String fileid;
    private String url;

    public Videostreamed(Video aggregate) {
        super(aggregate);
    }

    public Videostreamed() {
        super();
    }
}

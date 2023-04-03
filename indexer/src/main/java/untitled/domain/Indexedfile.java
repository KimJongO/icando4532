package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class Indexedfile extends AbstractEvent {

    private Long id;
    private String fileid;
    private String keywords;

    public Indexedfile(Fileindexer aggregate) {
        super(aggregate);
    }

    public Indexedfile() {
        super();
    }
}

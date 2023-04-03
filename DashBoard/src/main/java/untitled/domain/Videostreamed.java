package untitled.domain;

import java.util.*;
import lombok.Data;
import untitled.infra.AbstractEvent;

@Data
public class Videostreamed extends AbstractEvent {

    private Long id;
    private String fileid;
    private String url;
}

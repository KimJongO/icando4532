package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "DashBoard_table")
@Data
public class DashBoard {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private Integer size;
    private String name;
    private String path;
    private Boolean indexflag;
    private Boolean uploadflag;
    private String videourl;
}

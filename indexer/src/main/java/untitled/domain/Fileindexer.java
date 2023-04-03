package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.IndexerApplication;
import untitled.domain.Indexedfile;

@Entity
@Table(name = "Fileindexer_table")
@Data
public class Fileindexer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fileid;

    @ElementCollection
    private List<String> keywords;

    @PostPersist
    public void onPostPersist() {
        Indexedfile indexedfile = new Indexedfile(this);
        indexedfile.publishAfterCommit();
    }

    public static FileindexerRepository repository() {
        FileindexerRepository fileindexerRepository = IndexerApplication.applicationContext.getBean(
            FileindexerRepository.class
        );
        return fileindexerRepository;
    }

    public static void fileIndexing(FileUploaded fileUploaded) {
        /** Example 1:  new item 
        Fileindexer fileindexer = new Fileindexer();
        repository().save(fileindexer);

        Indexedfile indexedfile = new Indexedfile(fileindexer);
        indexedfile.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(fileindexer->{
            
            fileindexer // do something
            repository().save(fileindexer);

            Indexedfile indexedfile = new Indexedfile(fileindexer);
            indexedfile.publishAfterCommit();

         });
        */

    }
}

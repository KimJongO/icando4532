package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.VideoProcessingApplication;
import untitled.domain.Videostreamed;

@Entity
@Table(name = "Video_table")
@Data
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fileid;

    private String url;

    @PostPersist
    public void onPostPersist() {
        Videostreamed videostreamed = new Videostreamed(this);
        videostreamed.publishAfterCommit();
    }

    public static VideoRepository repository() {
        VideoRepository videoRepository = VideoProcessingApplication.applicationContext.getBean(
            VideoRepository.class
        );
        return videoRepository;
    }

    public static void videostreaming(FileUploaded fileUploaded) {
        /** Example 1:  new item 
        Video video = new Video();
        repository().save(video);

        Videostreamed videostreamed = new Videostreamed(video);
        videostreamed.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(video->{
            
            video // do something
            repository().save(video);

            Videostreamed videostreamed = new Videostreamed(video);
            videostreamed.publishAfterCommit();

         });
        */

    }
}

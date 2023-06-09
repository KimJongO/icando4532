package untitled.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import untitled.config.kafka.KafkaProcessor;
import untitled.domain.*;

@Service
@Transactional
public class PolicyHandler {

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Videostreamed'"
    )
    public void wheneverVideostreamed_Alert(
        @Payload Videostreamed videostreamed
    ) {
        Videostreamed event = videostreamed;
        System.out.println(
            "\n\n##### listener Alert : " + videostreamed + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FileUploaded'"
    )
    public void wheneverFileUploaded_Alert(@Payload FileUploaded fileUploaded) {
        FileUploaded event = fileUploaded;
        System.out.println(
            "\n\n##### listener Alert : " + fileUploaded + "\n\n"
        );
        // Sample Logic //

    }
}

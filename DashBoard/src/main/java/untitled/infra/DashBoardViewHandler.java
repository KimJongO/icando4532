package untitled.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import untitled.config.kafka.KafkaProcessor;
import untitled.domain.*;

@Service
public class DashBoardViewHandler {

    @Autowired
    private DashBoardRepository dashBoardRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenFileUploaded_then_CREATE_1(
        @Payload FileUploaded fileUploaded
    ) {
        try {
            if (!fileUploaded.validate()) return;

            // view 객체 생성
            DashBoard dashBoard = new DashBoard();
            // view 객체에 이벤트의 Value 를 set 함
            dashBoard.setId(fileUploaded.getId());
            dashBoard.setSize(fileUploaded.getSize());
            dashBoard.setName(fileUploaded.getName());
            dashBoard.setPath(fileUploaded.getPath());
            dashBoard.setUploadflag(true);
            // view 레파지 토리에 save
            dashBoardRepository.save(dashBoard);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenVideostreamed_then_UPDATE_1(
        @Payload Videostreamed videostreamed
    ) {
        try {
            if (!videostreamed.validate()) return;
            // view 객체 조회

            List<DashBoard> dashBoardList = dashBoardRepository.findByVideourl(
                videostreamed.getUrl()
            );
            for (DashBoard dashBoard : dashBoardList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                dashBoard.setIndexflag(true);
                // view 레파지 토리에 save
                dashBoardRepository.save(dashBoard);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class FileUploadHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<FileUpload>> {

    @Override
    public EntityModel<FileUpload> process(EntityModel<FileUpload> model) {
        return model;
    }
}

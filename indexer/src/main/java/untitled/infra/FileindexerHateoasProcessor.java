package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class FileindexerHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Fileindexer>> {

    @Override
    public EntityModel<Fileindexer> process(EntityModel<Fileindexer> model) {
        return model;
    }
}

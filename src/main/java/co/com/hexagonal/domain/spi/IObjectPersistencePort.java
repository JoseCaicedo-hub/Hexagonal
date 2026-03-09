package co.com.hexagonal.domain.spi;

import co.com.hexagonal.domain.model.ObjectModel;

import java.util.List;

public interface IObjectPersistencePort {
    ObjectModel saveObjectModel(ObjectModel objectModel);
    List<ObjectModel> getAllObjectModels();
}

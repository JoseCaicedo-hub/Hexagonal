package co.com.hexagonal.domain.spi;

import co.com.hexagonal.domain.model.ObjectModel;

import java.util.List;

public interface IObjectPersistencePort {
    ObjectModel saveObjectModel(ObjectModel objectModel);
    ObjectModel updateObjectModel(ObjectModel objectModel, Long id);
    void deleteObjectModel(Long id);
    List<ObjectModel> getAllObjectModels();
}

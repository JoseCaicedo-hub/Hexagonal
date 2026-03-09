package co.com.hexagonal.domain.api;

import co.com.hexagonal.domain.model.ObjectModel;

import java.util.List;

public interface IObjectServicePort {
    void saveObject(ObjectModel objectModel);
    void updateObject(ObjectModel objectModel);
    void deleteObject(ObjectModel objectModel);

    List<ObjectModel> getAllObjectModels();
}

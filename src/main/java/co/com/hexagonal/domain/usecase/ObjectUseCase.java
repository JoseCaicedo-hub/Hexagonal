package co.com.hexagonal.domain.usecase;

import co.com.hexagonal.domain.api.IObjectServicePort;
import co.com.hexagonal.domain.model.ObjectModel;
import co.com.hexagonal.domain.spi.IObjectPersistencePort;

import java.util.List;


public class ObjectUseCase implements IObjectServicePort {

    private final IObjectPersistencePort objectPersistencePort;

    public ObjectUseCase(IObjectPersistencePort objectPersistencePort) {
        this.objectPersistencePort = objectPersistencePort;
    }

    @Override
    public void saveObject(ObjectModel objectModel) {

    }

    @Override
    public void updateObject(ObjectModel objectModel) {

    }

    @Override
    public void deleteObject(ObjectModel objectModel) {

    }

    @Override
    public List<ObjectModel> getAllObjectModels() {
        return List.of();
    }
}

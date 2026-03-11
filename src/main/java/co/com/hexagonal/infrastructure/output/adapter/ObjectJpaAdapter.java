package co.com.hexagonal.infrastructure.output.adapter;

import co.com.hexagonal.domain.model.ObjectModel;
import co.com.hexagonal.domain.spi.IObjectPersistencePort;
import co.com.hexagonal.infrastructure.exception.NoDataFoundException;
import co.com.hexagonal.infrastructure.output.entity.ObjectEntity;
import co.com.hexagonal.infrastructure.output.mapper.IObjectEntityMapper;
import co.com.hexagonal.infrastructure.output.repository.IObjectRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ObjectJpaAdapter implements IObjectPersistencePort {

    private IObjectRepository objectRepository;
    private IObjectEntityMapper objectEntityMapper;

    public ObjectJpaAdapter(IObjectRepository objectRepository, IObjectEntityMapper objectEntityMapper) {
        this.objectRepository = objectRepository;
        this.objectEntityMapper = objectEntityMapper;
    }

    @Override
    public ObjectModel saveObjectModel(ObjectModel objectModel) {
        ObjectEntity objectEntity = objectRepository.save(objectEntityMapper.toEntity(objectModel));

        return objectEntityMapper.toObjectModel(objectEntity);
    }

    @Override
    public ObjectModel updateObjectModel(ObjectModel objectModel, Long id) {
        return null;
    }

    @Override
    public void deleteObjectModel(Long id) {

    }

    @Override
    public List<ObjectModel> getAllObjectModels() {
        List<ObjectEntity> entityList = objectRepository.findAll();
        if(entityList.isEmpty()){
            throw new NoDataFoundException("No se encontraron datos");
        }
        return objectEntityMapper.toObjectModelList(entityList);
    }
}

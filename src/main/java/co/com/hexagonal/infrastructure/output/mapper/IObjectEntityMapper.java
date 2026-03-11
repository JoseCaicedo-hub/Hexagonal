package co.com.hexagonal.infrastructure.output.mapper;

import co.com.hexagonal.domain.model.ObjectModel;
import co.com.hexagonal.infrastructure.output.entity.ObjectEntity;

import java.util.List;

public interface IObjectEntityMapper {
    ObjectEntity toEntity(ObjectModel user);
    ObjectModel toObjectModel(ObjectEntity objectEntity);
    List<ObjectModel> toObjectModelList(List<ObjectEntity> userEntityList);
}

package co.com.hexagonal.application.mappper;

import co.com.hexagonal.application.dto.request.ObjectRequestDto;
import co.com.hexagonal.domain.model.ObjectModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface IObjectResponseMapper {
    ObjectRequestDto toResponse(ObjectModel objectModel);
    List<ObjectRequestDto> toResponseList(List<ObjectModel> objectModels);
}

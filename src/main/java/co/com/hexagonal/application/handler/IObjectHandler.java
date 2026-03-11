package co.com.hexagonal.application.handler;

import co.com.hexagonal.application.dto.request.ObjectRequestDto;
import co.com.hexagonal.application.dto.response.ObjectResponseDto;
import co.com.hexagonal.domain.model.ObjectModel;

import java.util.List;

public interface IObjectHandler {
    void saveObject(ObjectRequestDto objectRequestDto);
    List<ObjectResponseDto> getObjects();
}

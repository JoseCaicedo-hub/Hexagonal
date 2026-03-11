package co.com.hexagonal.application.handler.impl;

import co.com.hexagonal.application.dto.request.ObjectRequestDto;
import co.com.hexagonal.application.dto.response.ObjectResponseDto;
import co.com.hexagonal.application.handler.IObjectHandler;
import co.com.hexagonal.application.mappper.IObjectRequestMapper;
import co.com.hexagonal.application.mappper.IObjectResponseMapper;
import co.com.hexagonal.domain.api.IObjectServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ObjectHandler implements IObjectHandler {

    private final IObjectServicePort objectServicePort;
    private final IObjectRequestMapper objectRequestMapper;
    private final IObjectResponseMapper iObjectResponseMapper;


    @Override
    public void saveObject(ObjectRequestDto objectRequestDto) {

    }

    @Override
    public List<ObjectResponseDto> getObjects() {
        return List.of();
    }
}

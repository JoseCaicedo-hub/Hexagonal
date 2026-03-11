package co.com.hexagonal.infrastructure.input.rest;

import co.com.hexagonal.application.dto.request.ObjectRequestDto;
import co.com.hexagonal.application.dto.response.ObjectResponseDto;
import co.com.hexagonal.application.handler.IObjectHandler;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v3/object")
@RequiredArgsConstructor
public class ObjectRestController {
    private final IObjectHandler objectHandler;

    @PostMapping("/")
    public ResponseEntity<Void> saveObject(@RequestBody ObjectRequestDto objectRequestDto){
        objectHandler.saveObject(objectRequestDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<ObjectResponseDto>> getAllObjects(){
        return ResponseEntity.ok(objectHandler.getObjects());
    }
}

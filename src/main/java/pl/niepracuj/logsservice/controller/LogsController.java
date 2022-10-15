package pl.niepracuj.logsservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/logs")
public class LogsController {

    private final LogMapper logMapper;
    private final LogService logService;

    @PostMapping
    public logDto createLog(@RequestBody LogDto logDto){
        return logMapper.toDto(logService.saveLog(logMapper.toNewEntity)));
    }
}

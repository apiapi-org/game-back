package apiapi.gameback.controller;

import apiapi.gameback.domain.Document;
import apiapi.gameback.service.DocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/game")
@RequiredArgsConstructor
public class DocumentController {

    private final DocumentService documentService;

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("/{title}")
    public Document get(@PathVariable String title) {
        return documentService.DocumentGet();
    }

    @PostMapping()
    public String post(@RequestBody String body) {
        return "success";
    }

    @PatchMapping()
    public String patch(@RequestBody String body) {
        return "success";
    }

    @DeleteMapping()
    public String delete(@RequestBody String body) {
        return "success";
    }
}

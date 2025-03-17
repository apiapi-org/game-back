package apiapi.gameback.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/game")
public class DocumentController {

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("/{title}")
    public String get(@PathVariable String title) {
        return title;
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

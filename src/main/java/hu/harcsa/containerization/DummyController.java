package hu.harcsa.containerization;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dummies")
class DummyController {
    private final DummyService service;

    DummyController(DummyService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Dummy getDummyData(@PathVariable String id) {
        return service.getDummy(id);
    }
}

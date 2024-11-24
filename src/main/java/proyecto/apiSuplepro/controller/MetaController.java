package proyecto.apiSuplepro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyecto.apiSuplepro.model.Meta;
import proyecto.apiSuplepro.service.MetaService;

import java.util.List;

@RestController
@RequestMapping("/api/meta")
public class MetaController {

    @Autowired
    private MetaService metaService;

    @GetMapping
    public List<Meta> getAllMeta() {
        return metaService.getAllMeta();
    }

    @GetMapping("/{id}")
    public Meta getMetaById(@PathVariable Long id) {
        return metaService.getMetaById(id).orElse(null);
    }

    @PostMapping
    public Meta createMeta(@RequestBody Meta meta) {
        return metaService.saveMeta(meta);
    }

    @DeleteMapping("/{id}")
    public void deleteMeta(@PathVariable Long id) {
        metaService.deleteMeta(id);
    }
}

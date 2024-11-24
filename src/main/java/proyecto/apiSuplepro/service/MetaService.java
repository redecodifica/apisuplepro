package proyecto.apiSuplepro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.apiSuplepro.model.Meta;
import proyecto.apiSuplepro.repository.MetaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MetaService {

    @Autowired
    private MetaRepository metaRepository;

    public List<Meta> getAllMeta() {
        return metaRepository.findAll();
    }

    public Optional<Meta> getMetaById(Long id) {
        return metaRepository.findById(id);
    }

    public Meta saveMeta(Meta meta) {
        return metaRepository.save(meta);
    }

    public void deleteMeta(Long id) {
        metaRepository.deleteById(id);
    }
}

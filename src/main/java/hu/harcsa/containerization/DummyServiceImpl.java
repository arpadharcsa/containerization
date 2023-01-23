package hu.harcsa.containerization;

import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Collections;
import java.util.List;

@Service
class DummyServiceImpl implements DummyService {
    @Override
    public List<Dummy> getDummies() {
        return Collections.emptyList();
    }

    @Override
    public Dummy getDummy(String id) {
        return new Dummy(id, Instant.now().toString());
    }
}

package hu.harcsa.containerization;

import java.util.List;

public interface DummyService {
    List<Dummy> getDummies();

    Dummy getDummy(String id);

}

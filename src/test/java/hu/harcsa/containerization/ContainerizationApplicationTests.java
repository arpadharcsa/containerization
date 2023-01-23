package hu.harcsa.containerization;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ContainerizationApplicationTests {

    private static final String DUMMY_API = "/dummies";
    private static final String FETCH_ONE_DUMMY_URI = DUMMY_API + "/%s";
    private final TestRestTemplate restTemplate;

    @Autowired
    ContainerizationApplicationTests(TestRestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Test
    void contextLoads() {
        //given
        final String id = "testId";

        //when
        final ResponseEntity<Dummy> result = restTemplate.getForEntity(FETCH_ONE_DUMMY_URI.formatted(id), Dummy.class);

        //then
        assertEquals(HttpStatus.OK, result.getStatusCode());
        assertEquals(id, Objects.requireNonNull(result.getBody()).id(), "Invalid id");
    }

}

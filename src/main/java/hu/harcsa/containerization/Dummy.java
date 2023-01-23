package hu.harcsa.containerization;

import com.fasterxml.jackson.annotation.JsonProperty;

record Dummy(@JsonProperty String id, @JsonProperty String timestamp) {
}

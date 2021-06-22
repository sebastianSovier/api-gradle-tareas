package cl.binter.challenge.domain.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Task {
    private String taskId;
    private String taskName;
    private Integer duration;
}

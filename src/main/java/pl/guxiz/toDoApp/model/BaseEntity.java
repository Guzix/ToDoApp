package pl.guxiz.toDoApp.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BaseEntity {


    private Long id;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private String createdBy;

    private String updatedBy;
}

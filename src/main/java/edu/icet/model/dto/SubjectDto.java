package edu.icet.model.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SubjectDto   {
    private Integer subjectId;
    private String subjectCode;
    private String subjectName;
    private String stream;
    private String description;
    private Integer credits;
}

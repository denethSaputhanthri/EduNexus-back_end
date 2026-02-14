package edu.icet.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class ParentDTO {
    private Integer parentId;
    private Integer userId;
    private String occupation;
}

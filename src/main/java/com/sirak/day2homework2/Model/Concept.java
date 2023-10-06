package com.sirak.day2homework2.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Concept {
    private String name;
    private int id;
    private String title;
    private String descrption;


}

package com.example.converter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Sample {
    @Id
    private String id;
    @Convert(converter = GenderConverter.class)
    private Gender gender;
}

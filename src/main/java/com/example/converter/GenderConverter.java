package com.example.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.EnumSet;
import java.util.NoSuchElementException;

@Converter(autoApply = true)
public class GenderConverter extends CodeValueConverter<Gender> {
    GenderConverter() {
        super(Gender.class);
    }
}

//@Converter(autoApply = true)
//public class GenderConverter implements AttributeConverter<Gender, String> {
//
//    @Override
//    public String convertToDatabaseColumn(Gender attribute) {
//        return attribute.getCode();
//    }
//
//    @Override
//    public Gender convertToEntityAttribute(String dbData) {
//        return EnumSet.allOf(Gender.class).stream()
//                .filter(e->e.getCode().equals(dbData))
//                .findAny()
//                .orElseThrow(()-> new NoSuchElementException());
//    }
//}

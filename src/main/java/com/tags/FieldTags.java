package com.tags;

import java.util.*;

public class FieldTags {
    private final List<Byte> fieldTags;

    public FieldTags() {
        fieldTags = new ArrayList<>();

        for (byte i = 0; i <= 24; i++) {
            fieldTags.add(i);
        }

        Collections.shuffle(fieldTags);
    }

    public List<Byte> getField() {
        return fieldTags;
    }
}

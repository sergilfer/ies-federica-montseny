package org.iesfm.DeSerializer;

public interface Deserializer<T> {
    T fromStringToObject (String value);
}

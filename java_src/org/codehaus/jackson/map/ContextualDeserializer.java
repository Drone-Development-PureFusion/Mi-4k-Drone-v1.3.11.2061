package org.codehaus.jackson.map;
/* loaded from: classes3.dex */
public interface ContextualDeserializer<T> {
    JsonDeserializer<T> createContextual(DeserializationConfig deserializationConfig, BeanProperty beanProperty);
}

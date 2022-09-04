package org.codehaus.jackson.map;
/* loaded from: classes3.dex */
public interface ContextualKeyDeserializer {
    KeyDeserializer createContextual(DeserializationConfig deserializationConfig, BeanProperty beanProperty);
}

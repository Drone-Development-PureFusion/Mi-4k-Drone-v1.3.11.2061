package org.codehaus.jackson.map;
/* loaded from: classes3.dex */
public abstract class DeserializationProblemHandler {
    public boolean handleUnknownProperty(DeserializationContext deserializationContext, JsonDeserializer<?> jsonDeserializer, Object obj, String str) {
        return false;
    }
}

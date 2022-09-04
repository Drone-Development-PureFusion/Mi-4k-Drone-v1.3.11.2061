package org.codehaus.jackson.map.jsontype;

import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.type.JavaType;
/* loaded from: classes3.dex */
public interface TypeIdResolver {
    JsonTypeInfo.EnumC11699Id getMechanism();

    String idFromValue(Object obj);

    String idFromValueAndType(Object obj, Class<?> cls);

    void init(JavaType javaType);

    JavaType typeFromId(String str);
}

package com.fimi.soul.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.DeserializationProblemHandler;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;
/* renamed from: com.fimi.soul.utils.ak */
/* loaded from: classes.dex */
public class C3083ak {

    /* renamed from: a */
    private static ObjectMapper f11532a = new ObjectMapper();

    static {
        f11532a.getDeserializationConfig().set(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        f11532a.getSerializationConfig().setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);
        f11532a.getSerializationConfig().setSerializationInclusion(JsonSerialize.Inclusion.NON_DEFAULT);
        f11532a.configure(DeserializationConfig.Feature.FAIL_ON_NULL_FOR_PRIMITIVES, false);
        f11532a.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
        f11532a.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        f11532a.configure(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS, false);
        f11532a.configure(DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
    }

    /* renamed from: a */
    public static <T> T m29327a(Class<T> cls, File file) {
        return (T) f11532a.readValue(file, cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static <T> ArrayList<T> m29326a(Class<? extends T[]> cls, String str) {
        Object[] objArr = (Object[]) f11532a.readValue(str, cls);
        ArrayList<T> arrayList = (ArrayList<T>) new ArrayList();
        for (Object obj : objArr) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<LinkedHashMap<String, Object>> m29325a(String str) {
        return (List) f11532a.readValue(str, List.class);
    }

    /* renamed from: a */
    public static void m29324a(DeserializationProblemHandler deserializationProblemHandler) {
        f11532a.getDeserializationConfig().addHandler(deserializationProblemHandler);
    }

    /* renamed from: b */
    public static <T> T m29323b(Class<T> cls, String str) {
        return (T) f11532a.readValue(str, cls);
    }
}

package com.google.ads.mediation;

import com.google.android.gms.ads.internal.util.client.C3784b;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
@Deprecated
/* renamed from: com.google.ads.mediation.i */
/* loaded from: classes.dex */
public abstract class AbstractC3419i {

    /* renamed from: com.google.ads.mediation.i$a */
    /* loaded from: classes.dex */
    public static final class C3420a extends Exception {
        public C3420a(String str) {
            super(str);
        }
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: com.google.ads.mediation.i$b */
    /* loaded from: classes.dex */
    protected @interface AbstractC3421b {
        /* renamed from: a */
        String m27889a();

        /* renamed from: b */
        boolean m27888b() default true;
    }

    /* renamed from: a */
    protected void m27891a() {
    }

    /* renamed from: a */
    public void m27890a(Map<String, String> map) {
        Field[] fields;
        HashMap hashMap = new HashMap();
        for (Field field : getClass().getFields()) {
            AbstractC3421b abstractC3421b = (AbstractC3421b) field.getAnnotation(AbstractC3421b.class);
            if (abstractC3421b != null) {
                hashMap.put(abstractC3421b.m27889a(), field);
            }
        }
        if (hashMap.isEmpty()) {
            C3784b.m26840d("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Field field2 = (Field) hashMap.remove(entry.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, entry.getValue());
                } catch (IllegalAccessException e) {
                    String key = entry.getKey();
                    C3784b.m26840d(new StringBuilder(String.valueOf(key).length() + 49).append("Server option \"").append(key).append("\" could not be set: Illegal Access").toString());
                } catch (IllegalArgumentException e2) {
                    String key2 = entry.getKey();
                    C3784b.m26840d(new StringBuilder(String.valueOf(key2).length() + 43).append("Server option \"").append(key2).append("\" could not be set: Bad Type").toString());
                }
            } else {
                String key3 = entry.getKey();
                String value = entry.getValue();
                C3784b.m26846a(new StringBuilder(String.valueOf(key3).length() + 31 + String.valueOf(value).length()).append("Unexpected server option: ").append(key3).append(" = \"").append(value).append("\"").toString());
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Field field3 : hashMap.values()) {
            if (((AbstractC3421b) field3.getAnnotation(AbstractC3421b.class)).m27888b()) {
                String valueOf = String.valueOf(((AbstractC3421b) field3.getAnnotation(AbstractC3421b.class)).m27889a());
                C3784b.m26840d(valueOf.length() != 0 ? "Required server option missing: ".concat(valueOf) : new String("Required server option missing: "));
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(((AbstractC3421b) field3.getAnnotation(AbstractC3421b.class)).m27889a());
            }
        }
        if (sb.length() > 0) {
            String valueOf2 = String.valueOf(sb.toString());
            throw new C3420a(valueOf2.length() != 0 ? "Required server option(s) missing: ".concat(valueOf2) : new String("Required server option(s) missing: "));
        }
        m27891a();
    }
}

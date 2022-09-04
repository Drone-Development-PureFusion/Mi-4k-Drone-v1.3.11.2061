package p005b.p006a.p007a.p029b.p052m.p053a;

import java.io.File;
import java.lang.reflect.Method;
import p005b.p006a.p007a.p029b.p052m.C0634f;
/* renamed from: b.a.a.b.m.a.j */
/* loaded from: classes.dex */
public class C0619j {

    /* renamed from: a */
    static final String f1081a = "java.nio.file.Path";

    /* renamed from: b */
    static final String f1082b = "java.nio.file.Files";

    /* renamed from: a */
    public static boolean m38696a(File file, File file2) {
        if (!file.exists()) {
            throw new IllegalArgumentException("File [" + file + "] does not exist.");
        }
        if (!file2.exists()) {
            throw new IllegalArgumentException("File [" + file2 + "] does not exist.");
        }
        try {
            Class<?> cls = Class.forName(f1081a);
            Class<?> cls2 = Class.forName(f1082b);
            Method method = File.class.getMethod("toPath", new Class[0]);
            Method method2 = cls2.getMethod("getFileStore", cls);
            return method2.invoke(null, method.invoke(file, new Object[0])).equals(method2.invoke(null, method.invoke(file2, new Object[0])));
        } catch (Exception e) {
            throw new C0634f("Failed to check file store equality for [" + file + "] and [" + file2 + "]", e);
        }
    }
}

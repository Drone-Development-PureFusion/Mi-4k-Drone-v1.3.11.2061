package p005b.p006a.p007a.p029b.p036g.p040d;

import java.util.HashMap;
import java.util.Map;
/* renamed from: b.a.a.b.g.d.f */
/* loaded from: classes.dex */
public class C0474f {

    /* renamed from: a */
    Map<C0478j, Class<?>> f642a = new HashMap();

    /* renamed from: b */
    private Class<?> m39223b(Class<?> cls, String str) {
        return this.f642a.get(new C0478j(cls, str));
    }

    /* renamed from: a */
    public Class<?> m39225a(Class<?> cls, String str) {
        String lowerCase = str.toLowerCase();
        while (cls != null) {
            Class<?> m39223b = m39223b(cls, lowerCase);
            if (m39223b != null) {
                return m39223b;
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* renamed from: a */
    public void m39224a(Class<?> cls, String str, Class<?> cls2) {
        this.f642a.put(new C0478j(cls, str.toLowerCase()), cls2);
    }
}

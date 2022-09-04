package p005b.p006a.p007a.p008a.p028p;

import java.util.HashMap;
/* renamed from: b.a.a.a.p.c */
/* loaded from: classes.dex */
public class C0395c extends InheritableThreadLocal<HashMap<String, String>> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.InheritableThreadLocal
    /* renamed from: a */
    public HashMap<String, String> childValue(HashMap<String, String> hashMap) {
        if (hashMap == null) {
            return null;
        }
        return new HashMap<>(hashMap);
    }
}

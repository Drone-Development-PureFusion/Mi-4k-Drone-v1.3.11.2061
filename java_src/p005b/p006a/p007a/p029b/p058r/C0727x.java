package p005b.p006a.p007a.p029b.p058r;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Pattern;
/* renamed from: b.a.a.b.r.x */
/* loaded from: classes.dex */
public class C0727x {
    /* renamed from: a */
    public static void m38359a(Collection<String> collection, Collection<String> collection2) {
        if (collection2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (String str : collection2) {
            Pattern compile = Pattern.compile(str);
            for (String str2 : collection) {
                if (compile.matcher(str2).matches()) {
                    arrayList.add(str2);
                }
            }
        }
        collection.retainAll(arrayList);
    }

    /* renamed from: a */
    public static void m38358a(Collection<String> collection, String... strArr) {
        m38359a(collection, Arrays.asList(strArr));
    }

    /* renamed from: b */
    public static void m38357b(Collection<String> collection, Collection<String> collection2) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (String str : collection2) {
            Pattern compile = Pattern.compile(str);
            for (String str2 : collection) {
                if (compile.matcher(str2).matches()) {
                    arrayList.add(str2);
                }
            }
        }
        collection.removeAll(arrayList);
    }

    /* renamed from: b */
    public static void m38356b(Collection<String> collection, String... strArr) {
        m38357b(collection, Arrays.asList(strArr));
    }
}

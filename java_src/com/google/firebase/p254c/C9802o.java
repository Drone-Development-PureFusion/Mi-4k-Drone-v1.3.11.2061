package com.google.firebase.p254c;

import android.support.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.firebase.c.o */
/* loaded from: classes2.dex */
class C9802o {

    /* renamed from: a */
    private static final C9802o f30596a = new C9802o();

    /* renamed from: b */
    private final Map<String, WeakReference<AbstractC9785j>> f30597b = new HashMap();

    /* renamed from: c */
    private final Object f30598c = new Object();

    C9802o() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C9802o m6934a() {
        return f30596a;
    }

    /* renamed from: a */
    public List<C9797l> m6933a(@NonNull C9779i c9779i) {
        List<C9797l> unmodifiableList;
        synchronized (this.f30598c) {
            ArrayList arrayList = new ArrayList();
            String c9779i2 = c9779i.toString();
            for (Map.Entry<String, WeakReference<AbstractC9785j>> entry : this.f30597b.entrySet()) {
                if (entry.getKey().startsWith(c9779i2)) {
                    AbstractC9785j abstractC9785j = entry.getValue().get();
                    if (abstractC9785j instanceof C9797l) {
                        arrayList.add((C9797l) abstractC9785j);
                    }
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    /* renamed from: a */
    public void m6932a(AbstractC9785j abstractC9785j) {
        synchronized (this.f30598c) {
            this.f30597b.put(abstractC9785j.mo6949l().toString(), new WeakReference<>(abstractC9785j));
        }
    }

    /* renamed from: b */
    public List<C9769c> m6931b(@NonNull C9779i c9779i) {
        List<C9769c> unmodifiableList;
        synchronized (this.f30598c) {
            ArrayList arrayList = new ArrayList();
            String c9779i2 = c9779i.toString();
            for (Map.Entry<String, WeakReference<AbstractC9785j>> entry : this.f30597b.entrySet()) {
                if (entry.getKey().startsWith(c9779i2)) {
                    AbstractC9785j abstractC9785j = entry.getValue().get();
                    if (abstractC9785j instanceof C9769c) {
                        arrayList.add((C9769c) abstractC9785j);
                    }
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    /* renamed from: b */
    public void m6930b(AbstractC9785j abstractC9785j) {
        synchronized (this.f30598c) {
            String c9779i = abstractC9785j.mo6949l().toString();
            WeakReference<AbstractC9785j> weakReference = this.f30597b.get(c9779i);
            AbstractC9785j abstractC9785j2 = weakReference != null ? weakReference.get() : null;
            if (abstractC9785j2 == null || abstractC9785j2 == abstractC9785j) {
                this.f30597b.remove(c9779i);
            }
        }
    }
}

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
@aaa
/* loaded from: classes.dex */
public class acn {

    /* renamed from: com.google.android.gms.internal.acn$a */
    /* loaded from: classes2.dex */
    public interface AbstractC6190a<D, R> {
        /* renamed from: a */
        R mo12733a(D d);
    }

    /* renamed from: a */
    public static <A, B> aco<B> m18207a(final aco<A> acoVar, final AbstractC6190a<A, B> abstractC6190a) {
        final acl aclVar = new acl();
        acoVar.mo18203a(new Runnable() { // from class: com.google.android.gms.internal.acn.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    acl.this.m18209b((acl) abstractC6190a.mo12733a(acoVar.get()));
                } catch (InterruptedException | CancellationException | ExecutionException e) {
                    acl.this.cancel(true);
                }
            }
        });
        return aclVar;
    }

    /* renamed from: a */
    public static <V> aco<List<V>> m18206a(final List<aco<V>> list) {
        final acl aclVar = new acl();
        final int size = list.size();
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        for (aco<V> acoVar : list) {
            acoVar.mo18203a(new Runnable() { // from class: com.google.android.gms.internal.acn.2
                @Override // java.lang.Runnable
                public void run() {
                    if (atomicInteger.incrementAndGet() >= size) {
                        try {
                            aclVar.m18209b((acl) acn.m18204c(list));
                        } catch (InterruptedException | ExecutionException e) {
                            abr.d("Unable to convert list of futures to a future of list", e);
                        }
                    }
                }
            });
        }
        return aclVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static <V> List<V> m18204c(List<aco<V>> list) {
        ArrayList arrayList = new ArrayList();
        for (aco<V> acoVar : list) {
            V v = acoVar.get();
            if (v != null) {
                arrayList.add(v);
            }
        }
        return arrayList;
    }
}

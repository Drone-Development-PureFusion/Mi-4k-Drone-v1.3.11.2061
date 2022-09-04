package com.fimi.soul.module.p214c;

import java.util.ArrayList;
import java.util.List;
/* renamed from: com.fimi.soul.module.c.b */
/* loaded from: classes.dex */
public class C2519b implements AbstractC2522c {

    /* renamed from: a */
    private List<AbstractC2521b> f8191a = new ArrayList();

    /* renamed from: com.fimi.soul.module.c.b$a */
    /* loaded from: classes.dex */
    static class C2520a {

        /* renamed from: a */
        private static C2519b f8192a = new C2519b();

        C2520a() {
        }
    }

    /* renamed from: com.fimi.soul.module.c.b$b */
    /* loaded from: classes.dex */
    public interface AbstractC2521b {
        /* renamed from: a */
        void mo31388a(int i);
    }

    /* renamed from: a */
    public static C2519b m31392a() {
        return C2520a.f8192a;
    }

    @Override // com.fimi.soul.module.p214c.AbstractC2522c
    /* renamed from: a */
    public void mo31387a(int i) {
        for (AbstractC2521b abstractC2521b : this.f8191a) {
            abstractC2521b.mo31388a(i);
        }
    }

    /* renamed from: a */
    public void m31391a(AbstractC2521b abstractC2521b) {
        this.f8191a.add(abstractC2521b);
    }

    /* renamed from: b */
    public void m31390b(AbstractC2521b abstractC2521b) {
        this.f8191a.add(abstractC2521b);
    }
}

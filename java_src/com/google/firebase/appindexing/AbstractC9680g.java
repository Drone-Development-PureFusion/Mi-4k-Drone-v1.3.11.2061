package com.google.firebase.appindexing;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.AbstractC7653rh;
import com.google.firebase.appindexing.internal.Thing;
import com.google.firebase.appindexing.p252a.AbstractC9667e;
/* renamed from: com.google.firebase.appindexing.g */
/* loaded from: classes2.dex */
public interface AbstractC9680g {

    /* renamed from: a */
    public static final int f30277a = 1000;

    /* renamed from: b */
    public static final int f30278b = 256;

    /* renamed from: c */
    public static final int f30279c = 5;

    /* renamed from: d */
    public static final int f30280d = 20;

    /* renamed from: e */
    public static final int f30281e = 100;

    /* renamed from: f */
    public static final int f30282f = 20000;

    /* renamed from: g */
    public static final int f30283g = 30000;

    /* renamed from: com.google.firebase.appindexing.g$a */
    /* loaded from: classes2.dex */
    public static class C9681a extends AbstractC9667e<C9681a> {
        public C9681a() {
            this("Thing");
        }

        public C9681a(@NonNull String str) {
            super(str);
        }
    }

    /* renamed from: com.google.firebase.appindexing.g$b */
    /* loaded from: classes2.dex */
    public interface AbstractC9682b {

        /* renamed from: a */
        public static final Thing.Metadata f30284a = new C9683a().m7471a();

        /* renamed from: com.google.firebase.appindexing.g$b$a */
        /* loaded from: classes2.dex */
        public static final class C9683a {

            /* renamed from: a */
            private static final AbstractC7653rh.C7654a f30285a = new AbstractC7653rh.C7654a();

            /* renamed from: b */
            private boolean f30286b = f30285a.f25402a;

            /* renamed from: c */
            private int f30287c = f30285a.f25403b;

            /* renamed from: d */
            private String f30288d = f30285a.f25404c;

            /* renamed from: a */
            public C9683a m7470a(int i) {
                C4588d.m23618b(i >= 0, new StringBuilder(53).append("Negative score values are invalid. Value: ").append(i).toString());
                this.f30287c = i;
                return this;
            }

            /* renamed from: a */
            public C9683a m7469a(boolean z) {
                this.f30286b = z;
                return this;
            }

            /* renamed from: a */
            public Thing.Metadata m7471a() {
                return new Thing.Metadata(this.f30286b, this.f30287c, this.f30288d);
            }
        }
    }
}

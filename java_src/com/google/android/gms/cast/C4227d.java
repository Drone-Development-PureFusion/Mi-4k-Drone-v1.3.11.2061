package com.google.android.gms.cast;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.Display;
import com.google.android.gms.cast.internal.C4432h;
import com.google.android.gms.cast.internal.C4439l;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.agu;
import com.google.android.gms.internal.agv;
/* renamed from: com.google.android.gms.cast.d */
/* loaded from: classes.dex */
public final class C4227d {

    /* renamed from: a */
    public static final int f16087a = 1;

    /* renamed from: b */
    public static final int f16088b = 2;

    /* renamed from: c */
    public static final int f16089c = 3;

    /* renamed from: f */
    private static final C4467a.AbstractC4473b<agv, C4229a> f16092f = new C4467a.AbstractC4473b<agv, C4229a>() { // from class: com.google.android.gms.cast.d.1
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public agv mo7438a(Context context, Looper looper, C4626s c4626s, C4229a c4229a, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            Bundle bundle = new Bundle();
            bundle.putInt("configuration", c4229a.f16095c);
            return new agv(context, looper, c4626s, c4229a.f16093a, bundle, c4229a.f16094b, abstractC4491b, abstractC4492c);
        }
    };

    /* renamed from: d */
    public static final C4467a<C4229a> f16090d = new C4467a<>("CastRemoteDisplay.API", f16092f, C4439l.f16661b);

    /* renamed from: e */
    public static final AbstractC4234e f16091e = new agu(f16090d);

    /* renamed from: com.google.android.gms.cast.d$a */
    /* loaded from: classes.dex */
    public static final class C4229a implements C4467a.AbstractC4468a.AbstractC4469a {

        /* renamed from: a */
        final CastDevice f16093a;

        /* renamed from: b */
        final AbstractC4231b f16094b;

        /* renamed from: c */
        final int f16095c;

        /* renamed from: com.google.android.gms.cast.d$a$a */
        /* loaded from: classes2.dex */
        public static final class C4230a {

            /* renamed from: a */
            CastDevice f16096a;

            /* renamed from: b */
            AbstractC4231b f16097b;

            /* renamed from: c */
            int f16098c = 2;

            public C4230a(CastDevice castDevice, AbstractC4231b abstractC4231b) {
                C4588d.m23626a(castDevice, "CastDevice parameter cannot be null");
                this.f16096a = castDevice;
                this.f16097b = abstractC4231b;
            }

            /* renamed from: a */
            public C4230a m24916a(@AbstractC4233d int i) {
                this.f16098c = i;
                return this;
            }

            /* renamed from: a */
            public C4229a m24917a() {
                return new C4229a(this);
            }
        }

        private C4229a(C4230a c4230a) {
            this.f16093a = c4230a.f16096a;
            this.f16094b = c4230a.f16097b;
            this.f16095c = c4230a.f16098c;
        }
    }

    /* renamed from: com.google.android.gms.cast.d$b */
    /* loaded from: classes.dex */
    public interface AbstractC4231b {
        /* renamed from: a */
        void mo24915a(Status status);
    }

    /* renamed from: com.google.android.gms.cast.d$c */
    /* loaded from: classes.dex */
    public interface AbstractC4232c extends AbstractC4502m {
        /* renamed from: b */
        Display mo17557b();
    }

    /* renamed from: com.google.android.gms.cast.d$d */
    /* loaded from: classes.dex */
    public @interface AbstractC4233d {
    }

    private C4227d() {
    }

    /* renamed from: a */
    public static final boolean m24919a(Context context) {
        C4432h.m24198a(context);
        return C4432h.f16658a.m16824c().booleanValue();
    }
}

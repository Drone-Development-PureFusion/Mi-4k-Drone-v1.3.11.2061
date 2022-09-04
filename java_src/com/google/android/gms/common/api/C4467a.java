package com.google.android.gms.common.api;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a.AbstractC4468a;
import com.google.android.gms.common.internal.AbstractC4559ac;
import com.google.android.gms.common.internal.AbstractC4600p;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4626s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;
/* renamed from: com.google.android.gms.common.api.a */
/* loaded from: classes.dex */
public final class C4467a<O extends AbstractC4468a> {

    /* renamed from: a */
    private final AbstractC4473b<?, O> f16797a;

    /* renamed from: c */
    private final C4478g<?> f16799c;

    /* renamed from: e */
    private final String f16801e;

    /* renamed from: b */
    private final AbstractC4480i<?, O> f16798b = null;

    /* renamed from: d */
    private final C4481j<?> f16800d = null;

    /* renamed from: com.google.android.gms.common.api.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC4468a {

        /* renamed from: com.google.android.gms.common.api.a$a$a */
        /* loaded from: classes.dex */
        public interface AbstractC4469a extends AbstractC4468a {
        }

        /* renamed from: com.google.android.gms.common.api.a$a$b */
        /* loaded from: classes2.dex */
        public static final class C4470b implements AbstractC4471c {
            private C4470b() {
            }
        }

        /* renamed from: com.google.android.gms.common.api.a$a$c */
        /* loaded from: classes.dex */
        public interface AbstractC4471c extends AbstractC4468a {
        }

        /* renamed from: com.google.android.gms.common.api.a$a$d */
        /* loaded from: classes.dex */
        public interface AbstractC4472d extends AbstractC4469a, AbstractC4471c {
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC4473b<T extends AbstractC4477f, O> extends AbstractC4476e<T, O> {
        /* renamed from: a */
        public abstract T mo7438a(Context context, Looper looper, C4626s c4626s, O o, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c);
    }

    /* renamed from: com.google.android.gms.common.api.a$c */
    /* loaded from: classes.dex */
    public interface AbstractC4474c {
    }

    /* renamed from: com.google.android.gms.common.api.a$d */
    /* loaded from: classes.dex */
    public static class C4475d<C extends AbstractC4474c> {
    }

    /* renamed from: com.google.android.gms.common.api.a$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC4476e<T extends AbstractC4474c, O> {
        /* renamed from: a */
        public int mo9706a() {
            return Integer.MAX_VALUE;
        }

        /* renamed from: a */
        public List<Scope> mo20498a(O o) {
            return Collections.emptyList();
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$f */
    /* loaded from: classes.dex */
    public interface AbstractC4477f extends AbstractC4474c {
        /* renamed from: a */
        void m24006a(AbstractC4559ac abstractC4559ac, Set<Scope> set);

        /* renamed from: a */
        void mo7977a(AbstractC4600p.AbstractC4606f abstractC4606f);

        /* renamed from: a */
        void m24005a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        /* renamed from: e */
        Intent mo23565e();

        /* renamed from: f */
        void mo9828f();

        /* renamed from: m_ */
        boolean mo23561m_();

        /* renamed from: t */
        boolean m24004t();

        /* renamed from: u */
        boolean m24003u();

        /* renamed from: v */
        boolean mo9364v();

        /* renamed from: w */
        boolean mo7943w();

        @Nullable
        /* renamed from: x */
        IBinder m24002x();
    }

    /* renamed from: com.google.android.gms.common.api.a$g */
    /* loaded from: classes.dex */
    public static final class C4478g<C extends AbstractC4477f> extends C4475d<C> {
    }

    /* renamed from: com.google.android.gms.common.api.a$h */
    /* loaded from: classes.dex */
    public interface AbstractC4479h<T extends IInterface> extends AbstractC4474c {
        /* renamed from: a */
        T m23999a(IBinder iBinder);

        /* renamed from: a */
        String m24001a();

        /* renamed from: a */
        void m24000a(int i, T t);

        /* renamed from: b */
        String m23998b();
    }

    /* renamed from: com.google.android.gms.common.api.a$i */
    /* loaded from: classes.dex */
    public static abstract class AbstractC4480i<T extends AbstractC4479h, O> extends AbstractC4476e<T, O> {
        /* renamed from: b */
        public abstract int m23997b();

        /* renamed from: b */
        public abstract T m23996b(O o);
    }

    /* renamed from: com.google.android.gms.common.api.a$j */
    /* loaded from: classes.dex */
    public static final class C4481j<C extends AbstractC4479h> extends C4475d<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends AbstractC4477f> C4467a(String str, AbstractC4473b<C, O> abstractC4473b, C4478g<C> c4478g) {
        C4588d.m23626a(abstractC4473b, "Cannot construct an Api with a null ClientBuilder");
        C4588d.m23626a(c4478g, "Cannot construct an Api with a null ClientKey");
        this.f16801e = str;
        this.f16797a = abstractC4473b;
        this.f16799c = c4478g;
    }

    /* renamed from: a */
    public AbstractC4476e<?, O> m24012a() {
        if (m24008e()) {
            return null;
        }
        return this.f16797a;
    }

    /* renamed from: b */
    public AbstractC4473b<?, O> m24011b() {
        C4588d.m23622a(this.f16797a != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f16797a;
    }

    /* renamed from: c */
    public AbstractC4480i<?, O> m24010c() {
        C4588d.m23622a(false, (Object) "This API was constructed with a ClientBuilder. Use getClientBuilder");
        return null;
    }

    /* renamed from: d */
    public C4475d<?> m24009d() {
        if (this.f16799c != null) {
            return this.f16799c;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    /* renamed from: e */
    public boolean m24008e() {
        return false;
    }

    /* renamed from: f */
    public String m24007f() {
        return this.f16801e;
    }
}

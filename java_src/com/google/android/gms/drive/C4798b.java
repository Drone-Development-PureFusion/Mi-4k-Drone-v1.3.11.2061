package com.google.android.gms.drive;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.C4538f;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.drive.internal.C4871b;
import com.google.android.gms.drive.internal.C4894br;
import com.google.android.gms.drive.internal.C4913bt;
import com.google.android.gms.drive.internal.C4928bw;
import com.google.android.gms.drive.internal.C4951d;
/* renamed from: com.google.android.gms.drive.b */
/* loaded from: classes2.dex */
public final class C4798b {

    /* renamed from: a */
    public static final C4467a.C4478g<C4913bt> f17559a = new C4467a.C4478g<>();

    /* renamed from: b */
    public static final Scope f17560b = new Scope(C4538f.f16929i);

    /* renamed from: c */
    public static final Scope f17561c = new Scope(C4538f.f16930j);

    /* renamed from: d */
    public static final Scope f17562d = new Scope("https://www.googleapis.com/auth/drive");

    /* renamed from: e */
    public static final Scope f17563e = new Scope("https://www.googleapis.com/auth/drive.apps");

    /* renamed from: f */
    public static final C4467a<C4467a.AbstractC4468a.C4470b> f17564f = new C4467a<>("Drive.API", new AbstractC4801a<C4467a.AbstractC4468a.C4470b>() { // from class: com.google.android.gms.drive.b.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.drive.C4798b.AbstractC4801a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public Bundle mo22698a(C4467a.AbstractC4468a.C4470b c4470b) {
            return new Bundle();
        }
    }, f17559a);

    /* renamed from: g */
    public static final C4467a<C4802b> f17565g = new C4467a<>("Drive.INTERNAL_API", new AbstractC4801a<C4802b>() { // from class: com.google.android.gms.drive.b.2
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.drive.C4798b.AbstractC4801a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public Bundle mo22698a(C4802b c4802b) {
            return c4802b == null ? new Bundle() : c4802b.m22697a();
        }
    }, f17559a);

    /* renamed from: h */
    public static final AbstractC4803c f17566h = new C4894br();

    /* renamed from: i */
    public static final AbstractC5107s f17567i = new C4928bw();

    /* renamed from: j */
    public static final AbstractC5109u f17568j = new C4951d();

    /* renamed from: k */
    public static final AbstractC4839g f17569k = new C4871b();

    /* renamed from: com.google.android.gms.drive.b$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC4801a<O extends C4467a.AbstractC4468a> extends C4467a.AbstractC4473b<C4913bt, O> {
        /* renamed from: a */
        protected abstract Bundle mo22698a(O o);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a */
        public /* bridge */ /* synthetic */ C4913bt mo7438a(Context context, Looper looper, C4626s c4626s, Object obj, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            return m22699a(context, looper, c4626s, (C4626s) ((C4467a.AbstractC4468a) obj), abstractC4491b, abstractC4492c);
        }

        /* renamed from: a */
        public C4913bt m22699a(Context context, Looper looper, C4626s c4626s, O o, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            return new C4913bt(context, looper, c4626s, abstractC4491b, abstractC4492c, mo22698a((AbstractC4801a<O>) o));
        }
    }

    /* renamed from: com.google.android.gms.drive.b$b */
    /* loaded from: classes2.dex */
    public static class C4802b implements C4467a.AbstractC4468a.AbstractC4472d {
        /* renamed from: a */
        public Bundle m22697a() {
            return null;
        }
    }

    private C4798b() {
    }
}

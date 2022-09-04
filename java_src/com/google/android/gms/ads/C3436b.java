package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.ads.doubleclick.C3450d;
import com.google.android.gms.ads.formats.AbstractC3462c;
import com.google.android.gms.ads.formats.AbstractC3464d;
import com.google.android.gms.ads.formats.AbstractC3466e;
import com.google.android.gms.ads.formats.C3458b;
import com.google.android.gms.ads.internal.client.AbstractC3523ah;
import com.google.android.gms.ads.internal.client.AbstractC3526ai;
import com.google.android.gms.ads.internal.client.BinderC3581t;
import com.google.android.gms.ads.internal.client.C3514ac;
import com.google.android.gms.ads.internal.client.C3559e;
import com.google.android.gms.ads.internal.client.C3586y;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.BinderC7852vk;
import com.google.android.gms.internal.BinderC7853vl;
import com.google.android.gms.internal.BinderC7854vm;
import com.google.android.gms.internal.BinderC7855vn;
import com.google.android.gms.internal.BinderC8004xp;
/* renamed from: com.google.android.gms.ads.b */
/* loaded from: classes2.dex */
public class C3436b {

    /* renamed from: a */
    private final C3586y f13718a;

    /* renamed from: b */
    private final Context f13719b;

    /* renamed from: c */
    private final AbstractC3523ah f13720c;

    /* renamed from: com.google.android.gms.ads.b$a */
    /* loaded from: classes2.dex */
    public static class C3437a {

        /* renamed from: a */
        private final Context f13721a;

        /* renamed from: b */
        private final AbstractC3526ai f13722b;

        C3437a(Context context, AbstractC3526ai abstractC3526ai) {
            this.f13721a = context;
            this.f13722b = abstractC3526ai;
        }

        public C3437a(Context context, String str) {
            this((Context) C4588d.m23626a(context, "context cannot be null"), C3514ac.m27584b().m27622a(context, str, new BinderC8004xp()));
        }

        /* renamed from: a */
        public C3437a m27854a(AbstractC3432a abstractC3432a) {
            try {
                this.f13722b.mo27312a(new BinderC3581t(abstractC3432a));
            } catch (RemoteException e) {
                C3784b.m26839d("Failed to set AdListener.", e);
            }
            return this;
        }

        /* renamed from: a */
        public C3437a m27853a(@NonNull C3454e c3454e) {
            C4588d.m23627a(c3454e);
            try {
                this.f13722b.mo27311a(c3454e.m27754b());
            } catch (RemoteException e) {
                C3784b.m26839d("Failed to set correlator.", e);
            }
            return this;
        }

        /* renamed from: a */
        public C3437a m27852a(C3458b c3458b) {
            try {
                this.f13722b.mo27310a(new NativeAdOptionsParcel(c3458b));
            } catch (RemoteException e) {
                C3784b.m26839d("Failed to specify native ad options", e);
            }
            return this;
        }

        /* renamed from: a */
        public C3437a m27851a(AbstractC3462c.AbstractC3463a abstractC3463a) {
            try {
                this.f13722b.mo27309a(new BinderC7852vk(abstractC3463a));
            } catch (RemoteException e) {
                C3784b.m26839d("Failed to add app install ad listener", e);
            }
            return this;
        }

        /* renamed from: a */
        public C3437a m27850a(AbstractC3464d.AbstractC3465a abstractC3465a) {
            try {
                this.f13722b.mo27308a(new BinderC7853vl(abstractC3465a));
            } catch (RemoteException e) {
                C3784b.m26839d("Failed to add content ad listener", e);
            }
            return this;
        }

        /* renamed from: a */
        public C3437a m27849a(String str, AbstractC3466e.AbstractC3468b abstractC3468b, AbstractC3466e.AbstractC3467a abstractC3467a) {
            try {
                this.f13722b.mo27307a(str, new BinderC7855vn(abstractC3468b), abstractC3467a == null ? null : new BinderC7854vm(abstractC3467a));
            } catch (RemoteException e) {
                C3784b.m26839d("Failed to add custom template ad listener", e);
            }
            return this;
        }

        /* renamed from: a */
        public C3436b m27855a() {
            try {
                return new C3436b(this.f13721a, this.f13722b.mo27313a());
            } catch (RemoteException e) {
                C3784b.m26843b("Failed to build AdLoader.", e);
                return null;
            }
        }
    }

    C3436b(Context context, AbstractC3523ah abstractC3523ah) {
        this(context, abstractC3523ah, C3586y.m27414a());
    }

    C3436b(Context context, AbstractC3523ah abstractC3523ah, C3586y c3586y) {
        this.f13719b = context;
        this.f13720c = abstractC3523ah;
        this.f13718a = c3586y;
    }

    /* renamed from: a */
    private void m27857a(C3559e c3559e) {
        try {
            this.f13720c.mo27328a(this.f13718a.m27413a(this.f13719b, c3559e));
        } catch (RemoteException e) {
            C3784b.m26843b("Failed to load ad.", e);
        }
    }

    /* renamed from: a */
    public String m27860a() {
        try {
            return this.f13720c.mo27324b();
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to get the mediation adapter class name.", e);
            return null;
        }
    }

    @RequiresPermission("android.permission.INTERNET")
    /* renamed from: a */
    public void m27859a(C3443c c3443c) {
        m27857a(c3443c.m27832f());
    }

    /* renamed from: a */
    public void m27858a(C3450d c3450d) {
        m27857a(c3450d.m27789j());
    }

    /* renamed from: b */
    public boolean m27856b() {
        try {
            return this.f13720c.mo27329a();
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to check if ad is loading.", e);
            return false;
        }
    }
}

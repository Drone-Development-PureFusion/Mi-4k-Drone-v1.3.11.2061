package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC4638w;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.ail;
import com.google.android.gms.internal.ani;
import com.google.android.gms.nearby.connection.AbstractC8755a;
import com.google.android.gms.nearby.connection.AppMetadata;
import com.xiaomi.market.sdk.C10445j;
/* loaded from: classes2.dex */
public final class anf extends AbstractC4638w<ani> {

    /* renamed from: a */
    private final long f22419a = hashCode();

    /* renamed from: com.google.android.gms.internal.anf$a */
    /* loaded from: classes2.dex */
    private static final class BinderC6608a extends BinderC6609b {

        /* renamed from: a */
        private final ahl.AbstractC6344b<Status> f22420a;

        public BinderC6608a(ahl.AbstractC6344b<Status> abstractC6344b, ail<AbstractC8755a.AbstractC8759d> ailVar) {
            super(ailVar);
            this.f22420a = (ahl.AbstractC6344b) C4588d.m23627a(abstractC6344b);
        }

        @Override // com.google.android.gms.internal.ane, com.google.android.gms.internal.anh
        /* renamed from: c */
        public void mo16643c(int i) {
            this.f22420a.mo7413a(new Status(i));
        }
    }

    /* renamed from: com.google.android.gms.internal.anf$b */
    /* loaded from: classes2.dex */
    private static class BinderC6609b extends ane {

        /* renamed from: a */
        private final ail<AbstractC8755a.AbstractC8759d> f22421a;

        BinderC6609b(ail<AbstractC8755a.AbstractC8759d> ailVar) {
            this.f22421a = ailVar;
        }

        @Override // com.google.android.gms.internal.ane, com.google.android.gms.internal.anh
        /* renamed from: a */
        public void mo16646a(final String str, final byte[] bArr, final boolean z) {
            this.f22421a.m17214a(new ail.AbstractC6386c<AbstractC8755a.AbstractC8759d>() { // from class: com.google.android.gms.internal.anf.b.1
                @Override // com.google.android.gms.internal.ail.AbstractC6386c
                /* renamed from: a */
                public void mo7919a() {
                }

                @Override // com.google.android.gms.internal.ail.AbstractC6386c
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void mo7917a(AbstractC8755a.AbstractC8759d abstractC8759d) {
                    abstractC8759d.m10205a(str, bArr, z);
                }
            });
        }

        @Override // com.google.android.gms.internal.ane, com.google.android.gms.internal.anh
        /* renamed from: b */
        public void mo16644b(final String str) {
            this.f22421a.m17214a(new ail.AbstractC6386c<AbstractC8755a.AbstractC8759d>() { // from class: com.google.android.gms.internal.anf.b.2
                @Override // com.google.android.gms.internal.ail.AbstractC6386c
                /* renamed from: a */
                public void mo7919a() {
                }

                @Override // com.google.android.gms.internal.ail.AbstractC6386c
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void mo7917a(AbstractC8755a.AbstractC8759d abstractC8759d) {
                    abstractC8759d.m10206a(str);
                }
            });
        }
    }

    /* renamed from: com.google.android.gms.internal.anf$c */
    /* loaded from: classes2.dex */
    private static class BinderC6612c extends ane {

        /* renamed from: a */
        private final ahl.AbstractC6344b<Status> f22428a;

        BinderC6612c(ahl.AbstractC6344b<Status> abstractC6344b) {
            this.f22428a = abstractC6344b;
        }

        @Override // com.google.android.gms.internal.ane, com.google.android.gms.internal.anh
        /* renamed from: d */
        public void mo16642d(int i) {
            this.f22428a.mo7413a(new Status(i));
        }
    }

    /* renamed from: com.google.android.gms.internal.anf$d */
    /* loaded from: classes2.dex */
    private static final class BinderC6613d extends BinderC6609b {

        /* renamed from: a */
        private final ahl.AbstractC6344b<Status> f22429a;

        /* renamed from: b */
        private final ail<AbstractC8755a.AbstractC8757b> f22430b;

        public BinderC6613d(ahl.AbstractC6344b<Status> abstractC6344b, ail<AbstractC8755a.AbstractC8757b> ailVar, ail<AbstractC8755a.AbstractC8759d> ailVar2) {
            super(ailVar2);
            this.f22429a = (ahl.AbstractC6344b) C4588d.m23627a(abstractC6344b);
            this.f22430b = (ail) C4588d.m23627a(ailVar);
        }

        @Override // com.google.android.gms.internal.ane, com.google.android.gms.internal.anh
        /* renamed from: a */
        public void mo16649a(final String str, final int i, final byte[] bArr) {
            this.f22430b.m17214a(new ail.AbstractC6386c<AbstractC8755a.AbstractC8757b>() { // from class: com.google.android.gms.internal.anf.d.1
                @Override // com.google.android.gms.internal.ail.AbstractC6386c
                /* renamed from: a */
                public void mo7919a() {
                }

                @Override // com.google.android.gms.internal.ail.AbstractC6386c
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void mo7917a(AbstractC8755a.AbstractC8757b abstractC8757b) {
                    abstractC8757b.m10209a(str, new Status(i), bArr);
                }
            });
        }

        @Override // com.google.android.gms.internal.ane, com.google.android.gms.internal.anh
        /* renamed from: b */
        public void mo16645b(int i) {
            this.f22429a.mo7413a(new Status(i));
        }
    }

    /* renamed from: com.google.android.gms.internal.anf$e */
    /* loaded from: classes2.dex */
    private static final class BinderC6615e extends ane {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC8755a.AbstractC8760e> f22435a;

        /* renamed from: b */
        private final ail<AbstractC8755a.AbstractC8756a> f22436b;

        BinderC6615e(ahl.AbstractC6344b<AbstractC8755a.AbstractC8760e> abstractC6344b, ail<AbstractC8755a.AbstractC8756a> ailVar) {
            this.f22435a = (ahl.AbstractC6344b) C4588d.m23627a(abstractC6344b);
            this.f22436b = (ail) C4588d.m23627a(ailVar);
        }

        @Override // com.google.android.gms.internal.ane, com.google.android.gms.internal.anh
        /* renamed from: a */
        public void mo16651a(int i, String str) {
            this.f22435a.mo7413a(new C6617f(new Status(i), str));
        }

        @Override // com.google.android.gms.internal.ane, com.google.android.gms.internal.anh
        /* renamed from: a */
        public void mo16647a(final String str, final String str2, final String str3, final byte[] bArr) {
            this.f22436b.m17214a(new ail.AbstractC6386c<AbstractC8755a.AbstractC8756a>() { // from class: com.google.android.gms.internal.anf.e.1
                @Override // com.google.android.gms.internal.ail.AbstractC6386c
                /* renamed from: a */
                public void mo7919a() {
                }

                @Override // com.google.android.gms.internal.ail.AbstractC6386c
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void mo7917a(AbstractC8755a.AbstractC8756a abstractC8756a) {
                    abstractC8756a.m10210a(str, str2, str3, bArr);
                }
            });
        }
    }

    /* renamed from: com.google.android.gms.internal.anf$f */
    /* loaded from: classes2.dex */
    private static final class C6617f implements AbstractC8755a.AbstractC8760e {

        /* renamed from: a */
        private final Status f22442a;

        /* renamed from: b */
        private final String f22443b;

        C6617f(Status status, String str) {
            this.f22442a = status;
            this.f22443b = str;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f22442a;
        }

        @Override // com.google.android.gms.nearby.connection.AbstractC8755a.AbstractC8760e
        /* renamed from: b */
        public String mo10204b() {
            return this.f22443b;
        }
    }

    /* renamed from: com.google.android.gms.internal.anf$g */
    /* loaded from: classes2.dex */
    private static final class BinderC6618g extends ane {

        /* renamed from: a */
        private final ahl.AbstractC6344b<Status> f22444a;

        /* renamed from: b */
        private final ail<AbstractC8755a.AbstractC8758c> f22445b;

        BinderC6618g(ahl.AbstractC6344b<Status> abstractC6344b, ail<AbstractC8755a.AbstractC8758c> ailVar) {
            this.f22444a = (ahl.AbstractC6344b) C4588d.m23627a(abstractC6344b);
            this.f22445b = (ail) C4588d.m23627a(ailVar);
        }

        @Override // com.google.android.gms.internal.ane, com.google.android.gms.internal.anh
        /* renamed from: a */
        public void mo16652a(int i) {
            this.f22444a.mo7413a(new Status(i));
        }

        @Override // com.google.android.gms.internal.ane, com.google.android.gms.internal.anh
        /* renamed from: a */
        public void mo16650a(final String str) {
            this.f22445b.m17214a(new ail.AbstractC6386c<AbstractC8755a.AbstractC8758c>() { // from class: com.google.android.gms.internal.anf.g.2
                @Override // com.google.android.gms.internal.ail.AbstractC6386c
                /* renamed from: a */
                public void mo7919a() {
                }

                @Override // com.google.android.gms.internal.ail.AbstractC6386c
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void mo7917a(AbstractC8755a.AbstractC8758c abstractC8758c) {
                    abstractC8758c.m10208a(str);
                }
            });
        }

        @Override // com.google.android.gms.internal.ane, com.google.android.gms.internal.anh
        /* renamed from: a */
        public void mo16648a(final String str, final String str2, final String str3, final String str4) {
            this.f22445b.m17214a(new ail.AbstractC6386c<AbstractC8755a.AbstractC8758c>() { // from class: com.google.android.gms.internal.anf.g.1
                @Override // com.google.android.gms.internal.ail.AbstractC6386c
                /* renamed from: a */
                public void mo7919a() {
                }

                @Override // com.google.android.gms.internal.ail.AbstractC6386c
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void mo7917a(AbstractC8755a.AbstractC8758c abstractC8758c) {
                    abstractC8758c.m10207a(str, str2, str3, str4);
                }
            });
        }
    }

    public anf(Context context, Looper looper, C4626s c4626s, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
        super(context, looper, 54, c4626s, abstractC4491b, abstractC4492c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public ani mo7440b(IBinder iBinder) {
        return ani.AbstractBinderC6633a.m16641a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    protected String mo7443a() {
        return "com.google.android.gms.nearby.connection.service.START";
    }

    /* renamed from: a */
    public void m16682a(ahl.AbstractC6344b<Status> abstractC6344b, String str) {
        ((ani) G()).mo16638a(new BinderC6612c(abstractC6344b), str, this.f22419a);
    }

    /* renamed from: a */
    public void m16681a(ahl.AbstractC6344b<Status> abstractC6344b, String str, long j, ail<AbstractC8755a.AbstractC8758c> ailVar) {
        ((ani) G()).mo16637a(new BinderC6618g(abstractC6344b, ailVar), str, j, this.f22419a);
    }

    /* renamed from: a */
    public void m16680a(ahl.AbstractC6344b<AbstractC8755a.AbstractC8760e> abstractC6344b, String str, AppMetadata appMetadata, long j, ail<AbstractC8755a.AbstractC8756a> ailVar) {
        ((ani) G()).mo16636a(new BinderC6615e(abstractC6344b, ailVar), str, appMetadata, j, this.f22419a);
    }

    /* renamed from: a */
    public void m16679a(ahl.AbstractC6344b<Status> abstractC6344b, String str, String str2, byte[] bArr, ail<AbstractC8755a.AbstractC8757b> ailVar, ail<AbstractC8755a.AbstractC8759d> ailVar2) {
        ((ani) G()).mo16635a(new BinderC6613d(abstractC6344b, ailVar, ailVar2), str, str2, bArr, this.f22419a);
    }

    /* renamed from: a */
    public void m16678a(ahl.AbstractC6344b<Status> abstractC6344b, String str, byte[] bArr, ail<AbstractC8755a.AbstractC8759d> ailVar) {
        ((ani) G()).mo16634a(new BinderC6608a(abstractC6344b, ailVar), str, bArr, this.f22419a);
    }

    /* renamed from: a */
    public void m16677a(String str) {
        try {
            ((ani) G()).mo16633a(str, this.f22419a);
        } catch (RemoteException e) {
            Log.w("NearbyConnectionsClient", "Couldn't stop discovery", e);
        }
    }

    /* renamed from: a */
    public void m16676a(String[] strArr, byte[] bArr) {
        try {
            ((ani) G()).mo16632a(strArr, bArr, this.f22419a);
        } catch (RemoteException e) {
            Log.w("NearbyConnectionsClient", "Couldn't send reliable message", e);
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    protected String mo7441b() {
        return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    }

    /* renamed from: b */
    public void m16675b(String str) {
        try {
            ((ani) G()).mo16630b(str, this.f22419a);
        } catch (RemoteException e) {
            Log.w("NearbyConnectionsClient", "Couldn't disconnect from endpoint", e);
        }
    }

    /* renamed from: b */
    public void m16674b(String[] strArr, byte[] bArr) {
        try {
            ((ani) G()).mo16629b(strArr, bArr, this.f22419a);
        } catch (RemoteException e) {
            Log.w("NearbyConnectionsClient", "Couldn't send unreliable message", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: c */
    public Bundle mo9367c() {
        Bundle bundle = new Bundle();
        bundle.putLong(C10445j.f32455aa, this.f22419a);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p, com.google.android.gms.common.api.C4467a.AbstractC4477f
    /* renamed from: f */
    public void mo9828f() {
        if (t()) {
            try {
                ((ani) G()).mo16628c(this.f22419a);
            } catch (RemoteException e) {
                Log.w("NearbyConnectionsClient", "Failed to notify client disconnect.", e);
            }
        }
        super.f();
    }

    /* renamed from: h */
    public String m16673h() {
        try {
            return ((ani) G()).mo16627d(this.f22419a);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: i */
    public String m16672i() {
        try {
            return ((ani) G()).mo16640a();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: j */
    public void m16671j() {
        try {
            ((ani) G()).mo16639a(this.f22419a);
        } catch (RemoteException e) {
            Log.w("NearbyConnectionsClient", "Couldn't stop advertising", e);
        }
    }

    /* renamed from: k */
    public void m16670k() {
        try {
            ((ani) G()).mo16631b(this.f22419a);
        } catch (RemoteException e) {
            Log.w("NearbyConnectionsClient", "Couldn't stop all endpoints", e);
        }
    }
}

package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.os.RemoteException;
import android.view.Display;
import android.view.Surface;
import com.google.android.gms.cast.AbstractC4234e;
import com.google.android.gms.cast.C4227d;
import com.google.android.gms.cast.internal.C4440m;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.agw;
import com.google.android.gms.internal.agy;
import com.google.android.gms.internal.ahl;
/* loaded from: classes.dex */
public class agu implements AbstractC4234e {

    /* renamed from: a */
    private static final C4440m f21660a = new C4440m("CastRemoteDisplayApiImpl");

    /* renamed from: b */
    private C4467a<?> f21661b;

    /* renamed from: c */
    private VirtualDisplay f21662c;

    /* renamed from: d */
    private final agy f21663d = new agy.AbstractBinderC6317a() { // from class: com.google.android.gms.internal.agu.1
        @Override // com.google.android.gms.internal.agy
        /* renamed from: a */
        public void mo17537a(int i) {
            agu.f21660a.m24160b("onRemoteDisplayEnded", new Object[0]);
            agu.this.m17564b();
        }
    };

    /* renamed from: com.google.android.gms.internal.agu$a */
    /* loaded from: classes.dex */
    abstract class AbstractBinderC6307a extends agw.AbstractBinderC6313a {
        AbstractBinderC6307a() {
        }

        @Override // com.google.android.gms.internal.agw
        /* renamed from: a */
        public void mo17549a() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.gms.internal.agw
        /* renamed from: a */
        public void mo17548a(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.gms.internal.agw
        /* renamed from: a */
        public void mo17547a(int i, int i2, Surface surface) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.gms.internal.agw
        /* renamed from: b */
        public void mo17546b() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.agu$b */
    /* loaded from: classes.dex */
    public abstract class AbstractC6308b extends ahl.AbstractC6343a<C4227d.AbstractC4232c, agv> {

        /* JADX INFO: Access modifiers changed from: protected */
        @TargetApi(19)
        /* renamed from: com.google.android.gms.internal.agu$b$a */
        /* loaded from: classes2.dex */
        public final class BinderC6309a extends AbstractBinderC6307a {

            /* renamed from: c */
            private final agv f21671c;

            public BinderC6309a(agv agvVar) {
                super();
                this.f21671c = agvVar;
            }

            /* renamed from: a */
            private int m17558a(int i, int i2) {
                if (i >= i2) {
                    i = i2;
                }
                return (i * 320) / 1080;
            }

            @Override // com.google.android.gms.internal.agu.AbstractBinderC6307a, com.google.android.gms.internal.agw
            /* renamed from: a */
            public void mo17548a(int i) {
                agu.f21660a.m24160b("onError: %d", Integer.valueOf(i));
                agu.this.m17564b();
                AbstractC6308b.this.b((AbstractC6308b) new C6311c(Status.f16788c));
            }

            @Override // com.google.android.gms.internal.agu.AbstractBinderC6307a, com.google.android.gms.internal.agw
            /* renamed from: a */
            public void mo17547a(int i, int i2, Surface surface) {
                agu.f21660a.m24160b("onConnected", new Object[0]);
                DisplayManager displayManager = (DisplayManager) this.f21671c.B().getSystemService("display");
                if (displayManager == null) {
                    agu.f21660a.m24154e("Unable to get the display manager", new Object[0]);
                    AbstractC6308b.this.b((AbstractC6308b) new C6311c(Status.f16788c));
                    return;
                }
                agu.this.m17564b();
                int m17558a = m17558a(i, i2);
                agu.this.f21662c = displayManager.createVirtualDisplay("private_display", i, i2, m17558a, surface, 2);
                if (agu.this.f21662c == null) {
                    agu.f21660a.m24154e("Unable to create virtual display", new Object[0]);
                    AbstractC6308b.this.b((AbstractC6308b) new C6311c(Status.f16788c));
                } else if (agu.this.f21662c.getDisplay() == null) {
                    agu.f21660a.m24154e("Virtual display does not have a display", new Object[0]);
                    AbstractC6308b.this.b((AbstractC6308b) new C6311c(Status.f16788c));
                } else {
                    try {
                        this.f21671c.m17553a(this, agu.this.f21662c.getDisplay().getDisplayId());
                    } catch (RemoteException | IllegalStateException e) {
                        agu.f21660a.m24154e("Unable to provision the route's new virtual Display", new Object[0]);
                        AbstractC6308b.this.b((AbstractC6308b) new C6311c(Status.f16788c));
                    }
                }
            }

            @Override // com.google.android.gms.internal.agu.AbstractBinderC6307a, com.google.android.gms.internal.agw
            /* renamed from: b */
            public void mo17546b() {
                agu.f21660a.m24160b("onConnectedWithDisplay", new Object[0]);
                if (agu.this.f21662c == null) {
                    agu.f21660a.m24154e("There is no virtual display", new Object[0]);
                    AbstractC6308b.this.b((AbstractC6308b) new C6311c(Status.f16788c));
                    return;
                }
                Display display = agu.this.f21662c.getDisplay();
                if (display != null) {
                    AbstractC6308b.this.b((AbstractC6308b) new C6311c(display));
                    return;
                }
                agu.f21660a.m24154e("Virtual display no longer has a display", new Object[0]);
                AbstractC6308b.this.b((AbstractC6308b) new C6311c(Status.f16788c));
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: com.google.android.gms.internal.agu$b$b */
        /* loaded from: classes2.dex */
        public final class BinderC6310b extends AbstractBinderC6307a {
            protected BinderC6310b() {
                super();
            }

            @Override // com.google.android.gms.internal.agu.AbstractBinderC6307a, com.google.android.gms.internal.agw
            /* renamed from: a */
            public void mo17549a() {
                agu.f21660a.m24160b("onDisconnected", new Object[0]);
                agu.this.m17564b();
                AbstractC6308b.this.b((AbstractC6308b) new C6311c(Status.f16786a));
            }

            @Override // com.google.android.gms.internal.agu.AbstractBinderC6307a, com.google.android.gms.internal.agw
            /* renamed from: a */
            public void mo17548a(int i) {
                agu.f21660a.m24160b("onError: %d", Integer.valueOf(i));
                agu.this.m17564b();
                AbstractC6308b.this.b((AbstractC6308b) new C6311c(Status.f16788c));
            }
        }

        public AbstractC6308b(AbstractC4489g abstractC4489g) {
            super(agu.this.f21661b, abstractC4489g);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public C4227d.AbstractC4232c mo7807b(Status status) {
            return new C6311c(status);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a */
        public void mo7809a(agv agvVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.agu$c */
    /* loaded from: classes.dex */
    public static final class C6311c implements C4227d.AbstractC4232c {

        /* renamed from: a */
        private final Status f21673a;

        /* renamed from: b */
        private final Display f21674b;

        public C6311c(Display display) {
            this.f21673a = Status.f16786a;
            this.f21674b = display;
        }

        public C6311c(Status status) {
            this.f21673a = status;
            this.f21674b = null;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f21673a;
        }

        @Override // com.google.android.gms.cast.C4227d.AbstractC4232c
        /* renamed from: b */
        public Display mo17557b() {
            return this.f21674b;
        }
    }

    public agu(C4467a c4467a) {
        this.f21661b = c4467a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(19)
    /* renamed from: b */
    public void m17564b() {
        if (this.f21662c != null) {
            if (this.f21662c.getDisplay() != null) {
                f21660a.m24160b(new StringBuilder(38).append("releasing virtual display: ").append(this.f21662c.getDisplay().getDisplayId()).toString(), new Object[0]);
            }
            this.f21662c.release();
            this.f21662c = null;
        }
    }

    @Override // com.google.android.gms.cast.AbstractC4234e
    /* renamed from: a */
    public AbstractC4494i<C4227d.AbstractC4232c> mo17568a(AbstractC4489g abstractC4489g) {
        f21660a.m24160b("stopRemoteDisplay", new Object[0]);
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC6308b(abstractC4489g) { // from class: com.google.android.gms.internal.agu.3
            @Override // com.google.android.gms.internal.agu.AbstractC6308b, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(agv agvVar) {
                agvVar.m17554a((agw) new AbstractC6308b.BinderC6310b());
            }
        });
    }

    @Override // com.google.android.gms.cast.AbstractC4234e
    /* renamed from: a */
    public AbstractC4494i<C4227d.AbstractC4232c> mo17567a(AbstractC4489g abstractC4489g, final String str) {
        f21660a.m24160b("startRemoteDisplay", new Object[0]);
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC6308b(abstractC4489g) { // from class: com.google.android.gms.internal.agu.2
            @Override // com.google.android.gms.internal.agu.AbstractC6308b, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(agv agvVar) {
                agvVar.m17552a(new AbstractC6308b.BinderC6309a(agvVar), agu.this.f21663d, str);
            }
        });
    }
}

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.BinderC3628l;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.client.AbstractC3517af;
import com.google.android.gms.ads.internal.client.AbstractC3520ag;
import com.google.android.gms.ads.internal.client.AbstractC3538am;
import com.google.android.gms.ads.internal.reward.client.AbstractC3746a;
import com.google.android.gms.ads.internal.reward.client.AbstractC3755d;
import com.google.android.gms.internal.AbstractC7807ur;
import com.google.android.gms.internal.AbstractC8082yy;
import java.util.LinkedList;
import java.util.List;
@aaa
/* renamed from: com.google.android.gms.internal.wn */
/* loaded from: classes.dex */
class C7911wn {

    /* renamed from: a */
    private final List<AbstractC7935a> f26071a = new LinkedList();

    /* renamed from: com.google.android.gms.internal.wn$a */
    /* loaded from: classes2.dex */
    interface AbstractC7935a {
        /* renamed from: a */
        void mo13233a(C7936wo c7936wo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13246a(BinderC3628l binderC3628l) {
        binderC3628l.a((AbstractC3520ag) new AbstractC3520ag.AbstractBinderC3521a() { // from class: com.google.android.gms.internal.wn.1
            @Override // com.google.android.gms.ads.internal.client.AbstractC3520ag
            /* renamed from: a */
            public void mo13231a() {
                C7911wn.this.f26071a.add(new AbstractC7935a() { // from class: com.google.android.gms.internal.wn.1.1
                    @Override // com.google.android.gms.internal.C7911wn.AbstractC7935a
                    /* renamed from: a */
                    public void mo13233a(C7936wo c7936wo) {
                        if (c7936wo.f26104a != null) {
                            c7936wo.f26104a.mo13231a();
                        }
                        C3779u.m26875t().m13226a();
                    }
                });
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3520ag
            /* renamed from: a */
            public void mo13230a(final int i) {
                C7911wn.this.f26071a.add(new AbstractC7935a() { // from class: com.google.android.gms.internal.wn.1.2
                    @Override // com.google.android.gms.internal.C7911wn.AbstractC7935a
                    /* renamed from: a */
                    public void mo13233a(C7936wo c7936wo) {
                        if (c7936wo.f26104a != null) {
                            c7936wo.f26104a.mo13230a(i);
                        }
                    }
                });
                abr.m18409e("Pooled interstitial failed to load.");
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3520ag
            /* renamed from: b */
            public void mo13229b() {
                C7911wn.this.f26071a.add(new AbstractC7935a() { // from class: com.google.android.gms.internal.wn.1.3
                    @Override // com.google.android.gms.internal.C7911wn.AbstractC7935a
                    /* renamed from: a */
                    public void mo13233a(C7936wo c7936wo) {
                        if (c7936wo.f26104a != null) {
                            c7936wo.f26104a.mo13229b();
                        }
                    }
                });
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3520ag
            /* renamed from: c */
            public void mo13228c() {
                C7911wn.this.f26071a.add(new AbstractC7935a() { // from class: com.google.android.gms.internal.wn.1.4
                    @Override // com.google.android.gms.internal.C7911wn.AbstractC7935a
                    /* renamed from: a */
                    public void mo13233a(C7936wo c7936wo) {
                        if (c7936wo.f26104a != null) {
                            c7936wo.f26104a.mo13228c();
                        }
                    }
                });
                abr.m18409e("Pooled interstitial loaded.");
            }

            @Override // com.google.android.gms.ads.internal.client.AbstractC3520ag
            /* renamed from: d */
            public void mo13227d() {
                C7911wn.this.f26071a.add(new AbstractC7935a() { // from class: com.google.android.gms.internal.wn.1.5
                    @Override // com.google.android.gms.internal.C7911wn.AbstractC7935a
                    /* renamed from: a */
                    public void mo13233a(C7936wo c7936wo) {
                        if (c7936wo.f26104a != null) {
                            c7936wo.f26104a.mo13227d();
                        }
                    }
                });
            }
        });
        binderC3628l.a((AbstractC3538am) new AbstractC3538am.AbstractBinderC3539a() { // from class: com.google.android.gms.internal.wn.2
            @Override // com.google.android.gms.ads.internal.client.AbstractC3538am
            /* renamed from: a */
            public void mo13243a(final String str, final String str2) {
                C7911wn.this.f26071a.add(new AbstractC7935a() { // from class: com.google.android.gms.internal.wn.2.1
                    @Override // com.google.android.gms.internal.C7911wn.AbstractC7935a
                    /* renamed from: a */
                    public void mo13233a(C7936wo c7936wo) {
                        if (c7936wo.f26105b != null) {
                            c7936wo.f26105b.mo13243a(str, str2);
                        }
                    }
                });
            }
        });
        binderC3628l.a((AbstractC8082yy) new AbstractC8082yy.AbstractBinderC8083a() { // from class: com.google.android.gms.internal.wn.3
            @Override // com.google.android.gms.internal.AbstractC8082yy
            /* renamed from: a */
            public void mo12836a(final AbstractC8079yx abstractC8079yx) {
                C7911wn.this.f26071a.add(new AbstractC7935a() { // from class: com.google.android.gms.internal.wn.3.1
                    @Override // com.google.android.gms.internal.C7911wn.AbstractC7935a
                    /* renamed from: a */
                    public void mo13233a(C7936wo c7936wo) {
                        if (c7936wo.f26106c != null) {
                            c7936wo.f26106c.mo12836a(abstractC8079yx);
                        }
                    }
                });
            }
        });
        binderC3628l.a((AbstractC7807ur) new AbstractC7807ur.AbstractBinderC7808a() { // from class: com.google.android.gms.internal.wn.4
            @Override // com.google.android.gms.internal.AbstractC7807ur
            /* renamed from: a */
            public void mo13242a(final AbstractC7804uq abstractC7804uq) {
                C7911wn.this.f26071a.add(new AbstractC7935a() { // from class: com.google.android.gms.internal.wn.4.1
                    @Override // com.google.android.gms.internal.C7911wn.AbstractC7935a
                    /* renamed from: a */
                    public void mo13233a(C7936wo c7936wo) {
                        if (c7936wo.f26107d != null) {
                            c7936wo.f26107d.mo13242a(abstractC7804uq);
                        }
                    }
                });
            }
        });
        binderC3628l.a((AbstractC3517af) new AbstractC3517af.AbstractBinderC3518a() { // from class: com.google.android.gms.internal.wn.5
            @Override // com.google.android.gms.ads.internal.client.AbstractC3517af
            /* renamed from: a */
            public void mo13241a() {
                C7911wn.this.f26071a.add(new AbstractC7935a() { // from class: com.google.android.gms.internal.wn.5.1
                    @Override // com.google.android.gms.internal.C7911wn.AbstractC7935a
                    /* renamed from: a */
                    public void mo13233a(C7936wo c7936wo) {
                        if (c7936wo.f26108e != null) {
                            c7936wo.f26108e.mo13241a();
                        }
                    }
                });
            }
        });
        binderC3628l.a((AbstractC3755d) new AbstractC3755d.AbstractBinderC3756a() { // from class: com.google.android.gms.internal.wn.6
            @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3755d
            /* renamed from: a */
            public void mo13240a() {
                C7911wn.this.f26071a.add(new AbstractC7935a() { // from class: com.google.android.gms.internal.wn.6.1
                    @Override // com.google.android.gms.internal.C7911wn.AbstractC7935a
                    /* renamed from: a */
                    public void mo13233a(C7936wo c7936wo) {
                        if (c7936wo.f26109f != null) {
                            c7936wo.f26109f.mo13240a();
                        }
                    }
                });
            }

            @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3755d
            /* renamed from: a */
            public void mo13239a(final int i) {
                C7911wn.this.f26071a.add(new AbstractC7935a() { // from class: com.google.android.gms.internal.wn.6.7
                    @Override // com.google.android.gms.internal.C7911wn.AbstractC7935a
                    /* renamed from: a */
                    public void mo13233a(C7936wo c7936wo) {
                        if (c7936wo.f26109f != null) {
                            c7936wo.f26109f.mo13239a(i);
                        }
                    }
                });
            }

            @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3755d
            /* renamed from: a */
            public void mo13238a(final AbstractC3746a abstractC3746a) {
                C7911wn.this.f26071a.add(new AbstractC7935a() { // from class: com.google.android.gms.internal.wn.6.5
                    @Override // com.google.android.gms.internal.C7911wn.AbstractC7935a
                    /* renamed from: a */
                    public void mo13233a(C7936wo c7936wo) {
                        if (c7936wo.f26109f != null) {
                            c7936wo.f26109f.mo13238a(abstractC3746a);
                        }
                    }
                });
            }

            @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3755d
            /* renamed from: b */
            public void mo13237b() {
                C7911wn.this.f26071a.add(new AbstractC7935a() { // from class: com.google.android.gms.internal.wn.6.2
                    @Override // com.google.android.gms.internal.C7911wn.AbstractC7935a
                    /* renamed from: a */
                    public void mo13233a(C7936wo c7936wo) {
                        if (c7936wo.f26109f != null) {
                            c7936wo.f26109f.mo13237b();
                        }
                    }
                });
            }

            @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3755d
            /* renamed from: c */
            public void mo13236c() {
                C7911wn.this.f26071a.add(new AbstractC7935a() { // from class: com.google.android.gms.internal.wn.6.3
                    @Override // com.google.android.gms.internal.C7911wn.AbstractC7935a
                    /* renamed from: a */
                    public void mo13233a(C7936wo c7936wo) {
                        if (c7936wo.f26109f != null) {
                            c7936wo.f26109f.mo13236c();
                        }
                    }
                });
            }

            @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3755d
            /* renamed from: d */
            public void mo13235d() {
                C7911wn.this.f26071a.add(new AbstractC7935a() { // from class: com.google.android.gms.internal.wn.6.4
                    @Override // com.google.android.gms.internal.C7911wn.AbstractC7935a
                    /* renamed from: a */
                    public void mo13233a(C7936wo c7936wo) {
                        if (c7936wo.f26109f != null) {
                            c7936wo.f26109f.mo13235d();
                        }
                    }
                });
            }

            @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3755d
            /* renamed from: e */
            public void mo13234e() {
                C7911wn.this.f26071a.add(new AbstractC7935a() { // from class: com.google.android.gms.internal.wn.6.6
                    @Override // com.google.android.gms.internal.C7911wn.AbstractC7935a
                    /* renamed from: a */
                    public void mo13233a(C7936wo c7936wo) {
                        if (c7936wo.f26109f != null) {
                            c7936wo.f26109f.mo13234e();
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13244a(final C7936wo c7936wo) {
        Handler handler = abv.f21039a;
        for (final AbstractC7935a abstractC7935a : this.f26071a) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.wn.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        abstractC7935a.mo13233a(c7936wo);
                    } catch (RemoteException e) {
                        abr.d("Could not propagate interstitial ad event.", e);
                    }
                }
            });
        }
        this.f26071a.clear();
    }
}

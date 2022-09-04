package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.ail;
import com.google.android.gms.wearable.AbstractC9441a;
import com.google.android.gms.wearable.AbstractC9453c;
import com.google.android.gms.wearable.AbstractC9458e;
import com.google.android.gms.wearable.AbstractC9630m;
import com.google.android.gms.wearable.AbstractC9636p;
import com.google.android.gms.wearable.C9465g;
import com.google.android.gms.wearable.internal.AbstractC9618x;
import java.util.List;
/* renamed from: com.google.android.gms.wearable.internal.as */
/* loaded from: classes2.dex */
public class BinderC9531as<T> extends AbstractC9618x.AbstractBinderC9619a {

    /* renamed from: a */
    private ail<Object> f30053a;

    /* renamed from: b */
    private ail<Object> f30054b;

    /* renamed from: c */
    private ail<AbstractC9458e.AbstractC9460b> f30055c;

    /* renamed from: d */
    private ail<AbstractC9630m.AbstractC9632b> f30056d;

    /* renamed from: e */
    private ail<AbstractC9636p.AbstractC9639c> f30057e;

    /* renamed from: f */
    private ail<Object> f30058f;

    /* renamed from: g */
    private ail<AbstractC9453c.AbstractC9454a> f30059g;

    /* renamed from: h */
    private ail<AbstractC9441a.AbstractC9444c> f30060h;

    /* renamed from: i */
    private final IntentFilter[] f30061i;

    /* renamed from: j */
    private final String f30062j;

    private BinderC9531as(IntentFilter[] intentFilterArr, String str) {
        this.f30061i = (IntentFilter[]) C4588d.m23627a(intentFilterArr);
        this.f30062j = str;
    }

    /* renamed from: a */
    public static BinderC9531as<AbstractC9453c.AbstractC9454a> m7938a(ail<AbstractC9453c.AbstractC9454a> ailVar, String str, IntentFilter[] intentFilterArr) {
        BinderC9531as<AbstractC9453c.AbstractC9454a> binderC9531as = new BinderC9531as<>(intentFilterArr, (String) C4588d.m23627a(str));
        ((BinderC9531as) binderC9531as).f30059g = (ail) C4588d.m23627a(ailVar);
        return binderC9531as;
    }

    /* renamed from: a */
    public static BinderC9531as<AbstractC9458e.AbstractC9460b> m7937a(ail<AbstractC9458e.AbstractC9460b> ailVar, IntentFilter[] intentFilterArr) {
        BinderC9531as<AbstractC9458e.AbstractC9460b> binderC9531as = new BinderC9531as<>(intentFilterArr, null);
        ((BinderC9531as) binderC9531as).f30055c = (ail) C4588d.m23627a(ailVar);
        return binderC9531as;
    }

    /* renamed from: a */
    private static void m7939a(ail<?> ailVar) {
        if (ailVar != null) {
            ailVar.m17215a();
        }
    }

    /* renamed from: b */
    private static ail.AbstractC6386c<AbstractC9458e.AbstractC9460b> m7935b(final DataHolder dataHolder) {
        return new ail.AbstractC6386c<AbstractC9458e.AbstractC9460b>() { // from class: com.google.android.gms.wearable.internal.as.1
            @Override // com.google.android.gms.internal.ail.AbstractC6386c
            /* renamed from: a */
            public void mo7919a() {
                DataHolder.this.close();
            }

            @Override // com.google.android.gms.internal.ail.AbstractC6386c
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7917a(AbstractC9458e.AbstractC9460b abstractC9460b) {
                try {
                    abstractC9460b.mo8095a(new C9465g(DataHolder.this));
                } finally {
                    DataHolder.this.close();
                }
            }
        };
    }

    /* renamed from: b */
    private static ail.AbstractC6386c<AbstractC9441a.AbstractC9444c> m7933b(final CapabilityInfoParcelable capabilityInfoParcelable) {
        return new ail.AbstractC6386c<AbstractC9441a.AbstractC9444c>() { // from class: com.google.android.gms.wearable.internal.as.6
            @Override // com.google.android.gms.internal.ail.AbstractC6386c
            /* renamed from: a */
            public void mo7919a() {
            }

            @Override // com.google.android.gms.internal.ail.AbstractC6386c
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7917a(AbstractC9441a.AbstractC9444c abstractC9444c) {
                abstractC9444c.mo7884a(CapabilityInfoParcelable.this);
            }
        };
    }

    /* renamed from: b */
    private static ail.AbstractC6386c<AbstractC9453c.AbstractC9454a> m7932b(final ChannelEventParcelable channelEventParcelable) {
        return new ail.AbstractC6386c<AbstractC9453c.AbstractC9454a>() { // from class: com.google.android.gms.wearable.internal.as.5
            @Override // com.google.android.gms.internal.ail.AbstractC6386c
            /* renamed from: a */
            public void mo7919a() {
            }

            @Override // com.google.android.gms.internal.ail.AbstractC6386c
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7917a(AbstractC9453c.AbstractC9454a abstractC9454a) {
                ChannelEventParcelable.this.m8074a(abstractC9454a);
            }
        };
    }

    /* renamed from: b */
    private static ail.AbstractC6386c<AbstractC9630m.AbstractC9632b> m7931b(final MessageEventParcelable messageEventParcelable) {
        return new ail.AbstractC6386c<AbstractC9630m.AbstractC9632b>() { // from class: com.google.android.gms.wearable.internal.as.2
            @Override // com.google.android.gms.internal.ail.AbstractC6386c
            /* renamed from: a */
            public void mo7919a() {
            }

            @Override // com.google.android.gms.internal.ail.AbstractC6386c
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7917a(AbstractC9630m.AbstractC9632b abstractC9632b) {
                abstractC9632b.mo7574a(MessageEventParcelable.this);
            }
        };
    }

    /* renamed from: b */
    public static BinderC9531as<AbstractC9630m.AbstractC9632b> m7934b(ail<AbstractC9630m.AbstractC9632b> ailVar, IntentFilter[] intentFilterArr) {
        BinderC9531as<AbstractC9630m.AbstractC9632b> binderC9531as = new BinderC9531as<>(intentFilterArr, null);
        ((BinderC9531as) binderC9531as).f30056d = (ail) C4588d.m23627a(ailVar);
        return binderC9531as;
    }

    /* renamed from: c */
    private static ail.AbstractC6386c<AbstractC9636p.AbstractC9639c> m7928c(final NodeParcelable nodeParcelable) {
        return new ail.AbstractC6386c<AbstractC9636p.AbstractC9639c>() { // from class: com.google.android.gms.wearable.internal.as.3
            @Override // com.google.android.gms.internal.ail.AbstractC6386c
            /* renamed from: a */
            public void mo7919a() {
            }

            @Override // com.google.android.gms.internal.ail.AbstractC6386c
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7917a(AbstractC9636p.AbstractC9639c abstractC9639c) {
                abstractC9639c.mo7559a(NodeParcelable.this);
            }
        };
    }

    /* renamed from: c */
    public static BinderC9531as<AbstractC9636p.AbstractC9639c> m7929c(ail<AbstractC9636p.AbstractC9639c> ailVar, IntentFilter[] intentFilterArr) {
        BinderC9531as<AbstractC9636p.AbstractC9639c> binderC9531as = new BinderC9531as<>(intentFilterArr, null);
        ((BinderC9531as) binderC9531as).f30057e = (ail) C4588d.m23627a(ailVar);
        return binderC9531as;
    }

    /* renamed from: d */
    private static ail.AbstractC6386c<AbstractC9636p.AbstractC9639c> m7926d(final NodeParcelable nodeParcelable) {
        return new ail.AbstractC6386c<AbstractC9636p.AbstractC9639c>() { // from class: com.google.android.gms.wearable.internal.as.4
            @Override // com.google.android.gms.internal.ail.AbstractC6386c
            /* renamed from: a */
            public void mo7919a() {
            }

            @Override // com.google.android.gms.internal.ail.AbstractC6386c
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7917a(AbstractC9636p.AbstractC9639c abstractC9639c) {
                abstractC9639c.mo7558b(NodeParcelable.this);
            }
        };
    }

    /* renamed from: d */
    public static BinderC9531as<AbstractC9453c.AbstractC9454a> m7927d(ail<AbstractC9453c.AbstractC9454a> ailVar, IntentFilter[] intentFilterArr) {
        BinderC9531as<AbstractC9453c.AbstractC9454a> binderC9531as = new BinderC9531as<>(intentFilterArr, null);
        ((BinderC9531as) binderC9531as).f30059g = (ail) C4588d.m23627a(ailVar);
        return binderC9531as;
    }

    /* renamed from: e */
    public static BinderC9531as<AbstractC9441a.AbstractC9444c> m7925e(ail<AbstractC9441a.AbstractC9444c> ailVar, IntentFilter[] intentFilterArr) {
        BinderC9531as<AbstractC9441a.AbstractC9444c> binderC9531as = new BinderC9531as<>(intentFilterArr, null);
        ((BinderC9531as) binderC9531as).f30060h = (ail) C4588d.m23627a(ailVar);
        return binderC9531as;
    }

    /* renamed from: a */
    public void m7940a() {
        m7939a((ail<?>) null);
        this.f30053a = null;
        m7939a((ail<?>) null);
        this.f30054b = null;
        m7939a(this.f30055c);
        this.f30055c = null;
        m7939a(this.f30056d);
        this.f30056d = null;
        m7939a(this.f30057e);
        this.f30057e = null;
        m7939a((ail<?>) null);
        this.f30058f = null;
        m7939a(this.f30059g);
        this.f30059g = null;
        m7939a(this.f30060h);
        this.f30060h = null;
    }

    @Override // com.google.android.gms.wearable.internal.AbstractC9618x
    /* renamed from: a */
    public void mo7707a(DataHolder dataHolder) {
        if (this.f30055c != null) {
            this.f30055c.m17214a(m7935b(dataHolder));
        } else {
            dataHolder.close();
        }
    }

    @Override // com.google.android.gms.wearable.internal.AbstractC9618x
    /* renamed from: a */
    public void mo7706a(AmsEntityUpdateParcelable amsEntityUpdateParcelable) {
    }

    @Override // com.google.android.gms.wearable.internal.AbstractC9618x
    /* renamed from: a */
    public void mo7705a(AncsNotificationParcelable ancsNotificationParcelable) {
    }

    @Override // com.google.android.gms.wearable.internal.AbstractC9618x
    /* renamed from: a */
    public void mo7704a(CapabilityInfoParcelable capabilityInfoParcelable) {
        if (this.f30060h != null) {
            this.f30060h.m17214a(m7933b(capabilityInfoParcelable));
        }
    }

    @Override // com.google.android.gms.wearable.internal.AbstractC9618x
    /* renamed from: a */
    public void mo7703a(ChannelEventParcelable channelEventParcelable) {
        if (this.f30059g != null) {
            this.f30059g.m17214a(m7932b(channelEventParcelable));
        }
    }

    @Override // com.google.android.gms.wearable.internal.AbstractC9618x
    /* renamed from: a */
    public void mo7702a(MessageEventParcelable messageEventParcelable) {
        if (this.f30056d != null) {
            this.f30056d.m17214a(m7931b(messageEventParcelable));
        }
    }

    @Override // com.google.android.gms.wearable.internal.AbstractC9618x
    /* renamed from: a */
    public void mo7701a(NodeParcelable nodeParcelable) {
        if (this.f30057e != null) {
            this.f30057e.m17214a(m7928c(nodeParcelable));
        }
    }

    @Override // com.google.android.gms.wearable.internal.AbstractC9618x
    /* renamed from: a */
    public void mo7700a(List<NodeParcelable> list) {
    }

    @Override // com.google.android.gms.wearable.internal.AbstractC9618x
    /* renamed from: b */
    public void mo7699b(NodeParcelable nodeParcelable) {
        if (this.f30057e != null) {
            this.f30057e.m17214a(m7926d(nodeParcelable));
        }
    }

    /* renamed from: b */
    public IntentFilter[] m7936b() {
        return this.f30061i;
    }

    /* renamed from: c */
    public String m7930c() {
        return this.f30062j;
    }
}

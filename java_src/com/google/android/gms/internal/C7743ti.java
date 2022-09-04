package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.AbstractC3603i;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
@aaa
/* renamed from: com.google.android.gms.internal.ti */
/* loaded from: classes.dex */
public class C7743ti implements AbstractC7744tj {

    /* renamed from: a */
    private final Object f25618a = new Object();

    /* renamed from: b */
    private final WeakHashMap<abi, AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf> f25619b = new WeakHashMap<>();

    /* renamed from: c */
    private final ArrayList<AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf> f25620c = new ArrayList<>();

    /* renamed from: d */
    private final Context f25621d;

    /* renamed from: e */
    private final VersionInfoParcel f25622e;

    /* renamed from: f */
    private final C7957wx f25623f;

    public C7743ti(Context context, VersionInfoParcel versionInfoParcel, C7957wx c7957wx) {
        this.f25621d = context.getApplicationContext();
        this.f25622e = versionInfoParcel;
        this.f25623f = c7957wx;
    }

    /* renamed from: a */
    public AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf m13601a(AdSizeParcel adSizeParcel, abi abiVar) {
        return m13600a(adSizeParcel, abiVar, abiVar.f20895b.mo18105b());
    }

    /* renamed from: a */
    public AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf m13600a(AdSizeParcel adSizeParcel, abi abiVar, View view) {
        return m13597a(adSizeParcel, abiVar, new AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf.C7740d(view, abiVar), (AbstractC7980wy) null);
    }

    /* renamed from: a */
    public AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf m13599a(AdSizeParcel adSizeParcel, abi abiVar, View view, AbstractC7980wy abstractC7980wy) {
        return m13597a(adSizeParcel, abiVar, new AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf.C7740d(view, abiVar), abstractC7980wy);
    }

    /* renamed from: a */
    public AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf m13598a(AdSizeParcel adSizeParcel, abi abiVar, AbstractC3603i abstractC3603i) {
        return m13597a(adSizeParcel, abiVar, new AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf.C7737a(abstractC3603i), (AbstractC7980wy) null);
    }

    /* renamed from: a */
    public AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf m13597a(AdSizeParcel adSizeParcel, abi abiVar, AbstractC7753tm abstractC7753tm, @Nullable AbstractC7980wy abstractC7980wy) {
        AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf c7745tk;
        synchronized (this.f25618a) {
            if (m13596a(abiVar)) {
                c7745tk = this.f25619b.get(abiVar);
            } else {
                c7745tk = abstractC7980wy != null ? new C7745tk(this.f25621d, adSizeParcel, abiVar, this.f25622e, abstractC7753tm, abstractC7980wy) : new C7746tl(this.f25621d, adSizeParcel, abiVar, this.f25622e, abstractC7753tm, this.f25623f);
                c7745tk.m13626a(this);
                this.f25619b.put(abiVar, c7745tk);
                this.f25620c.add(c7745tk);
            }
        }
        return c7745tk;
    }

    @Override // com.google.android.gms.internal.AbstractC7744tj
    /* renamed from: a */
    public void mo13591a(AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf abstractViewTreeObserver$OnGlobalLayoutListenerC7732tf) {
        synchronized (this.f25618a) {
            if (!abstractViewTreeObserver$OnGlobalLayoutListenerC7732tf.m13618f()) {
                this.f25620c.remove(abstractViewTreeObserver$OnGlobalLayoutListenerC7732tf);
                Iterator<Map.Entry<abi, AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf>> it2 = this.f25619b.entrySet().iterator();
                while (it2.hasNext()) {
                    if (it2.next().getValue() == abstractViewTreeObserver$OnGlobalLayoutListenerC7732tf) {
                        it2.remove();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m13596a(abi abiVar) {
        boolean z;
        synchronized (this.f25618a) {
            AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf abstractViewTreeObserver$OnGlobalLayoutListenerC7732tf = this.f25619b.get(abiVar);
            z = abstractViewTreeObserver$OnGlobalLayoutListenerC7732tf != null && abstractViewTreeObserver$OnGlobalLayoutListenerC7732tf.m13618f();
        }
        return z;
    }

    /* renamed from: b */
    public void m13595b(abi abiVar) {
        synchronized (this.f25618a) {
            AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf abstractViewTreeObserver$OnGlobalLayoutListenerC7732tf = this.f25619b.get(abiVar);
            if (abstractViewTreeObserver$OnGlobalLayoutListenerC7732tf != null) {
                abstractViewTreeObserver$OnGlobalLayoutListenerC7732tf.mo13590d();
            }
        }
    }

    /* renamed from: c */
    public void m13594c(abi abiVar) {
        synchronized (this.f25618a) {
            AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf abstractViewTreeObserver$OnGlobalLayoutListenerC7732tf = this.f25619b.get(abiVar);
            if (abstractViewTreeObserver$OnGlobalLayoutListenerC7732tf != null) {
                abstractViewTreeObserver$OnGlobalLayoutListenerC7732tf.m13611n();
            }
        }
    }

    /* renamed from: d */
    public void m13593d(abi abiVar) {
        synchronized (this.f25618a) {
            AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf abstractViewTreeObserver$OnGlobalLayoutListenerC7732tf = this.f25619b.get(abiVar);
            if (abstractViewTreeObserver$OnGlobalLayoutListenerC7732tf != null) {
                abstractViewTreeObserver$OnGlobalLayoutListenerC7732tf.m13610o();
            }
        }
    }

    /* renamed from: e */
    public void m13592e(abi abiVar) {
        synchronized (this.f25618a) {
            AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf abstractViewTreeObserver$OnGlobalLayoutListenerC7732tf = this.f25619b.get(abiVar);
            if (abstractViewTreeObserver$OnGlobalLayoutListenerC7732tf != null) {
                abstractViewTreeObserver$OnGlobalLayoutListenerC7732tf.m13609p();
            }
        }
    }
}

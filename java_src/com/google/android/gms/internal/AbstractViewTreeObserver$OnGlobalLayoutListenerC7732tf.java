package com.google.android.gms.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.PowerManager;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.AbstractC3603i;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.internal.tf */
/* loaded from: classes.dex */
public abstract class AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: b */
    protected final C7742th f25581b;
    @Nullable

    /* renamed from: c */
    BroadcastReceiver f25582c;

    /* renamed from: d */
    private final WeakReference<abi> f25583d;

    /* renamed from: f */
    private final AbstractC7753tm f25585f;

    /* renamed from: g */
    private final Context f25586g;

    /* renamed from: h */
    private final WindowManager f25587h;

    /* renamed from: i */
    private final PowerManager f25588i;

    /* renamed from: j */
    private final KeyguardManager f25589j;
    @Nullable

    /* renamed from: k */
    private AbstractC7744tj f25590k;

    /* renamed from: l */
    private boolean f25591l;

    /* renamed from: p */
    private boolean f25595p;

    /* renamed from: a */
    protected final Object f25580a = new Object();

    /* renamed from: m */
    private boolean f25592m = false;

    /* renamed from: n */
    private boolean f25593n = false;

    /* renamed from: r */
    private final HashSet<AbstractC7741tg> f25597r = new HashSet<>();

    /* renamed from: t */
    private final AbstractC7877vt f25599t = new AbstractC7877vt() { // from class: com.google.android.gms.internal.tf.2
        @Override // com.google.android.gms.internal.AbstractC7877vt
        /* renamed from: a */
        public void mo12713a(acy acyVar, Map<String, String> map) {
            if (!AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf.this.m13624a(map)) {
                return;
            }
            AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf.this.m13628a(acyVar.mo18105b(), map);
        }
    };

    /* renamed from: u */
    private final AbstractC7877vt f25600u = new AbstractC7877vt() { // from class: com.google.android.gms.internal.tf.3
        @Override // com.google.android.gms.internal.AbstractC7877vt
        /* renamed from: a */
        public void mo12713a(acy acyVar, Map<String, String> map) {
            if (!AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf.this.m13624a(map)) {
                return;
            }
            String valueOf = String.valueOf(AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf.this.f25581b.m13604d());
            abr.a(valueOf.length() != 0 ? "Received request to untrack: ".concat(valueOf) : new String("Received request to untrack: "));
            AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf.this.mo13587c();
        }
    };

    /* renamed from: v */
    private final AbstractC7877vt f25601v = new AbstractC7877vt() { // from class: com.google.android.gms.internal.tf.4
        @Override // com.google.android.gms.internal.AbstractC7877vt
        /* renamed from: a */
        public void mo12713a(acy acyVar, Map<String, String> map) {
            if (AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf.this.m13624a(map) && map.containsKey("isVisible")) {
                AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf.this.m13622a(Boolean.valueOf("1".equals(map.get("isVisible")) || "true".equals(map.get("isVisible"))).booleanValue());
            }
        }
    };

    /* renamed from: e */
    private WeakReference<ViewTreeObserver> f25584e = new WeakReference<>(null);

    /* renamed from: o */
    private boolean f25594o = true;

    /* renamed from: q */
    private boolean f25596q = false;

    /* renamed from: s */
    private ach f25598s = new ach(200);

    /* renamed from: com.google.android.gms.internal.tf$a */
    /* loaded from: classes2.dex */
    public static class C7737a implements AbstractC7753tm {

        /* renamed from: a */
        private WeakReference<AbstractC3603i> f25606a;

        public C7737a(AbstractC3603i abstractC3603i) {
            this.f25606a = new WeakReference<>(abstractC3603i);
        }

        @Override // com.google.android.gms.internal.AbstractC7753tm
        @Nullable
        /* renamed from: a */
        public View mo13581a() {
            AbstractC3603i abstractC3603i = this.f25606a.get();
            if (abstractC3603i != null) {
                return abstractC3603i.mo27362e();
            }
            return null;
        }

        @Override // com.google.android.gms.internal.AbstractC7753tm
        /* renamed from: b */
        public boolean mo13580b() {
            return this.f25606a.get() == null;
        }

        @Override // com.google.android.gms.internal.AbstractC7753tm
        /* renamed from: c */
        public AbstractC7753tm mo13579c() {
            return new C7738b(this.f25606a.get());
        }
    }

    /* renamed from: com.google.android.gms.internal.tf$b */
    /* loaded from: classes2.dex */
    public static class C7738b implements AbstractC7753tm {

        /* renamed from: a */
        private AbstractC3603i f25607a;

        public C7738b(AbstractC3603i abstractC3603i) {
            this.f25607a = abstractC3603i;
        }

        @Override // com.google.android.gms.internal.AbstractC7753tm
        /* renamed from: a */
        public View mo13581a() {
            if (this.f25607a != null) {
                return this.f25607a.mo27362e();
            }
            return null;
        }

        @Override // com.google.android.gms.internal.AbstractC7753tm
        /* renamed from: b */
        public boolean mo13580b() {
            return this.f25607a == null;
        }

        @Override // com.google.android.gms.internal.AbstractC7753tm
        /* renamed from: c */
        public AbstractC7753tm mo13579c() {
            return this;
        }
    }

    /* renamed from: com.google.android.gms.internal.tf$c */
    /* loaded from: classes2.dex */
    public static class C7739c implements AbstractC7753tm {
        @Nullable

        /* renamed from: a */
        private final View f25608a;
        @Nullable

        /* renamed from: b */
        private final abi f25609b;

        public C7739c(View view, abi abiVar) {
            this.f25608a = view;
            this.f25609b = abiVar;
        }

        @Override // com.google.android.gms.internal.AbstractC7753tm
        /* renamed from: a */
        public View mo13581a() {
            return this.f25608a;
        }

        @Override // com.google.android.gms.internal.AbstractC7753tm
        /* renamed from: b */
        public boolean mo13580b() {
            return this.f25609b == null || this.f25608a == null;
        }

        @Override // com.google.android.gms.internal.AbstractC7753tm
        /* renamed from: c */
        public AbstractC7753tm mo13579c() {
            return this;
        }
    }

    /* renamed from: com.google.android.gms.internal.tf$d */
    /* loaded from: classes2.dex */
    public static class C7740d implements AbstractC7753tm {

        /* renamed from: a */
        private final WeakReference<View> f25610a;

        /* renamed from: b */
        private final WeakReference<abi> f25611b;

        public C7740d(View view, abi abiVar) {
            this.f25610a = new WeakReference<>(view);
            this.f25611b = new WeakReference<>(abiVar);
        }

        @Override // com.google.android.gms.internal.AbstractC7753tm
        /* renamed from: a */
        public View mo13581a() {
            return this.f25610a.get();
        }

        @Override // com.google.android.gms.internal.AbstractC7753tm
        /* renamed from: b */
        public boolean mo13580b() {
            return this.f25610a.get() == null || this.f25611b.get() == null;
        }

        @Override // com.google.android.gms.internal.AbstractC7753tm
        /* renamed from: c */
        public AbstractC7753tm mo13579c() {
            return new C7739c(this.f25610a.get(), this.f25611b.get());
        }
    }

    public AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf(Context context, AdSizeParcel adSizeParcel, abi abiVar, VersionInfoParcel versionInfoParcel, AbstractC7753tm abstractC7753tm) {
        this.f25583d = new WeakReference<>(abiVar);
        this.f25585f = abstractC7753tm;
        this.f25581b = new C7742th(UUID.randomUUID().toString(), versionInfoParcel, adSizeParcel.f13864b, abiVar.f20903j, abiVar.m18486a(), adSizeParcel.f13871i);
        this.f25587h = (WindowManager) context.getSystemService("window");
        this.f25588i = (PowerManager) context.getApplicationContext().getSystemService("power");
        this.f25589j = (KeyguardManager) context.getSystemService("keyguard");
        this.f25586g = context;
    }

    /* renamed from: a */
    protected int m13630a(int i, DisplayMetrics displayMetrics) {
        return (int) (i / displayMetrics.density);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public JSONObject m13629a(@Nullable View view) {
        if (view == null) {
            return m13614k();
        }
        boolean mo18285a = C3779u.m26888g().mo18285a(view);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        try {
            view.getLocationOnScreen(iArr);
            view.getLocationInWindow(iArr2);
        } catch (Exception e) {
            abr.b("Failure getting view location.", e);
        }
        DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        Rect rect2 = new Rect();
        rect2.right = this.f25587h.getDefaultDisplay().getWidth();
        rect2.bottom = this.f25587h.getDefaultDisplay().getHeight();
        Rect rect3 = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect3, null);
        Rect rect4 = new Rect();
        boolean localVisibleRect = view.getLocalVisibleRect(rect4);
        Rect rect5 = new Rect();
        view.getHitRect(rect5);
        JSONObject m13615i = m13615i();
        m13615i.put("windowVisibility", view.getWindowVisibility()).put("isAttachedToWindow", mo18285a).put("viewBox", new JSONObject().put("top", m13630a(rect2.top, displayMetrics)).put("bottom", m13630a(rect2.bottom, displayMetrics)).put("left", m13630a(rect2.left, displayMetrics)).put("right", m13630a(rect2.right, displayMetrics))).put("adBox", new JSONObject().put("top", m13630a(rect.top, displayMetrics)).put("bottom", m13630a(rect.bottom, displayMetrics)).put("left", m13630a(rect.left, displayMetrics)).put("right", m13630a(rect.right, displayMetrics))).put("globalVisibleBox", new JSONObject().put("top", m13630a(rect3.top, displayMetrics)).put("bottom", m13630a(rect3.bottom, displayMetrics)).put("left", m13630a(rect3.left, displayMetrics)).put("right", m13630a(rect3.right, displayMetrics))).put("globalVisibleBoxVisible", globalVisibleRect).put("localVisibleBox", new JSONObject().put("top", m13630a(rect4.top, displayMetrics)).put("bottom", m13630a(rect4.bottom, displayMetrics)).put("left", m13630a(rect4.left, displayMetrics)).put("right", m13630a(rect4.right, displayMetrics))).put("localVisibleBoxVisible", localVisibleRect).put("hitBox", new JSONObject().put("top", m13630a(rect5.top, displayMetrics)).put("bottom", m13630a(rect5.bottom, displayMetrics)).put("left", m13630a(rect5.left, displayMetrics)).put("right", m13630a(rect5.right, displayMetrics))).put("screenDensity", displayMetrics.density).put("isVisible", C3779u.m26890e().m18357a(view, this.f25588i, this.f25589j));
        return m13615i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m13632a() {
        synchronized (this.f25580a) {
            if (this.f25582c != null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            this.f25582c = new BroadcastReceiver() { // from class: com.google.android.gms.internal.tf.1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    AbstractViewTreeObserver$OnGlobalLayoutListenerC7732tf.this.m13631a(3);
                }
            };
            this.f25586g.registerReceiver(this.f25582c, intentFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m13631a(int i) {
        boolean z = false;
        synchronized (this.f25580a) {
            if (!mo13586j() || !this.f25594o) {
                return;
            }
            View mo13581a = this.f25585f.mo13581a();
            boolean z2 = mo13581a != null && C3779u.m26890e().m18357a(mo13581a, this.f25588i, this.f25589j) && mo13581a.getGlobalVisibleRect(new Rect(), null);
            if (this.f25585f.mo13580b()) {
                mo13590d();
                return;
            }
            if (i == 1) {
                z = true;
            }
            if (z && !this.f25598s.m18222a() && z2 == this.f25596q) {
                return;
            }
            if (!z2 && !this.f25596q && i == 1) {
                return;
            }
            try {
                m13623a(m13629a(mo13581a));
                this.f25596q = z2;
            } catch (RuntimeException | JSONException e) {
                abr.a("Active view update failed.", e);
            }
            m13617g();
            m13619e();
        }
    }

    /* renamed from: a */
    protected void m13628a(View view, Map<String, String> map) {
        m13631a(3);
    }

    /* renamed from: a */
    public void m13627a(AbstractC7741tg abstractC7741tg) {
        this.f25597r.add(abstractC7741tg);
    }

    /* renamed from: a */
    public void m13626a(AbstractC7744tj abstractC7744tj) {
        synchronized (this.f25580a) {
            this.f25590k = abstractC7744tj;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m13625a(AbstractC7980wy abstractC7980wy) {
        abstractC7980wy.mo13113a("/updateActiveView", this.f25599t);
        abstractC7980wy.mo13113a("/untrackActiveViewUnit", this.f25600u);
        abstractC7980wy.mo13113a("/visibilityChanged", this.f25601v);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m13623a(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONArray.put(jSONObject);
            jSONObject2.put("units", jSONArray);
            mo13588b(jSONObject2);
        } catch (Throwable th) {
            abr.b("Skipping active view message.", th);
        }
    }

    /* renamed from: a */
    protected void m13622a(boolean z) {
        Iterator<AbstractC7741tg> it2 = this.f25597r.iterator();
        while (it2.hasNext()) {
            it2.next().mo13608a(this, z);
        }
    }

    /* renamed from: a */
    protected boolean m13624a(@Nullable Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.f25581b.m13604d());
    }

    /* renamed from: b */
    protected void m13621b() {
        synchronized (this.f25580a) {
            if (this.f25582c != null) {
                try {
                    this.f25586g.unregisterReceiver(this.f25582c);
                } catch (IllegalStateException e) {
                    abr.b("Failed trying to unregister the receiver", e);
                } catch (Exception e2) {
                    C3779u.m26886i().m18451a(e2, "AbstractActiveViewUnit.stopScreenStatusMonitoring");
                }
                this.f25582c = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void m13620b(AbstractC7980wy abstractC7980wy) {
        abstractC7980wy.mo13110b("/visibilityChanged", this.f25601v);
        abstractC7980wy.mo13110b("/untrackActiveViewUnit", this.f25600u);
        abstractC7980wy.mo13110b("/updateActiveView", this.f25599t);
    }

    /* renamed from: b */
    protected abstract void mo13588b(JSONObject jSONObject);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void mo13587c() {
        synchronized (this.f25580a) {
            m13616h();
            m13621b();
            this.f25594o = false;
            m13619e();
        }
    }

    /* renamed from: d */
    public void mo13590d() {
        synchronized (this.f25580a) {
            if (this.f25594o) {
                this.f25595p = true;
                try {
                    m13623a(m13612m());
                } catch (RuntimeException e) {
                    abr.b("Failure while processing active view data.", e);
                } catch (JSONException e2) {
                    abr.b("JSON failure while processing active view data.", e2);
                }
                String valueOf = String.valueOf(this.f25581b.m13604d());
                abr.a(valueOf.length() != 0 ? "Untracking ad unit: ".concat(valueOf) : new String("Untracking ad unit: "));
            }
        }
    }

    /* renamed from: e */
    protected void m13619e() {
        if (this.f25590k != null) {
            this.f25590k.mo13591a(this);
        }
    }

    /* renamed from: f */
    public boolean m13618f() {
        boolean z;
        synchronized (this.f25580a) {
            z = this.f25594o;
        }
        return z;
    }

    /* renamed from: g */
    protected void m13617g() {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        View mo13581a = this.f25585f.mo13579c().mo13581a();
        if (mo13581a == null || (viewTreeObserver2 = mo13581a.getViewTreeObserver()) == (viewTreeObserver = this.f25584e.get())) {
            return;
        }
        m13616h();
        if (!this.f25591l || (viewTreeObserver != null && viewTreeObserver.isAlive())) {
            this.f25591l = true;
            viewTreeObserver2.addOnScrollChangedListener(this);
            viewTreeObserver2.addOnGlobalLayoutListener(this);
        }
        this.f25584e = new WeakReference<>(viewTreeObserver2);
    }

    /* renamed from: h */
    protected void m13616h() {
        ViewTreeObserver viewTreeObserver = this.f25584e.get();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this);
        viewTreeObserver.removeGlobalOnLayoutListener(this);
    }

    /* renamed from: i */
    protected JSONObject m13615i() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("afmaVersion", this.f25581b.m13606b()).put("activeViewJSON", this.f25581b.m13605c()).put("timestamp", C3779u.m26884k().mo16432b()).put("adFormat", this.f25581b.m13607a()).put("hashCode", this.f25581b.m13604d()).put("isMraid", this.f25581b.m13603e()).put("isStopped", this.f25593n).put("isPaused", this.f25592m).put("isScreenOn", m13613l()).put("isNative", this.f25581b.m13602f()).put("appMuted", C3779u.m26890e().m18314h()).put("appVolume", C3779u.m26890e().m18316g()).put("deviceVolume", C3779u.m26890e().m18310j(this.f25586g));
        return jSONObject;
    }

    /* renamed from: j */
    protected abstract boolean mo13586j();

    /* renamed from: k */
    protected JSONObject m13614k() {
        return m13615i().put("isAttachedToWindow", false).put("isScreenOn", m13613l()).put("isVisible", false);
    }

    /* renamed from: l */
    boolean m13613l() {
        return this.f25588i.isScreenOn();
    }

    /* renamed from: m */
    protected JSONObject m13612m() {
        JSONObject m13615i = m13615i();
        m13615i.put("doneReasonCode", "u");
        return m13615i;
    }

    /* renamed from: n */
    public void m13611n() {
        synchronized (this.f25580a) {
            this.f25593n = true;
            m13631a(3);
        }
    }

    /* renamed from: o */
    public void m13610o() {
        synchronized (this.f25580a) {
            this.f25592m = true;
            m13631a(3);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        m13631a(2);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        m13631a(1);
    }

    /* renamed from: p */
    public void m13609p() {
        synchronized (this.f25580a) {
            this.f25592m = false;
            m13631a(3);
        }
    }
}

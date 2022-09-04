package com.google.android.gms.internal;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.android.gms.ads.C3446d;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C3514ac;
import com.google.android.gms.common.util.C4683f;
import java.util.Map;
import java.util.Set;
@aaa
/* renamed from: com.google.android.gms.internal.yi */
/* loaded from: classes.dex */
public class C8053yi extends C8063yn {

    /* renamed from: a */
    static final Set<String> f26374a = C4683f.m23146a((Object[]) new String[]{"top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center"});

    /* renamed from: b */
    private String f26375b = "top-right";

    /* renamed from: c */
    private boolean f26376c = true;

    /* renamed from: d */
    private int f26377d = 0;

    /* renamed from: e */
    private int f26378e = 0;

    /* renamed from: f */
    private int f26379f = -1;

    /* renamed from: g */
    private int f26380g = 0;

    /* renamed from: h */
    private int f26381h = 0;

    /* renamed from: i */
    private int f26382i = -1;

    /* renamed from: j */
    private final Object f26383j = new Object();

    /* renamed from: k */
    private final acy f26384k;

    /* renamed from: l */
    private final Activity f26385l;

    /* renamed from: m */
    private AdSizeParcel f26386m;

    /* renamed from: n */
    private ImageView f26387n;

    /* renamed from: o */
    private LinearLayout f26388o;

    /* renamed from: p */
    private AbstractC8064yo f26389p;

    /* renamed from: q */
    private PopupWindow f26390q;

    /* renamed from: r */
    private RelativeLayout f26391r;

    /* renamed from: s */
    private ViewGroup f26392s;

    public C8053yi(acy acyVar, AbstractC8064yo abstractC8064yo) {
        super(acyVar, "resize");
        this.f26384k = acyVar;
        this.f26385l = acyVar.mo18090f();
        this.f26389p = abstractC8064yo;
    }

    /* renamed from: b */
    private void m12916b(Map<String, String> map) {
        if (!TextUtils.isEmpty(map.get(FimiMediaMeta.IJKM_KEY_WIDTH))) {
            this.f26382i = C3779u.m26890e().m18330b(map.get(FimiMediaMeta.IJKM_KEY_WIDTH));
        }
        if (!TextUtils.isEmpty(map.get(FimiMediaMeta.IJKM_KEY_HEIGHT))) {
            this.f26379f = C3779u.m26890e().m18330b(map.get(FimiMediaMeta.IJKM_KEY_HEIGHT));
        }
        if (!TextUtils.isEmpty(map.get("offsetX"))) {
            this.f26380g = C3779u.m26890e().m18330b(map.get("offsetX"));
        }
        if (!TextUtils.isEmpty(map.get("offsetY"))) {
            this.f26381h = C3779u.m26890e().m18330b(map.get("offsetY"));
        }
        if (!TextUtils.isEmpty(map.get("allowOffscreen"))) {
            this.f26376c = Boolean.parseBoolean(map.get("allowOffscreen"));
        }
        String str = map.get("customClosePosition");
        if (!TextUtils.isEmpty(str)) {
            this.f26375b = str;
        }
    }

    /* renamed from: d */
    private int[] m12913d() {
        if (!m12915c()) {
            return null;
        }
        if (this.f26376c) {
            return new int[]{this.f26377d + this.f26380g, this.f26378e + this.f26381h};
        }
        int[] m18338b = C3779u.m26890e().m18338b(this.f26385l);
        int[] m18323d = C3779u.m26890e().m18323d(this.f26385l);
        int i = m18338b[0];
        int i2 = this.f26377d + this.f26380g;
        int i3 = this.f26378e + this.f26381h;
        if (i2 < 0) {
            i2 = 0;
        } else if (this.f26382i + i2 > i) {
            i2 = i - this.f26382i;
        }
        if (i3 < m18323d[0]) {
            i3 = m18323d[0];
        } else if (this.f26379f + i3 > m18323d[1]) {
            i3 = m18323d[1] - this.f26379f;
        }
        return new int[]{i2, i3};
    }

    /* renamed from: a */
    void m12922a(int i, int i2) {
        if (this.f26389p != null) {
            this.f26389p.mo12878a(i, i2, this.f26382i, this.f26379f);
        }
    }

    /* renamed from: a */
    public void m12921a(int i, int i2, boolean z) {
        synchronized (this.f26383j) {
            this.f26377d = i;
            this.f26378e = i2;
            if (this.f26390q != null && z) {
                int[] m12913d = m12913d();
                if (m12913d != null) {
                    this.f26390q.update(C3514ac.m27586a().m26865a(this.f26385l, m12913d[0]), C3514ac.m27586a().m26865a(this.f26385l, m12913d[1]), this.f26390q.getWidth(), this.f26390q.getHeight());
                    m12917b(m12913d[0], m12913d[1]);
                } else {
                    m12919a(true);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public void m12920a(Map<String, String> map) {
        char c;
        synchronized (this.f26383j) {
            if (this.f26385l == null) {
                b("Not an activity context. Cannot resize.");
            } else if (this.f26384k.mo18085k() == null) {
                b("Webview is not yet available, size is not set.");
            } else if (this.f26384k.mo18085k().f13867e) {
                b("Is interstitial. Cannot resize an interstitial.");
            } else if (this.f26384k.mo18080p()) {
                b("Cannot resize an expanded banner.");
            } else {
                m12916b(map);
                if (!m12923a()) {
                    b("Invalid width and height options. Cannot resize.");
                    return;
                }
                Window window = this.f26385l.getWindow();
                if (window == null || window.getDecorView() == null) {
                    b("Activity context is not ready, cannot get window or decor view.");
                    return;
                }
                int[] m12913d = m12913d();
                if (m12913d == null) {
                    b("Resize location out of screen or close button is not visible.");
                    return;
                }
                int m26865a = C3514ac.m27586a().m26865a(this.f26385l, this.f26382i);
                int m26865a2 = C3514ac.m27586a().m26865a(this.f26385l, this.f26379f);
                ViewParent parent = this.f26384k.mo18105b().getParent();
                if (parent == null || !(parent instanceof ViewGroup)) {
                    b("Webview is detached, probably in the middle of a resize or expand.");
                    return;
                }
                ((ViewGroup) parent).removeView(this.f26384k.mo18105b());
                if (this.f26390q == null) {
                    this.f26392s = (ViewGroup) parent;
                    Bitmap m18360a = C3779u.m26890e().m18360a(this.f26384k.mo18105b());
                    this.f26387n = new ImageView(this.f26385l);
                    this.f26387n.setImageBitmap(m18360a);
                    this.f26386m = this.f26384k.mo18085k();
                    this.f26392s.addView(this.f26387n);
                } else {
                    this.f26390q.dismiss();
                }
                this.f26391r = new RelativeLayout(this.f26385l);
                this.f26391r.setBackgroundColor(0);
                this.f26391r.setLayoutParams(new ViewGroup.LayoutParams(m26865a, m26865a2));
                this.f26390q = C3779u.m26890e().m18359a((View) this.f26391r, m26865a, m26865a2, false);
                this.f26390q.setOutsideTouchable(true);
                this.f26390q.setTouchable(true);
                this.f26390q.setClippingEnabled(!this.f26376c);
                this.f26391r.addView(this.f26384k.mo18105b(), -1, -1);
                this.f26388o = new LinearLayout(this.f26385l);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C3514ac.m27586a().m26865a(this.f26385l, 50), C3514ac.m27586a().m26865a(this.f26385l, 50));
                String str = this.f26375b;
                switch (str.hashCode()) {
                    case -1364013995:
                        if (str.equals("center")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1012429441:
                        if (str.equals("top-left")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -655373719:
                        if (str.equals("bottom-left")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1163912186:
                        if (str.equals("bottom-right")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1288627767:
                        if (str.equals("bottom-center")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1755462605:
                        if (str.equals("top-center")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        layoutParams.addRule(10);
                        layoutParams.addRule(9);
                        break;
                    case 1:
                        layoutParams.addRule(10);
                        layoutParams.addRule(14);
                        break;
                    case 2:
                        layoutParams.addRule(13);
                        break;
                    case 3:
                        layoutParams.addRule(12);
                        layoutParams.addRule(9);
                        break;
                    case 4:
                        layoutParams.addRule(12);
                        layoutParams.addRule(14);
                        break;
                    case 5:
                        layoutParams.addRule(12);
                        layoutParams.addRule(11);
                        break;
                    default:
                        layoutParams.addRule(10);
                        layoutParams.addRule(11);
                        break;
                }
                this.f26388o.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.yi.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        C8053yi.this.m12919a(true);
                    }
                });
                this.f26388o.setContentDescription("Close button");
                this.f26391r.addView(this.f26388o, layoutParams);
                try {
                    this.f26390q.showAtLocation(window.getDecorView(), 0, C3514ac.m27586a().m26865a(this.f26385l, m12913d[0]), C3514ac.m27586a().m26865a(this.f26385l, m12913d[1]));
                    m12922a(m12913d[0], m12913d[1]);
                    this.f26384k.mo18117a(new AdSizeParcel(this.f26385l, new C3446d(this.f26382i, this.f26379f)));
                    m12917b(m12913d[0], m12913d[1]);
                    d("resized");
                } catch (RuntimeException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    b(valueOf.length() != 0 ? "Cannot show popup window: ".concat(valueOf) : new String("Cannot show popup window: "));
                    this.f26391r.removeView(this.f26384k.mo18105b());
                    if (this.f26392s != null) {
                        this.f26392s.removeView(this.f26387n);
                        this.f26392s.addView(this.f26384k.mo18105b());
                        this.f26384k.mo18117a(this.f26386m);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m12919a(boolean z) {
        synchronized (this.f26383j) {
            if (this.f26390q != null) {
                this.f26390q.dismiss();
                this.f26391r.removeView(this.f26384k.mo18105b());
                if (this.f26392s != null) {
                    this.f26392s.removeView(this.f26387n);
                    this.f26392s.addView(this.f26384k.mo18105b());
                    this.f26384k.mo18117a(this.f26386m);
                }
                if (z) {
                    d("default");
                    if (this.f26389p != null) {
                        this.f26389p.mo12879G();
                    }
                }
                this.f26390q = null;
                this.f26391r = null;
                this.f26392s = null;
                this.f26388o = null;
            }
        }
    }

    /* renamed from: a */
    boolean m12923a() {
        return this.f26382i > -1 && this.f26379f > -1;
    }

    /* renamed from: b */
    void m12917b(int i, int i2) {
        a(i, i2 - C3779u.m26890e().m18323d(this.f26385l)[0], this.f26382i, this.f26379f);
    }

    /* renamed from: b */
    public boolean m12918b() {
        boolean z;
        synchronized (this.f26383j) {
            z = this.f26390q != null;
        }
        return z;
    }

    /* renamed from: c */
    public void m12914c(int i, int i2) {
        this.f26377d = i;
        this.f26378e = i2;
    }

    /* renamed from: c */
    boolean m12915c() {
        int i;
        int i2;
        int[] m18338b = C3779u.m26890e().m18338b(this.f26385l);
        int[] m18323d = C3779u.m26890e().m18323d(this.f26385l);
        int i3 = m18338b[0];
        int i4 = m18338b[1];
        if (this.f26382i < 50 || this.f26382i > i3) {
            abr.d("Width is too small or too large.");
            return false;
        } else if (this.f26379f < 50 || this.f26379f > i4) {
            abr.d("Height is too small or too large.");
            return false;
        } else if (this.f26379f == i4 && this.f26382i == i3) {
            abr.d("Cannot resize to a full-screen ad.");
            return false;
        } else {
            if (this.f26376c) {
                String str = this.f26375b;
                char c = 65535;
                switch (str.hashCode()) {
                    case -1364013995:
                        if (str.equals("center")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1012429441:
                        if (str.equals("top-left")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -655373719:
                        if (str.equals("bottom-left")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1163912186:
                        if (str.equals("bottom-right")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1288627767:
                        if (str.equals("bottom-center")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1755462605:
                        if (str.equals("top-center")) {
                            c = 1;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        i = this.f26380g + this.f26377d;
                        i2 = this.f26378e + this.f26381h;
                        break;
                    case 1:
                        i = ((this.f26377d + this.f26380g) + (this.f26382i / 2)) - 25;
                        i2 = this.f26378e + this.f26381h;
                        break;
                    case 2:
                        i = ((this.f26377d + this.f26380g) + (this.f26382i / 2)) - 25;
                        i2 = ((this.f26378e + this.f26381h) + (this.f26379f / 2)) - 25;
                        break;
                    case 3:
                        i = this.f26380g + this.f26377d;
                        i2 = ((this.f26378e + this.f26381h) + this.f26379f) - 50;
                        break;
                    case 4:
                        i = ((this.f26377d + this.f26380g) + (this.f26382i / 2)) - 25;
                        i2 = ((this.f26378e + this.f26381h) + this.f26379f) - 50;
                        break;
                    case 5:
                        i = ((this.f26377d + this.f26380g) + this.f26382i) - 50;
                        i2 = ((this.f26378e + this.f26381h) + this.f26379f) - 50;
                        break;
                    default:
                        i = ((this.f26377d + this.f26380g) + this.f26382i) - 50;
                        i2 = this.f26378e + this.f26381h;
                        break;
                }
                if (i < 0 || i + 50 > i3 || i2 < m18323d[0] || i2 + 50 > m18323d[1]) {
                    return false;
                }
            }
            return true;
        }
    }
}

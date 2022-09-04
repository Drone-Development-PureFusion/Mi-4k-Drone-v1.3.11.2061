package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.p001v4.internal.view.SupportMenu;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.fimi.soul.utils.p219a.C3070c;
import com.google.android.gms.common.internal.C4598n;
import com.google.android.gms.internal.C7788uf;
import com.google.android.gms.internal.C7801un;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.acy;
import com.google.android.gms.tagmanager.C9196e;
import java.util.HashMap;
@aaa
/* renamed from: com.google.android.gms.ads.internal.overlay.k */
/* loaded from: classes.dex */
public class C3663k extends FrameLayout implements AbstractC3660h {

    /* renamed from: a */
    private final acy f14331a;

    /* renamed from: b */
    private final FrameLayout f14332b;

    /* renamed from: c */
    private final RunnableC3681y f14333c;
    @Nullable

    /* renamed from: d */
    private AbstractC3661i f14334d;

    /* renamed from: e */
    private boolean f14335e;

    /* renamed from: f */
    private boolean f14336f;

    /* renamed from: g */
    private long f14337g;

    /* renamed from: h */
    private long f14338h;

    /* renamed from: i */
    private String f14339i;

    public C3663k(Context context, acy acyVar, int i, boolean z, C7801un c7801un) {
        super(context);
        this.f14331a = acyVar;
        this.f14332b = new FrameLayout(context);
        addView(this.f14332b, new FrameLayout.LayoutParams(-1, -1));
        C4598n.m23595a(acyVar.mo18088h());
        this.f14334d = acyVar.mo18088h().f14060b.mo27172a(context, acyVar, i, z, c7801un);
        if (this.f14334d != null) {
            this.f14332b.addView(this.f14334d, new FrameLayout.LayoutParams(-1, -1, 17));
            if (C7788uf.f25717B.m13486c().booleanValue()) {
                m27177l();
            }
        }
        this.f14333c = new RunnableC3681y(this);
        this.f14333c.m27120b();
        if (this.f14334d != null) {
            this.f14334d.mo27206a(this);
        }
        if (this.f14334d == null) {
            mo27189a("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    /* renamed from: a */
    public static void m27191a(acy acyVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(C9196e.f29004b, "no_video_view");
        acyVar.mo18107a("onVideoEvent", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m27188a(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put(C9196e.f29004b, str);
        int length = strArr.length;
        int i = 0;
        String str2 = null;
        while (i < length) {
            String str3 = strArr[i];
            if (str2 != null) {
                hashMap.put(str2, str3);
                str3 = null;
            }
            i++;
            str2 = str3;
        }
        this.f14331a.mo18107a("onVideoEvent", hashMap);
    }

    /* renamed from: o */
    private void m27174o() {
        if (this.f14331a.mo18090f() != null && !this.f14335e) {
            this.f14336f = (this.f14331a.mo18090f().getWindow().getAttributes().flags & 128) != 0;
            if (this.f14336f) {
                return;
            }
            this.f14331a.mo18090f().getWindow().addFlags(128);
            this.f14335e = true;
        }
    }

    /* renamed from: p */
    private void m27173p() {
        if (this.f14331a.mo18090f() != null && this.f14335e && !this.f14336f) {
            this.f14331a.mo18090f().getWindow().clearFlags(128);
            this.f14335e = false;
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.AbstractC3660h
    /* renamed from: a */
    public void mo27198a() {
        abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.k.1
            @Override // java.lang.Runnable
            public void run() {
                C3663k.this.m27188a("surfaceCreated", new String[0]);
            }
        });
    }

    /* renamed from: a */
    public void m27197a(float f) {
        if (this.f14334d == null) {
            return;
        }
        this.f14334d.mo27209a(f);
    }

    /* renamed from: a */
    public void m27196a(float f, float f2) {
        if (this.f14334d != null) {
            this.f14334d.mo27208a(f, f2);
        }
    }

    /* renamed from: a */
    public void m27195a(int i) {
        if (this.f14334d == null) {
            return;
        }
        this.f14334d.mo27207a(i);
    }

    /* renamed from: a */
    public void m27194a(int i, int i2, int i3, int i4) {
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.f14332b.setLayoutParams(layoutParams);
        requestLayout();
    }

    @TargetApi(14)
    /* renamed from: a */
    public void m27193a(MotionEvent motionEvent) {
        if (this.f14334d == null) {
            return;
        }
        this.f14334d.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public void m27190a(String str) {
        this.f14339i = str;
    }

    @Override // com.google.android.gms.ads.internal.overlay.AbstractC3660h
    /* renamed from: a */
    public void mo27189a(String str, @Nullable String str2) {
        m27188a("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.ads.internal.overlay.AbstractC3660h
    /* renamed from: b */
    public void mo27187b() {
        if (this.f14334d != null && this.f14338h == 0) {
            m27188a("canplaythrough", "duration", String.valueOf(this.f14334d.getDuration() / 1000.0f), "videoWidth", String.valueOf(this.f14334d.getVideoWidth()), "videoHeight", String.valueOf(this.f14334d.getVideoHeight()));
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.AbstractC3660h
    /* renamed from: c */
    public void mo27186c() {
        m27174o();
    }

    @Override // com.google.android.gms.ads.internal.overlay.AbstractC3660h
    /* renamed from: d */
    public void mo27185d() {
        m27188a("pause", new String[0]);
        m27173p();
    }

    @Override // com.google.android.gms.ads.internal.overlay.AbstractC3660h
    /* renamed from: e */
    public void mo27184e() {
        m27188a("ended", new String[0]);
        m27173p();
    }

    @Override // com.google.android.gms.ads.internal.overlay.AbstractC3660h
    /* renamed from: f */
    public void mo27183f() {
        this.f14338h = this.f14337g;
        abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.k.2
            @Override // java.lang.Runnable
            public void run() {
                C3663k.this.m27188a("surfaceDestroyed", new String[0]);
            }
        });
    }

    /* renamed from: g */
    public void m27182g() {
        if (this.f14334d == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.f14339i)) {
            this.f14334d.setVideoPath(this.f14339i);
        } else {
            m27188a("no_src", new String[0]);
        }
    }

    /* renamed from: h */
    public void m27181h() {
        if (this.f14334d == null) {
            return;
        }
        this.f14334d.mo27203d();
    }

    /* renamed from: i */
    public void m27180i() {
        if (this.f14334d == null) {
            return;
        }
        this.f14334d.mo27204c();
    }

    /* renamed from: j */
    public void m27179j() {
        if (this.f14334d == null) {
            return;
        }
        this.f14334d.mo27202e();
    }

    /* renamed from: k */
    public void m27178k() {
        if (this.f14334d == null) {
            return;
        }
        this.f14334d.mo27201f();
    }

    @TargetApi(14)
    /* renamed from: l */
    public void m27177l() {
        if (this.f14334d == null) {
            return;
        }
        TextView textView = new TextView(this.f14334d.getContext());
        String valueOf = String.valueOf(this.f14334d.mo27210a());
        textView.setText(valueOf.length() != 0 ? "AdMob - ".concat(valueOf) : new String("AdMob - "));
        textView.setTextColor(SupportMenu.CATEGORY_MASK);
        textView.setBackgroundColor(-256);
        this.f14332b.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.f14332b.bringChildToFront(textView);
    }

    /* renamed from: m */
    public void m27176m() {
        this.f14333c.m27121a();
        if (this.f14334d != null) {
            this.f14334d.mo27205b();
        }
        m27173p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m27175n() {
        if (this.f14334d == null) {
            return;
        }
        long currentPosition = this.f14334d.getCurrentPosition();
        if (this.f14337g == currentPosition || currentPosition <= 0) {
            return;
        }
        m27188a("timeupdate", C3070c.C3071a.f11505i, String.valueOf(((float) currentPosition) / 1000.0f));
        this.f14337g = currentPosition;
    }
}

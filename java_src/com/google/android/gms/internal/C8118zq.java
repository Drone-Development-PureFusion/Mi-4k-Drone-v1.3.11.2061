package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.google.android.gms.internal.C8113zn;
import com.google.android.gms.internal.abi;
@aaa
@TargetApi(19)
/* renamed from: com.google.android.gms.internal.zq */
/* loaded from: classes.dex */
public class C8118zq extends C8115zo {

    /* renamed from: h */
    private PopupWindow f26491h;

    /* renamed from: g */
    private Object f26490g = new Object();

    /* renamed from: i */
    private boolean f26492i = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8118zq(Context context, abi.C6129a c6129a, acy acyVar, C8113zn.AbstractC8114a abstractC8114a) {
        super(context, c6129a, acyVar, abstractC8114a);
    }

    /* renamed from: g */
    private void m12792g() {
        synchronized (this.f26490g) {
            this.f26492i = true;
            if ((this.f26454b instanceof Activity) && ((Activity) this.f26454b).isDestroyed()) {
                this.f26491h = null;
            }
            if (this.f26491h != null) {
                if (this.f26491h.isShowing()) {
                    this.f26491h.dismiss();
                }
                this.f26491h = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.AbstractC8104zj
    /* renamed from: a */
    protected void mo12795a(int i) {
        m12792g();
        super.a(i);
    }

    @Override // com.google.android.gms.internal.AbstractC8104zj, com.google.android.gms.internal.abx
    /* renamed from: d */
    public void mo12794d() {
        m12792g();
        super.d();
    }

    @Override // com.google.android.gms.internal.C8115zo
    /* renamed from: f */
    protected void mo12793f() {
        Window window = this.f26454b instanceof Activity ? ((Activity) this.f26454b).getWindow() : null;
        if (window == null || window.getDecorView() == null || ((Activity) this.f26454b).isDestroyed()) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this.f26454b);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(this.f26455c.mo18105b(), -1, -1);
        synchronized (this.f26490g) {
            if (this.f26492i) {
                return;
            }
            this.f26491h = new PopupWindow((View) frameLayout, 1, 1, false);
            this.f26491h.setOutsideTouchable(true);
            this.f26491h.setClippingEnabled(false);
            abr.a("Displaying the 1x1 popup off the screen.");
            try {
                this.f26491h.showAtLocation(window.getDecorView(), 0, -1, -1);
            } catch (Exception e) {
                this.f26491h = null;
            }
        }
    }
}

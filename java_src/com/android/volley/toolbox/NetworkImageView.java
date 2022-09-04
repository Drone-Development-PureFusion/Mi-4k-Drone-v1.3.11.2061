package com.android.volley.toolbox;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.volley.C0967u;
import com.android.volley.toolbox.C0949k;
/* loaded from: classes.dex */
public class NetworkImageView extends ImageView {

    /* renamed from: a */
    private String f2071a;

    /* renamed from: b */
    private int f2072b;

    /* renamed from: c */
    private int f2073c;

    /* renamed from: d */
    private C0949k f2074d;

    /* renamed from: e */
    private C0949k.C0956c f2075e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.android.volley.toolbox.NetworkImageView$1 */
    /* loaded from: classes.dex */
    public class C09311 implements C0949k.AbstractC0957d {

        /* renamed from: a */
        final /* synthetic */ boolean f2076a;

        C09311(boolean z) {
            this.f2076a = z;
        }

        @Override // com.android.volley.toolbox.C0949k.AbstractC0957d
        /* renamed from: a */
        public void mo29151a(final C0949k.C0956c c0956c, boolean z) {
            if (z && this.f2076a) {
                NetworkImageView.this.post(new Runnable() { // from class: com.android.volley.toolbox.NetworkImageView.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C09311.this.mo29151a(c0956c, false);
                    }
                });
            } else if (c0956c.m37292b() != null) {
                NetworkImageView.this.setImageBitmap(c0956c.m37292b());
            } else if (NetworkImageView.this.f2072b == 0) {
            } else {
                NetworkImageView.this.setImageResource(NetworkImageView.this.f2072b);
            }
        }

        @Override // com.android.volley.C0924p.AbstractC0925a
        /* renamed from: a */
        public void mo29150a(C0967u c0967u) {
            if (NetworkImageView.this.f2073c != 0) {
                NetworkImageView.this.setImageResource(NetworkImageView.this.f2073c);
            }
        }
    }

    public NetworkImageView(Context context) {
        this(context, null);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    private void m37375a() {
        if (this.f2072b != 0) {
            setImageResource(this.f2072b);
        } else {
            setImageBitmap(null);
        }
    }

    /* renamed from: a */
    public void m37373a(String str, C0949k c0949k) {
        this.f2071a = str;
        this.f2074d = c0949k;
        m37372a(false);
    }

    /* renamed from: a */
    void m37372a(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        int width = getWidth();
        int height = getHeight();
        ImageView.ScaleType scaleType = getScaleType();
        if (getLayoutParams() != null) {
            z3 = getLayoutParams().width == -2;
            z2 = getLayoutParams().height == -2;
        } else {
            z2 = false;
            z3 = false;
        }
        if (!z3 || !z2) {
            z4 = false;
        }
        if (width == 0 && height == 0 && !z4) {
            return;
        }
        if (TextUtils.isEmpty(this.f2071a)) {
            if (this.f2075e != null) {
                this.f2075e.m37295a();
                this.f2075e = null;
            }
            m37375a();
            return;
        }
        if (this.f2075e != null && this.f2075e.m37291c() != null) {
            if (this.f2075e.m37291c().equals(this.f2071a)) {
                return;
            }
            this.f2075e.m37295a();
            m37375a();
        }
        int i = z3 ? 0 : width;
        if (z2) {
            height = 0;
        }
        this.f2075e = this.f2074d.m37307a(this.f2071a, new C09311(z), i, height, scaleType);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public String getImageURL() {
        return this.f2071a;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        if (this.f2075e != null) {
            this.f2075e.m37295a();
            setImageBitmap(null);
            this.f2075e = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m37372a(true);
    }

    public void setDefaultImageResId(int i) {
        this.f2072b = i;
    }

    public void setErrorImageResId(int i) {
        this.f2073c = i;
    }
}

package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.ads.internal.client.C3514ac;
import com.google.android.gms.internal.aaa;
@aaa
/* renamed from: com.google.android.gms.ads.internal.overlay.o */
/* loaded from: classes.dex */
public class View$OnClickListenerC3669o extends FrameLayout implements View.OnClickListener {

    /* renamed from: a */
    private final ImageButton f14342a;

    /* renamed from: b */
    private final AbstractC3675u f14343b;

    public View$OnClickListenerC3669o(Context context, int i, AbstractC3675u abstractC3675u) {
        super(context);
        this.f14343b = abstractC3675u;
        setOnClickListener(this);
        this.f14342a = new ImageButton(context);
        this.f14342a.setImageResource(17301527);
        this.f14342a.setBackgroundColor(0);
        this.f14342a.setOnClickListener(this);
        this.f14342a.setPadding(0, 0, 0, 0);
        this.f14342a.setContentDescription("Interstitial close button");
        int m26865a = C3514ac.m27586a().m26865a(context, i);
        addView(this.f14342a, new FrameLayout.LayoutParams(m26865a, m26865a, 17));
    }

    /* renamed from: a */
    public void m27171a(boolean z, boolean z2) {
        if (!z2) {
            this.f14342a.setVisibility(0);
        } else if (z) {
            this.f14342a.setVisibility(4);
        } else {
            this.f14342a.setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f14343b != null) {
            this.f14343b.mo27160c();
        }
    }
}

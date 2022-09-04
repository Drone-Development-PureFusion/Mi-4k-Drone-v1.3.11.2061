package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;
import com.google.android.gms.internal.aaa;
@aaa
@TargetApi(14)
/* renamed from: com.google.android.gms.ads.internal.overlay.i */
/* loaded from: classes.dex */
public abstract class AbstractC3661i extends TextureView {
    public AbstractC3661i(Context context) {
        super(context);
    }

    /* renamed from: a */
    public abstract String mo27210a();

    /* renamed from: a */
    public abstract void mo27209a(float f);

    /* renamed from: a */
    public abstract void mo27208a(float f, float f2);

    /* renamed from: a */
    public abstract void mo27207a(int i);

    /* renamed from: a */
    public abstract void mo27206a(AbstractC3660h abstractC3660h);

    /* renamed from: b */
    public abstract void mo27205b();

    /* renamed from: c */
    public abstract void mo27204c();

    /* renamed from: d */
    public abstract void mo27203d();

    /* renamed from: e */
    public abstract void mo27202e();

    /* renamed from: f */
    public abstract void mo27201f();

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void setVideoPath(String str);
}

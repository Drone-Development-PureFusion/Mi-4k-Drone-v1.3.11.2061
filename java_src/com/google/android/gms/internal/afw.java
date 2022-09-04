package com.google.android.gms.internal;

import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import com.google.android.gms.cast.framework.C4253d;
import com.google.android.gms.cast.framework.media.C4298c;
import com.google.android.gms.cast.framework.media.p234a.AbstractC4294a;
import com.google.android.gms.common.util.C4696s;
/* loaded from: classes2.dex */
public class afw extends AbstractC4294a {

    /* renamed from: a */
    private final SeekBar f21523a;

    /* renamed from: b */
    private final SeekBar f21524b;

    public afw(SeekBar seekBar, SeekBar seekBar2) {
        this.f21523a = seekBar;
        this.f21524b = seekBar2;
        this.f21523a.setClickable(false);
        if (C4696s.m23106h()) {
            this.f21523a.setThumb(null);
        } else {
            this.f21523a.setThumb(new ColorDrawable(0));
        }
        this.f21523a.setProgress(1);
        this.f21523a.setMax(1);
        this.f21523a.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.afw.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
    }

    /* renamed from: e */
    private void m17701e() {
        int i = 4;
        C4298c a = a();
        if (a == null || !a.m24515t()) {
            return;
        }
        boolean m24524k = a.m24524k();
        this.f21523a.setVisibility(m24524k ? 0 : 4);
        SeekBar seekBar = this.f21524b;
        if (!m24524k) {
            i = 0;
        }
        seekBar.setVisibility(i);
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: a */
    public void mo17672a(C4253d c4253d) {
        super.mo17672a(c4253d);
        m17701e();
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: c */
    public void mo17670c() {
        m17701e();
    }
}

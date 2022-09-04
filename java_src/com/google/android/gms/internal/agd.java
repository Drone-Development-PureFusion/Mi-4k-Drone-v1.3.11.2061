package com.google.android.gms.internal;

import android.widget.SeekBar;
import com.google.android.gms.cast.framework.C4253d;
import com.google.android.gms.cast.framework.media.C4298c;
import com.google.android.gms.cast.framework.media.p234a.AbstractC4294a;
/* loaded from: classes2.dex */
public class agd extends AbstractC4294a implements C4298c.AbstractC4325d {

    /* renamed from: a */
    private final SeekBar f21553a;

    /* renamed from: b */
    private final long f21554b;

    /* renamed from: c */
    private final SeekBar.OnSeekBarChangeListener f21555c;

    /* renamed from: d */
    private boolean f21556d = true;

    public agd(SeekBar seekBar, long j, final SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f21553a = seekBar;
        this.f21554b = j;
        this.f21555c = new SeekBar.OnSeekBarChangeListener() { // from class: com.google.android.gms.internal.agd.1
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar2, int i, boolean z) {
                if (onSeekBarChangeListener != null) {
                    onSeekBarChangeListener.onProgressChanged(seekBar2, i, z);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar2) {
                agd.this.m17687a(false);
                if (onSeekBarChangeListener != null) {
                    onSeekBarChangeListener.onStartTrackingTouch(seekBar2);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar2) {
                agd.this.m17687a(true);
                if (onSeekBarChangeListener != null) {
                    onSeekBarChangeListener.onStopTrackingTouch(seekBar2);
                }
                C4298c a = agd.this.a();
                if (a == null || !a.m24515t()) {
                    return;
                }
                a.m24578a(seekBar2.getProgress());
            }
        };
    }

    @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4325d
    /* renamed from: a */
    public void mo17676a(long j, long j2) {
        if (m17686e()) {
            this.f21553a.setMax((int) j2);
            this.f21553a.setProgress((int) j);
        }
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: a */
    public void mo17672a(C4253d c4253d) {
        super.mo17672a(c4253d);
        this.f21553a.setOnSeekBarChangeListener(this.f21555c);
        C4298c a = a();
        if (a != null) {
            a.m24563a(this, this.f21554b);
            if (a.m24515t()) {
                this.f21553a.setProgress((int) a.m24534e());
                this.f21553a.setMax((int) a.m24531f());
                return;
            }
            this.f21553a.setProgress(0);
            this.f21553a.setMax(1);
        }
    }

    /* renamed from: a */
    public void m17687a(boolean z) {
        this.f21556d = z;
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: b */
    public void mo17671b() {
        if (a() != null) {
            a().m24564a(this);
        }
        this.f21553a.setOnSeekBarChangeListener(null);
        this.f21553a.setProgress(0);
        this.f21553a.setMax(1);
        super.mo17671b();
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: d */
    public void mo17680d() {
    }

    /* renamed from: e */
    public boolean m17686e() {
        return this.f21556d;
    }
}

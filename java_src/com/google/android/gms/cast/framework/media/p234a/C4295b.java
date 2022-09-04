package com.google.android.gms.cast.framework.media.p234a;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.gms.C3424R;
import com.google.android.gms.cast.framework.AbstractC4279j;
import com.google.android.gms.cast.framework.AbstractC4283l;
import com.google.android.gms.cast.framework.C4251c;
import com.google.android.gms.cast.framework.C4253d;
import com.google.android.gms.cast.framework.C4282k;
import com.google.android.gms.cast.framework.media.C4298c;
import com.google.android.gms.internal.afs;
import com.google.android.gms.internal.aft;
import com.google.android.gms.internal.afu;
import com.google.android.gms.internal.afv;
import com.google.android.gms.internal.afx;
import com.google.android.gms.internal.afy;
import com.google.android.gms.internal.afz;
import com.google.android.gms.internal.aga;
import com.google.android.gms.internal.agb;
import com.google.android.gms.internal.agc;
import com.google.android.gms.internal.agd;
import com.google.android.gms.internal.age;
import com.google.android.gms.internal.agf;
import com.google.android.gms.internal.agg;
import com.google.android.gms.internal.agi;
import com.google.android.gms.internal.agj;
import com.google.android.gms.internal.agk;
import com.google.android.gms.internal.agl;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* renamed from: com.google.android.gms.cast.framework.media.a.b */
/* loaded from: classes2.dex */
public class C4295b implements AbstractC4283l<C4253d>, C4298c.AbstractC4322a {

    /* renamed from: a */
    private final Activity f16321a;

    /* renamed from: b */
    private final C4282k f16322b;

    /* renamed from: c */
    private final Map<View, AbstractC4294a> f16323c = new HashMap();

    /* renamed from: d */
    private final Set<agj> f16324d = new HashSet();

    /* renamed from: e */
    private C4298c.AbstractC4322a f16325e;

    /* renamed from: f */
    private C4298c f16326f;

    public C4295b(Activity activity) {
        this.f16321a = activity;
        this.f16322b = C4251c.m24868a((Context) activity).m24862b();
        this.f16322b.m24717a(this, C4253d.class);
        m24595c(this.f16322b.m24715b());
    }

    /* renamed from: b */
    private void m24605b(View view, AbstractC4294a abstractC4294a) {
        this.f16323c.put(view, abstractC4294a);
        if (m24592f()) {
            abstractC4294a.mo17672a(this.f16322b.m24715b());
            m24588j();
        }
    }

    /* renamed from: c */
    private void m24595c(AbstractC4279j abstractC4279j) {
        if (m24592f() || !(abstractC4279j instanceof C4253d) || !abstractC4279j.m24733o()) {
            return;
        }
        C4253d c4253d = (C4253d) abstractC4279j;
        this.f16326f = c4253d.m24853a();
        if (this.f16326f == null) {
            return;
        }
        this.f16326f.m24566a(this);
        for (AbstractC4294a abstractC4294a : this.f16323c.values()) {
            abstractC4294a.mo17672a(c4253d);
        }
        m24588j();
    }

    /* renamed from: i */
    private void m24589i() {
        if (!m24592f()) {
            return;
        }
        for (AbstractC4294a abstractC4294a : this.f16323c.values()) {
            abstractC4294a.mo17671b();
        }
        this.f16326f.m24544b(this);
        this.f16326f = null;
    }

    /* renamed from: j */
    private void m24588j() {
        for (AbstractC4294a abstractC4294a : this.f16323c.values()) {
            abstractC4294a.mo17670c();
        }
    }

    @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4322a
    /* renamed from: a */
    public void mo17753a() {
        m24588j();
        if (this.f16325e != null) {
            this.f16325e.mo17753a();
        }
    }

    /* renamed from: a */
    public void m24632a(View view) {
        m24605b(view, new afx(view));
    }

    /* renamed from: a */
    public void m24631a(View view, int i) {
        m24605b(view, new agf(view, i));
    }

    /* renamed from: a */
    public void m24630a(View view, long j) {
        m24605b(view, new age(view, j));
    }

    /* renamed from: a */
    public void m24629a(View view, AbstractC4294a abstractC4294a) {
        m24605b(view, abstractC4294a);
    }

    /* renamed from: a */
    public void m24628a(ImageView imageView) {
        m24605b(imageView, new aga(imageView, this.f16321a));
    }

    /* renamed from: a */
    public void m24627a(ImageView imageView, int i, @DrawableRes int i2) {
        m24605b(imageView, new afu(imageView, this.f16321a, i, i2));
    }

    /* renamed from: a */
    public void m24626a(ImageView imageView, int i, View view) {
        m24605b(imageView, new afu(imageView, this.f16321a, i, view));
    }

    /* renamed from: a */
    public void m24625a(@NonNull ImageView imageView, @NonNull Drawable drawable, @NonNull Drawable drawable2, Drawable drawable3, View view, boolean z) {
        m24605b(imageView, new agb(imageView, this.f16321a, drawable, drawable2, drawable3, view, z));
    }

    /* renamed from: a */
    public void m24624a(ProgressBar progressBar) {
        m24623a(progressBar, 1000L);
    }

    /* renamed from: a */
    public void m24623a(ProgressBar progressBar, long j) {
        m24605b(progressBar, new agc(progressBar, j));
    }

    /* renamed from: a */
    public void m24622a(SeekBar seekBar) {
        m24621a(seekBar, 1000L);
    }

    /* renamed from: a */
    public void m24621a(SeekBar seekBar, long j) {
        m24605b(seekBar, new agd(seekBar, j, new SeekBar.OnSeekBarChangeListener() { // from class: com.google.android.gms.cast.framework.media.a.b.1
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar2, int i, boolean z) {
                if (z) {
                    for (agj agjVar : C4295b.this.f16324d) {
                        agjVar.m17677a(i);
                    }
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar2) {
                for (agj agjVar : C4295b.this.f16324d) {
                    agjVar.m17675a(false);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar2) {
                for (agj agjVar : C4295b.this.f16324d) {
                    agjVar.m17675a(true);
                }
            }
        }));
    }

    /* renamed from: a */
    public void m24620a(TextView textView) {
        m24605b(textView, new agi(textView, this.f16321a.getString(C3424R.C3427string.cast_invalid_stream_duration_text), null));
    }

    /* renamed from: a */
    public void m24619a(TextView textView, View view) {
        m24605b(textView, new agi(textView, this.f16321a.getString(C3424R.C3427string.cast_invalid_stream_duration_text), view));
    }

    /* renamed from: a */
    public void m24618a(TextView textView, String str) {
        m24617a(textView, Collections.singletonList(str));
    }

    /* renamed from: a */
    public void m24617a(TextView textView, List<String> list) {
        m24605b(textView, new afz(textView, list));
    }

    /* renamed from: a */
    public void m24616a(TextView textView, boolean z) {
        m24615a(textView, z, 1000L);
    }

    /* renamed from: a */
    public void m24615a(TextView textView, boolean z, long j) {
        agj agjVar = new agj(textView, j, this.f16321a.getString(C3424R.C3427string.cast_invalid_stream_position_text));
        if (z) {
            this.f16324d.add(agjVar);
        }
        m24605b(textView, agjVar);
    }

    @Override // com.google.android.gms.cast.framework.AbstractC4283l
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo24447a(C4253d c4253d) {
    }

    @Override // com.google.android.gms.cast.framework.AbstractC4283l
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo24446a(C4253d c4253d, int i) {
        m24589i();
    }

    @Override // com.google.android.gms.cast.framework.AbstractC4283l
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo24445a(C4253d c4253d, String str) {
        m24595c(c4253d);
    }

    @Override // com.google.android.gms.cast.framework.AbstractC4283l
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo24444a(C4253d c4253d, boolean z) {
        m24595c(c4253d);
    }

    /* renamed from: a */
    public void m24609a(C4298c.AbstractC4322a abstractC4322a) {
        this.f16325e = abstractC4322a;
    }

    @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4322a
    /* renamed from: b */
    public void mo17744b() {
        m24588j();
        if (this.f16325e != null) {
            this.f16325e.mo17744b();
        }
    }

    /* renamed from: b */
    public void m24608b(View view) {
        m24605b(view, new afv(view, this.f16321a));
    }

    /* renamed from: b */
    public void m24607b(View view, int i) {
        m24605b(view, new agg(view, i));
    }

    /* renamed from: b */
    public void m24606b(View view, long j) {
        m24630a(view, -j);
    }

    /* renamed from: b */
    public void m24604b(ImageView imageView, int i, @DrawableRes int i2) {
        m24605b(imageView, new aft(imageView, this.f16321a, i, i2));
    }

    /* renamed from: b */
    public void m24603b(TextView textView, String str) {
        m24602b(textView, Collections.singletonList(str));
    }

    /* renamed from: b */
    public void m24602b(TextView textView, List<String> list) {
        m24605b(textView, new afy(textView, list));
    }

    @Override // com.google.android.gms.cast.framework.AbstractC4283l
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void mo24440b(C4253d c4253d) {
    }

    @Override // com.google.android.gms.cast.framework.AbstractC4283l
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void mo24439b(C4253d c4253d, int i) {
        m24589i();
    }

    @Override // com.google.android.gms.cast.framework.AbstractC4283l
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void mo24438b(C4253d c4253d, String str) {
    }

    @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4322a
    /* renamed from: c */
    public void mo17741c() {
        m24588j();
        if (this.f16325e != null) {
            this.f16325e.mo17741c();
        }
    }

    /* renamed from: c */
    public void m24598c(View view) {
        m24605b(view, new afs(view, this.f16321a));
    }

    /* renamed from: c */
    public void m24597c(View view, int i) {
        m24605b(view, new agl(view, i));
    }

    @Override // com.google.android.gms.cast.framework.AbstractC4283l
    /* renamed from: c  reason: avoid collision after fix types in other method */
    public void mo24436c(C4253d c4253d, int i) {
        m24589i();
    }

    @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4322a
    /* renamed from: d */
    public void mo17739d() {
        m24588j();
        if (this.f16325e != null) {
            this.f16325e.mo17739d();
        }
    }

    /* renamed from: d */
    public void m24594d(View view, int i) {
        m24605b(view, new agk(view, i));
    }

    @Override // com.google.android.gms.cast.framework.AbstractC4283l
    /* renamed from: d  reason: avoid collision after fix types in other method */
    public void mo24434d(C4253d c4253d, int i) {
    }

    @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4322a
    /* renamed from: e */
    public void mo17737e() {
        for (AbstractC4294a abstractC4294a : this.f16323c.values()) {
            abstractC4294a.mo17680d();
        }
        if (this.f16325e != null) {
            this.f16325e.mo17737e();
        }
    }

    /* renamed from: f */
    public boolean m24592f() {
        return this.f16326f != null;
    }

    /* renamed from: g */
    public C4298c m24591g() {
        return this.f16326f;
    }

    /* renamed from: h */
    public void m24590h() {
        m24589i();
        this.f16323c.clear();
        this.f16322b.m24712b(this, C4253d.class);
        this.f16325e = null;
    }
}

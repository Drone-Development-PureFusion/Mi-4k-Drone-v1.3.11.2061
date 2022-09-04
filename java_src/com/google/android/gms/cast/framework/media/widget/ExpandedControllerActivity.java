package com.google.android.gms.cast.framework.media.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p004v7.app.ActionBar;
import android.support.p004v7.app.AppCompatActivity;
import android.support.p004v7.appcompat.C0176R;
import android.support.p004v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.gms.C3424R;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.AbstractC4283l;
import com.google.android.gms.cast.framework.C4251c;
import com.google.android.gms.cast.framework.C4253d;
import com.google.android.gms.cast.framework.C4282k;
import com.google.android.gms.cast.framework.media.C4298c;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.framework.media.p234a.C4295b;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.C4696s;
import com.google.android.gms.internal.afr;
import com.google.android.gms.internal.afw;
/* loaded from: classes2.dex */
public abstract class ExpandedControllerActivity extends AppCompatActivity implements AbstractC4348a {

    /* renamed from: c */
    private int f16443c;

    /* renamed from: d */
    private TextView f16444d;

    /* renamed from: e */
    private SeekBar f16445e;

    /* renamed from: f */
    private afr f16446f;

    /* renamed from: g */
    private int[] f16447g;

    /* renamed from: i */
    private View f16449i;

    /* renamed from: j */
    private C4295b f16450j;

    /* renamed from: k */
    private C4282k f16451k;

    /* renamed from: a */
    private final AbstractC4283l<C4253d> f16441a = new C4347b();

    /* renamed from: b */
    private final C4298c.AbstractC4322a f16442b = new C4346a();

    /* renamed from: h */
    private ImageView[] f16448h = new ImageView[4];

    /* renamed from: com.google.android.gms.cast.framework.media.widget.ExpandedControllerActivity$a */
    /* loaded from: classes2.dex */
    private class C4346a implements C4298c.AbstractC4322a {
        private C4346a() {
        }

        @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4322a
        /* renamed from: a */
        public void mo17753a() {
            C4298c m24455i = ExpandedControllerActivity.this.m24455i();
            if (m24455i == null || !m24455i.m24515t()) {
                ExpandedControllerActivity.this.finish();
                return;
            }
            ExpandedControllerActivity.this.m24453k();
            ExpandedControllerActivity.this.m24452l();
        }

        @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4322a
        /* renamed from: b */
        public void mo17744b() {
            ExpandedControllerActivity.this.m24454j();
        }

        @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4322a
        /* renamed from: c */
        public void mo17741c() {
        }

        @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4322a
        /* renamed from: d */
        public void mo17739d() {
        }

        @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4322a
        /* renamed from: e */
        public void mo17737e() {
            ExpandedControllerActivity.this.f16444d.setText(ExpandedControllerActivity.this.getResources().getString(C3424R.C3427string.cast_expanded_controller_loading));
        }
    }

    /* renamed from: com.google.android.gms.cast.framework.media.widget.ExpandedControllerActivity$b */
    /* loaded from: classes2.dex */
    private class C4347b implements AbstractC4283l<C4253d> {
        private C4347b() {
        }

        @Override // com.google.android.gms.cast.framework.AbstractC4283l
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo24447a(C4253d c4253d) {
        }

        @Override // com.google.android.gms.cast.framework.AbstractC4283l
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo24439b(C4253d c4253d, int i) {
            ExpandedControllerActivity.this.finish();
        }

        @Override // com.google.android.gms.cast.framework.AbstractC4283l
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo24445a(C4253d c4253d, String str) {
        }

        @Override // com.google.android.gms.cast.framework.AbstractC4283l
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo24444a(C4253d c4253d, boolean z) {
        }

        @Override // com.google.android.gms.cast.framework.AbstractC4283l
        /* renamed from: b  reason: avoid collision after fix types in other method */
        public void mo24440b(C4253d c4253d) {
        }

        @Override // com.google.android.gms.cast.framework.AbstractC4283l
        /* renamed from: b  reason: avoid collision after fix types in other method */
        public void mo24446a(C4253d c4253d, int i) {
        }

        @Override // com.google.android.gms.cast.framework.AbstractC4283l
        /* renamed from: b  reason: avoid collision after fix types in other method */
        public void mo24438b(C4253d c4253d, String str) {
        }

        @Override // com.google.android.gms.cast.framework.AbstractC4283l
        /* renamed from: c  reason: avoid collision after fix types in other method */
        public void mo24436c(C4253d c4253d, int i) {
        }

        @Override // com.google.android.gms.cast.framework.AbstractC4283l
        /* renamed from: d  reason: avoid collision after fix types in other method */
        public void mo24434d(C4253d c4253d, int i) {
        }
    }

    /* renamed from: a */
    private afr m24473a(RelativeLayout relativeLayout) {
        afr afrVar = new afr(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(0, C3424R.C3426id.end_text);
        layoutParams.addRule(1, C3424R.C3426id.start_text);
        layoutParams.addRule(6, C3424R.C3426id.seek_bar);
        layoutParams.addRule(7, C3424R.C3426id.seek_bar);
        layoutParams.addRule(5, C3424R.C3426id.seek_bar);
        layoutParams.addRule(8, C3424R.C3426id.seek_bar);
        afrVar.setLayoutParams(layoutParams);
        afrVar.setPadding(this.f16445e.getPaddingLeft(), this.f16445e.getPaddingTop(), this.f16445e.getPaddingRight(), this.f16445e.getPaddingBottom());
        afrVar.setContentDescription(getResources().getString(C3424R.C3427string.cast_seek_bar));
        afrVar.setBackgroundColor(0);
        relativeLayout.addView(afrVar);
        return afrVar;
    }

    /* renamed from: a */
    private void m24477a(Toolbar toolbar) {
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeAsUpIndicator(C3424R.C3425drawable.quantum_ic_keyboard_arrow_down_white_36);
        }
    }

    /* renamed from: a */
    private void m24476a(View view, int i, int i2, C4295b c4295b) {
        ImageView imageView = (ImageView) view.findViewById(i);
        if (i2 == C3424R.C3426id.cast_button_type_empty) {
            imageView.setVisibility(4);
        } else if (i2 == C3424R.C3426id.cast_button_type_custom) {
        } else {
            if (i2 == C3424R.C3426id.cast_button_type_play_pause_toggle) {
                m24474a(imageView, c4295b);
            } else if (i2 == C3424R.C3426id.cast_button_type_skip_previous) {
                m24471b(imageView, c4295b);
            } else if (i2 == C3424R.C3426id.cast_button_type_skip_next) {
                m24468c(imageView, c4295b);
            } else if (i2 == C3424R.C3426id.cast_button_type_rewind_30_seconds) {
                m24465d(imageView, c4295b);
            } else if (i2 == C3424R.C3426id.cast_button_type_forward_30_seconds) {
                m24462e(imageView, c4295b);
            } else if (i2 == C3424R.C3426id.cast_button_type_mute_toggle) {
                m24459f(imageView, c4295b);
            } else if (i2 != C3424R.C3426id.cast_button_type_closed_caption) {
            } else {
                m24457g(imageView, c4295b);
            }
        }
    }

    /* renamed from: a */
    private void m24475a(View view, C4295b c4295b) {
        c4295b.m24626a((ImageView) view.findViewById(C3424R.C3426id.background_image_view), -1, view.findViewById(C3424R.C3426id.background_place_holder_image_view));
        this.f16444d = (TextView) view.findViewById(C3424R.C3426id.status_text);
        c4295b.m24632a((ProgressBar) view.findViewById(C3424R.C3426id.loading_indicator));
        this.f16445e = (SeekBar) view.findViewById(C3424R.C3426id.seek_bar);
        m24458g();
        SeekBar seekBar = (SeekBar) view.findViewById(C3424R.C3426id.live_stream_seek_bar);
        c4295b.m24616a((TextView) view.findViewById(C3424R.C3426id.start_text), true);
        c4295b.m24619a((TextView) view.findViewById(C3424R.C3426id.end_text), (ImageView) view.findViewById(C3424R.C3426id.live_stream_indicator));
        c4295b.m24622a(this.f16445e);
        c4295b.m24629a(seekBar, new afw(seekBar, this.f16445e));
        this.f16448h[0] = (ImageView) view.findViewById(C3424R.C3426id.button_0);
        this.f16448h[1] = (ImageView) view.findViewById(C3424R.C3426id.button_1);
        this.f16448h[2] = (ImageView) view.findViewById(C3424R.C3426id.button_2);
        this.f16448h[3] = (ImageView) view.findViewById(C3424R.C3426id.button_3);
        m24476a(view, C3424R.C3426id.button_0, this.f16447g[0], c4295b);
        m24476a(view, C3424R.C3426id.button_1, this.f16447g[1], c4295b);
        m24476a(view, C3424R.C3426id.button_play_pause_toggle, C3424R.C3426id.cast_button_type_play_pause_toggle, c4295b);
        m24476a(view, C3424R.C3426id.button_2, this.f16447g[2], c4295b);
        m24476a(view, C3424R.C3426id.button_3, this.f16447g[3], c4295b);
        this.f16449i = findViewById(C3424R.C3426id.ad_container);
        this.f16446f = m24473a((RelativeLayout) view.findViewById(C3424R.C3426id.seek_bar_controls));
    }

    /* renamed from: a */
    private void m24474a(ImageView imageView, C4295b c4295b) {
        imageView.setBackgroundResource(this.f16443c);
        Drawable drawable = getResources().getDrawable(C3424R.C3425drawable.cast_ic_expanded_controller_pause);
        Drawable drawable2 = getResources().getDrawable(C3424R.C3425drawable.cast_ic_expanded_controller_play);
        Drawable drawable3 = getResources().getDrawable(C3424R.C3425drawable.cast_ic_expanded_controller_stop);
        imageView.setImageDrawable(drawable2);
        c4295b.m24625a(imageView, drawable2, drawable, drawable3, null, false);
    }

    /* renamed from: b */
    private void m24471b(ImageView imageView, C4295b c4295b) {
        imageView.setBackgroundResource(this.f16443c);
        imageView.setImageDrawable(getResources().getDrawable(C3424R.C3425drawable.cast_ic_expanded_controller_skip_previous));
        imageView.setContentDescription(getResources().getString(C3424R.C3427string.cast_skip_prev));
        c4295b.m24607b((View) imageView, 0);
    }

    /* renamed from: c */
    private void m24468c(ImageView imageView, C4295b c4295b) {
        imageView.setBackgroundResource(this.f16443c);
        imageView.setImageDrawable(getResources().getDrawable(C3424R.C3425drawable.cast_ic_expanded_controller_skip_next));
        imageView.setContentDescription(getResources().getString(C3424R.C3427string.cast_skip_next));
        c4295b.m24631a((View) imageView, 0);
    }

    /* renamed from: d */
    private void m24465d(ImageView imageView, C4295b c4295b) {
        imageView.setBackgroundResource(this.f16443c);
        imageView.setImageDrawable(getResources().getDrawable(C3424R.C3425drawable.cast_ic_expanded_controller_rewind30));
        imageView.setContentDescription(getResources().getString(C3424R.C3427string.cast_rewind_30));
        c4295b.m24606b(imageView, NotificationOptions.f16268b);
    }

    /* renamed from: e */
    private int m24463e() {
        TypedArray obtainStyledAttributes = obtainStyledAttributes(new int[]{C0176R.attr.selectableItemBackgroundBorderless});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: e */
    private void m24462e(ImageView imageView, C4295b c4295b) {
        imageView.setBackgroundResource(this.f16443c);
        imageView.setImageDrawable(getResources().getDrawable(C3424R.C3425drawable.cast_ic_expanded_controller_forward30));
        imageView.setContentDescription(getResources().getString(C3424R.C3427string.cast_forward_30));
        c4295b.m24630a(imageView, NotificationOptions.f16268b);
    }

    /* renamed from: f */
    private void m24459f(ImageView imageView, C4295b c4295b) {
        imageView.setBackgroundResource(this.f16443c);
        imageView.setImageDrawable(getResources().getDrawable(C3424R.C3425drawable.cast_ic_expanded_controller_mute));
        c4295b.m24628a(imageView);
    }

    /* renamed from: f */
    private int[] m24460f() {
        boolean z = true;
        TypedArray obtainStyledAttributes = obtainStyledAttributes(null, C3424R.styleable.CastExpandedController, C3424R.attr.castExpandedControllerStyle, C3424R.style.CastExpandedController);
        int resourceId = obtainStyledAttributes.getResourceId(C3424R.styleable.CastExpandedController_castControlButtons, 0);
        if (resourceId == 0) {
            obtainStyledAttributes.recycle();
            return new int[]{C3424R.C3426id.cast_button_type_empty, C3424R.C3426id.cast_button_type_empty, C3424R.C3426id.cast_button_type_empty, C3424R.C3426id.cast_button_type_empty};
        }
        TypedArray obtainTypedArray = getResources().obtainTypedArray(resourceId);
        if (obtainTypedArray.length() != 4) {
            z = false;
        }
        C4588d.m23619b(z);
        int[] iArr = new int[obtainTypedArray.length()];
        for (int i = 0; i < obtainTypedArray.length(); i++) {
            iArr[i] = obtainTypedArray.getResourceId(i, 0);
        }
        obtainTypedArray.recycle();
        return iArr;
    }

    @TargetApi(21)
    /* renamed from: g */
    private void m24458g() {
        if (C4696s.m23103k()) {
            this.f16445e.setProgressBackgroundTintMode(PorterDuff.Mode.MULTIPLY);
            this.f16445e.setProgressBackgroundTintList(ColorStateList.valueOf(getResources().getColor(C3424R.color.cast_expanded_controller_seek_bar_progress_background_tint_color)));
            this.f16445e.setSplitTrack(false);
        }
    }

    /* renamed from: g */
    private void m24457g(ImageView imageView, C4295b c4295b) {
        imageView.setBackgroundResource(this.f16443c);
        imageView.setImageDrawable(getResources().getDrawable(C3424R.C3425drawable.cast_ic_expanded_controller_closed_caption));
        c4295b.m24598c(imageView);
    }

    @TargetApi(19)
    /* renamed from: h */
    private void m24456h() {
        if (!C4696s.m23114a()) {
            return;
        }
        int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility();
        if (C4696s.m23110d()) {
            systemUiVisibility ^= 2;
        }
        if (C4696s.m23109e()) {
            systemUiVisibility ^= 4;
        }
        if (C4696s.m23106h()) {
            systemUiVisibility ^= 4096;
        }
        getWindow().getDecorView().setSystemUiVisibility(systemUiVisibility);
        if (!C4696s.m23107g()) {
            return;
        }
        setImmersive(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public C4298c m24455i() {
        C4253d m24715b = this.f16451k.m24715b();
        if (m24715b == null || !m24715b.o()) {
            return null;
        }
        return m24715b.m24853a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m24454j() {
        MediaInfo m24527h;
        MediaMetadata m25139e;
        ActionBar supportActionBar;
        C4298c m24455i = m24455i();
        if (m24455i == null || !m24455i.m24515t() || (m24527h = m24455i.m24527h()) == null || (m25139e = m24527h.m25139e()) == null || (supportActionBar = getSupportActionBar()) == null) {
            return;
        }
        supportActionBar.setTitle(m25139e.m25112b(MediaMetadata.f15884k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m24453k() {
        CastDevice m24843b;
        C4253d m24715b = this.f16451k.m24715b();
        if (m24715b != null && (m24843b = m24715b.m24843b()) != null) {
            String m25240e = m24843b.m25240e();
            if (!TextUtils.isEmpty(m25240e)) {
                this.f16444d.setText(getResources().getString(C3424R.C3427string.cast_casting_to_device, m25240e));
                return;
            }
        }
        this.f16444d.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m24452l() {
        MediaInfo mediaInfo = null;
        C4298c m24455i = m24455i();
        MediaStatus m24529g = m24455i == null ? null : m24455i.m24529g();
        if (m24529g != null && m24529g.m25039r()) {
            this.f16445e.setEnabled(false);
            this.f16449i.setVisibility(0);
        } else {
            this.f16445e.setEnabled(true);
            this.f16449i.setVisibility(8);
        }
        if (m24455i != null) {
            mediaInfo = m24455i.m24527h();
        }
        if (mediaInfo != null) {
            this.f16446f.m17724a(this.f16445e.getMax());
            this.f16446f.m17722a(mediaInfo.m25134j(), -1);
        }
    }

    @Override // com.google.android.gms.cast.framework.media.widget.AbstractC4348a
    /* renamed from: a */
    public final int mo24428a() {
        return 4;
    }

    @Override // com.google.android.gms.cast.framework.media.widget.AbstractC4348a
    /* renamed from: a */
    public final int mo24427a(int i) {
        return this.f16447g[i];
    }

    @Override // com.google.android.gms.cast.framework.media.widget.AbstractC4348a
    /* renamed from: b */
    public final ImageView mo24425b(int i) {
        return this.f16448h[i];
    }

    @Override // com.google.android.gms.cast.framework.media.widget.AbstractC4348a
    /* renamed from: b */
    public C4295b mo24426b() {
        return this.f16450j;
    }

    /* renamed from: c */
    public TextView m24469c() {
        return this.f16444d;
    }

    /* renamed from: d */
    public SeekBar m24466d() {
        return this.f16445e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p004v7.app.AppCompatActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C4251c.m24868a((Context) this).m24867a(this, bundle);
        this.f16451k = C4251c.m24868a((Context) this).m24862b();
        if (this.f16451k.m24715b() == null) {
            finish();
        }
        this.f16450j = new C4295b(this);
        this.f16450j.m24609a(this.f16442b);
        setContentView(C3424R.layout.cast_expanded_controller_activity);
        this.f16443c = m24463e();
        this.f16447g = m24460f();
        m24475a(findViewById(C3424R.C3426id.expanded_controller_layout), this.f16450j);
        m24477a((Toolbar) findViewById(C3424R.C3426id.toolbar));
        m24453k();
        m24454j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p004v7.app.AppCompatActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (this.f16450j != null) {
            this.f16450j.m24609a((C4298c.AbstractC4322a) null);
            this.f16450j.m24590h();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        C4251c.m24868a((Context) this).m24862b().m24712b(this.f16441a, C4253d.class);
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        C4251c.m24868a((Context) this).m24862b().m24717a(this.f16441a, C4253d.class);
        C4253d m24715b = C4251c.m24868a((Context) this).m24862b().m24715b();
        if (m24715b == null || (!m24715b.o() && !m24715b.p())) {
            finish();
        }
        super.onResume();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            m24456h();
        }
    }
}

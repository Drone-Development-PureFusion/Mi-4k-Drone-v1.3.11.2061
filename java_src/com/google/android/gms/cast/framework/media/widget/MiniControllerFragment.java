package com.google.android.gms.cast.framework.media.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.p001v4.app.Fragment;
import android.support.p001v4.graphics.drawable.DrawableCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.C3424R;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.framework.media.p234a.C4295b;
import com.google.android.gms.cast.internal.C4440m;
import com.google.android.gms.common.internal.C4588d;
/* loaded from: classes2.dex */
public class MiniControllerFragment extends Fragment implements AbstractC4348a {

    /* renamed from: a */
    private static final C4440m f16454a = new C4440m("MiniControllerFragment");

    /* renamed from: b */
    private boolean f16455b;

    /* renamed from: c */
    private int f16456c;

    /* renamed from: d */
    private int f16457d;

    /* renamed from: e */
    private int[] f16458e;

    /* renamed from: f */
    private ImageView[] f16459f = new ImageView[3];

    /* renamed from: g */
    private int f16460g;

    /* renamed from: h */
    private C4295b f16461h;

    /* renamed from: a */
    private void m24433a(Context context, AttributeSet attributeSet) {
        boolean z = true;
        if (this.f16458e != null) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3424R.styleable.CastMiniController, C3424R.attr.castMiniControllerStyle, C3424R.style.CastMiniController);
        this.f16455b = obtainStyledAttributes.getBoolean(C3424R.styleable.CastMiniController_castShowImageThumbnail, true);
        this.f16456c = obtainStyledAttributes.getResourceId(C3424R.styleable.CastMiniController_castTitleTextAppearance, 0);
        this.f16457d = obtainStyledAttributes.getResourceId(C3424R.styleable.CastMiniController_castSubtitleTextAppearance, 0);
        int resourceId = obtainStyledAttributes.getResourceId(C3424R.styleable.CastMiniController_castControlButtons, 0);
        if (resourceId != 0) {
            TypedArray obtainTypedArray = context.getResources().obtainTypedArray(resourceId);
            if (obtainTypedArray.length() != 3) {
                z = false;
            }
            C4588d.m23619b(z);
            this.f16458e = new int[obtainTypedArray.length()];
            for (int i = 0; i < obtainTypedArray.length(); i++) {
                this.f16458e[i] = obtainTypedArray.getResourceId(i, 0);
            }
            obtainTypedArray.recycle();
            if (this.f16455b) {
                this.f16458e[0] = C3424R.C3426id.cast_button_type_empty;
            }
            this.f16460g = 0;
            for (int i2 : this.f16458e) {
                if (i2 != C3424R.C3426id.cast_button_type_empty) {
                    this.f16460g++;
                }
            }
        } else {
            f16454a.m24155d("Unable to read attribute castControlButtons.", new Object[0]);
            this.f16458e = new int[]{C3424R.C3426id.cast_button_type_empty, C3424R.C3426id.cast_button_type_empty, C3424R.C3426id.cast_button_type_empty};
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m24431a(RelativeLayout relativeLayout, int i, int i2) {
        int i3;
        int i4;
        ImageView imageView = (ImageView) relativeLayout.findViewById(i);
        int i5 = this.f16458e[i2];
        if (i5 == C3424R.C3426id.cast_button_type_empty) {
            imageView.setVisibility(4);
        } else if (i5 == C3424R.C3426id.cast_button_type_custom) {
        } else {
            if (i5 == C3424R.C3426id.cast_button_type_play_pause_toggle) {
                int i6 = C3424R.C3425drawable.cast_ic_mini_controller_play;
                int i7 = C3424R.C3425drawable.cast_ic_mini_controller_pause;
                int i8 = C3424R.C3425drawable.cast_ic_mini_controller_stop;
                if (this.f16460g == 1) {
                    int i9 = C3424R.C3425drawable.cast_ic_mini_controller_play_large;
                    int i10 = C3424R.C3425drawable.cast_ic_mini_controller_pause_large;
                    i8 = C3424R.C3425drawable.cast_ic_mini_controller_stop_large;
                    i3 = i9;
                    i4 = i10;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                Drawable drawable = getResources().getDrawable(i3);
                Drawable drawable2 = getResources().getDrawable(i4);
                Drawable drawable3 = getResources().getDrawable(i8);
                imageView.setImageDrawable(drawable2);
                ProgressBar m24430c = m24430c(i);
                relativeLayout.addView(m24430c);
                this.f16461h.m24625a(imageView, drawable, drawable2, drawable3, m24430c, true);
            } else if (i5 == C3424R.C3426id.cast_button_type_skip_previous) {
                imageView.setImageDrawable(m24429d(C3424R.C3425drawable.cast_ic_mini_controller_skip_prev));
                imageView.setContentDescription(getResources().getString(C3424R.C3427string.cast_skip_prev));
                this.f16461h.m24607b((View) imageView, 0);
            } else if (i5 == C3424R.C3426id.cast_button_type_skip_next) {
                imageView.setImageDrawable(m24429d(C3424R.C3425drawable.cast_ic_mini_controller_skip_next));
                imageView.setContentDescription(getResources().getString(C3424R.C3427string.cast_skip_next));
                this.f16461h.m24631a((View) imageView, 0);
            } else if (i5 == C3424R.C3426id.cast_button_type_rewind_30_seconds) {
                imageView.setImageDrawable(m24429d(C3424R.C3425drawable.cast_ic_mini_controller_rewind30));
                imageView.setContentDescription(getResources().getString(C3424R.C3427string.cast_rewind_30));
                this.f16461h.m24606b(imageView, NotificationOptions.f16268b);
            } else if (i5 == C3424R.C3426id.cast_button_type_forward_30_seconds) {
                imageView.setImageDrawable(m24429d(C3424R.C3425drawable.cast_ic_mini_controller_forward30));
                imageView.setContentDescription(getResources().getString(C3424R.C3427string.cast_forward_30));
                this.f16461h.m24630a(imageView, NotificationOptions.f16268b);
            } else if (i5 == C3424R.C3426id.cast_button_type_mute_toggle) {
                imageView.setImageDrawable(getResources().getDrawable(C3424R.C3425drawable.cast_ic_mini_controller_mute));
                this.f16461h.m24628a(imageView);
            } else if (i5 != C3424R.C3426id.cast_button_type_closed_caption) {
            } else {
                imageView.setImageDrawable(m24429d(C3424R.C3425drawable.cast_ic_mini_controller_closed_caption));
                this.f16461h.m24598c(imageView);
            }
        }
    }

    /* renamed from: c */
    private ProgressBar m24430c(int i) {
        ProgressBar progressBar = new ProgressBar(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(8, i);
        layoutParams.addRule(6, i);
        layoutParams.addRule(5, i);
        layoutParams.addRule(7, i);
        layoutParams.addRule(15);
        progressBar.setLayoutParams(layoutParams);
        progressBar.setVisibility(8);
        return progressBar;
    }

    /* renamed from: d */
    private Drawable m24429d(@DrawableRes int i) {
        Drawable drawable = getResources().getDrawable(i);
        Drawable wrap = DrawableCompat.wrap(getResources().getDrawable(i).mutate());
        DrawableCompat.setTintMode(wrap, PorterDuff.Mode.MULTIPLY);
        DrawableCompat.setTint(wrap, getResources().getColor(C3424R.color.cast_mini_controller_disabled_button_drawable_tint_color));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842910}, drawable);
        stateListDrawable.addState(new int[]{-16842910}, wrap);
        return stateListDrawable;
    }

    @Override // com.google.android.gms.cast.framework.media.widget.AbstractC4348a
    /* renamed from: a */
    public final int mo24428a() {
        return 3;
    }

    @Override // com.google.android.gms.cast.framework.media.widget.AbstractC4348a
    /* renamed from: a */
    public final int mo24427a(int i) {
        return this.f16458e[i];
    }

    /* renamed from: a */
    public void m24432a(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        m24433a(context, attributeSet);
    }

    @Override // com.google.android.gms.cast.framework.media.widget.AbstractC4348a
    /* renamed from: b */
    public final ImageView mo24425b(int i) {
        return this.f16459f[i];
    }

    @Override // com.google.android.gms.cast.framework.media.widget.AbstractC4348a
    /* renamed from: b */
    public C4295b mo24426b() {
        return this.f16461h;
    }

    @Override // android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f16461h = new C4295b(getActivity());
        View inflate = layoutInflater.inflate(C3424R.layout.cast_mini_controller, viewGroup);
        inflate.setVisibility(8);
        this.f16461h.m24597c(inflate, 8);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C3424R.C3426id.container_current);
        ImageView imageView = (ImageView) inflate.findViewById(C3424R.C3426id.icon_view);
        TextView textView = (TextView) inflate.findViewById(C3424R.C3426id.title_view);
        if (this.f16456c != 0) {
            textView.setTextAppearance(getActivity(), this.f16456c);
        }
        TextView textView2 = (TextView) inflate.findViewById(C3424R.C3426id.subtitle_view);
        if (this.f16457d != 0) {
            textView2.setTextAppearance(getActivity(), this.f16457d);
        }
        this.f16461h.m24597c(relativeLayout, 8);
        this.f16461h.m24618a(textView, MediaMetadata.f15884k);
        this.f16461h.m24618a(textView2, MediaMetadata.f15885l);
        this.f16461h.m24624a((ProgressBar) inflate.findViewById(C3424R.C3426id.progressBar));
        this.f16461h.m24608b(relativeLayout);
        if (this.f16455b) {
            this.f16461h.m24627a(imageView, -1, C3424R.C3425drawable.cast_album_art_placeholder);
        } else {
            imageView.setVisibility(8);
        }
        this.f16459f[0] = (ImageView) relativeLayout.findViewById(C3424R.C3426id.button_0);
        this.f16459f[1] = (ImageView) relativeLayout.findViewById(C3424R.C3426id.button_1);
        this.f16459f[2] = (ImageView) relativeLayout.findViewById(C3424R.C3426id.button_2);
        m24431a(relativeLayout, C3424R.C3426id.button_0, 0);
        m24431a(relativeLayout, C3424R.C3426id.button_1, 1);
        m24431a(relativeLayout, C3424R.C3426id.button_2, 2);
        return inflate;
    }

    @Override // android.support.p001v4.app.Fragment
    public void onDestroy() {
        if (this.f16461h != null) {
            this.f16461h.m24590h();
            this.f16461h = null;
        }
        super.onDestroy();
    }
}

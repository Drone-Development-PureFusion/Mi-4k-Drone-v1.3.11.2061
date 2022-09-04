package com.google.android.gms.cast.framework;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.preference.PreferenceManager;
import android.support.annotation.ColorRes;
import android.support.annotation.DimenRes;
import android.support.annotation.StringRes;
import android.support.p004v7.app.MediaRouteButton;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.C4696s;
import com.google.android.gms.internal.afj;
import com.google.android.gms.internal.afk;
/* renamed from: com.google.android.gms.cast.framework.h */
/* loaded from: classes2.dex */
public interface AbstractC4262h {

    /* renamed from: com.google.android.gms.cast.framework.h$a */
    /* loaded from: classes2.dex */
    public static class C4263a {

        /* renamed from: a */
        private Activity f16172a;

        /* renamed from: b */
        private View f16173b;

        /* renamed from: c */
        private int f16174c;

        /* renamed from: d */
        private String f16175d;

        /* renamed from: e */
        private AbstractC4264b f16176e;

        /* renamed from: f */
        private boolean f16177f;

        /* renamed from: g */
        private float f16178g;

        /* renamed from: h */
        private String f16179h;

        public C4263a(Activity activity, MediaRouteButton mediaRouteButton) {
            this.f16172a = (Activity) C4588d.m23627a(activity);
            this.f16173b = (View) C4588d.m23627a(mediaRouteButton);
        }

        @TargetApi(11)
        public C4263a(Activity activity, MenuItem menuItem) {
            this.f16172a = (Activity) C4588d.m23627a(activity);
            if (C4696s.m23114a()) {
                this.f16173b = ((MenuItem) C4588d.m23627a(menuItem)).getActionView();
            }
        }

        /* renamed from: a */
        public C4263a m24816a() {
            this.f16177f = true;
            return this;
        }

        /* renamed from: a */
        public C4263a m24815a(float f) {
            this.f16178g = f;
            return this;
        }

        /* renamed from: a */
        public C4263a m24814a(@ColorRes int i) {
            this.f16174c = this.f16172a.getResources().getColor(i);
            return this;
        }

        /* renamed from: a */
        public C4263a m24813a(AbstractC4264b abstractC4264b) {
            this.f16176e = abstractC4264b;
            return this;
        }

        /* renamed from: a */
        public C4263a m24812a(String str) {
            this.f16175d = str;
            return this;
        }

        /* renamed from: b */
        public Activity m24811b() {
            return this.f16172a;
        }

        /* renamed from: b */
        public C4263a m24810b(@StringRes int i) {
            this.f16175d = this.f16172a.getResources().getString(i);
            return this;
        }

        /* renamed from: b */
        public C4263a m24809b(String str) {
            this.f16179h = str;
            return this;
        }

        /* renamed from: c */
        public View m24808c() {
            return this.f16173b;
        }

        /* renamed from: c */
        public C4263a m24807c(@DimenRes int i) {
            this.f16178g = this.f16172a.getResources().getDimension(i);
            return this;
        }

        /* renamed from: d */
        public C4263a m24805d(@StringRes int i) {
            this.f16179h = this.f16172a.getResources().getString(i);
            return this;
        }

        /* renamed from: d */
        public AbstractC4264b m24806d() {
            return this.f16176e;
        }

        /* renamed from: e */
        public int m24804e() {
            return this.f16174c;
        }

        /* renamed from: f */
        public boolean m24803f() {
            return this.f16177f;
        }

        /* renamed from: g */
        public String m24802g() {
            return this.f16175d;
        }

        /* renamed from: h */
        public String m24801h() {
            return this.f16179h;
        }

        /* renamed from: i */
        public float m24800i() {
            return this.f16178g;
        }

        /* renamed from: j */
        public AbstractC4262h m24799j() {
            return C4696s.m23109e() ? new afj(this) : new afk(this);
        }
    }

    /* renamed from: com.google.android.gms.cast.framework.h$b */
    /* loaded from: classes2.dex */
    public interface AbstractC4264b {
        /* renamed from: a */
        void m24798a();
    }

    /* renamed from: com.google.android.gms.cast.framework.h$c */
    /* loaded from: classes2.dex */
    public static class C4265c {
        /* renamed from: a */
        public static void m24797a(Context context) {
            PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("googlecast-introOverlayShown", true).apply();
        }

        /* renamed from: b */
        public static boolean m24796b(Context context) {
            return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("googlecast-introOverlayShown", false);
        }
    }

    /* renamed from: a */
    void mo17779a();

    /* renamed from: b */
    void mo17776b();
}

package com.fimi.kernel.view.dialog;

import android.animation.Animator;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.fimi.kernel.utils.C1682w;
/* loaded from: classes.dex */
public class SampleDialogFragment extends DialogFragment {

    /* renamed from: a */
    protected C1682w f4226a;

    /* renamed from: b */
    private int f4227b;

    /* renamed from: c */
    private int f4228c;

    /* renamed from: d */
    private View f4229d;

    /* renamed from: e */
    private DialogInterface.OnCancelListener f4230e = null;

    /* renamed from: f */
    private DialogInterface.OnDismissListener f4231f = null;

    /* renamed from: g */
    private int f4232g;

    /* renamed from: h */
    private int f4233h;

    /* renamed from: a */
    public static SampleDialogFragment m34415a(int i, int i2) {
        return m34414a(i, i2, 17);
    }

    /* renamed from: a */
    public static SampleDialogFragment m34414a(int i, int i2, int i3) {
        SampleDialogFragment sampleDialogFragment = new SampleDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("style", i);
        bundle.putInt("theme", i2);
        bundle.putInt("gravity", i3);
        sampleDialogFragment.setArguments(bundle);
        return sampleDialogFragment;
    }

    /* renamed from: a */
    public static SampleDialogFragment m34413a(int i, int i2, int i3, int i4) {
        SampleDialogFragment sampleDialogFragment = new SampleDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("style", i);
        bundle.putInt("theme", i2);
        bundle.putInt("gravity", i3);
        bundle.putInt("color", i4);
        sampleDialogFragment.setArguments(bundle);
        return sampleDialogFragment;
    }

    /* renamed from: a */
    public View m34417a() {
        return this.f4229d;
    }

    /* renamed from: a */
    public void m34416a(int i) {
        this.f4226a.m34477c(i);
    }

    /* renamed from: a */
    public void m34412a(DialogInterface.OnCancelListener onCancelListener) {
        this.f4230e = onCancelListener;
    }

    /* renamed from: a */
    public void m34411a(DialogInterface.OnDismissListener onDismissListener) {
        this.f4231f = onDismissListener;
    }

    /* renamed from: a */
    public void m34410a(View view) {
        this.f4229d = view;
    }

    /* renamed from: a */
    protected void m34409a(boolean z) {
        Window window = getActivity().getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (z) {
            attributes.flags |= 67108864;
        } else {
            attributes.flags &= -67108865;
        }
        window.setAttributes(attributes);
    }

    /* renamed from: b */
    public DialogInterface.OnCancelListener m34408b() {
        return this.f4230e;
    }

    /* renamed from: c */
    public DialogInterface.OnDismissListener m34407c() {
        return this.f4231f;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Window window = getDialog().getWindow();
        window.getAttributes().gravity = this.f4232g;
        window.setLayout(-1, -2);
        window.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#88838B8B")));
        super.onActivityCreated(bundle);
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        if (this.f4230e != null) {
            this.f4230e.onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        dismiss();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4228c = getArguments().getInt("style");
        this.f4227b = getArguments().getInt("theme");
        this.f4232g = getArguments().getInt("gravity");
        this.f4233h = getArguments().getInt("color");
        setStyle(this.f4228c, this.f4227b);
        this.f4226a = new C1682w(getActivity());
        if (Build.VERSION.SDK_INT >= 19) {
            m34409a(true);
        }
        this.f4226a.m34487a(true);
        m34416a(this.f4233h);
    }

    @Override // android.app.Fragment
    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return super.onCreateAnimator(i, z, i2);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f4229d;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        dismiss();
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f4231f != null) {
            this.f4231f.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }
}

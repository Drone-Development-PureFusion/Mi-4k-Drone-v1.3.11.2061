package com.google.android.gms.p232c;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.p232c.AbstractC4167d;
@SuppressLint({"NewApi"})
/* renamed from: com.google.android.gms.c.c */
/* loaded from: classes2.dex */
public final class BinderC4166c extends AbstractC4167d.AbstractBinderC4168a {

    /* renamed from: a */
    private Fragment f15768a;

    private BinderC4166c(Fragment fragment) {
        this.f15768a = fragment;
    }

    /* renamed from: a */
    public static BinderC4166c m25297a(Fragment fragment) {
        if (fragment != null) {
            return new BinderC4166c(fragment);
        }
        return null;
    }

    @Override // com.google.android.gms.p232c.AbstractC4167d
    /* renamed from: a */
    public AbstractC4170e mo25290a() {
        return BinderC4173f.m25293a(this.f15768a.getActivity());
    }

    @Override // com.google.android.gms.p232c.AbstractC4167d
    /* renamed from: a */
    public void mo25289a(Intent intent) {
        this.f15768a.startActivity(intent);
    }

    @Override // com.google.android.gms.p232c.AbstractC4167d
    /* renamed from: a */
    public void mo25288a(Intent intent, int i) {
        this.f15768a.startActivityForResult(intent, i);
    }

    @Override // com.google.android.gms.p232c.AbstractC4167d
    /* renamed from: a */
    public void mo25286a(AbstractC4170e abstractC4170e) {
        this.f15768a.registerForContextMenu((View) BinderC4173f.m25294a(abstractC4170e));
    }

    @Override // com.google.android.gms.p232c.AbstractC4167d
    /* renamed from: a */
    public void mo25285a(boolean z) {
        this.f15768a.setHasOptionsMenu(z);
    }

    @Override // com.google.android.gms.p232c.AbstractC4167d
    /* renamed from: b */
    public Bundle mo25284b() {
        return this.f15768a.getArguments();
    }

    @Override // com.google.android.gms.p232c.AbstractC4167d
    /* renamed from: b */
    public void mo25283b(AbstractC4170e abstractC4170e) {
        this.f15768a.unregisterForContextMenu((View) BinderC4173f.m25294a(abstractC4170e));
    }

    @Override // com.google.android.gms.p232c.AbstractC4167d
    /* renamed from: b */
    public void mo25282b(boolean z) {
        this.f15768a.setMenuVisibility(z);
    }

    @Override // com.google.android.gms.p232c.AbstractC4167d
    /* renamed from: c */
    public int mo25281c() {
        return this.f15768a.getId();
    }

    @Override // com.google.android.gms.p232c.AbstractC4167d
    /* renamed from: c */
    public void mo25280c(boolean z) {
        this.f15768a.setRetainInstance(z);
    }

    @Override // com.google.android.gms.p232c.AbstractC4167d
    /* renamed from: d */
    public AbstractC4167d mo25279d() {
        return m25297a(this.f15768a.getParentFragment());
    }

    @Override // com.google.android.gms.p232c.AbstractC4167d
    /* renamed from: d */
    public void mo25278d(boolean z) {
        this.f15768a.setUserVisibleHint(z);
    }

    @Override // com.google.android.gms.p232c.AbstractC4167d
    /* renamed from: e */
    public AbstractC4170e mo25277e() {
        return BinderC4173f.m25293a(this.f15768a.getResources());
    }

    @Override // com.google.android.gms.p232c.AbstractC4167d
    /* renamed from: f */
    public boolean mo25276f() {
        return this.f15768a.getRetainInstance();
    }

    @Override // com.google.android.gms.p232c.AbstractC4167d
    /* renamed from: g */
    public String mo25275g() {
        return this.f15768a.getTag();
    }

    @Override // com.google.android.gms.p232c.AbstractC4167d
    /* renamed from: h */
    public AbstractC4167d mo25274h() {
        return m25297a(this.f15768a.getTargetFragment());
    }

    @Override // com.google.android.gms.p232c.AbstractC4167d
    /* renamed from: i */
    public int mo25273i() {
        return this.f15768a.getTargetRequestCode();
    }

    @Override // com.google.android.gms.p232c.AbstractC4167d
    /* renamed from: j */
    public boolean mo25272j() {
        return this.f15768a.getUserVisibleHint();
    }

    @Override // com.google.android.gms.p232c.AbstractC4167d
    /* renamed from: k */
    public AbstractC4170e mo25271k() {
        return BinderC4173f.m25293a(this.f15768a.getView());
    }

    @Override // com.google.android.gms.p232c.AbstractC4167d
    /* renamed from: l */
    public boolean mo25270l() {
        return this.f15768a.isAdded();
    }

    @Override // com.google.android.gms.p232c.AbstractC4167d
    /* renamed from: m */
    public boolean mo25269m() {
        return this.f15768a.isDetached();
    }

    @Override // com.google.android.gms.p232c.AbstractC4167d
    /* renamed from: n */
    public boolean mo25268n() {
        return this.f15768a.isHidden();
    }

    @Override // com.google.android.gms.p232c.AbstractC4167d
    /* renamed from: o */
    public boolean mo25267o() {
        return this.f15768a.isInLayout();
    }

    @Override // com.google.android.gms.p232c.AbstractC4167d
    /* renamed from: p */
    public boolean mo25266p() {
        return this.f15768a.isRemoving();
    }

    @Override // com.google.android.gms.p232c.AbstractC4167d
    /* renamed from: q */
    public boolean mo25265q() {
        return this.f15768a.isResumed();
    }

    @Override // com.google.android.gms.p232c.AbstractC4167d
    /* renamed from: r */
    public boolean mo25264r() {
        return this.f15768a.isVisible();
    }
}

package com.fimi.soul.module.setting.newhand;

import android.support.p001v4.app.Fragment;
import android.support.p001v4.app.FragmentManager;
import android.support.p001v4.app.FragmentStatePagerAdapter;
import android.support.p001v4.app.FragmentTransaction;
import android.support.p001v4.view.ViewPager;
import java.util.List;
/* loaded from: classes.dex */
public class NewHandAdapt extends FragmentStatePagerAdapter {

    /* renamed from: a */
    private List<Fragment> f10690a;

    /* renamed from: b */
    private Fragment f10691b;

    /* renamed from: c */
    private FragmentManager f10692c;

    /* renamed from: d */
    private FragmentTransaction f10693d;

    /* renamed from: e */
    private ViewPager f10694e;

    /* renamed from: f */
    private int f10695f;

    public NewHandAdapt(FragmentManager fragmentManager, List<Fragment> list, ViewPager viewPager) {
        super(fragmentManager);
        this.f10690a = list;
        this.f10694e = viewPager;
        this.f10692c = fragmentManager;
    }

    @Override // android.support.p001v4.view.PagerAdapter
    public int getCount() {
        return this.f10690a.size();
    }

    @Override // android.support.p001v4.app.FragmentStatePagerAdapter
    public Fragment getItem(int i) {
        return this.f10690a.get(i);
    }
}

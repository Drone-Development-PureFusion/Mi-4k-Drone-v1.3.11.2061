package com.fimi.soul.view.sliding;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class FmFragmentPagerAdapter extends FragmentPagerAdapter {

    /* renamed from: a */
    private ArrayList<Fragment> f13164a;

    public FmFragmentPagerAdapter(FragmentManager fragmentManager, ArrayList<Fragment> arrayList) {
        super(fragmentManager);
        this.f13164a = null;
        this.f13164a = arrayList;
    }

    @Override // android.support.p001v4.view.PagerAdapter
    public int getCount() {
        return this.f13164a.size();
    }

    @Override // android.support.v13.app.FragmentPagerAdapter
    public Fragment getItem(int i) {
        return i < this.f13164a.size() ? this.f13164a.get(i) : this.f13164a.get(0);
    }
}

package com.fimi.soul.media.gallery;

import android.support.p001v4.app.Fragment;
import android.support.p001v4.app.FragmentManager;
import android.support.p001v4.app.FragmentStatePagerAdapter;
import android.support.p001v4.view.ViewPager;
import com.fimi.soul.view.photodraweeview.AbstractC3312d;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
/* loaded from: classes.dex */
public class DroneImagePagerAdapter extends FragmentStatePagerAdapter {

    /* renamed from: a */
    Map<Integer, DroneImageDetailFragment> f7860a = new Hashtable();

    /* renamed from: b */
    private ArrayList<String> f7861b;

    /* renamed from: c */
    private ArrayList<String> f7862c;

    /* renamed from: d */
    private DroneImageDetailFragment f7863d;

    /* renamed from: e */
    private AbstractC3312d f7864e;

    /* renamed from: f */
    private ViewPager f7865f;

    public DroneImagePagerAdapter(FragmentManager fragmentManager, ArrayList<String> arrayList) {
        super(fragmentManager);
        this.f7861b = arrayList;
    }

    public DroneImagePagerAdapter(FragmentManager fragmentManager, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        super(fragmentManager);
        this.f7861b = arrayList;
        this.f7862c = arrayList2;
    }

    /* renamed from: a */
    public DroneImageDetailFragment m31686a(int i) {
        return this.f7860a.get(Integer.valueOf(i));
    }

    /* renamed from: a */
    public void m31685a(ViewPager viewPager) {
        this.f7865f = viewPager;
    }

    /* renamed from: a */
    public void m31684a(AbstractC3312d abstractC3312d) {
        this.f7864e = abstractC3312d;
    }

    /* renamed from: a */
    public void m31683a(ArrayList<String> arrayList) {
        this.f7861b = arrayList;
    }

    @Override // android.support.p001v4.view.PagerAdapter
    public int getCount() {
        if (this.f7861b == null) {
            return 0;
        }
        return this.f7861b.size();
    }

    @Override // android.support.p001v4.app.FragmentStatePagerAdapter
    public Fragment getItem(int i) {
        this.f7863d = new DroneImageDetailFragment();
        this.f7863d.m31735b(this.f7861b.get(i));
        this.f7863d.m31741a(i);
        if (this.f7864e != null) {
            this.f7863d.m31739a(this.f7864e);
        }
        if (this.f7862c != null && this.f7862c.size() > 0) {
            this.f7863d.m31733c(this.f7862c.get(i));
        }
        this.f7860a.put(Integer.valueOf(i), this.f7863d);
        return this.f7863d;
    }

    @Override // android.support.p001v4.view.PagerAdapter
    public int getItemPosition(Object obj) {
        if (obj == null || ((DroneImageDetailFragment) obj).m31742a() != this.f7865f.getCurrentItem()) {
            return super.getItemPosition(obj);
        }
        return -2;
    }
}

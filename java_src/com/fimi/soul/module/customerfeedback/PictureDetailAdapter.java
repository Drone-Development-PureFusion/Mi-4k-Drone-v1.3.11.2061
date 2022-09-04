package com.fimi.soul.module.customerfeedback;

import android.net.Uri;
import android.support.p001v4.app.Fragment;
import android.support.p001v4.app.FragmentManager;
import android.support.p001v4.app.FragmentStatePagerAdapter;
import android.util.Log;
import java.util.HashMap;
import java.util.LinkedList;
/* loaded from: classes.dex */
public class PictureDetailAdapter extends FragmentStatePagerAdapter {

    /* renamed from: a */
    private LinkedList<Object> f8334a;

    /* renamed from: b */
    private MyViewPager f8335b;

    /* renamed from: c */
    private HashMap<Integer, DetailPictureFragment> f8336c = new HashMap<>();

    public PictureDetailAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    public PictureDetailAdapter(FragmentManager fragmentManager, LinkedList<Object> linkedList, MyViewPager myViewPager) {
        super(fragmentManager);
        this.f8334a = linkedList;
        this.f8335b = myViewPager;
    }

    /* renamed from: a */
    public DetailPictureFragment m31256a(int i) {
        return this.f8336c.get(Integer.valueOf(i));
    }

    /* renamed from: a */
    public void m31255a(LinkedList<Object> linkedList) {
        this.f8334a = linkedList;
        Log.e("good", linkedList.toString());
        notifyDataSetChanged();
    }

    @Override // android.support.p001v4.view.PagerAdapter
    public int getCount() {
        if (this.f8334a == null) {
            return 0;
        }
        return this.f8334a.size() - 1;
    }

    @Override // android.support.p001v4.app.FragmentStatePagerAdapter
    public Fragment getItem(int i) {
        if (i < this.f8334a.size() - 1) {
            Object obj = this.f8334a.get(i);
            if (obj instanceof Uri) {
                this.f8336c.put(Integer.valueOf(i), DetailPictureFragment.m31273a((Uri) obj));
            }
        }
        return this.f8336c.get(Integer.valueOf(i));
    }

    @Override // android.support.p001v4.view.PagerAdapter
    public int getItemPosition(Object obj) {
        if (obj == null || ((DetailPictureFragment) obj).m31275a() != this.f8335b.getCurrentItem()) {
            return super.getItemPosition(obj);
        }
        return -2;
    }
}

package com.fimi.soul.module.customerfeedback;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.p001v4.app.Fragment;
import android.support.p001v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.view.photodraweeview.AbstractC3312d;
import java.util.LinkedList;
/* loaded from: classes.dex */
public class ShowDetailPictureGroupFragment extends Fragment implements ViewPager.OnPageChangeListener {

    /* renamed from: a */
    private MyViewPager f8337a;

    /* renamed from: b */
    private AbstractC3312d f8338b;

    /* renamed from: c */
    private PictureDetailAdapter f8339c;

    /* renamed from: d */
    private LinkedList<Object> f8340d;

    /* renamed from: a */
    public void m31254a(int i) {
        this.f8337a.setCurrentItem(i);
    }

    /* renamed from: a */
    public void m31253a(AbstractC3312d abstractC3312d) {
        this.f8338b = abstractC3312d;
    }

    /* renamed from: a */
    public void m31252a(LinkedList<Object> linkedList) {
        this.f8340d = linkedList;
        if (this.f8339c != null) {
            this.f8339c.m31255a(this.f8340d);
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(C1704R.layout.showdetail_feedback_fragment, (ViewGroup) null);
        this.f8337a = (MyViewPager) inflate.findViewById(C1704R.C1706id.viewpager);
        this.f8337a.setOnPageChangeListener(this);
        this.f8339c = new PictureDetailAdapter(getFragmentManager(), this.f8340d, this.f8337a);
        this.f8337a.setAdapter(this.f8339c);
        return inflate;
    }

    @Override // android.support.p001v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    @Override // android.support.p001v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        DetailPictureFragment m31256a;
        Uri uri;
        if (f != 0.0f || i2 != 0 || (m31256a = this.f8339c.m31256a(i)) == null || i >= this.f8340d.size()) {
            return;
        }
        Object obj = this.f8340d.get(i);
        if (!(obj instanceof Uri) || (uri = (Uri) obj) == null) {
            return;
        }
        if (uri.equals(m31256a.m31267c()) && m31256a.m31266d()) {
            return;
        }
        m31256a.m31269b(uri);
        m31256a.m31271a(this.f8338b);
        m31256a.m31270b();
    }

    @Override // android.support.p001v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
    }
}

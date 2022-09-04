package com.fimi.soul.media.gallery;

import android.os.Bundle;
import android.support.p001v4.app.Fragment;
import android.support.p001v4.app.FragmentManager;
import android.support.p001v4.app.FragmentStatePagerAdapter;
import android.support.p001v4.view.ViewPager;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.view.HackyViewPager;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class ImagePagerActivity extends BaseActivity {

    /* renamed from: a */
    public static final String f7918a = "image_index";

    /* renamed from: b */
    public static final String f7919b = "image_urls";

    /* renamed from: c */
    public static final String f7920c = "image_native";

    /* renamed from: d */
    private static final String f7921d = "STATE_POSITION";

    /* renamed from: e */
    private HackyViewPager f7922e;

    /* renamed from: f */
    private int f7923f;

    /* renamed from: g */
    private TextView f7924g;

    /* renamed from: com.fimi.soul.media.gallery.ImagePagerActivity$a */
    /* loaded from: classes.dex */
    private class C2402a extends FragmentStatePagerAdapter {

        /* renamed from: a */
        public ArrayList<String> f7926a;

        /* renamed from: b */
        public boolean f7927b;

        public C2402a(FragmentManager fragmentManager, ArrayList<String> arrayList, boolean z) {
            super(fragmentManager);
            this.f7926a = arrayList;
            this.f7927b = z;
        }

        @Override // android.support.p001v4.view.PagerAdapter
        public int getCount() {
            if (this.f7926a == null) {
                return 0;
            }
            return this.f7926a.size();
        }

        @Override // android.support.p001v4.app.FragmentStatePagerAdapter
        public Fragment getItem(int i) {
            return ImageDetailFragment.m31630a(this.f7926a.get(i), this.f7927b);
        }
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1704R.layout.image_detail_pager);
        this.f7923f = getIntent().getIntExtra("image_index", 0);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("image_urls");
        boolean booleanExtra = getIntent().getBooleanExtra(f7920c, false);
        this.f7922e = (HackyViewPager) findViewById(C1704R.C1706id.pager);
        this.f7922e.setAdapter(new C2402a(getSupportFragmentManager(), stringArrayListExtra, booleanExtra));
        this.f7924g = (TextView) findViewById(C1704R.C1706id.indicator);
        if (this.f7922e.getAdapter().getCount() == 1) {
            this.f7924g.setVisibility(4);
        }
        this.f7924g.setText(getString(C1704R.C1707string.viewpager_indicator, new Object[]{1, Integer.valueOf(this.f7922e.getAdapter().getCount())}));
        this.f7922e.setOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.fimi.soul.media.gallery.ImagePagerActivity.1
            @Override // android.support.p001v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // android.support.p001v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // android.support.p001v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                ImagePagerActivity.this.f7924g.setText(ImagePagerActivity.this.getString(C1704R.C1707string.viewpager_indicator, new Object[]{Integer.valueOf(i + 1), Integer.valueOf(ImagePagerActivity.this.f7922e.getAdapter().getCount())}));
            }
        });
        if (bundle != null) {
            this.f7923f = bundle.getInt(f7921d);
        }
        this.f7922e.setCurrentItem(this.f7923f);
    }

    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt(f7921d, this.f7922e.getCurrentItem());
    }
}

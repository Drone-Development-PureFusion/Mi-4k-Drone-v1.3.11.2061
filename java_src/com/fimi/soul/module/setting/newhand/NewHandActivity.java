package com.fimi.soul.module.setting.newhand;

import android.os.Bundle;
import android.support.p001v4.view.ViewPager;
import android.util.Log;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseActivity;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class NewHandActivity extends BaseActivity {

    /* renamed from: a */
    private NewHandAdapt f10684a;

    /* renamed from: b */
    private ViewPager f10685b;

    /* renamed from: c */
    private int f10686c;

    /* renamed from: d */
    private int f10687d;

    /* renamed from: e */
    private int f10688e;

    /* renamed from: a */
    public ViewPager m29839a() {
        if (this.f10685b == null) {
            this.f10685b = (ViewPager) findViewById(C1704R.C1706id.view_pager);
        }
        return this.f10685b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1704R.layout.activity_new_hand);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NewHandStartPagerFragment());
        arrayList.add(new NewHandOneFragment());
        arrayList.add(new NewHandTwoFragment());
        arrayList.add(new NewHandThreeFragment());
        arrayList.add(new NewHandFourFragment());
        arrayList.add(new NewHandFiveFragment());
        arrayList.add(new NewHandSixFragment());
        arrayList.add(new NewHandSevenFragment());
        this.f10684a = new NewHandAdapt(getSupportFragmentManager(), arrayList, m29839a());
        m29839a().setAdapter(this.f10684a);
        m29839a().setCurrentItem(0);
        m29839a().setOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.fimi.soul.module.setting.newhand.NewHandActivity.1
            @Override // android.support.p001v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                Log.i("zhej", "pager:" + i);
            }

            @Override // android.support.p001v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // android.support.p001v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
            }
        });
    }
}

package com.fimi.soul.module.p209b.p210a.p211a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import cn.sharesdk.framework.Platform;
import com.fimi.soul.module.p209b.C2477a;
import com.mob.tools.gui.ViewPagerAdapter;
import com.mob.tools.utils.C10109R;
import java.util.ArrayList;
/* renamed from: com.fimi.soul.module.b.a.a.j */
/* loaded from: classes.dex */
public abstract class AbstractView$OnClickListenerC2507j extends ViewPagerAdapter implements View.OnClickListener {

    /* renamed from: a */
    protected static final int f8148a = 1000;

    /* renamed from: b */
    public static final int f8149b = 52;

    /* renamed from: c */
    protected Object[][] f8150c;

    /* renamed from: d */
    protected int f8151d;

    /* renamed from: e */
    protected int f8152e;

    /* renamed from: f */
    protected int f8153f;

    /* renamed from: g */
    protected int f8154g;

    /* renamed from: h */
    protected int f8155h;

    /* renamed from: i */
    protected int f8156i;

    /* renamed from: j */
    protected int f8157j;

    /* renamed from: k */
    private AbstractC2502i f8158k;

    /* renamed from: l */
    private C2498f f8159l;

    /* renamed from: m */
    private long f8160m;

    public AbstractView$OnClickListenerC2507j(AbstractC2502i abstractC2502i, ArrayList<Object> arrayList) {
        this.f8158k = abstractC2502i;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        mo31475a(abstractC2502i.getContext(), arrayList);
        mo31473a(arrayList);
    }

    /* renamed from: a */
    private View m31476a(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(-855310);
        int i = this.f8152e / this.f8153f;
        LinearLayout[] linearLayoutArr = new LinearLayout[this.f8154g * i];
        linearLayout.setTag(linearLayoutArr);
        int bitmapRes = C10109R.getBitmapRes(context, "ssdk_oks_classic_platform_cell_back");
        for (int i2 = 0; i2 < i; i2++) {
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, this.f8153f));
            for (int i3 = 0; i3 < this.f8154g; i3++) {
                linearLayoutArr[(this.f8154g * i2) + i3] = new LinearLayout(context);
                linearLayoutArr[(this.f8154g * i2) + i3].setBackgroundResource(bitmapRes);
                linearLayoutArr[(this.f8154g * i2) + i3].setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.f8153f);
                layoutParams.weight = 1.0f;
                linearLayout2.addView(linearLayoutArr[(this.f8154g * i2) + i3], layoutParams);
                if (i3 < this.f8154g - 1) {
                    linearLayout2.addView(new View(context), new LinearLayout.LayoutParams(this.f8155h, -1));
                }
            }
            linearLayout.addView(new View(context), new LinearLayout.LayoutParams(-1, this.f8155h));
        }
        for (LinearLayout linearLayout3 : linearLayoutArr) {
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, this.f8157j);
            layoutParams2.topMargin = this.f8156i;
            linearLayout3.addView(imageView, layoutParams2);
            TextView textView = new TextView(context);
            textView.setTextColor(-10197916);
            textView.setTextSize(2, 14.0f);
            textView.setGravity(17);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.weight = 1.0f;
            linearLayout3.addView(textView, layoutParams3);
        }
        return linearLayout;
    }

    /* renamed from: a */
    private void m31472a(LinearLayout[] linearLayoutArr, Object[] objArr) {
        int bitmapRes = C10109R.getBitmapRes(this.f8158k.getContext(), "ssdk_oks_classic_platform_cell_back");
        int bitmapRes2 = C10109R.getBitmapRes(this.f8158k.getContext(), "ssdk_oks_classic_platfrom_cell_back_nor");
        for (int i = 0; i < objArr.length; i++) {
            ImageView imageView = (ImageView) C10109R.forceCast(linearLayoutArr[i].getChildAt(0));
            TextView textView = (TextView) C10109R.forceCast(linearLayoutArr[i].getChildAt(1));
            if (objArr[i] == null) {
                imageView.setVisibility(4);
                textView.setVisibility(4);
                linearLayoutArr[i].setBackgroundResource(bitmapRes2);
                linearLayoutArr[i].setOnClickListener(null);
            } else {
                imageView.setVisibility(0);
                textView.setVisibility(0);
                linearLayoutArr[i].setBackgroundResource(bitmapRes);
                linearLayoutArr[i].setOnClickListener(this);
                linearLayoutArr[i].setTag(objArr[i]);
                if (objArr[i] instanceof C2477a) {
                    C2477a c2477a = (C2477a) C10109R.forceCast(objArr[i]);
                    if (c2477a.f8034b != null) {
                        imageView.setImageBitmap(c2477a.f8034b);
                    } else {
                        imageView.setImageBitmap(null);
                    }
                    if (c2477a.f8033a != null) {
                        textView.setText(c2477a.f8033a);
                    } else {
                        textView.setText("");
                    }
                } else {
                    String lowerCase = ((Platform) C10109R.forceCast(objArr[i])).getName().toLowerCase();
                    int bitmapRes3 = C10109R.getBitmapRes(imageView.getContext(), "ssdk_oks_classic_" + lowerCase);
                    if (bitmapRes3 > 0) {
                        imageView.setImageResource(bitmapRes3);
                    } else {
                        imageView.setImageBitmap(null);
                    }
                    int stringRes = C10109R.getStringRes(textView.getContext(), "ssdk_" + lowerCase);
                    if (stringRes > 0) {
                        textView.setText(stringRes);
                    } else {
                        textView.setText("");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public int m31477a() {
        return this.f8151d;
    }

    /* renamed from: a */
    protected abstract void mo31475a(Context context, ArrayList<Object> arrayList);

    /* renamed from: a */
    public void m31474a(C2498f c2498f) {
        this.f8159l = c2498f;
    }

    /* renamed from: a */
    protected abstract void mo31473a(ArrayList<Object> arrayList);

    /* renamed from: b */
    public int m31471b() {
        return this.f8152e;
    }

    @Override // com.mob.tools.gui.ViewPagerAdapter
    public int getCount() {
        if (this.f8150c == null) {
            return 0;
        }
        return this.f8150c.length;
    }

    @Override // com.mob.tools.gui.ViewPagerAdapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = m31476a(viewGroup.getContext());
        }
        m31472a((LinearLayout[]) C10109R.forceCast(((LinearLayout) C10109R.forceCast(view)).getTag()), this.f8150c[i]);
        return view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f8160m < 1000) {
            return;
        }
        this.f8160m = currentTimeMillis;
        if (view.getTag() instanceof C2477a) {
            this.f8158k.m31493a(view, (C2477a) C10109R.forceCast(view.getTag()));
            return;
        }
        this.f8158k.m31483d((Platform) C10109R.forceCast(view.getTag()));
    }

    @Override // com.mob.tools.gui.ViewPagerAdapter
    public void onScreenChange(int i, int i2) {
        if (this.f8159l != null) {
            this.f8159l.setScreenCount(getCount());
            this.f8159l.m31500a(i, i2);
        }
    }
}

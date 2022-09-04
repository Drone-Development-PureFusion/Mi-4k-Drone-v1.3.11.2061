package com.fimi.soul.view.titlebar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p001v4.app.FragmentActivity;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.fimi.kernel.utils.C1673n;
import com.fimi.kernel.utils.C1675p;
import com.fimi.kernel.view.dialog.SampleDialogFragment;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseFimiActivity;
import com.fimi.soul.entity.FmMenuItem;
import com.fimi.soul.p168b.C1733e;
import java.util.List;
import p282m.framework.p285ui.widget.asyncview.AsyncImageView;
/* loaded from: classes.dex */
public class FmTitleBar extends LinearLayout {

    /* renamed from: k */
    public LayoutInflater f13218k;

    /* renamed from: l */
    public int f13219l;

    /* renamed from: s */
    private Activity f13226s;

    /* renamed from: v */
    private PopupWindow f13229v;

    /* renamed from: a */
    protected LinearLayout f13208a = null;

    /* renamed from: b */
    protected LinearLayout f13209b = null;

    /* renamed from: c */
    protected Button f13210c = null;

    /* renamed from: d */
    protected Button f13211d = null;

    /* renamed from: e */
    protected ImageView f13212e = null;

    /* renamed from: f */
    protected ImageView f13213f = null;

    /* renamed from: g */
    protected SimpleDraweeView f13214g = null;

    /* renamed from: h */
    protected ImageView f13215h = null;

    /* renamed from: t */
    private LinearLayout.LayoutParams f13227t = null;

    /* renamed from: u */
    private LinearLayout.LayoutParams f13228u = null;

    /* renamed from: i */
    protected LinearLayout f13216i = null;

    /* renamed from: j */
    public int f13217j = 1;

    /* renamed from: m */
    public LinearLayout.LayoutParams f13220m = null;

    /* renamed from: n */
    public LinearLayout.LayoutParams f13221n = null;

    /* renamed from: o */
    public LinearLayout.LayoutParams f13222o = null;

    /* renamed from: p */
    public LinearLayout.LayoutParams f13223p = null;

    /* renamed from: q */
    public LinearLayout.LayoutParams f13224q = null;

    /* renamed from: r */
    SampleDialogFragment f13225r = null;

    public FmTitleBar(Context context) {
        super(context);
        m28306a(context);
    }

    public FmTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m28306a(context);
    }

    /* renamed from: a */
    public static SampleDialogFragment m28303a(View view, int i, int i2, int i3, int i4, int i5, int i6) {
        SampleDialogFragment m34413a = SampleDialogFragment.m34413a(1, C1704R.style.MyDialog, i5, i6);
        m34413a.m34410a(view);
        FragmentTransaction beginTransaction = ((FragmentActivity) view.getContext()).getFragmentManager().beginTransaction();
        beginTransaction.setCustomAnimations(i, i2, i3, i4);
        m34413a.show(beginTransaction, "showDialog");
        m34413a.setCancelable(true);
        return m34413a;
    }

    /* renamed from: a */
    public void m28310a() {
        this.f13216i.removeAllViews();
    }

    /* renamed from: a */
    public void m28309a(int i) {
        this.f13216i.setVisibility(0);
        this.f13216i.addView(this.f13218k.inflate(i, (ViewGroup) null), this.f13220m);
    }

    /* renamed from: a */
    public void m28308a(int i, int i2) {
        C1675p.m34630a(this.f13216i);
        C1675p.m34630a(this.f13212e);
        int measuredWidth = this.f13212e.getMeasuredWidth();
        int measuredWidth2 = this.f13216i.getMeasuredWidth();
        this.f13227t.rightMargin = 0;
        this.f13227t.leftMargin = 0;
        if (i != 1 && i != 17) {
            if (i == 3 && i2 == 5) {
                this.f13208a.setGravity(3);
                this.f13216i.setHorizontalGravity(5);
            } else if (i == 5 && i2 == 5) {
                this.f13208a.setGravity(5);
                this.f13216i.setHorizontalGravity(5);
            } else if (i != 3 || i2 != 3) {
            } else {
                this.f13208a.setGravity(3);
                this.f13216i.setHorizontalGravity(3);
            }
        } else if (measuredWidth == 0 && measuredWidth2 == 0) {
            this.f13208a.setGravity(1);
        } else {
            if (i2 == 5) {
                if (measuredWidth2 != 0) {
                    this.f13210c.setPadding((measuredWidth2 / 3) * 2, 0, 0, 0);
                }
                this.f13210c.setGravity(17);
                this.f13216i.setHorizontalGravity(5);
            }
            if (i2 != 17 && i2 != 1) {
                return;
            }
            this.f13208a.setGravity(1);
            this.f13216i.setHorizontalGravity(3);
            this.f13210c.setGravity(17);
            int i3 = measuredWidth - measuredWidth2;
            if (i3 > 0) {
                this.f13227t.rightMargin = i3;
                return;
            }
            this.f13227t.leftMargin = Math.abs(i3);
        }
    }

    /* renamed from: a */
    public void m28307a(int i, int i2, int i3, int i4) {
        this.f13227t.setMargins(i, i2, i3, i4);
    }

    /* renamed from: a */
    public void m28306a(Context context) {
        this.f13226s = (Activity) context;
        setOrientation(1);
        setId(this.f13217j);
        this.f13218k = LayoutInflater.from(context);
        this.f13221n = new LinearLayout.LayoutParams(-1, (int) context.getResources().getDimension(C1704R.dimen.activity_headtop_margin));
        this.f13220m = new LinearLayout.LayoutParams(-1, -1);
        this.f13222o = new LinearLayout.LayoutParams(-1, -2);
        this.f13223p = new LinearLayout.LayoutParams(-2, -1);
        this.f13224q = new LinearLayout.LayoutParams(-2, -2);
        this.f13224q.gravity = 16;
        this.f13227t = new LinearLayout.LayoutParams(-2, -2, 1.0f);
        this.f13227t.gravity = 16;
        this.f13228u = new LinearLayout.LayoutParams(-2, -2);
        this.f13228u.gravity = 16;
        if (Build.VERSION.SDK_INT >= 19) {
            addView(new View(context), this.f13221n);
        }
        this.f13209b = new LinearLayout(context);
        this.f13209b.setOrientation(0);
        this.f13208a = new LinearLayout(context);
        this.f13208a.setOrientation(1);
        this.f13208a.setGravity(16);
        this.f13208a.setPadding(0, 0, 0, 0);
        this.f13210c = new Button(context);
        this.f13210c.setTextColor(Color.rgb(255, 255, 255));
        this.f13210c.setTextSize(16.0f);
        this.f13210c.setPadding(5, 0, 5, 0);
        this.f13210c.setGravity(16);
        this.f13210c.setBackgroundDrawable(null);
        this.f13210c.setSingleLine();
        this.f13208a.addView(this.f13210c, new LinearLayout.LayoutParams(-2, -2, 1.0f));
        this.f13211d = new Button(context);
        this.f13211d.setTextColor(Color.rgb(255, 255, 255));
        this.f13211d.setTextSize(15.0f);
        this.f13211d.setPadding(6, 0, 5, 0);
        this.f13211d.setGravity(16);
        this.f13211d.setBackgroundDrawable(null);
        this.f13211d.setSingleLine();
        this.f13208a.addView(this.f13211d, new LinearLayout.LayoutParams(-2, 0));
        this.f13212e = new ImageView(context);
        this.f13212e.setVisibility(8);
        this.f13215h = new ImageView(context);
        this.f13215h.setVisibility(8);
        this.f13213f = new ImageView(context);
        this.f13213f.setVisibility(8);
        this.f13214g = new SimpleDraweeView(context);
        this.f13214g.setHierarchy(new GenericDraweeHierarchyBuilder(getResources()).setPlaceholderImage(getResources().getDrawable(C1704R.C1705drawable.defaultavatar)).setFailureImage(getResources().getDrawable(C1704R.C1705drawable.defaultavatar)).setRoundingParams(RoundingParams.asCircle()).build());
        this.f13214g.setVisibility(8);
        this.f13209b.addView(this.f13212e, this.f13224q);
        this.f13209b.addView(this.f13214g, this.f13224q);
        this.f13209b.addView(this.f13215h, this.f13224q);
        this.f13209b.addView(this.f13213f, this.f13224q);
        this.f13209b.addView(this.f13208a, this.f13227t);
        this.f13216i = new LinearLayout(context);
        this.f13216i.setOrientation(0);
        this.f13216i.setGravity(5);
        this.f13216i.setPadding(0, 0, 0, 0);
        this.f13216i.setHorizontalGravity(5);
        this.f13216i.setGravity(16);
        this.f13216i.setVisibility(8);
        this.f13209b.addView(this.f13216i, this.f13228u);
        addView(this.f13209b, this.f13222o);
    }

    /* renamed from: a */
    public void m28305a(Bitmap bitmap, int i, int i2) {
        this.f13224q.leftMargin = 10;
        this.f13212e.setVisibility(0);
        this.f13212e.setImageBitmap(bitmap);
        this.f13212e.getLayoutParams().height = i;
        this.f13212e.getLayoutParams().width = i2;
    }

    /* renamed from: a */
    public void m28304a(View view) {
        this.f13220m.rightMargin = 20;
        this.f13216i.setVisibility(0);
        this.f13216i.addView(view, this.f13220m);
    }

    /* renamed from: a */
    public void m28302a(View view, View view2, boolean z) {
        C1675p.m34630a(view2);
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = (getMeasuredHeight() - view.getMeasuredHeight()) / 2;
        if (view2.getMeasuredWidth() > view.getMeasuredWidth()) {
            measuredWidth = view2.getMeasuredWidth();
        }
        if (z) {
            this.f13229v = new PopupWindow(view2, measuredWidth + 10, -2, true);
        } else {
            this.f13229v = new PopupWindow(view2, -1, -2, true);
        }
        this.f13229v.setFocusable(true);
        this.f13229v.setOutsideTouchable(true);
        this.f13229v.setBackgroundDrawable(new ColorDrawable(AsyncImageView.f35337a));
        this.f13229v.showAsDropDown(view, 0, measuredHeight + 2);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void m28301a(List<FmMenuItem> list, final AdapterView.OnItemClickListener onItemClickListener) {
        View inflate = this.f13218k.inflate(C1704R.layout.list_pop, (ViewGroup) null);
        this.f13225r = m28303a(inflate, C1704R.anim.push_up_in, C1704R.anim.push_up_out, C1704R.anim.push_up_in, C1704R.anim.push_up_out, 48, this.f13219l);
        ListView listView = (ListView) inflate.findViewById(C1704R.C1706id.pop_list);
        inflate.findViewById(C1704R.C1706id.title_bar).setBackgroundColor(this.f13219l);
        inflate.findViewById(C1704R.C1706id.close).setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.titlebar.FmTitleBar.1
            @Override // android.view.View.OnClickListener
            @SuppressLint({"NewApi"})
            public void onClick(View view) {
                FmTitleBar.this.f13225r.dismiss();
            }
        });
        listView.setAdapter((ListAdapter) new C1733e(this.f13226s, list));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.fimi.soul.view.titlebar.FmTitleBar.2
            @Override // android.widget.AdapterView.OnItemClickListener
            @SuppressLint({"NewApi"})
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                FmTitleBar.this.f13225r.dismiss();
                onItemClickListener.onItemClick(adapterView, view, i, j);
            }
        });
    }

    /* renamed from: b */
    public SimpleDraweeView m28299b(int i, int i2) {
        this.f13224q.leftMargin = 15;
        this.f13224q.topMargin = 5;
        this.f13214g.setVisibility(0);
        this.f13214g.getLayoutParams().height = i2;
        this.f13214g.getLayoutParams().width = i;
        return this.f13214g;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public void m28300b() {
        if (this.f13225r == null || !this.f13225r.isVisible()) {
            return;
        }
        this.f13225r.dismiss();
    }

    /* renamed from: b */
    public void m28298b(Bitmap bitmap, int i, int i2) {
        this.f13224q.leftMargin = 15;
        this.f13224q.topMargin = 5;
        this.f13214g.setVisibility(0);
        this.f13214g.setImageBitmap(bitmap);
        this.f13214g.getLayoutParams().height = i;
        this.f13214g.getLayoutParams().width = i2;
    }

    /* renamed from: b */
    public void m28297b(View view) {
        this.f13224q.leftMargin = 10;
        this.f13209b.addView(view, this.f13224q);
    }

    /* renamed from: c */
    public void m28296c() {
        if (this.f13229v != null) {
            this.f13229v.dismiss();
        }
    }

    public ImageView getLogoView() {
        return this.f13212e;
    }

    public ImageView getLogoView2() {
        return this.f13213f;
    }

    public LinearLayout getRightLayout() {
        return this.f13216i;
    }

    public Button getTitleSmallTextButton() {
        return this.f13211d;
    }

    public Button getTitleTextButton() {
        return this.f13210c;
    }

    public LinearLayout getTitleTextLayout() {
        return this.f13208a;
    }

    public void setChildViewFillParent(boolean z) {
        if (z) {
            this.f13227t = new LinearLayout.LayoutParams(-2, -2, 1.0f);
            this.f13227t.gravity = 16;
            this.f13208a.setLayoutParams(this.f13227t);
            this.f13228u = new LinearLayout.LayoutParams(-2, -2);
            this.f13228u.gravity = 16;
            this.f13216i.setLayoutParams(this.f13228u);
            return;
        }
        this.f13227t = new LinearLayout.LayoutParams(-2, -2);
        this.f13227t.gravity = 16;
        this.f13208a.setLayoutParams(this.f13227t);
        this.f13228u = new LinearLayout.LayoutParams(-2, -2, 1.0f);
        this.f13228u.gravity = 16;
        this.f13216i.setLayoutParams(this.f13228u);
    }

    public void setLogo(int i) {
        this.f13212e.setVisibility(0);
        this.f13212e.setBackgroundResource(i);
    }

    public void setLogo(Drawable drawable) {
        this.f13212e.setVisibility(0);
        this.f13212e.setBackgroundDrawable(drawable);
    }

    public void setLogo2(int i) {
        this.f13213f.setVisibility(0);
        this.f13213f.setBackgroundResource(i);
    }

    public void setLogo2(Drawable drawable) {
        this.f13213f.setVisibility(0);
        this.f13213f.setBackgroundDrawable(drawable);
    }

    public void setLogo2OnClickListener(View.OnClickListener onClickListener) {
        this.f13213f.setOnClickListener(onClickListener);
    }

    public void setLogo3(int i) {
        this.f13214g.setVisibility(0);
        this.f13214g.setBackgroundResource(i);
    }

    public void setLogo3(Drawable drawable) {
        this.f13214g.setVisibility(0);
        this.f13214g.setBackgroundDrawable(drawable);
    }

    public void setLogo3OnClickListener(View.OnClickListener onClickListener) {
        this.f13214g.setOnClickListener(onClickListener);
    }

    public void setLogoLine(int i) {
        this.f13215h.setVisibility(0);
        this.f13215h.setBackgroundResource(i);
    }

    public void setLogoLine(Drawable drawable) {
        this.f13215h.setVisibility(0);
        this.f13215h.setBackgroundDrawable(drawable);
    }

    public void setLogoOnClickListener(View.OnClickListener onClickListener) {
        this.f13212e.setOnClickListener(onClickListener);
    }

    public void setTitleBarBackground(int i) {
        setBackgroundResource(i);
    }

    public void setTitleBarBackgroundColor(int i) {
        this.f13219l = i;
        setBackgroundColor(i);
        ((BaseFimiActivity) this.f13226s).setStatusBarTintResource(i);
    }

    public void setTitleBarBackgroundDrawable(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setTitleBarLeftBackground(int i) {
        Drawable drawable = getResources().getDrawable(i);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.f13210c.setCompoundDrawables(drawable, null, null, null);
    }

    public void setTitleColor(int i) {
        this.f13210c.setTextColor(i);
    }

    public void setTitleSmallText(int i) {
        this.f13211d.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f13211d.setText(i);
    }

    public void setTitleSmallText(String str) {
        if (C1673n.m34653b(str)) {
            this.f13211d.setLayoutParams(new LinearLayout.LayoutParams(-2, 0));
            this.f13211d.setText("");
            return;
        }
        this.f13211d.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f13211d.setText(str);
    }

    public void setTitleText(int i) {
        this.f13210c.setText(i);
    }

    public void setTitleText(String str) {
        this.f13210c.setText(str);
    }

    public void setTitleTextBackgroundDrawable(Drawable drawable) {
        this.f13210c.setBackgroundDrawable(drawable);
    }

    public void setTitleTextBackgroundResource(int i) {
        this.f13210c.setBackgroundResource(i);
    }

    public void setTitleTextBold(boolean z) {
        TextPaint paint = this.f13210c.getPaint();
        if (z) {
            paint.setFakeBoldText(true);
        } else {
            paint.setFakeBoldText(false);
        }
    }

    public void setTitleTextDropDown(final View view) {
        if (view == null) {
            return;
        }
        setTitleTextOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.titlebar.FmTitleBar.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                FmTitleBar.this.m28302a((View) FmTitleBar.this.f13210c, view, true);
            }
        });
    }

    public void setTitleTextOnClickListener(View.OnClickListener onClickListener) {
        this.f13210c.setOnClickListener(onClickListener);
    }

    public void setTitleTextSize(int i) {
        this.f13210c.setTextSize(i);
    }
}

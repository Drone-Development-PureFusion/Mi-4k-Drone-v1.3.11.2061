package com.fimi.soul.module.customerfeedback;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.utils.C3075ad;
import java.util.LinkedList;
/* renamed from: com.fimi.soul.module.customerfeedback.c */
/* loaded from: classes.dex */
public class View$OnClickListenerC2553c extends BaseAdapter implements View.OnClickListener {

    /* renamed from: a */
    LinkedList<Object> f8353a;

    /* renamed from: b */
    private Context f8354b;

    /* renamed from: c */
    private int f8355c;

    /* renamed from: d */
    private int f8356d;

    /* renamed from: com.fimi.soul.module.customerfeedback.c$a */
    /* loaded from: classes.dex */
    class C2554a {

        /* renamed from: a */
        SimpleDraweeView f8357a;

        /* renamed from: b */
        ImageView f8358b;

        C2554a() {
        }
    }

    public View$OnClickListenerC2553c(LinkedList<Object> linkedList, Context context) {
        this.f8353a = linkedList;
        this.f8354b = context;
        m31243a();
    }

    /* renamed from: a */
    private void m31243a() {
        Bitmap decodeResource = BitmapFactory.decodeResource(this.f8354b.getResources(), C1704R.C1705drawable.add_images_box);
        this.f8355c = decodeResource.getWidth();
        this.f8356d = decodeResource.getHeight();
        if (decodeResource.isRecycled()) {
            decodeResource.recycle();
        }
    }

    /* renamed from: a */
    public void m31242a(LinkedList<Object> linkedList) {
        this.f8353a = linkedList;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f8353a == null) {
            return 0;
        }
        return this.f8353a.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (this.f8353a == null) {
            return null;
        }
        return this.f8353a.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C2554a c2554a;
        if (view == null) {
            view = LayoutInflater.from(this.f8354b).inflate(C1704R.layout.add_feedback_item_adapter, (ViewGroup) null);
            c2554a = new C2554a();
            c2554a.f8357a = (SimpleDraweeView) view.findViewById(C1704R.C1706id.add_feedback_pic);
            c2554a.f8358b = (ImageView) view.findViewById(C1704R.C1706id.delete_feedback_pic);
            c2554a.f8358b.setOnClickListener(this);
            view.setTag(c2554a);
            c2554a.f8357a.getLayoutParams().height = this.f8356d;
            c2554a.f8357a.getLayoutParams().width = this.f8355c;
        } else {
            c2554a = (C2554a) view.getTag();
        }
        Object obj = this.f8353a.get(i);
        if (obj != null) {
            if (obj instanceof Uri) {
                Uri uri = (Uri) obj;
                c2554a.f8358b.setTag(new Integer(i));
                C3075ad.m29364a(c2554a.f8357a, uri.toString());
                C2549a.m31251a().m31250a(uri);
                c2554a.f8358b.setVisibility(0);
            } else if (obj instanceof Integer) {
                c2554a.f8357a.setImageResource(((Integer) obj).intValue());
                c2554a.f8358b.setVisibility(8);
            }
        }
        return view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof Integer) {
            Integer num = (Integer) tag;
            if (this.f8353a == null || num.intValue() >= this.f8353a.size()) {
                return;
            }
            Object obj = this.f8353a.get(num.intValue());
            if (!this.f8353a.contains(obj)) {
                return;
            }
            this.f8353a.remove(obj);
            m31242a(this.f8353a);
        }
    }
}

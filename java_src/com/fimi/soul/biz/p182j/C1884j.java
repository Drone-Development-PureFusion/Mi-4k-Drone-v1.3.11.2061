package com.fimi.soul.biz.p182j;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1679t;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.C3125i;
import com.google.android.gms.maps.model.C8575a;
import com.google.android.gms.maps.model.C8610b;
import java.util.ArrayList;
import p005b.p006a.p007a.p029b.p045i.p046a.C0548a;
/* renamed from: com.fimi.soul.biz.j.j */
/* loaded from: classes.dex */
public class C1884j {

    /* renamed from: a */
    private static C8575a f5164a;

    /* renamed from: a */
    public static Bitmap m33754a(View view, Context context) {
        if (view == null) {
            return null;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(C3125i.m29082a(context, 28.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(C3125i.m29082a(context, 48.0f), 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    /* renamed from: a */
    public static C8575a m33758a(int i) {
        f5164a = C8610b.m11086a(i);
        return f5164a;
    }

    /* renamed from: a */
    public static C8575a m33757a(Context context, int i, float f, boolean z) {
        View inflate = LayoutInflater.from(context).inflate(C1704R.layout.action_markericon, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C1704R.C1706id.point_heightValue);
        textView.setText(C1642c.m34885e().m34501p() ? Math.round(C1679t.m34553b(f)) + context.getString(C1704R.C1707string.distance_unit_ft) : Math.round(f) + context.getString(C1704R.C1707string.distance_unit_m));
        if (z) {
            textView.setTextColor(context.getResources().getColor(C1704R.color.onmarker_color));
        } else {
            textView.setTextColor(context.getResources().getColor(C1704R.color.mystyle_markerinfo));
        }
        C3103au.m29218b(context.getAssets(), textView);
        ImageView imageView = (ImageView) inflate.findViewById(C1704R.C1706id.markerIcon);
        if (i != 0) {
            imageView.setBackgroundResource(i);
        }
        return C8610b.m11085a(m33754a(inflate, context));
    }

    /* renamed from: a */
    public static C8575a m33756a(Context context, int i, int i2, boolean z) {
        View inflate = LayoutInflater.from(context).inflate(C1704R.layout.action_markericon_animation, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C1704R.C1706id.point_heightValue);
        textView.setText(i2 + C0548a.f931b);
        if (z) {
            textView.setTextColor(context.getResources().getColor(C1704R.color.onmarker_color));
        } else {
            textView.setTextColor(context.getResources().getColor(C1704R.color.mystyle_markerinfo));
        }
        C3103au.m29218b(context.getAssets(), textView);
        ImageView imageView = (ImageView) inflate.findViewById(C1704R.C1706id.markerIcon);
        if (i != 0) {
            imageView.setBackgroundResource(i);
        }
        return C8610b.m11085a(m33754a(inflate, context));
    }

    /* renamed from: a */
    public static ArrayList<C8575a> m33755a(Context context, int i, boolean z, int i2, int i3) {
        ArrayList<C8575a> arrayList = new ArrayList<>();
        arrayList.add(m33756a(context, i2, i, z));
        arrayList.add(m33756a(context, i3, i, z));
        return arrayList;
    }
}

package com.fimi.soul.drone.p194c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.p001v4.view.ViewCompat;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.utils.C3103au;
/* renamed from: com.fimi.soul.drone.c.b */
/* loaded from: classes.dex */
public class C2103b {

    /* renamed from: a */
    private static final int f6066a = 6;

    /* renamed from: a */
    public static Bitmap m32886a(int i, String str, Context context) {
        return m32884a(context, (int) C1704R.C1705drawable.ic_wp_map, i, str);
    }

    /* renamed from: a */
    public static Bitmap m32885a(int i, String str, String str2, Context context) {
        return m32883a(context, i, str, str2);
    }

    /* renamed from: a */
    private static Bitmap m32884a(Context context, int i, int i2, String str) {
        Resources resources = context.getResources();
        float f = resources.getDisplayMetrics().density;
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, i);
        Bitmap.Config config = decodeResource.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap copy = decodeResource.copy(config, true);
        Paint paint = new Paint();
        paint.setColorFilter(new LightingColorFilter(0, i2));
        Canvas canvas = new Canvas(copy);
        canvas.drawBitmap(copy, 0.0f, 0.0f, paint);
        Paint paint2 = new Paint(1);
        paint2.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint2.setTextSize((int) (f * 15.0f));
        paint2.setShadowLayer(1.0f, 0.0f, 1.0f, -1);
        Rect rect = new Rect();
        paint2.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(str, (copy.getWidth() - rect.width()) / 2, ((rect.height() + copy.getHeight()) * 5) / 12, paint2);
        return copy;
    }

    /* renamed from: a */
    private static Bitmap m32883a(Context context, int i, String str, String str2) {
        Rect rect;
        Resources resources = context.getResources();
        float f = resources.getDisplayMetrics().density;
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, i);
        Bitmap.Config config = decodeResource.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap copy = decodeResource.copy(config, true);
        Paint paint = new Paint();
        Canvas canvas = new Canvas(copy);
        canvas.drawBitmap(copy, 0.0f, 0.0f, paint);
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        paint2.setAntiAlias(true);
        paint2.setTextSize((int) (11.0f * f));
        paint2.setFakeBoldText(true);
        paint2.setShadowLayer(1.0f, 0.0f, 1.0f, ViewCompat.MEASURED_STATE_MASK);
        Rect rect2 = new Rect();
        paint2.getTextBounds(str, 0, str.length(), rect2);
        rect2.offsetTo(-6, rect2.height() / 2);
        if (str2 != null) {
            rect = new Rect();
            rect.offsetTo(0, rect2.bottom);
        } else {
            rect = new Rect(0, 0, 0, 0);
        }
        Rect rect3 = new Rect(rect2);
        rect3.union(rect);
        rect3.offsetTo((copy.getWidth() - rect3.width()) / 2, (rect2.top + ((copy.getHeight() - rect3.height()) / 2)) - rect2.height());
        rect3.set(rect3.left - 6, rect3.top - 6, rect3.right + 6, rect3.bottom + 6);
        canvas.drawText(str, (copy.getWidth() - rect2.width()) / 2, ((copy.getHeight() - (rect.height() + rect2.height())) / 2) + rect2.top + 5, paint2);
        return copy;
    }

    /* renamed from: b */
    public static Bitmap m32882b(int i, String str, String str2, Context context) {
        return m32881b(context, i, str, str2);
    }

    /* renamed from: b */
    private static Bitmap m32881b(Context context, int i, String str, String str2) {
        Rect rect;
        Resources resources = context.getResources();
        float f = resources.getDisplayMetrics().density;
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, i);
        Bitmap.Config config = decodeResource.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap copy = decodeResource.copy(config, true);
        Paint paint = new Paint();
        Canvas canvas = new Canvas(copy);
        canvas.drawBitmap(copy, 0.0f, 0.0f, paint);
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        paint2.setAlpha(204);
        paint2.setAntiAlias(true);
        paint2.setTextSize((int) (f * 11.2d));
        TextView textView = new TextView(context);
        textView.setText(str);
        C3103au.m29232a(context.getAssets(), textView);
        Rect rect2 = new Rect();
        paint2.getTextBounds(textView.getText().toString(), 0, str.length(), rect2);
        rect2.offsetTo(-6, rect2.height() / 2);
        if (str2 != null) {
            rect = new Rect();
            rect.offsetTo(0, rect2.bottom);
        } else {
            rect = new Rect(0, 0, 0, 0);
        }
        Rect rect3 = new Rect(rect2);
        rect3.union(rect);
        rect3.offsetTo((copy.getWidth() - rect3.width()) / 2, (rect2.top + ((copy.getHeight() - rect3.height()) / 2)) - rect2.height());
        rect3.set(rect3.left - 6, rect3.top - 6, rect3.right + 6, rect3.bottom + 6);
        canvas.drawText(str, (copy.getWidth() - rect2.width()) / 2, ((((copy.getHeight() - (rect.height() + rect2.height())) / 2) + rect2.top) / 2) + 5, paint2);
        return copy;
    }
}

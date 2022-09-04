package com.fimi.kernel.utils;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.fimi.kernel.utils.h */
/* loaded from: classes.dex */
public final class C1665h {
    /* renamed from: a */
    public static float m34733a(TextPaint textPaint) {
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        return (float) Math.ceil(fontMetrics.descent - fontMetrics.ascent);
    }

    /* renamed from: a */
    public static float m34731a(String str, TextPaint textPaint) {
        return textPaint.measureText(str);
    }

    /* renamed from: a */
    public static int m34734a(Canvas canvas, String str, int i, TextPaint textPaint, int i2, int i3) {
        if (C1673n.m34653b(str)) {
            return 1;
        }
        List<String> m34730b = m34730b(str, i, textPaint);
        int m34733a = (int) m34733a(textPaint);
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= m34730b.size()) {
                return m34730b.size();
            }
            canvas.drawText(m34730b.get(i5), i2, (m34733a * i5) + (m34733a / 2) + i3, textPaint);
            i4 = i5 + 1;
        }
    }

    /* renamed from: a */
    public static int m34732a(String str, int i, TextPaint textPaint) {
        if (C1673n.m34653b(str)) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= str.length()) {
                i2 = 0;
                break;
            }
            float measureText = textPaint.measureText(str.substring(0, i2 + 1));
            if (measureText <= i) {
                if (measureText == i) {
                    break;
                }
                i2++;
            } else {
                i2--;
                break;
            }
        }
        if (i2 == 0) {
            i2 = str.length() - 1;
        }
        return i2;
    }

    /* renamed from: b */
    public static float m34729b(String str, TextPaint textPaint) {
        return Layout.getDesiredWidth(str, textPaint);
    }

    /* renamed from: b */
    public static List<String> m34730b(String str, int i, TextPaint textPaint) {
        String[] split = str.indexOf("\n") != -1 ? str.split("\n") : new String[]{str};
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            while (true) {
                int m34732a = m34732a(str2, i, textPaint);
                if (m34732a <= 0) {
                    arrayList.add(str2);
                } else if (m34732a == str2.length() - 1) {
                    arrayList.add(str2);
                } else {
                    arrayList.add(str2.substring(0, m34732a + 1));
                }
                if (str2.length() > m34732a + 1) {
                    str2 = str2.substring(m34732a + 1);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static int m34728c(String str, int i, TextPaint textPaint) {
        String[] split = str.indexOf("\n") != -1 ? str.split("\n") : new String[]{str};
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            while (true) {
                int m34732a = m34732a(str2, i, textPaint);
                if (m34732a <= 0) {
                    arrayList.add(str2);
                } else if (m34732a == str2.length() - 1) {
                    arrayList.add(str2);
                } else {
                    arrayList.add(str2.substring(0, m34732a + 1));
                }
                if (str2.length() > m34732a + 1) {
                    str2 = str2.substring(m34732a + 1);
                }
            }
        }
        return arrayList.size();
    }
}

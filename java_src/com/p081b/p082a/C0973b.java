package com.p081b.p082a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.animation.AnimationUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: com.b.a.b */
/* loaded from: classes.dex */
public class C0973b {

    /* renamed from: b */
    private static final int f2177b = 0;

    /* renamed from: d */
    private static final int f2179d = 0;

    /* renamed from: f */
    private static final int f2181f = 0;

    /* renamed from: g */
    private static final int f2182g = 1;

    /* renamed from: h */
    private static final int f2183h = 2;

    /* renamed from: i */
    private static final int f2184i = 3;

    /* renamed from: j */
    private static final int f2185j = 4;

    /* renamed from: k */
    private static final int f2186k = 5;

    /* renamed from: l */
    private static final int f2187l = 6;

    /* renamed from: m */
    private static final int f2188m = 7;

    /* renamed from: n */
    private static final int f2189n = 0;

    /* renamed from: o */
    private static final int f2190o = 0;

    /* renamed from: a */
    private static final int[] f2176a = {16843490};

    /* renamed from: c */
    private static final int[] f2178c = {16843489};

    /* renamed from: e */
    private static final int[] f2180e = {16843073, 16843160, 16843198, 16843199, 16843200, 16843486, 16843487, 16843488};

    /* renamed from: a */
    public static AbstractC0971a m37248a(Context context, int i) {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = context.getResources().getAnimation(i);
                    return m37245a(context, (XmlPullParser) xmlResourceParser);
                } catch (XmlPullParserException e) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                    notFoundException.initCause(e);
                    throw notFoundException;
                }
            } catch (IOException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    /* renamed from: a */
    private static AbstractC0971a m37245a(Context context, XmlPullParser xmlPullParser) {
        return m37244a(context, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0);
    }

    /* renamed from: a */
    private static AbstractC0971a m37244a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, C0975d c0975d, int i) {
        ArrayList arrayList;
        int i2 = 0;
        int depth = xmlPullParser.getDepth();
        ArrayList arrayList2 = null;
        AbstractC0971a abstractC0971a = null;
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if (name.equals("objectAnimator")) {
                        abstractC0971a = m37247a(context, attributeSet);
                    } else if (name.equals("animator")) {
                        abstractC0971a = m37246a(context, attributeSet, null);
                    } else if (!name.equals("set")) {
                        throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                    } else {
                        abstractC0971a = new C0975d();
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2176a);
                        TypedValue typedValue = new TypedValue();
                        obtainStyledAttributes.getValue(0, typedValue);
                        m37244a(context, xmlPullParser, attributeSet, (C0975d) abstractC0971a, typedValue.type == 16 ? typedValue.data : 0);
                        obtainStyledAttributes.recycle();
                    }
                    if (c0975d != null) {
                        arrayList = arrayList2 == null ? new ArrayList() : arrayList2;
                        arrayList.add(abstractC0971a);
                    } else {
                        arrayList = arrayList2;
                    }
                    arrayList2 = arrayList;
                }
            }
        }
        if (c0975d != null && arrayList2 != null) {
            AbstractC0971a[] abstractC0971aArr = new AbstractC0971a[arrayList2.size()];
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                abstractC0971aArr[i2] = (AbstractC0971a) it2.next();
                i2++;
            }
            if (i == 0) {
                c0975d.m37238a(abstractC0971aArr);
            } else {
                c0975d.m37236b(abstractC0971aArr);
            }
        }
        return abstractC0971a;
    }

    /* renamed from: a */
    private static C0992l m37247a(Context context, AttributeSet attributeSet) {
        C0992l c0992l = new C0992l();
        m37246a(context, attributeSet, c0992l);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2178c);
        c0992l.m37180a(obtainStyledAttributes.getString(0));
        obtainStyledAttributes.recycle();
        return c0992l;
    }

    /* renamed from: a */
    private static C1015q m37246a(Context context, AttributeSet attributeSet, C1015q c1015q) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2180e);
        long j = obtainStyledAttributes.getInt(1, 0);
        long j2 = obtainStyledAttributes.getInt(2, 0);
        int i = obtainStyledAttributes.getInt(7, 0);
        if (c1015q == null) {
            c1015q = new C1015q();
        }
        boolean z = i == 0;
        TypedValue peekValue = obtainStyledAttributes.peekValue(5);
        boolean z2 = peekValue != null;
        int i2 = z2 ? peekValue.type : 0;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(6);
        boolean z3 = peekValue2 != null;
        int i3 = z3 ? peekValue2.type : 0;
        if ((z2 && i2 >= 28 && i2 <= 31) || (z3 && i3 >= 28 && i3 <= 31)) {
            z = false;
            c1015q.m37096a((AbstractC1014p) new C0982e());
        }
        if (z) {
            if (z2) {
                float dimension = i2 == 5 ? obtainStyledAttributes.getDimension(5, 0.0f) : obtainStyledAttributes.getFloat(5, 0.0f);
                if (z3) {
                    c1015q.mo37089a(dimension, i3 == 5 ? obtainStyledAttributes.getDimension(6, 0.0f) : obtainStyledAttributes.getFloat(6, 0.0f));
                } else {
                    c1015q.mo37089a(dimension);
                }
            } else {
                c1015q.mo37089a(i3 == 5 ? obtainStyledAttributes.getDimension(6, 0.0f) : obtainStyledAttributes.getFloat(6, 0.0f));
            }
        } else if (z2) {
            int dimension2 = i2 == 5 ? (int) obtainStyledAttributes.getDimension(5, 0.0f) : (i2 < 28 || i2 > 31) ? obtainStyledAttributes.getInt(5, 0) : obtainStyledAttributes.getColor(5, 0);
            if (z3) {
                c1015q.mo37088a(dimension2, i3 == 5 ? (int) obtainStyledAttributes.getDimension(6, 0.0f) : (i3 < 28 || i3 > 31) ? obtainStyledAttributes.getInt(6, 0) : obtainStyledAttributes.getColor(6, 0));
            } else {
                c1015q.mo37088a(dimension2);
            }
        } else if (z3) {
            c1015q.mo37088a(i3 == 5 ? (int) obtainStyledAttributes.getDimension(6, 0.0f) : (i3 < 28 || i3 > 31) ? obtainStyledAttributes.getInt(6, 0) : obtainStyledAttributes.getColor(6, 0));
        }
        c1015q.mo37083b(j);
        c1015q.mo37098a(j2);
        if (obtainStyledAttributes.hasValue(3)) {
            c1015q.m37099a(obtainStyledAttributes.getInt(3, 0));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            c1015q.m37084b(obtainStyledAttributes.getInt(4, 1));
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId > 0) {
            c1015q.mo37097a(AnimationUtils.loadInterpolator(context, resourceId));
        }
        obtainStyledAttributes.recycle();
        return c1015q;
    }
}

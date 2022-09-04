package com.xiaomi.push.service;

import com.xiaomi.smack.packet.C10731a;
import com.xiaomi.smack.provider.AbstractC10744b;
import com.xiaomi.smack.provider.C10745c;
import com.xiaomi.smack.util.C10749d;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
/* renamed from: com.xiaomi.push.service.c */
/* loaded from: classes.dex */
public class C10660c implements AbstractC10744b {
    /* renamed from: a */
    public static C10731a m4278a(XmlPullParser xmlPullParser) {
        String str;
        String[] strArr;
        String[] strArr2;
        ArrayList arrayList = null;
        if (xmlPullParser.getEventType() != 2) {
            return null;
        }
        String name = xmlPullParser.getName();
        String namespace = xmlPullParser.getNamespace();
        if (xmlPullParser.getAttributeCount() > 0) {
            strArr2 = new String[xmlPullParser.getAttributeCount()];
            strArr = new String[xmlPullParser.getAttributeCount()];
            for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                strArr2[i] = xmlPullParser.getAttributeName(i);
                strArr[i] = C10749d.m3835b(xmlPullParser.getAttributeValue(i));
            }
            str = null;
        } else {
            str = null;
            strArr = null;
            strArr2 = null;
        }
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3) {
                return new C10731a(name, namespace, strArr2, strArr, str, arrayList);
            }
            if (next == 4) {
                str = xmlPullParser.getText().trim();
            } else if (next == 2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                C10731a m4278a = m4278a(xmlPullParser);
                if (m4278a != null) {
                    arrayList.add(m4278a);
                }
            }
        }
    }

    /* renamed from: a */
    public void m4279a() {
        C10745c.m3856a().m3854a("all", "xm:chat", this);
    }

    /* renamed from: b */
    public C10731a m4277b(XmlPullParser xmlPullParser) {
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1 && eventType != 2) {
            eventType = xmlPullParser.next();
        }
        if (eventType == 2) {
            return m4278a(xmlPullParser);
        }
        return null;
    }
}

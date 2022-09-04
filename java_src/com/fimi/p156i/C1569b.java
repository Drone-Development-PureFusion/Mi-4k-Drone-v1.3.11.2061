package com.fimi.p156i;

import android.util.Xml;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
/* renamed from: com.fimi.i.b */
/* loaded from: classes.dex */
public class C1569b {
    /* renamed from: a */
    public List<C1568a> m35107a(InputStream inputStream) {
        ArrayList arrayList = null;
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, "utf-8");
        C1568a c1568a = null;
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            switch (eventType) {
                case 2:
                    if ("firmwares".equals(newPullParser.getName())) {
                        arrayList = new ArrayList();
                        break;
                    } else if ("firmware".equals(newPullParser.getName())) {
                        c1568a = new C1568a();
                        break;
                    } else if ("name".equals(newPullParser.getName())) {
                        c1568a.m35110a(newPullParser.nextText());
                        break;
                    } else if ("version".equals(newPullParser.getName())) {
                        c1568a.m35108b(newPullParser.nextText());
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ("firmware".equals(newPullParser.getName())) {
                        arrayList.add(c1568a);
                        break;
                    } else {
                        break;
                    }
            }
        }
        inputStream.close();
        return arrayList;
    }
}

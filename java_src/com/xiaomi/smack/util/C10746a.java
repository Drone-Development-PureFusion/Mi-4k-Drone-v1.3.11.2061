package com.xiaomi.smack.util;

import android.text.TextUtils;
import com.tencent.p263mm.sdk.message.RMsgInfoDB;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.push.service.C10615ak;
import com.xiaomi.push.service.C10627aq;
import com.xiaomi.push.service.C10660c;
import com.xiaomi.smack.AbstractC10716a;
import com.xiaomi.smack.C10730l;
import com.xiaomi.smack.packet.AbstractC10735d;
import com.xiaomi.smack.packet.C10731a;
import com.xiaomi.smack.packet.C10732b;
import com.xiaomi.smack.packet.C10734c;
import com.xiaomi.smack.packet.C10737f;
import com.xiaomi.smack.packet.C10740g;
import com.xiaomi.smack.packet.C10741h;
import com.xiaomi.smack.provider.C10745c;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* renamed from: com.xiaomi.smack.util.a */
/* loaded from: classes2.dex */
public class C10746a {

    /* renamed from: a */
    private static XmlPullParser f33548a = null;

    /* renamed from: a */
    public static C10731a m3850a(String str, String str2, XmlPullParser xmlPullParser) {
        Object m3855a = C10745c.m3856a().m3855a("all", "xm:chat");
        if (m3855a == null || !(m3855a instanceof C10660c)) {
            return null;
        }
        return ((C10660c) m3855a).m4277b(xmlPullParser);
    }

    /* renamed from: a */
    public static C10732b m3848a(XmlPullParser xmlPullParser, AbstractC10716a abstractC10716a) {
        String attributeValue = xmlPullParser.getAttributeValue("", "id");
        String attributeValue2 = xmlPullParser.getAttributeValue("", "to");
        String attributeValue3 = xmlPullParser.getAttributeValue("", "from");
        String attributeValue4 = xmlPullParser.getAttributeValue("", "chid");
        C10732b.C10733a m3911a = C10732b.C10733a.m3911a(xmlPullParser.getAttributeValue("", "type"));
        HashMap hashMap = new HashMap();
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            hashMap.put(attributeName, xmlPullParser.getAttributeValue("", attributeName));
        }
        boolean z = false;
        C10741h c10741h = null;
        C10732b c10732b = null;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (name.equals("error")) {
                    c10741h = m3844d(xmlPullParser);
                } else {
                    c10732b = new C10732b();
                    c10732b.a(m3850a(name, namespace, xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("iq")) {
                z = true;
            }
            c10741h = c10741h;
            c10732b = c10732b;
            z = z;
        }
        if (c10732b == null) {
            if (C10732b.C10733a.f33461a == m3911a || C10732b.C10733a.f33462b == m3911a) {
                C10747b c10747b = new C10747b();
                c10747b.k(attributeValue);
                c10747b.m(attributeValue3);
                c10747b.n(attributeValue2);
                c10747b.m3913a(C10732b.C10733a.f33464d);
                c10747b.l(attributeValue4);
                c10747b.a(new C10741h(C10741h.C10742a.f33524e));
                abstractC10716a.mo3986a(c10747b);
                AbstractC10404b.m5264d("iq usage error. send packet in packet parser.");
                return null;
            }
            c10732b = new C10748c();
        }
        c10732b.k(attributeValue);
        c10732b.m(attributeValue2);
        c10732b.l(attributeValue4);
        c10732b.n(attributeValue3);
        c10732b.m3913a(m3911a);
        c10732b.a(c10741h);
        c10732b.m3912a(hashMap);
        return c10732b;
    }

    /* renamed from: a */
    public static AbstractC10735d m3849a(XmlPullParser xmlPullParser) {
        String str;
        if ("1".equals(xmlPullParser.getAttributeValue("", "s"))) {
            String attributeValue = xmlPullParser.getAttributeValue("", "chid");
            String attributeValue2 = xmlPullParser.getAttributeValue("", "id");
            String attributeValue3 = xmlPullParser.getAttributeValue("", "from");
            String attributeValue4 = xmlPullParser.getAttributeValue("", "to");
            String attributeValue5 = xmlPullParser.getAttributeValue("", "type");
            C10615ak.C10617b m4374b = C10615ak.m4383a().m4374b(attributeValue, attributeValue4);
            C10615ak.C10617b m4374b2 = m4374b == null ? C10615ak.m4383a().m4374b(attributeValue, attributeValue3) : m4374b;
            if (m4374b2 == null) {
                throw new C10730l("the channel id is wrong while receiving a encrypted message");
            }
            boolean z = false;
            AbstractC10735d abstractC10735d = null;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if (!"s".equals(xmlPullParser.getName())) {
                        throw new C10730l("error while receiving a encrypted message with wrong format");
                    }
                    if (xmlPullParser.next() != 4) {
                        throw new C10730l("error while receiving a encrypted message with wrong format");
                    }
                    String text = xmlPullParser.getText();
                    if ("5".equals(attributeValue) || "6".equals(attributeValue)) {
                        C10734c c10734c = new C10734c();
                        c10734c.l(attributeValue);
                        c10734c.m3905b(true);
                        c10734c.n(attributeValue3);
                        c10734c.m(attributeValue4);
                        c10734c.k(attributeValue2);
                        c10734c.m3898f(attributeValue5);
                        C10731a c10731a = new C10731a("s", null, null, null);
                        c10731a.m3918b(text);
                        c10734c.a(c10731a);
                        return c10734c;
                    }
                    m3847a(C10627aq.m4344b(C10627aq.m4350a(m4374b2.f33004i, attributeValue2), text));
                    f33548a.next();
                    abstractC10735d = m3849a(f33548a);
                } else if (next == 3 && xmlPullParser.getName().equals(RMsgInfoDB.TABLE)) {
                    z = true;
                }
            }
            if (abstractC10735d != null) {
                return abstractC10735d;
            }
            throw new C10730l("error while receiving a encrypted message with wrong format");
        }
        C10734c c10734c2 = new C10734c();
        String attributeValue6 = xmlPullParser.getAttributeValue("", "id");
        if (attributeValue6 == null) {
            attributeValue6 = "ID_NOT_AVAILABLE";
        }
        c10734c2.k(attributeValue6);
        c10734c2.m(xmlPullParser.getAttributeValue("", "to"));
        c10734c2.n(xmlPullParser.getAttributeValue("", "from"));
        c10734c2.l(xmlPullParser.getAttributeValue("", "chid"));
        c10734c2.m3909a(xmlPullParser.getAttributeValue("", "appid"));
        try {
            str = xmlPullParser.getAttributeValue("", "transient");
        } catch (Exception e) {
            str = null;
        }
        try {
            String attributeValue7 = xmlPullParser.getAttributeValue("", "seq");
            if (!TextUtils.isEmpty(attributeValue7)) {
                c10734c2.m3906b(attributeValue7);
            }
        } catch (Exception e2) {
        }
        try {
            String attributeValue8 = xmlPullParser.getAttributeValue("", "mseq");
            if (!TextUtils.isEmpty(attributeValue8)) {
                c10734c2.m3904c(attributeValue8);
            }
        } catch (Exception e3) {
        }
        try {
            String attributeValue9 = xmlPullParser.getAttributeValue("", "fseq");
            if (!TextUtils.isEmpty(attributeValue9)) {
                c10734c2.m3902d(attributeValue9);
            }
        } catch (Exception e4) {
        }
        try {
            String attributeValue10 = xmlPullParser.getAttributeValue("", "status");
            if (!TextUtils.isEmpty(attributeValue10)) {
                c10734c2.m3900e(attributeValue10);
            }
        } catch (Exception e5) {
        }
        c10734c2.m3907a(!TextUtils.isEmpty(str) && str.equalsIgnoreCase("true"));
        c10734c2.m3898f(xmlPullParser.getAttributeValue("", "type"));
        String m3842f = m3842f(xmlPullParser);
        if (m3842f == null || "".equals(m3842f.trim())) {
            AbstractC10735d.m3869u();
        } else {
            c10734c2.m3891j(m3842f);
        }
        String str2 = null;
        boolean z2 = false;
        while (!z2) {
            int next2 = xmlPullParser.next();
            if (next2 == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (TextUtils.isEmpty(namespace)) {
                    namespace = "xm";
                }
                if (name.equals("subject")) {
                    if (m3842f(xmlPullParser) == null) {
                    }
                    c10734c2.m3896g(m3843e(xmlPullParser));
                } else if (name.equals("body")) {
                    String attributeValue11 = xmlPullParser.getAttributeValue("", "encode");
                    String m3843e = m3843e(xmlPullParser);
                    if (!TextUtils.isEmpty(attributeValue11)) {
                        c10734c2.m3908a(m3843e, attributeValue11);
                    } else {
                        c10734c2.m3894h(m3843e);
                    }
                } else if (name.equals("thread")) {
                    if (str2 == null) {
                        str2 = xmlPullParser.nextText();
                    }
                } else if (name.equals("error")) {
                    c10734c2.a(m3844d(xmlPullParser));
                } else {
                    c10734c2.a(m3850a(name, namespace, xmlPullParser));
                }
            } else if (next2 == 3 && xmlPullParser.getName().equals(RMsgInfoDB.TABLE)) {
                z2 = true;
            }
        }
        c10734c2.m3892i(str2);
        return c10734c2;
    }

    /* renamed from: a */
    private static void m3847a(byte[] bArr) {
        if (f33548a == null) {
            try {
                f33548a = XmlPullParserFactory.newInstance().newPullParser();
                f33548a.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            } catch (XmlPullParserException e) {
                e.printStackTrace();
            }
        }
        f33548a.setInput(new InputStreamReader(new ByteArrayInputStream(bArr)));
    }

    /* renamed from: b */
    public static C10737f m3846b(XmlPullParser xmlPullParser) {
        C10737f.EnumC10739b enumC10739b = C10737f.EnumC10739b.available;
        String attributeValue = xmlPullParser.getAttributeValue("", "type");
        if (attributeValue != null && !attributeValue.equals("")) {
            try {
                enumC10739b = C10737f.EnumC10739b.valueOf(attributeValue);
            } catch (IllegalArgumentException e) {
                System.err.println("Found invalid presence type " + attributeValue);
            }
        }
        C10737f c10737f = new C10737f(enumC10739b);
        c10737f.m(xmlPullParser.getAttributeValue("", "to"));
        c10737f.n(xmlPullParser.getAttributeValue("", "from"));
        c10737f.l(xmlPullParser.getAttributeValue("", "chid"));
        String attributeValue2 = xmlPullParser.getAttributeValue("", "id");
        if (attributeValue2 == null) {
            attributeValue2 = "ID_NOT_AVAILABLE";
        }
        c10737f.k(attributeValue2);
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (name.equals("status")) {
                    c10737f.m3864a(xmlPullParser.nextText());
                } else if (name.equals("priority")) {
                    try {
                        c10737f.m3867a(Integer.parseInt(xmlPullParser.nextText()));
                    } catch (NumberFormatException e2) {
                    } catch (IllegalArgumentException e3) {
                        c10737f.m3867a(0);
                    }
                } else if (name.equals("show")) {
                    String nextText = xmlPullParser.nextText();
                    try {
                        c10737f.m3866a(C10737f.EnumC10738a.valueOf(nextText));
                    } catch (IllegalArgumentException e4) {
                        System.err.println("Found invalid presence mode " + nextText);
                    }
                } else if (name.equals("error")) {
                    c10737f.a(m3844d(xmlPullParser));
                } else {
                    c10737f.a(m3850a(name, namespace, xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("presence")) {
                z = true;
            }
        }
        return c10737f;
    }

    /* renamed from: c */
    public static C10740g m3845c(XmlPullParser xmlPullParser) {
        C10740g c10740g = null;
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                c10740g = new C10740g(xmlPullParser.getName());
            } else if (next == 3 && xmlPullParser.getName().equals("error")) {
                z = true;
            }
        }
        return c10740g;
    }

    /* renamed from: d */
    public static C10741h m3844d(XmlPullParser xmlPullParser) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        String str2 = null;
        String str3 = "-1";
        int i = 0;
        while (i < xmlPullParser.getAttributeCount()) {
            String attributeValue = xmlPullParser.getAttributeName(i).equals(XiaomiOAuthConstants.EXTRA_CODE_2) ? xmlPullParser.getAttributeValue("", XiaomiOAuthConstants.EXTRA_CODE_2) : str3;
            String attributeValue2 = xmlPullParser.getAttributeName(i).equals("type") ? xmlPullParser.getAttributeValue("", "type") : str2;
            if (xmlPullParser.getAttributeName(i).equals("reason")) {
                str = xmlPullParser.getAttributeValue("", "reason");
            }
            i++;
            str2 = attributeValue2;
            str3 = attributeValue;
        }
        boolean z = false;
        String str4 = null;
        String str5 = null;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("text")) {
                    str5 = xmlPullParser.nextText();
                } else {
                    String name = xmlPullParser.getName();
                    String namespace = xmlPullParser.getNamespace();
                    if ("urn:ietf:params:xml:ns:xmpp-stanzas".equals(namespace)) {
                        str4 = name;
                    } else {
                        arrayList.add(m3850a(name, namespace, xmlPullParser));
                    }
                }
            } else if (next == 3) {
                if (xmlPullParser.getName().equals("error")) {
                    z = true;
                }
            } else if (next == 4) {
                str5 = xmlPullParser.getText();
            }
        }
        return new C10741h(Integer.parseInt(str3), str2 == null ? "cancel" : str2, str, str4, str5, arrayList);
    }

    /* renamed from: e */
    private static String m3843e(XmlPullParser xmlPullParser) {
        String str = "";
        int depth = xmlPullParser.getDepth();
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getDepth() == depth) {
                return str;
            }
            str = str + xmlPullParser.getText();
        }
    }

    /* renamed from: f */
    private static String m3842f(XmlPullParser xmlPullParser) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            if ("xml:lang".equals(attributeName) || ("lang".equals(attributeName) && "xml".equals(xmlPullParser.getAttributePrefix(i)))) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }
}

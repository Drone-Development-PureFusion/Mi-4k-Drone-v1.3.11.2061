package com.xiaomi.smack;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
/* renamed from: com.xiaomi.smack.g */
/* loaded from: classes.dex */
public final class C10725g {

    /* renamed from: a */
    private static int f33429a;

    /* renamed from: b */
    private static int f33430b;

    /* renamed from: c */
    private static int f33431c = 300000;

    /* renamed from: d */
    private static int f33432d = 330000;

    /* renamed from: e */
    private static Vector<String> f33433e = new Vector<>();

    static {
        f33429a = 5000;
        f33430b = 330000;
        try {
            for (ClassLoader classLoader : m3945d()) {
                Enumeration<URL> resources = classLoader.getResources("META-INF/smack-config.xml");
                while (resources.hasMoreElements()) {
                    InputStream inputStream = null;
                    try {
                        inputStream = resources.nextElement().openStream();
                        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                        newPullParser.setInput(inputStream, "UTF-8");
                        int eventType = newPullParser.getEventType();
                        do {
                            if (eventType == 2) {
                                if (newPullParser.getName().equals("className")) {
                                    m3949a(newPullParser);
                                } else if (newPullParser.getName().equals("packetReplyTimeout")) {
                                    f33429a = m3948a(newPullParser, f33429a);
                                } else if (newPullParser.getName().equals("keepAliveInterval")) {
                                    f33430b = m3948a(newPullParser, f33430b);
                                } else if (newPullParser.getName().equals("mechName")) {
                                    f33433e.add(newPullParser.nextText());
                                }
                            }
                            eventType = newPullParser.next();
                        } while (eventType != 1);
                        try {
                            inputStream.close();
                        } catch (Exception e) {
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        try {
                            inputStream.close();
                        } catch (Exception e3) {
                        }
                    }
                }
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    private C10725g() {
    }

    /* renamed from: a */
    private static int m3948a(XmlPullParser xmlPullParser, int i) {
        try {
            return Integer.parseInt(xmlPullParser.nextText());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return i;
        }
    }

    /* renamed from: a */
    public static String m3950a() {
        return "3.1.0";
    }

    /* renamed from: a */
    private static void m3949a(XmlPullParser xmlPullParser) {
        String nextText = xmlPullParser.nextText();
        try {
            Class.forName(nextText);
        } catch (ClassNotFoundException e) {
            System.err.println("Error! A startup class specified in smack-config.xml could not be loaded: " + nextText);
        }
    }

    /* renamed from: b */
    public static int m3947b() {
        return f33430b;
    }

    /* renamed from: c */
    public static int m3946c() {
        return f33431c;
    }

    /* renamed from: d */
    private static ClassLoader[] m3945d() {
        ClassLoader[] classLoaderArr = {C10725g.class.getClassLoader(), Thread.currentThread().getContextClassLoader()};
        ArrayList arrayList = new ArrayList();
        for (ClassLoader classLoader : classLoaderArr) {
            if (classLoader != null) {
                arrayList.add(classLoader);
            }
        }
        return (ClassLoader[]) arrayList.toArray(new ClassLoader[arrayList.size()]);
    }
}

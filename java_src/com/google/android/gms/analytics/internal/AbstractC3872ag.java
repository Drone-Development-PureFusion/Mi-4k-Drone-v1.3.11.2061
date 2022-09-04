package com.google.android.gms.analytics.internal;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.AbstractC3871af;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.analytics.internal.ag */
/* loaded from: classes2.dex */
public abstract class AbstractC3872ag<T extends AbstractC3871af> extends C3919s {

    /* renamed from: a */
    AbstractC3873a<T> f15004a;

    /* renamed from: com.google.android.gms.analytics.internal.ag$a */
    /* loaded from: classes2.dex */
    public interface AbstractC3873a<U extends AbstractC3871af> {
        /* renamed from: a */
        void mo26218a(String str, int i);

        /* renamed from: a */
        void mo26217a(String str, String str2);

        /* renamed from: a */
        void mo26216a(String str, boolean z);

        /* renamed from: b */
        U mo26215b();

        /* renamed from: b */
        void mo26214b(String str, String str2);
    }

    public AbstractC3872ag(C3922v c3922v, AbstractC3873a<T> abstractC3873a) {
        super(c3922v);
        this.f15004a = abstractC3873a;
    }

    /* renamed from: a */
    private T m26391a(XmlResourceParser xmlResourceParser) {
        try {
            xmlResourceParser.next();
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (xmlResourceParser.getEventType() == 2) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase();
                    if (lowerCase.equals("screenname")) {
                        String attributeValue = xmlResourceParser.getAttributeValue(null, "name");
                        String trim = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue) && !TextUtils.isEmpty(trim)) {
                            this.f15004a.mo26217a(attributeValue, trim);
                        }
                    } else if (lowerCase.equals("string")) {
                        String attributeValue2 = xmlResourceParser.getAttributeValue(null, "name");
                        String trim2 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue2) && trim2 != null) {
                            this.f15004a.mo26214b(attributeValue2, trim2);
                        }
                    } else if (lowerCase.equals("bool")) {
                        String attributeValue3 = xmlResourceParser.getAttributeValue(null, "name");
                        String trim3 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue3) && !TextUtils.isEmpty(trim3)) {
                            try {
                                this.f15004a.mo26216a(attributeValue3, Boolean.parseBoolean(trim3));
                            } catch (NumberFormatException e) {
                                c("Error parsing bool configuration value", trim3, e);
                            }
                        }
                    } else if (lowerCase.equals("integer")) {
                        String attributeValue4 = xmlResourceParser.getAttributeValue(null, "name");
                        String trim4 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue4) && !TextUtils.isEmpty(trim4)) {
                            try {
                                this.f15004a.mo26218a(attributeValue4, Integer.parseInt(trim4));
                            } catch (NumberFormatException e2) {
                                c("Error parsing int configuration value", trim4, e2);
                            }
                        }
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e3) {
            e("Error parsing tracker configuration file", e3);
        } catch (XmlPullParserException e4) {
            e("Error parsing tracker configuration file", e4);
        }
        return this.f15004a.mo26215b();
    }

    /* renamed from: a */
    public T m26392a(int i) {
        try {
            return m26391a(k().m26111c().getResources().getXml(i));
        } catch (Resources.NotFoundException e) {
            d("inflate() called with unknown resourceId", e);
            return null;
        }
    }
}

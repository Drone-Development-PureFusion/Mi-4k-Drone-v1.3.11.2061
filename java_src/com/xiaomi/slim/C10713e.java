package com.xiaomi.slim;

import com.tencent.p263mm.sdk.message.RMsgInfoDB;
import com.xiaomi.smack.AbstractC10716a;
import com.xiaomi.smack.C10730l;
import com.xiaomi.smack.packet.AbstractC10735d;
import com.xiaomi.smack.util.C10746a;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* renamed from: com.xiaomi.slim.e */
/* loaded from: classes2.dex */
public class C10713e {

    /* renamed from: a */
    private XmlPullParser f33393a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10713e() {
        try {
            this.f33393a = XmlPullParserFactory.newInstance().newPullParser();
            this.f33393a.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        } catch (XmlPullParserException e) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public AbstractC10735d m3999a(byte[] bArr, AbstractC10716a abstractC10716a) {
        this.f33393a.setInput(new InputStreamReader(new ByteArrayInputStream(bArr)));
        this.f33393a.next();
        int eventType = this.f33393a.getEventType();
        String name = this.f33393a.getName();
        if (eventType == 2) {
            if (name.equals(RMsgInfoDB.TABLE)) {
                return C10746a.m3849a(this.f33393a);
            }
            if (name.equals("iq")) {
                return C10746a.m3848a(this.f33393a, abstractC10716a);
            }
            if (name.equals("presence")) {
                return C10746a.m3846b(this.f33393a);
            }
            if (!this.f33393a.getName().equals("stream")) {
                if (this.f33393a.getName().equals("error")) {
                    throw new C10730l(C10746a.m3845c(this.f33393a));
                }
                if (this.f33393a.getName().equals("warning")) {
                    this.f33393a.next();
                    if (this.f33393a.getName().equals("multi-login")) {
                    }
                } else if (this.f33393a.getName().equals("bind")) {
                }
            }
        }
        return null;
    }
}

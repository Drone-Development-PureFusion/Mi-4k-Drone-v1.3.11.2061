package com.baidu.tts.p090b.p091a.p093b;

import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.loopj.RequestParams;
import com.baidu.tts.p086a.p087a.C1045a;
import com.baidu.tts.p086a.p087a.C1046b;
import com.baidu.tts.p090b.p091a.p093b.C1096f;
import com.baidu.tts.p102f.EnumC1166a;
import com.baidu.tts.p102f.EnumC1172d;
import com.baidu.tts.p102f.EnumC1175g;
import com.baidu.tts.p102f.EnumC1182n;
import com.baidu.tts.p105h.p106a.C1191c;
import com.baidu.tts.p114m.C1237h;
import com.baidu.tts.tools.CommonUtility;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.baidu.tts.b.a.b.h */
/* loaded from: classes.dex */
public class C1102h extends AbstractC1101g {

    /* renamed from: a */
    private C1045a<byte[], byte[]> f2564a = new C1045a<>();

    /* renamed from: b */
    private C1096f.C1098b f2565b;

    /* renamed from: c */
    private C1237h f2566c;

    public C1102h(C1237h c1237h) {
        this.f2566c = c1237h;
        this.f2564a.m36875a(new C1046b());
        this.f2564a.m36876a();
    }

    /* renamed from: a */
    private void m36622a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt(EnumC1175g.ERROR_NUMBER.m36319a());
            LoggerProxy.m36554d("TtsResponseHandler", "parseJSON errNo=" + optInt);
            this.f2566c.m36159a(optInt);
            if (optInt != 0) {
                this.f2566c.m36158a(C1191c.m36299a().m36296a(EnumC1182n.ONLINE_ENGINE_REQUEST_RESULT_ERROR, optInt, jSONObject.getString(EnumC1175g.ERROR_MESSAGE.m36319a())));
            } else {
                this.f2566c.m36153a(jSONObject.optString(EnumC1175g.SERIAL_NUMBER.m36319a()));
                this.f2566c.m36150b(jSONObject.optInt(EnumC1175g.INDEX.m36319a()));
                this.f2566c.m36146c(jSONObject.optInt(EnumC1175g.PERCENT.m36317b()));
            }
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m36621b(HttpEntity httpEntity) {
        byte[] bArr;
        byte[] bArr2 = null;
        try {
            bArr = ("----BD**TTS++LIB").getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            bArr = null;
        }
        try {
            bArr2 = EntityUtils.toByteArray(httpEntity);
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        int indexOf = CommonUtility.indexOf(bArr2, bArr, 0);
        if (indexOf < 0) {
            this.f2566c.m36158a(C1191c.m36299a().m36292b(EnumC1182n.ONLINE_ENGINE_HTTP_REQUEST_PARSE_ERROR));
            return;
        }
        int indexOf2 = CommonUtility.indexOf(bArr2, bArr, bArr.length + indexOf);
        if (indexOf2 < 0) {
            this.f2566c.m36158a(C1191c.m36299a().m36292b(EnumC1182n.ONLINE_ENGINE_HTTP_REQUEST_PARSE_ERROR));
            return;
        }
        try {
            m36622a(new String(CommonUtility.copyBytesOfRange(bArr2, indexOf + bArr.length, indexOf2), "utf-8"));
        } catch (UnsupportedEncodingException e3) {
            e3.printStackTrace();
        }
        int indexOf3 = CommonUtility.indexOf(bArr2, bArr, bArr.length + indexOf2);
        if (indexOf3 < 0) {
            return;
        }
        this.f2566c.m36152a(this.f2564a.m36874a((C1045a<byte[], byte[]>) CommonUtility.copyBytesOfRange(bArr2, bArr.length + indexOf2, indexOf3)));
        this.f2566c.m36157a(EnumC1166a.PCM);
    }

    /* renamed from: c */
    private void m36620c(HttpEntity httpEntity) {
        String str = null;
        try {
            str = EntityUtils.toString(httpEntity, EnumC1172d.UTF8.m36323a());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e2) {
            e2.printStackTrace();
        }
        m36622a(str);
    }

    @Override // com.baidu.tts.p090b.p091a.p093b.AbstractC1101g
    /* renamed from: a */
    public void mo36625a(int i, Header[] headerArr, String str, HttpEntity httpEntity) {
        if (RequestParams.APPLICATION_JSON.equals(str)) {
            m36620c(httpEntity);
        } else {
            m36621b(httpEntity);
        }
    }

    @Override // com.baidu.tts.p090b.p091a.p093b.AbstractC1101g
    /* renamed from: a */
    public void mo36624a(int i, Header[] headerArr, String str, HttpEntity httpEntity, Throwable th) {
        LoggerProxy.m36554d("TtsResponseHandler", "onFailure error = " + th.getMessage());
        this.f2566c.m36158a(C1191c.m36299a().m36295a(EnumC1182n.ONLINE_ENGINE_HTTP_REQUEST_FAILURE, i, null, th));
    }

    /* renamed from: a */
    public void m36623a(C1096f.C1098b c1098b) {
        this.f2565b = c1098b;
    }
}

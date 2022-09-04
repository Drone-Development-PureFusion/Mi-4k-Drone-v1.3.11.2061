package com.baidu.tts.p090b.p091a.p093b;

import com.baidu.tts.loopj.AsyncHttpResponseHandler;
import com.baidu.tts.loopj.RequestParams;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
/* renamed from: com.baidu.tts.b.a.b.g */
/* loaded from: classes.dex */
public abstract class AbstractC1101g extends AsyncHttpResponseHandler {

    /* renamed from: a */
    private String f2562a;

    /* renamed from: b */
    private HttpEntity f2563b;

    /* renamed from: a */
    String m36626a(HttpEntity httpEntity) {
        Header contentType = httpEntity.getContentType();
        if (contentType == null || !RequestParams.APPLICATION_JSON.equals(contentType.getValue())) {
            return null;
        }
        return RequestParams.APPLICATION_JSON;
    }

    /* renamed from: a */
    public abstract void mo36625a(int i, Header[] headerArr, String str, HttpEntity httpEntity);

    /* renamed from: a */
    public abstract void mo36624a(int i, Header[] headerArr, String str, HttpEntity httpEntity, Throwable th);

    @Override // com.baidu.tts.loopj.AsyncHttpResponseHandler
    public void onFailure(int i, Header[] headerArr, byte[] bArr, Throwable th) {
        mo36624a(i, headerArr, this.f2562a, this.f2563b, th);
    }

    @Override // com.baidu.tts.loopj.AsyncHttpResponseHandler
    public void onSuccess(int i, Header[] headerArr, byte[] bArr) {
        mo36625a(i, headerArr, this.f2562a, this.f2563b);
    }

    @Override // com.baidu.tts.loopj.AsyncHttpResponseHandler, com.baidu.tts.loopj.ResponseHandlerInterface
    public void sendResponseMessage(HttpResponse httpResponse) {
        if (!Thread.currentThread().isInterrupted()) {
            StatusLine statusLine = httpResponse.getStatusLine();
            this.f2563b = httpResponse.getEntity();
            this.f2562a = m36626a(this.f2563b);
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            if (statusLine.getStatusCode() >= 300) {
                sendFailureMessage(statusLine.getStatusCode(), httpResponse.getAllHeaders(), null, new HttpResponseException(statusLine.getStatusCode(), statusLine.getReasonPhrase()));
            } else {
                sendSuccessMessage(statusLine.getStatusCode(), httpResponse.getAllHeaders(), null);
            }
        }
    }
}

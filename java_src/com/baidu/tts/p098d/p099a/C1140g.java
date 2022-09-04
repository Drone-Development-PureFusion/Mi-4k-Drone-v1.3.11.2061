package com.baidu.tts.p098d.p099a;

import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.loopj.RangeFileAsyncHttpResponseHandler;
import com.baidu.tts.p102f.EnumC1182n;
import com.baidu.tts.p105h.p106a.C1191c;
import java.io.File;
import org.apache.http.Header;
/* renamed from: com.baidu.tts.d.a.g */
/* loaded from: classes.dex */
public class C1140g extends RangeFileAsyncHttpResponseHandler {

    /* renamed from: a */
    private C1136c f2690a;

    public C1140g(File file, C1136c c1136c) {
        super(file);
        this.f2690a = c1136c;
    }

    @Override // com.baidu.tts.loopj.FileAsyncHttpResponseHandler
    public void onFailure(int i, Header[] headerArr, Throwable th, File file) {
        String str = null;
        if (th != null) {
            Throwable cause = th.getCause();
            str = cause == null ? th.getMessage() : cause.getMessage();
        }
        LoggerProxy.m36554d("ModelFileResponseHandler", "onFailure statuscode=" + i + "--msg=" + str);
        this.f2690a.m36490a(C1191c.m36299a().m36295a(EnumC1182n.MODEL_REQUEST_ERROR, i, "download failure", th));
    }

    @Override // com.baidu.tts.loopj.AsyncHttpResponseHandler
    public void onProgress(long j, long j2) {
        this.f2690a.m36491a(j, j2);
    }

    @Override // com.baidu.tts.loopj.FileAsyncHttpResponseHandler
    public void onSuccess(int i, Header[] headerArr, File file) {
        LoggerProxy.m36554d("ModelFileResponseHandler", "onSuccess");
        this.f2690a.m36485e();
    }
}

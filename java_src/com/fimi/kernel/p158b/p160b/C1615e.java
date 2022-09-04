package com.fimi.kernel.p158b.p160b;

import android.os.Message;
import com.fimi.kernel.AbstractC1584b;
import com.fimi.kernel.p158b.AbstractC1586a;
import com.fimi.kernel.p158b.AbstractC1632e;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* renamed from: com.fimi.kernel.b.b.e */
/* loaded from: classes.dex */
public class C1615e extends AbstractC1584b implements AbstractC1586a {

    /* renamed from: a */
    private volatile int f3999a = 0;

    /* renamed from: b */
    private Map<Integer, AbstractC1632e> f4000b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public synchronized int m34972b() {
        this.f3999a++;
        return this.f3999a;
    }

    @Override // com.fimi.kernel.AbstractC1584b
    /* renamed from: a */
    protected void mo30955a(Message message) {
        AbstractC1632e abstractC1632e = this.f4000b.get(Integer.valueOf(message.what));
        if (abstractC1632e != null) {
            if (message.arg1 == 1) {
                abstractC1632e.mo30004a(message.obj);
            } else {
                abstractC1632e.mo30002b(message.obj);
            }
            this.f4000b.remove(abstractC1632e);
        }
    }

    @Override // com.fimi.kernel.p158b.AbstractC1586a
    /* renamed from: a */
    public void mo34912a(final String str, final AbstractC1632e<String> abstractC1632e) {
        a(new Runnable() { // from class: com.fimi.kernel.b.b.e.1
            /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() {
                int m34972b;
                InputStreamReader inputStreamReader;
                InputStreamReader inputStreamReader2;
                HttpURLConnection httpURLConnection = null;
                do {
                    m34972b = C1615e.this.m34972b();
                } while (C1615e.this.f4000b.containsKey(Integer.valueOf(m34972b)));
                C1615e.this.f4000b.put(Integer.valueOf(m34972b), abstractC1632e);
                Message message = new Message();
                message.what = m34972b;
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
                    try {
                        inputStreamReader = new InputStreamReader(httpURLConnection2.getInputStream());
                        try {
                            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                            StringBuffer stringBuffer = new StringBuffer();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                stringBuffer.append(readLine);
                            }
                            message.obj = stringBuffer.toString();
                            message.arg1 = 1;
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            if (inputStreamReader != null) {
                                try {
                                    inputStreamReader.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        } catch (Exception e2) {
                            httpURLConnection = httpURLConnection2;
                            e = e2;
                            inputStreamReader2 = inputStreamReader;
                            try {
                                message.arg1 = 0;
                                message.obj = e.toString();
                                e.printStackTrace();
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                if (inputStreamReader2 != null) {
                                    try {
                                        inputStreamReader2.close();
                                    } catch (IOException e3) {
                                        e3.printStackTrace();
                                    }
                                }
                                C1615e.this.a().sendMessage(message);
                            } catch (Throwable th) {
                                th = th;
                                inputStreamReader = inputStreamReader2;
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                if (inputStreamReader != null) {
                                    try {
                                        inputStreamReader.close();
                                    } catch (IOException e4) {
                                        e4.printStackTrace();
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            httpURLConnection = httpURLConnection2;
                            th = th2;
                            if (httpURLConnection != null) {
                            }
                            if (inputStreamReader != null) {
                            }
                            throw th;
                        }
                    } catch (Exception e5) {
                        inputStreamReader2 = null;
                        httpURLConnection = httpURLConnection2;
                        e = e5;
                    } catch (Throwable th3) {
                        inputStreamReader = null;
                        httpURLConnection = httpURLConnection2;
                        th = th3;
                    }
                } catch (Exception e6) {
                    e = e6;
                    inputStreamReader2 = null;
                } catch (Throwable th4) {
                    th = th4;
                    inputStreamReader = null;
                }
                C1615e.this.a().sendMessage(message);
            }
        });
    }

    @Override // com.fimi.kernel.p158b.AbstractC1586a
    /* renamed from: a */
    public <T> void mo34911a(String str, AbstractC1632e<T> abstractC1632e, Class<?> cls) {
    }

    @Override // com.fimi.kernel.p158b.AbstractC1586a
    /* renamed from: a */
    public void mo34910a(String str, Map<String, String> map, AbstractC1632e<String> abstractC1632e) {
    }

    @Override // com.fimi.kernel.p158b.AbstractC1586a
    /* renamed from: a */
    public <T> void mo34909a(String str, Map<String, String> map, AbstractC1632e<T> abstractC1632e, Class<?> cls) {
    }

    @Override // com.fimi.kernel.p158b.AbstractC1586a
    /* renamed from: a */
    public void mo34908a(String str, JSONObject jSONObject, AbstractC1632e<JSONObject> abstractC1632e) {
    }

    @Override // com.fimi.kernel.p158b.AbstractC1586a
    /* renamed from: b */
    public void mo34907b(String str, AbstractC1632e<String> abstractC1632e) {
    }

    @Override // com.fimi.kernel.p158b.AbstractC1586a
    /* renamed from: b */
    public <T> void mo34906b(String str, AbstractC1632e<T> abstractC1632e, Class<?> cls) {
    }

    @Override // com.fimi.kernel.p158b.AbstractC1586a
    /* renamed from: b */
    public void mo34905b(String str, JSONObject jSONObject, AbstractC1632e<JSONObject> abstractC1632e) {
    }

    @Override // com.fimi.kernel.p158b.AbstractC1586a
    /* renamed from: c */
    public void mo34904c(String str, AbstractC1632e<JSONObject> abstractC1632e) {
    }

    @Override // com.fimi.kernel.p158b.AbstractC1586a
    /* renamed from: d */
    public void mo34903d(String str, AbstractC1632e<JSONObject> abstractC1632e) {
    }
}

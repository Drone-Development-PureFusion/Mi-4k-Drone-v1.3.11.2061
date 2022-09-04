package com.fimi.soul.biz.p184l;

import android.util.Log;
import com.facebook.common.util.UriUtil;
import com.google.gson.Gson;
import com.xiaomi.infra.galaxy.fds.android.auth.GalaxyFDSCredential;
import com.xiaomi.infra.galaxy.fds.android.exception.GalaxyFDSClientException;
import com.xiaomi.infra.galaxy.fds.android.model.HttpMethod;
import com.xiaomi.infra.galaxy.fds.android.model.InitMultipartUploadResult;
import com.xiaomi.infra.galaxy.fds.android.model.ObjectMetadata;
import com.xiaomi.infra.galaxy.fds.android.model.ProgressListener;
import com.xiaomi.infra.galaxy.fds.android.model.PutObjectResult;
import com.xiaomi.infra.galaxy.fds.android.model.UploadPartResult;
import com.xiaomi.infra.galaxy.fds.android.model.UploadPartResultList;
import com.xiaomi.infra.galaxy.fds.android.model.UserParam;
import com.xiaomi.infra.galaxy.fds.android.util.Args;
import com.xiaomi.infra.galaxy.fds.android.util.Consts;
import com.xiaomi.infra.galaxy.fds.android.util.RequestFactory;
import com.xiaomi.infra.galaxy.fds.android.util.Util;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
/* renamed from: com.fimi.soul.biz.l.h */
/* loaded from: classes.dex */
public class C1922h {

    /* renamed from: b */
    String f5333b;

    /* renamed from: c */
    String f5334c;

    /* renamed from: d */
    List<UserParam> f5335d;

    /* renamed from: e */
    BufferedInputStream f5336e;

    /* renamed from: f */
    ByteArrayOutputStream f5337f;

    /* renamed from: g */
    ObjectMetadata f5338g;

    /* renamed from: h */
    ProgressListener f5339h;

    /* renamed from: i */
    C1919f f5340i;

    /* renamed from: j */
    public File f5341j;

    /* renamed from: l */
    ArrayList f5343l;

    /* renamed from: m */
    private final C1917d f5344m;

    /* renamed from: n */
    private final HttpClient f5345n;

    /* renamed from: o */
    private long f5346o;

    /* renamed from: s */
    private long f5350s;

    /* renamed from: a */
    String f5332a = null;

    /* renamed from: p */
    private boolean f5347p = false;

    /* renamed from: q */
    private int f5348q = 1;

    /* renamed from: r */
    private int f5349r = 0;

    /* renamed from: k */
    int f5342k = 0;

    public C1922h(C1917d c1917d) {
        this.f5340i = null;
        this.f5344m = c1917d;
        this.f5345n = m33522a(this.f5344m);
        this.f5340i = new C1919f();
    }

    @Deprecated
    public C1922h(String str, GalaxyFDSCredential galaxyFDSCredential, C1917d c1917d) {
        this.f5340i = null;
        this.f5344m = c1917d;
        this.f5344m.m33587a(galaxyFDSCredential);
        this.f5345n = m33522a(this.f5344m);
        this.f5340i = new C1919f();
    }

    /* renamed from: a */
    private InitMultipartUploadResult m33520a(String str, String str2, long j) {
        String str3 = this.f5344m.m33542r() + "/" + str + "/" + (str2 == null ? "" : str2) + "?uploads";
        InputStream inputStream = null;
        try {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put(Consts.ESTIMATED_OBJECT_SIZE, Long.toString(j));
                HttpResponse execute = this.f5345n.execute(RequestFactory.createRequest(str3, this.f5344m.m33564f(), str2 == null ? HttpMethod.POST : HttpMethod.PUT, hashMap));
                inputStream = execute.getEntity().getContent();
                if (execute.getStatusLine().getStatusCode() != 200) {
                    throw new GalaxyFDSClientException("Unable to upload object[" + str + "/" + str2 + "] to URI :" + str3 + ". Fail to initiate multipart upload: " + execute.getStatusLine().toString());
                }
                InitMultipartUploadResult initMultipartUploadResult = (InitMultipartUploadResult) new Gson().fromJson((Reader) new InputStreamReader(inputStream), (Class<Object>) InitMultipartUploadResult.class);
                this.f5334c = initMultipartUploadResult.getObjectName();
                if (initMultipartUploadResult == null || initMultipartUploadResult.getUploadId() == null || initMultipartUploadResult.getObjectName() == null || initMultipartUploadResult.getBucketName() == null) {
                    throw new GalaxyFDSClientException("Fail to parse the result of init multipart upload. bucket name:" + str + ", object name:" + str2);
                }
                this.f5332a = initMultipartUploadResult.getUploadId();
                return initMultipartUploadResult;
            } catch (IOException e) {
                throw new GalaxyFDSClientException("Fail to initiate multipart upload. URI:" + str3, e);
            }
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* renamed from: a */
    private PutObjectResult m33517a(String str, String str2, String str3, ObjectMetadata objectMetadata, UploadPartResultList uploadPartResultList, List<UserParam> list) {
        Map<String, String> allMetadata;
        ?? sb = new StringBuilder();
        sb.append(this.f5344m.m33542r() + "/" + str2 + "/" + str3 + "?uploadId=" + str);
        if (list != null) {
            for (UserParam userParam : list) {
                sb.append('&');
                sb.append(userParam.toString());
            }
        }
        String sb2 = sb.toString();
        try {
            if (objectMetadata != null) {
                try {
                    allMetadata = objectMetadata.getAllMetadata();
                } catch (IOException e) {
                    e = e;
                    this.f5340i.m33539a(false);
                    throw new GalaxyFDSClientException("Fail to complete multipart upload. URI:" + sb2, e);
                } catch (Throwable th) {
                    th = th;
                    sb = 0;
                    if (sb != 0) {
                        try {
                            sb.close();
                        } catch (IOException e2) {
                        }
                    }
                    throw th;
                }
            } else {
                allMetadata = null;
            }
            HttpPut createRequest = RequestFactory.createRequest(sb2, this.f5344m.m33564f(), HttpMethod.PUT, allMetadata);
            createRequest.setEntity(new StringEntity(new Gson().toJson(uploadPartResultList)));
            HttpResponse execute = this.f5345n.execute(createRequest);
            InputStream content = execute.getEntity().getContent();
            try {
                if (execute.getStatusLine().getStatusCode() != 200) {
                    throw new GalaxyFDSClientException("Unable to upload object[" + str2 + "/" + str3 + "] to URI :" + sb2 + ". Fail to complete multipart upload: " + execute.getStatusLine().toString());
                }
                PutObjectResult putObjectResult = (PutObjectResult) new Gson().fromJson((Reader) new InputStreamReader(content), (Class<Object>) PutObjectResult.class);
                if (putObjectResult == null || putObjectResult.getAccessKeyId() == null || putObjectResult.getSignature() == null || putObjectResult.getExpires() == 0) {
                    throw new GalaxyFDSClientException("Fail to parse the result of completing multipart upload. bucket name:" + str2 + ", object name:" + str3 + ", upload ID:" + str);
                }
                putObjectResult.setFdsServiceBaseUri(this.f5344m.m33545o());
                putObjectResult.setCdnServiceBaseUri(this.f5344m.m33544p());
                this.f5340i.m33537b(putObjectResult.getObjectName());
                this.f5340i.m33535c(putObjectResult.getAbsolutePresignedUri());
                if (content != null) {
                    try {
                        content.close();
                    } catch (IOException e3) {
                    }
                }
                return putObjectResult;
            } catch (IOException e4) {
                e = e4;
                this.f5340i.m33539a(false);
                throw new GalaxyFDSClientException("Fail to complete multipart upload. URI:" + sb2, e);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    private UploadPartResult m33518a(String str, String str2, String str3, int i, byte[] bArr) {
        HttpResponse execute;
        InputStream content;
        String str4 = this.f5344m.m33542r() + "/" + str2 + "/" + str3 + "?uploadId=" + str + "&partNumber=" + i;
        InputStream inputStream = null;
        while (true) {
            try {
                if (!this.f5347p) {
                    try {
                        HttpPut createRequest = RequestFactory.createRequest(str4, this.f5344m.m33564f(), HttpMethod.PUT, null);
                        createRequest.setEntity(new ByteArrayEntity(bArr));
                        execute = this.f5345n.execute(createRequest);
                        content = execute.getEntity().getContent();
                        break;
                    } catch (GalaxyFDSClientException e) {
                        InputStream inputStream2 = inputStream;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException e2) {
                            }
                        }
                        inputStream = inputStream2;
                    } catch (IOException e3) {
                        throw new GalaxyFDSClientException("Fail to put part. URI:" + str4, e3);
                    }
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                    }
                }
                throw th;
            }
        }
        if (execute.getStatusLine().getStatusCode() != 200) {
            throw new GalaxyFDSClientException("Unable to upload object[" + str2 + "/" + str3 + "] to URI :" + str4 + ". Fail to upload part " + i + ": " + execute.getStatusLine().toString());
        }
        UploadPartResult uploadPartResult = (UploadPartResult) new Gson().fromJson((Reader) new InputStreamReader(content), (Class<Object>) UploadPartResult.class);
        if (uploadPartResult == null || uploadPartResult.getEtag() == null || uploadPartResult.getPartSize() == 0) {
            throw new GalaxyFDSClientException("Fail to parse the result of uploading part. bucket name:" + str2 + ", object name:" + str3 + ", upload ID:" + str);
        }
        if (content != null) {
            try {
                content.close();
            } catch (IOException e5) {
            }
        }
        return uploadPartResult;
    }

    /* renamed from: a */
    private HttpClient m33522a(C1917d c1917d) {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, c1917d.m33576c());
        HttpConnectionParams.setSoTimeout(basicHttpParams, c1917d.m33582b());
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, true);
        HttpConnectionParams.setTcpNoDelay(basicHttpParams, true);
        int i = c1917d.m33572d()[0];
        int i2 = c1917d.m33572d()[1];
        if (i > 0 || i2 > 0) {
            HttpConnectionParams.setSocketBufferSize(basicHttpParams, Math.max(i, i2));
        }
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme(UriUtil.HTTP_SCHEME, PlainSocketFactory.getSocketFactory(), 80));
        if (c1917d.m33550j()) {
            SSLSocketFactory socketFactory = SSLSocketFactory.getSocketFactory();
            socketFactory.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            schemeRegistry.register(new Scheme(UriUtil.HTTPS_SCHEME, socketFactory, 443));
        }
        return new DefaultHttpClient(new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams);
    }

    /* renamed from: a */
    private void m33519a(String str, String str2, String str3) {
        InputStream inputStream = null;
        String str4 = this.f5344m.m33542r() + "/" + str + "/" + str2 + "?uploadId=" + str3;
        try {
            try {
                HttpResponse execute = this.f5345n.execute(RequestFactory.createRequest(str4, this.f5344m.m33564f(), HttpMethod.DELETE, null));
                inputStream = execute.getEntity().getContent();
                if (execute.getStatusLine().getStatusCode() != 200) {
                    throw new GalaxyFDSClientException("Unable to upload object[" + str + "/" + str2 + "] to URI :" + str4 + ". Fail to abort multipart upload: " + execute.getStatusLine().toString());
                } else if (inputStream == null) {
                } else {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                    }
                }
            } catch (IOException e2) {
                this.f5340i.m33539a(false);
                throw new GalaxyFDSClientException("Fail to abort multipart upload. URI:" + str4, e2);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                }
            }
            throw th;
        }
    }

    /* renamed from: a */
    public int m33524a() {
        return this.f5348q;
    }

    /* renamed from: a */
    public void m33523a(int i) {
        this.f5348q = i;
    }

    /* renamed from: a */
    public void m33521a(String str, File file, List<UserParam> list, ProgressListener progressListener) {
        Args.notNull(file, "file");
        this.f5333b = str;
        this.f5341j = file;
        this.f5339h = progressListener;
        this.f5335d = list;
        try {
            this.f5336e = new BufferedInputStream(new FileInputStream(file));
            this.f5346o = file.length();
            this.f5338g = new ObjectMetadata();
            this.f5338g.setContentLength(file.length());
            this.f5338g.setContentType(Util.getMimeType(file));
            this.f5338g.setLastModified(new Date(file.lastModified()));
            this.f5334c = UUID.randomUUID().toString() + file.getName().substring(file.getName().lastIndexOf("."));
            m33520a(str, this.f5334c, this.f5338g.getContentLength());
        } catch (FileNotFoundException e) {
            throw new GalaxyFDSClientException("Unable to find the file to be uploaded:" + file.getAbsolutePath(), e);
        }
    }

    /* renamed from: b */
    public C1919f m33516b() {
        int read;
        int m33568e = this.f5344m.m33568e();
        UploadPartResultList uploadPartResultList = new UploadPartResultList();
        try {
            this.f5336e = new BufferedInputStream(new FileInputStream(this.f5341j));
            if (this.f5350s > 0) {
                this.f5336e.skip(this.f5346o - this.f5350s);
            } else {
                this.f5350s = this.f5346o;
                this.f5349r = (int) (this.f5350s % ((long) m33568e) == 0 ? this.f5350s / m33568e : (this.f5350s / m33568e) + 1);
                this.f5343l = new ArrayList(this.f5349r);
            }
            int i = (int) (this.f5350s % ((long) m33568e) == 0 ? this.f5350s / m33568e : (this.f5350s / m33568e) + 1);
            for (int i2 = this.f5348q; i2 <= this.f5349r; i2++) {
                long min = Math.min(m33568e, this.f5350s);
                this.f5337f = new ByteArrayOutputStream((int) min);
                byte[] bArr = new byte[1048576];
                while (!this.f5347p) {
                    int min2 = Math.min(bArr.length, (int) min);
                    if (min <= 0 || (read = this.f5336e.read(bArr, 0, min2)) == -1) {
                        break;
                    }
                    this.f5337f.write(bArr, 0, read);
                    min -= read;
                    this.f5350s -= read;
                    this.f5342k = read + this.f5342k;
                    this.f5339h.onProgress(this.f5342k, this.f5346o);
                    Log.i("ljh", "finish percent : " + ((this.f5342k * 100) / this.f5346o));
                    try {
                        Thread.sleep(500L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                UploadPartResult m33518a = m33518a(this.f5332a, this.f5333b, this.f5334c, i2, this.f5337f.toByteArray());
                if (m33518a != null) {
                    this.f5343l.add(m33518a);
                }
                this.f5348q = i2 + 1;
            }
            uploadPartResultList.setUploadPartResultList(this.f5343l);
            m33517a(this.f5332a, this.f5333b, this.f5334c, this.f5338g, uploadPartResultList, this.f5335d);
            this.f5340i.m33539a(true);
        } catch (GalaxyFDSClientException e2) {
            try {
                m33519a(this.f5333b, this.f5334c, this.f5332a);
            } catch (GalaxyFDSClientException e3) {
                e3.printStackTrace();
                this.f5340i.m33539a(false);
            }
        } catch (FileNotFoundException e4) {
            e4.printStackTrace();
            this.f5340i.m33539a(false);
        } catch (IOException e5) {
            e5.printStackTrace();
            this.f5340i.m33539a(false);
        }
        return this.f5340i;
    }

    /* renamed from: c */
    public void m33515c() {
        this.f5347p = true;
    }

    /* renamed from: d */
    public void m33514d() {
        Thread.interrupted();
        this.f5348q = 0;
        this.f5350s = 0L;
    }

    /* renamed from: e */
    public C1919f m33513e() {
        this.f5347p = false;
        return m33516b();
    }
}

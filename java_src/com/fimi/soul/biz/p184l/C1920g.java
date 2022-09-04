package com.fimi.soul.biz.p184l;

import android.content.Context;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.p176d.C1833a;
import com.fimi.soul.entity.FdsMsg;
import com.fimi.soul.entity.PlaneMsg;
import com.xiaomi.infra.galaxy.fds.android.FDSClientConfiguration;
import com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClient;
import com.xiaomi.infra.galaxy.fds.android.GalaxyFDSClientImpl;
import com.xiaomi.infra.galaxy.fds.android.auth.OAuthCredential;
import com.xiaomi.infra.galaxy.fds.android.exception.GalaxyFDSClientException;
import com.xiaomi.infra.galaxy.fds.android.model.ExpiresParam;
import com.xiaomi.infra.galaxy.fds.android.model.FDSObject;
import com.xiaomi.infra.galaxy.fds.android.model.ObjectMetadata;
import com.xiaomi.infra.galaxy.fds.android.model.ProgressListener;
import com.xiaomi.infra.galaxy.fds.android.model.PutObjectResult;
import com.xiaomi.infra.galaxy.fds.android.model.UserParam;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.fimi.soul.biz.l.g */
/* loaded from: classes.dex */
public class C1920g {

    /* renamed from: a */
    private Context f5326a;

    /* renamed from: b */
    private GalaxyFDSClient f5327b;

    /* renamed from: c */
    private String f5328c = null;

    /* renamed from: d */
    private String f5329d = null;

    /* renamed from: e */
    private List<UserParam> f5330e;

    /* renamed from: f */
    private AbstractC1921a f5331f;

    /* renamed from: com.fimi.soul.biz.l.g$a */
    /* loaded from: classes.dex */
    public interface AbstractC1921a {
        /* renamed from: a */
        void mo33396a(C1922h c1922h);
    }

    public C1920g(Context context) {
        this.f5330e = null;
        this.f5330e = new ArrayList();
        this.f5326a = context;
    }

    /* renamed from: a */
    public PlaneMsg m33533a() {
        boolean z;
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            this.f5328c = C1833a.m33967c(this.f5326a, 0);
            this.f5329d = C1833a.m33969b(this.f5326a, 0);
            FDSClientConfiguration withFdsServiceBaseUri = new FDSClientConfiguration().withCredential(new OAuthCredential(C1756a.f4555n, "2882303761517518920", "2882303761517518920", this.f5328c, C1756a.f4566y, this.f5329d, C1756a.f4557p)).withFdsServiceBaseUri(C1756a.f4555n);
            withFdsServiceBaseUri.setRegionName("awsusor0");
            withFdsServiceBaseUri.setUploadPartSize(5242880);
            this.f5327b = new GalaxyFDSClientImpl(withFdsServiceBaseUri);
            this.f5330e.add(new ExpiresParam(System.currentTimeMillis() + 3153600000000L));
            z = true;
        } catch (GalaxyFDSClientException e) {
            e.printStackTrace();
            planeMsg.setErrorMessage(e.getMessage());
            z = false;
        }
        planeMsg.setSuccess(z);
        return planeMsg;
    }

    /* renamed from: a */
    public PlaneMsg m33531a(File file) {
        boolean z = false;
        FdsMsg fdsMsg = new FdsMsg();
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            if (this.f5327b == null) {
                m33533a();
            }
            if (this.f5327b != null) {
                PutObjectResult putObject = this.f5327b.putObject(C1756a.f4556o, file, this.f5330e);
                fdsMsg.setBucketName(C1756a.f4556o);
                fdsMsg.setObjectName(putObject.getObjectName());
                fdsMsg.setUrl(putObject.getAbsolutePresignedUri());
                z = true;
            }
        } catch (GalaxyFDSClientException e) {
            e.printStackTrace();
            planeMsg.setErrorMessage(e.getMessage());
        }
        planeMsg.setSuccess(z);
        planeMsg.setData(fdsMsg);
        return planeMsg;
    }

    /* renamed from: a */
    public PlaneMsg m33530a(File file, ProgressListener progressListener) {
        boolean z = false;
        FdsMsg fdsMsg = new FdsMsg();
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            if (this.f5327b == null) {
                m33533a();
            }
            if (this.f5327b != null) {
                PutObjectResult putObject = this.f5327b.putObject(C1756a.f4556o, file, this.f5330e, progressListener);
                fdsMsg.setBucketName(C1756a.f4556o);
                fdsMsg.setObjectName(putObject.getObjectName());
                fdsMsg.setUrl(putObject.getAbsolutePresignedUri());
                z = true;
            }
        } catch (GalaxyFDSClientException e) {
            e.printStackTrace();
            planeMsg.setErrorMessage(e.getMessage());
        }
        planeMsg.setSuccess(z);
        planeMsg.setData(fdsMsg);
        return planeMsg;
    }

    /* renamed from: a */
    public PlaneMsg m33529a(InputStream inputStream, ObjectMetadata objectMetadata) {
        PlaneMsg planeMsg = new PlaneMsg();
        FdsMsg fdsMsg = new FdsMsg();
        boolean z = false;
        try {
            if (this.f5327b == null) {
                m33533a();
            }
            if (this.f5327b != null) {
                PutObjectResult putObject = this.f5327b.putObject(C1756a.f4556o, inputStream, objectMetadata, this.f5330e);
                fdsMsg.setBucketName(C1756a.f4556o);
                fdsMsg.setObjectName(putObject.getObjectName());
                fdsMsg.setUrl(putObject.getAbsolutePresignedUri());
                z = true;
            }
        } catch (GalaxyFDSClientException e) {
            e.printStackTrace();
            planeMsg.setErrorMessage(e.getMessage());
        }
        planeMsg.setSuccess(z);
        planeMsg.setData(fdsMsg);
        return planeMsg;
    }

    /* renamed from: a */
    public PlaneMsg m33528a(InputStream inputStream, ObjectMetadata objectMetadata, ProgressListener progressListener) {
        boolean z;
        PlaneMsg planeMsg = new PlaneMsg();
        FdsMsg fdsMsg = new FdsMsg();
        try {
            if (this.f5327b == null) {
                m33533a();
            }
        } catch (GalaxyFDSClientException e) {
            e.printStackTrace();
            planeMsg.setErrorMessage(e.getMessage());
        }
        if (this.f5327b != null) {
            PutObjectResult putObject = this.f5327b.putObject(C1756a.f4556o, inputStream, objectMetadata, this.f5330e, progressListener);
            fdsMsg.setBucketName(C1756a.f4556o);
            fdsMsg.setObjectName(putObject.getObjectName());
            fdsMsg.setUrl(putObject.getAbsolutePresignedUri());
            z = true;
            planeMsg.setSuccess(z);
            planeMsg.setData(fdsMsg);
            return planeMsg;
        }
        z = false;
        planeMsg.setSuccess(z);
        planeMsg.setData(fdsMsg);
        return planeMsg;
    }

    /* renamed from: a */
    public File m33527a(String str) {
        try {
            if (this.f5327b == null) {
                m33533a();
            }
            this.f5327b.getObject(C1756a.f4556o, str, null);
        } catch (GalaxyFDSClientException e) {
            e.printStackTrace();
        }
        return null;
    }

    /* renamed from: a */
    public void m33532a(AbstractC1921a abstractC1921a) {
        this.f5331f = abstractC1921a;
    }

    /* renamed from: b */
    public PlaneMsg m33526b(File file, ProgressListener progressListener) {
        FdsMsg fdsMsg = new FdsMsg();
        PlaneMsg planeMsg = new PlaneMsg();
        this.f5328c = C1833a.m33967c(this.f5326a, 0);
        this.f5329d = C1833a.m33969b(this.f5326a, 0);
        try {
            C1917d m33578b = new C1917d().m33579b(new OAuthCredential(C1756a.f4555n, "2882303761517518920", "2882303761517518920", this.f5328c, C1756a.f4566y, this.f5329d, C1756a.f4557p)).m33578b(C1756a.f4555n);
            m33578b.m33559g(5242880);
            m33578b.m33566e("awsusor0");
            this.f5330e.add(new ExpiresParam(System.currentTimeMillis() + 3153600000000L));
            C1922h c1922h = new C1922h(m33578b);
            if (this.f5331f != null) {
                this.f5331f.mo33396a(c1922h);
            }
            c1922h.m33521a(C1756a.f4556o, file, this.f5330e, progressListener);
            fdsMsg.setBucketName(C1756a.f4556o);
            C1919f m33516b = c1922h.m33516b();
            if (m33516b != null) {
                fdsMsg.setObjectName(m33516b.m33536c());
                fdsMsg.setUrl(m33516b.m33534d());
                planeMsg.setSuccess(m33516b.m33541a());
            }
        } catch (GalaxyFDSClientException e) {
            e.printStackTrace();
            planeMsg.setErrorMessage(e.getMessage());
            planeMsg.setSuccess(false);
        }
        planeMsg.setData(fdsMsg);
        planeMsg.setFile(file);
        return planeMsg;
    }

    /* renamed from: b */
    public InputStream m33525b(String str) {
        FDSObject fDSObject;
        try {
            if (this.f5327b == null) {
                m33533a();
            }
            fDSObject = this.f5327b.getObject(C1756a.f4556o, str);
        } catch (GalaxyFDSClientException e) {
            e.printStackTrace();
            fDSObject = null;
        }
        if (fDSObject != null) {
            return fDSObject.getObjectContent();
        }
        return null;
    }
}

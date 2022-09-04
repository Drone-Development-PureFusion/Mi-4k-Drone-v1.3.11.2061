package com.fimi.soul.biz.update;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.fimi.kernel.AbstractC1584b;
import com.fimi.kernel.C1642c;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.module.update.C3029b;
import com.fimi.soul.utils.C3129m;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
/* renamed from: com.fimi.soul.biz.update.c */
/* loaded from: classes.dex */
public abstract class AbstractC2056c extends AbstractC1584b {

    /* renamed from: a */
    protected static final int f5763a = 9898;

    /* renamed from: b */
    public static boolean f5764b = false;

    /* renamed from: c */
    public static boolean f5765c = false;

    /* renamed from: d */
    public static final int f5766d = -1;

    /* renamed from: e */
    public static final int f5767e = -2;

    /* renamed from: f */
    private AbstractC2077i f5768f;

    /* renamed from: g */
    private long f5769g;

    /* renamed from: h */
    private UpdateVersonBean f5770h;

    /* renamed from: i */
    private UpdateVersonBean f5771i;

    /* renamed from: j */
    private Gson f5772j = new Gson();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m33126a(int i, int i2, int i3) {
        Message message = new Message();
        message.what = f5763a;
        message.arg1 = i;
        message.arg2 = i2;
        Bundle bundle = new Bundle();
        bundle.putInt("arg3", i3);
        message.setData(bundle);
        a().sendMessage(message);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.kernel.AbstractC1584b
    /* renamed from: a */
    public void mo30955a(Message message) {
        boolean z = true;
        if (message.what == f5763a) {
            if (message.arg1 != 1) {
                z = false;
            }
            this.f5768f.mo28035a(z, message.arg2, this.f5769g, message.getData().getInt("arg3"));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m33123a(UpdateVersonBean updateVersonBean) {
        this.f5771i = updateVersonBean;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m33122a(final UpdateVersonBean updateVersonBean, final String str, AbstractC2077i abstractC2077i) {
        this.f5768f = abstractC2077i;
        Log.d("moweiru", "downloadFile");
        a(new Runnable() { // from class: com.fimi.soul.biz.update.c.1
            /* JADX WARN: Code restructure failed: missing block: B:48:0x00c2, code lost:
                r8.f5775c.m33126a(1, 0, r2.getSysid());
             */
            /* JADX WARN: Removed duplicated region for block: B:83:0x00eb A[Catch: Exception -> 0x00f2, TRY_LEAVE, TryCatch #10 {Exception -> 0x00f2, blocks: (B:89:0x00e6, B:83:0x00eb), top: B:88:0x00e6 }] */
            /* JADX WARN: Removed duplicated region for block: B:88:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() {
                InputStream inputStream;
                FileOutputStream fileOutputStream;
                FileOutputStream fileOutputStream2;
                FileOutputStream fileOutputStream3 = null;
                fileOutputStream3 = null;
                InputStream inputStream2 = null;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(updateVersonBean.getUrl()).openConnection();
                    httpURLConnection.setConnectTimeout(50000);
                    httpURLConnection.setReadTimeout(100000);
                    httpURLConnection.setRequestMethod("GET");
                    File file = new File(str);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    if (httpURLConnection.getResponseCode() == 200) {
                        inputStream = httpURLConnection.getInputStream();
                        try {
                            fileOutputStream2 = new FileOutputStream(file);
                            try {
                                AbstractC2056c.this.f5769g = httpURLConnection.getContentLength();
                                byte[] bArr = new byte[2048];
                                int i = 0;
                                while (true) {
                                    int read = inputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    } else if (AbstractC2056c.f5765c) {
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (Exception e) {
                                                e.printStackTrace();
                                                return;
                                            }
                                        }
                                        if (fileOutputStream2 == null) {
                                            return;
                                        }
                                        fileOutputStream2.flush();
                                        fileOutputStream2.close();
                                        return;
                                    } else if (AbstractC2056c.f5764b) {
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (Exception e2) {
                                                e2.printStackTrace();
                                                return;
                                            }
                                        }
                                        if (fileOutputStream2 == null) {
                                            return;
                                        }
                                        fileOutputStream2.flush();
                                        fileOutputStream2.close();
                                        return;
                                    } else {
                                        fileOutputStream2.write(bArr, 0, read);
                                        i += read;
                                        AbstractC2056c.this.m33126a(0, i, updateVersonBean.getSysid());
                                    }
                                }
                            } catch (Exception e3) {
                                fileOutputStream = fileOutputStream2;
                                inputStream2 = inputStream;
                                try {
                                    if (!AbstractC2056c.f5764b) {
                                        AbstractC2056c.this.m33126a(1, -2, updateVersonBean.getSysid());
                                    }
                                    if (inputStream2 != null) {
                                        try {
                                            inputStream2.close();
                                        } catch (Exception e4) {
                                            e4.printStackTrace();
                                            return;
                                        }
                                    }
                                    if (fileOutputStream == null) {
                                        return;
                                    }
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                    return;
                                } catch (Throwable th) {
                                    inputStream = inputStream2;
                                    fileOutputStream3 = fileOutputStream;
                                    th = th;
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Exception e5) {
                                            e5.printStackTrace();
                                            throw th;
                                        }
                                    }
                                    if (fileOutputStream3 != null) {
                                        fileOutputStream3.flush();
                                        fileOutputStream3.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                fileOutputStream3 = fileOutputStream2;
                                if (inputStream != null) {
                                }
                                if (fileOutputStream3 != null) {
                                }
                                throw th;
                            }
                        } catch (Exception e6) {
                            fileOutputStream = null;
                            inputStream2 = inputStream;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        fileOutputStream2 = null;
                        inputStream = null;
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e7) {
                            e7.printStackTrace();
                            return;
                        }
                    }
                    if (fileOutputStream2 == null) {
                        return;
                    }
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                } catch (Exception e8) {
                    fileOutputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    inputStream = null;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void m33121b(UpdateVersonBean updateVersonBean) {
        this.f5770h = updateVersonBean;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void m33120c(UpdateVersonBean updateVersonBean) {
        if (updateVersonBean != null) {
            this.f5770h = updateVersonBean;
            C1642c.m34887c().mo34879a(getClass().toString(), updateVersonBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public String m33119d(UpdateVersonBean updateVersonBean) {
        String str = "";
        int sysid = updateVersonBean.getSysid();
        if (sysid == 0) {
            str = C3029b.f11259D;
        } else if (sysid == 3) {
            str = C3029b.f11262G;
        } else if (sysid == 1) {
            str = C3029b.f11260E;
        } else if (sysid == 2) {
            str = C3029b.f11261F;
        } else if (sysid == 10) {
            str = C3029b.f11263H;
        } else if (sysid == 9) {
            str = C3029b.f11265J;
        } else if (sysid == 6) {
            str = C3029b.f11264I;
        } else if (sysid == 4) {
            str = "firmware.zip";
        } else if (sysid == 11) {
            str = C2080l.m33060a(updateVersonBean.getFileEncode());
        } else if (sysid == 15) {
            str = C2080l.m33059a(updateVersonBean.getFileEncode(), updateVersonBean.getNewVersion() + "");
        } else if (sysid == 26) {
            str = C2080l.m33054b(updateVersonBean.getFileEncode(), updateVersonBean.getNewVersion() + "");
        } else if (sysid == 14) {
            str = C2080l.m33049c(updateVersonBean.getFileEncode(), updateVersonBean.getNewVersion() + "");
        } else if (sysid == 25) {
            str = C2080l.m33045d(updateVersonBean.getFileEncode(), updateVersonBean.getNewVersion() + "");
        } else if (sysid == 17) {
            str = C3029b.f11278W;
        } else if (sysid == 16) {
            str = C3029b.f11279X;
        } else if (sysid == 12) {
            str = C3029b.f11280Y;
        } else if (sysid == 13) {
            str = C3029b.f11281Z;
        } else if (sysid == 18) {
            str = C3029b.f11272Q;
        } else if (sysid == 19) {
            str = C3029b.f11273R;
        } else if (sysid == 20) {
            str = C3029b.f11274S;
        } else if (sysid == 253) {
            str = C3029b.f11276U;
        } else if (sysid == 5) {
            str = C3029b.f11275T;
        } else if (sysid == 23) {
            str = C3029b.f11283aa;
        } else if (sysid == 24) {
            str = C3029b.f11277V;
        } else if (sysid == 27) {
            str = C3029b.f11257B;
        }
        return C3129m.m29045v() + str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public Gson m33118g() {
        return this.f5772j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public UpdateVersonBean m33117h() {
        return this.f5771i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public UpdateVersonBean m33116i() {
        return this.f5770h;
    }

    /* renamed from: j */
    public UpdateVersonBean m33115j() {
        if (this.f5770h == null) {
            this.f5770h = (UpdateVersonBean) C1642c.m34887c().mo34880a(getClass().toString(), UpdateVersonBean.class);
        }
        if (this.f5770h == null) {
            this.f5770h = new UpdateVersonBean();
        }
        return this.f5770h;
    }
}

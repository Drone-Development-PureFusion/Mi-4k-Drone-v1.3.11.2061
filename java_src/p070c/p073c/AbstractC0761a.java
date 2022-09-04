package p070c.p073c;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.NumberFormat;
import java.util.Properties;
import p070c.p072b.AbstractC0753i;
import p070c.p072b.AbstractC0756l;
import p070c.p072b.C0745b;
import p070c.p072b.C0759n;
/* renamed from: c.c.a */
/* loaded from: classes.dex */
public abstract class AbstractC0761a implements AbstractC0756l {

    /* renamed from: a */
    public static final String f1422a = "suite";

    /* renamed from: b */
    static int f1423b;

    /* renamed from: c */
    static boolean f1424c = true;

    /* renamed from: e */
    private static Properties f1425e;

    /* renamed from: d */
    boolean f1426d = true;

    static {
        f1423b = 500;
        f1423b = m38144a("maxmessage", f1423b);
    }

    /* renamed from: a */
    public static int m38144a(String str, int i) {
        String m38128h = m38128h(str);
        if (m38128h == null) {
            return i;
        }
        try {
            return Integer.parseInt(m38128h);
        } catch (NumberFormatException e) {
            return i;
        }
    }

    /* renamed from: a */
    public static String m38142a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return m38127i(stringWriter.toString());
    }

    /* renamed from: a */
    protected static Properties m38146a() {
        if (f1425e == null) {
            f1425e = new Properties();
            f1425e.put("loading", "true");
            f1425e.put("filterstack", "true");
            m38130g();
        }
        return f1425e;
    }

    /* renamed from: a */
    public static void m38143a(String str, String str2) {
        m38146a().put(str, str2);
    }

    /* renamed from: a */
    protected static void m38141a(Properties properties) {
        f1425e = properties;
    }

    /* renamed from: b */
    public static void m38138b() {
        FileOutputStream fileOutputStream = new FileOutputStream(m38131f());
        try {
            m38146a().store(fileOutputStream, "");
        } finally {
            fileOutputStream.close();
        }
    }

    /* renamed from: e */
    public static String m38132e(String str) {
        return (f1423b == -1 || str.length() <= f1423b) ? str : str.substring(0, f1423b) + "...";
    }

    /* renamed from: e */
    protected static boolean m38133e() {
        return !m38128h("filterstack").equals("true") || !f1424c;
    }

    /* renamed from: f */
    private static File m38131f() {
        return new File(System.getProperty("user.home"), "junit.properties");
    }

    /* renamed from: g */
    private static void m38130g() {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(m38131f());
        } catch (IOException e) {
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            m38141a(new Properties(m38146a()));
            m38146a().load(fileInputStream);
            if (fileInputStream == null) {
                return;
            }
            try {
                fileInputStream.close();
            } catch (IOException e2) {
            }
        } catch (IOException e3) {
            if (fileInputStream == null) {
                return;
            }
            try {
                fileInputStream.close();
            } catch (IOException e4) {
            }
        } catch (Throwable th2) {
            fileInputStream2 = fileInputStream;
            th = th2;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException e5) {
                }
            }
            throw th;
        }
    }

    /* renamed from: h */
    public static String m38128h(String str) {
        return m38146a().getProperty(str);
    }

    /* renamed from: i */
    public static String m38127i(String str) {
        if (m38133e()) {
            return str;
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return stringWriter.toString();
                }
                if (!m38126j(readLine)) {
                    printWriter.println(readLine);
                }
            } catch (Exception e) {
                return str;
            }
        }
    }

    /* renamed from: j */
    static boolean m38126j(String str) {
        for (String str2 : new String[]{"junit.framework.TestCase", "junit.framework.TestResult", "junit.framework.TestSuite", "junit.framework.Assert.", "junit.swingui.TestRunner", "junit.awtui.TestRunner", "junit.textui.TestRunner", "java.lang.reflect.Method.invoke("}) {
            if (str.indexOf(str2) > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public String m38145a(long j) {
        return NumberFormat.getInstance().format(j / 1000.0d);
    }

    /* renamed from: a */
    protected String m38139a(String[] strArr) {
        String str = null;
        int i = 0;
        while (i < strArr.length) {
            if (strArr[i].equals("-noloading")) {
                m38140a(false);
            } else if (strArr[i].equals("-nofilterstack")) {
                f1424c = false;
            } else if (strArr[i].equals("-c")) {
                if (strArr.length > i + 1) {
                    str = m38134d(strArr[i + 1]);
                } else {
                    System.out.println("Missing Test class name");
                }
                i++;
            } else {
                str = strArr[i];
            }
            str = str;
            i++;
        }
        return str;
    }

    /* renamed from: a */
    public abstract void mo38105a(int i, AbstractC0753i abstractC0753i, Throwable th);

    @Override // p070c.p072b.AbstractC0756l
    /* renamed from: a */
    public synchronized void mo836a(AbstractC0753i abstractC0753i) {
        mo38099b(abstractC0753i.toString());
    }

    @Override // p070c.p072b.AbstractC0756l
    /* renamed from: a */
    public synchronized void mo835a(AbstractC0753i abstractC0753i, C0745b c0745b) {
        mo38105a(2, abstractC0753i, c0745b);
    }

    @Override // p070c.p072b.AbstractC0756l
    /* renamed from: a */
    public synchronized void mo834a(AbstractC0753i abstractC0753i, Throwable th) {
        mo38105a(1, abstractC0753i, th);
    }

    /* renamed from: a */
    public abstract void mo38101a(String str);

    /* renamed from: a */
    public void m38140a(boolean z) {
        this.f1426d = z;
    }

    @Override // p070c.p072b.AbstractC0756l
    /* renamed from: b */
    public synchronized void mo833b(AbstractC0753i abstractC0753i) {
        mo38101a(abstractC0753i.toString());
    }

    /* renamed from: b */
    public abstract void mo38099b(String str);

    /* renamed from: c */
    public AbstractC0753i m38136c(String str) {
        if (str.length() <= 0) {
            m38137c();
            return null;
        }
        try {
            Class<?> m38129g = m38129g(str);
            try {
                Method method = m38129g.getMethod(f1422a, new Class[0]);
                if (!Modifier.isStatic(method.getModifiers())) {
                    mo38091f("Suite() method must be static");
                    return null;
                }
                try {
                    AbstractC0753i abstractC0753i = (AbstractC0753i) method.invoke(null, new Object[0]);
                    if (abstractC0753i == null) {
                        return abstractC0753i;
                    }
                    m38137c();
                    return abstractC0753i;
                } catch (IllegalAccessException e) {
                    mo38091f("Failed to invoke suite():" + e.toString());
                    return null;
                } catch (InvocationTargetException e2) {
                    mo38091f("Failed to invoke suite():" + e2.getTargetException().toString());
                    return null;
                }
            } catch (Exception e3) {
                m38137c();
                return new C0759n(m38129g);
            }
        } catch (ClassNotFoundException e4) {
            String message = e4.getMessage();
            if (message != null) {
                str = message;
            }
            mo38091f("Class not found \"" + str + "\"");
            return null;
        } catch (Exception e5) {
            mo38091f("Error: " + e5.toString());
            return null;
        }
    }

    /* renamed from: c */
    protected void m38137c() {
    }

    /* renamed from: d */
    public String m38134d(String str) {
        return str.startsWith("Default package for") ? str.substring(str.lastIndexOf(".") + 1) : str;
    }

    /* renamed from: d */
    protected boolean m38135d() {
        return m38128h("loading").equals("true") && this.f1426d;
    }

    /* renamed from: f */
    protected abstract void mo38091f(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public Class<?> m38129g(String str) {
        return Class.forName(str);
    }
}

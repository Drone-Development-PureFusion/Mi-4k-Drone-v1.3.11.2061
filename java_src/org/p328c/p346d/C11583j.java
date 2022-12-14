package org.p328c.p346d;

import java.io.File;
import java.io.IOException;
/* renamed from: org.c.d.j */
/* loaded from: classes2.dex */
public class C11583j extends AbstractC11574e {

    /* renamed from: a */
    private final File f36707a;

    /* renamed from: b */
    private File f36708b;

    public C11583j() {
        this(null);
    }

    public C11583j(File file) {
        this.f36707a = file;
    }

    /* renamed from: a */
    private File m634a(File file) {
        File createTempFile = File.createTempFile("junit", "", file);
        createTempFile.delete();
        createTempFile.mkdir();
        return createTempFile;
    }

    /* renamed from: a */
    private boolean m635a(int i, String[] strArr) {
        return i == strArr.length + (-1);
    }

    /* renamed from: b */
    private void m630b(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                m630b(file2);
            }
        }
        file.delete();
    }

    /* renamed from: c */
    private void m627c(String str) {
        if (new File(str).getParent() != null) {
            throw new IOException("Folder name cannot consist of multiple path components separated by a file separator. Please use newFolder('MyParentFolder','MyFolder') to create hierarchies of folders");
        }
    }

    /* renamed from: a */
    public File m633a(String str) {
        File file = new File(m624f(), str);
        if (!file.createNewFile()) {
            throw new IOException("a file with the name '" + str + "' already exists in the test folder");
        }
        return file;
    }

    /* renamed from: a */
    public File m632a(String... strArr) {
        File m624f = m624f();
        int i = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            m627c(str);
            File file = new File(m624f, str);
            if (!file.mkdir() && m635a(i, strArr)) {
                throw new IOException("a folder with the name '" + str + "' already exists");
            }
            i++;
            m624f = file;
        }
        return m624f;
    }

    @Override // org.p328c.p346d.AbstractC11574e
    /* renamed from: a */
    protected void mo636a() {
        m628c();
    }

    /* renamed from: b */
    public File m629b(String str) {
        return m632a(str);
    }

    @Override // org.p328c.p346d.AbstractC11574e
    /* renamed from: b */
    protected void mo631b() {
        m623g();
    }

    /* renamed from: c */
    public void m628c() {
        this.f36708b = m634a(this.f36707a);
    }

    /* renamed from: d */
    public File m626d() {
        return File.createTempFile("junit", null, m624f());
    }

    /* renamed from: e */
    public File m625e() {
        return m634a(m624f());
    }

    /* renamed from: f */
    public File m624f() {
        if (this.f36708b == null) {
            throw new IllegalStateException("the temporary folder has not yet been created");
        }
        return this.f36708b;
    }

    /* renamed from: g */
    public void m623g() {
        if (this.f36708b != null) {
            m630b(this.f36708b);
        }
    }
}

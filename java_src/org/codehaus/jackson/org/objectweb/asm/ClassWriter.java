package org.codehaus.jackson.org.objectweb.asm;

import android.support.p001v4.view.accessibility.AccessibilityEventCompat;
import com.xiaomi.infra.galaxy.fds.android.util.Consts;
import it.p273a.p274a.AbstractC10866e;
import p005b.p006a.p007a.p029b.C0494h;
/* loaded from: classes3.dex */
public class ClassWriter implements ClassVisitor {
    public static final int COMPUTE_FRAMES = 2;
    public static final int COMPUTE_MAXS = 1;

    /* renamed from: a */
    static final byte[] f36866a;

    /* renamed from: A */
    MethodWriter f36867A;

    /* renamed from: B */
    MethodWriter f36868B;

    /* renamed from: D */
    private short f36869D;

    /* renamed from: E */
    Item[] f36870E;

    /* renamed from: F */
    String f36871F;

    /* renamed from: G */
    private final boolean f36872G;

    /* renamed from: H */
    private final boolean f36873H;

    /* renamed from: I */
    boolean f36874I;

    /* renamed from: J */
    ClassReader f36875J;

    /* renamed from: b */
    int f36876b;

    /* renamed from: c */
    int f36877c;

    /* renamed from: d */
    final ByteVector f36878d;

    /* renamed from: e */
    Item[] f36879e;

    /* renamed from: f */
    int f36880f;

    /* renamed from: g */
    final Item f36881g;

    /* renamed from: h */
    final Item f36882h;

    /* renamed from: i */
    final Item f36883i;

    /* renamed from: j */
    private int f36884j;

    /* renamed from: k */
    private int f36885k;

    /* renamed from: l */
    private int f36886l;

    /* renamed from: m */
    private int f36887m;

    /* renamed from: n */
    private int f36888n;

    /* renamed from: o */
    private int[] f36889o;

    /* renamed from: p */
    private int f36890p;

    /* renamed from: q */
    private ByteVector f36891q;

    /* renamed from: r */
    private int f36892r;

    /* renamed from: s */
    private int f36893s;

    /* renamed from: t */
    private AnnotationWriter f36894t;

    /* renamed from: u */
    private AnnotationWriter f36895u;

    /* renamed from: v */
    private Attribute f36896v;

    /* renamed from: w */
    private int f36897w;

    /* renamed from: x */
    private ByteVector f36898x;

    /* renamed from: y */
    FieldWriter f36899y;

    /* renamed from: z */
    FieldWriter f36900z;

    static {
        byte[] bArr = new byte[AbstractC10866e.f34822A];
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) ("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHHFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII".charAt(i) - 'A');
        }
        f36866a = bArr;
    }

    public ClassWriter(int i) {
        boolean z = true;
        this.f36877c = 1;
        this.f36878d = new ByteVector();
        this.f36879e = new Item[256];
        this.f36880f = (int) (0.75d * this.f36879e.length);
        this.f36881g = new Item();
        this.f36882h = new Item();
        this.f36883i = new Item();
        this.f36873H = (i & 1) != 0;
        this.f36872G = (i & 2) == 0 ? false : z;
    }

    public ClassWriter(ClassReader classReader, int i) {
        this(i);
        classReader.m261a(this);
        this.f36875J = classReader;
    }

    /* renamed from: a */
    private Item m246a(Item item) {
        Item item2 = this.f36879e[item.f36936j % this.f36879e.length];
        while (item2 != null && (item2.f36930b != item.f36930b || !item.m220a(item2))) {
            item2 = item2.f36937k;
        }
        return item2;
    }

    /* renamed from: a */
    private void m254a(int i, int i2, int i3) {
        this.f36878d.m267b(i, i2).putShort(i3);
    }

    /* renamed from: b */
    private Item m245b(String str) {
        this.f36882h.m222a(8, str, null, null);
        Item m246a = m246a(this.f36882h);
        if (m246a == null) {
            this.f36878d.m267b(8, newUTF8(str));
            int i = this.f36877c;
            this.f36877c = i + 1;
            Item item = new Item(i, this.f36882h);
            m244b(item);
            return item;
        }
        return m246a;
    }

    /* renamed from: b */
    private void m244b(Item item) {
        if (this.f36877c > this.f36880f) {
            int length = this.f36879e.length;
            int i = (length * 2) + 1;
            Item[] itemArr = new Item[i];
            for (int i2 = length - 1; i2 >= 0; i2--) {
                Item item2 = this.f36879e[i2];
                while (item2 != null) {
                    int length2 = item2.f36936j % itemArr.length;
                    Item item3 = item2.f36937k;
                    item2.f36937k = itemArr[length2];
                    itemArr[length2] = item2;
                    item2 = item3;
                }
            }
            this.f36879e = itemArr;
            this.f36880f = (int) (i * 0.75d);
        }
        int length3 = item.f36936j % this.f36879e.length;
        item.f36937k = this.f36879e[length3];
        this.f36879e[length3] = item;
    }

    /* renamed from: c */
    private Item m242c(Item item) {
        this.f36869D = (short) (this.f36869D + 1);
        Item item2 = new Item(this.f36869D, this.f36881g);
        m244b(item2);
        if (this.f36870E == null) {
            this.f36870E = new Item[16];
        }
        if (this.f36869D == this.f36870E.length) {
            Item[] itemArr = new Item[this.f36870E.length * 2];
            System.arraycopy(this.f36870E, 0, itemArr, 0, this.f36870E.length);
            this.f36870E = itemArr;
        }
        this.f36870E[this.f36869D] = item2;
        return item2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m255a(int i, int i2) {
        this.f36882h.f36930b = 15;
        this.f36882h.f36932d = i | (i2 << 32);
        this.f36882h.f36936j = Integer.MAX_VALUE & (i + 15 + i2);
        Item m246a = m246a(this.f36882h);
        if (m246a == null) {
            String str = this.f36870E[i].f36933g;
            String str2 = this.f36870E[i2].f36933g;
            this.f36882h.f36931c = m243c(getCommonSuperClass(str, str2));
            m246a = new Item(0, this.f36882h);
            m244b(m246a);
        }
        return m246a.f36931c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m250a(String str, int i) {
        this.f36881g.f36930b = 14;
        this.f36881g.f36931c = i;
        this.f36881g.f36933g = str;
        this.f36881g.f36936j = Integer.MAX_VALUE & (str.hashCode() + 14 + i);
        Item m246a = m246a(this.f36881g);
        if (m246a == null) {
            m246a = m242c(this.f36881g);
        }
        return m246a.f36929a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Item m258a(double d) {
        this.f36881g.m225a(d);
        Item m246a = m246a(this.f36881g);
        if (m246a == null) {
            this.f36878d.putByte(6).putLong(this.f36881g.f36932d);
            Item item = new Item(this.f36877c, this.f36881g);
            m244b(item);
            this.f36877c += 2;
            return item;
        }
        return m246a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Item m257a(float f) {
        this.f36881g.m224a(f);
        Item m246a = m246a(this.f36881g);
        if (m246a == null) {
            this.f36878d.putByte(4).putInt(this.f36881g.f36931c);
            int i = this.f36877c;
            this.f36877c = i + 1;
            Item item = new Item(i, this.f36881g);
            m244b(item);
            return item;
        }
        return m246a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Item m256a(int i) {
        this.f36881g.m223a(i);
        Item m246a = m246a(this.f36881g);
        if (m246a == null) {
            this.f36878d.putByte(3).putInt(i);
            int i2 = this.f36877c;
            this.f36877c = i2 + 1;
            Item item = new Item(i2, this.f36881g);
            m244b(item);
            return item;
        }
        return m246a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Item m253a(long j) {
        this.f36881g.m221a(j);
        Item m246a = m246a(this.f36881g);
        if (m246a == null) {
            this.f36878d.putByte(5).putLong(j);
            Item item = new Item(this.f36877c, this.f36881g);
            m244b(item);
            this.f36877c += 2;
            return item;
        }
        return m246a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Item m252a(Object obj) {
        if (obj instanceof Integer) {
            return m256a(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return m256a(((Byte) obj).intValue());
        }
        if (obj instanceof Character) {
            return m256a((int) ((Character) obj).charValue());
        }
        if (obj instanceof Short) {
            return m256a(((Short) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return m256a(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return m257a(((Float) obj).floatValue());
        } else {
            if (obj instanceof Long) {
                return m253a(((Long) obj).longValue());
            }
            if (obj instanceof Double) {
                return m258a(((Double) obj).doubleValue());
            }
            if (obj instanceof String) {
                return m245b((String) obj);
            }
            if (!(obj instanceof Type)) {
                throw new IllegalArgumentException(new StringBuffer().append("value ").append(obj).toString());
            }
            Type type = (Type) obj;
            return m251a(type.getSort() == 10 ? type.getInternalName() : type.getDescriptor());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Item m251a(String str) {
        this.f36882h.m222a(7, str, null, null);
        Item m246a = m246a(this.f36882h);
        if (m246a == null) {
            this.f36878d.m267b(7, newUTF8(str));
            int i = this.f36877c;
            this.f36877c = i + 1;
            Item item = new Item(i, this.f36882h);
            m244b(item);
            return item;
        }
        return m246a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Item m249a(String str, String str2) {
        this.f36882h.m222a(12, str, str2, null);
        Item m246a = m246a(this.f36882h);
        if (m246a == null) {
            m254a(12, newUTF8(str), newUTF8(str2));
            int i = this.f36877c;
            this.f36877c = i + 1;
            Item item = new Item(i, this.f36882h);
            m244b(item);
            return item;
        }
        return m246a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Item m248a(String str, String str2, String str3) {
        this.f36883i.m222a(9, str, str2, str3);
        Item m246a = m246a(this.f36883i);
        if (m246a == null) {
            m254a(9, newClass(str), newNameType(str2, str3));
            int i = this.f36877c;
            this.f36877c = i + 1;
            Item item = new Item(i, this.f36883i);
            m244b(item);
            return item;
        }
        return m246a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Item m247a(String str, String str2, String str3, boolean z) {
        int i = z ? 11 : 10;
        this.f36883i.m222a(i, str, str2, str3);
        Item m246a = m246a(this.f36883i);
        if (m246a == null) {
            m254a(i, newClass(str), newNameType(str2, str3));
            int i2 = this.f36877c;
            this.f36877c = i2 + 1;
            Item item = new Item(i2, this.f36883i);
            m244b(item);
            return item;
        }
        return m246a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m243c(String str) {
        this.f36881g.m222a(13, str, null, null);
        Item m246a = m246a(this.f36881g);
        if (m246a == null) {
            m246a = m242c(this.f36881g);
        }
        return m246a.f36929a;
    }

    protected String getCommonSuperClass(String str, String str2) {
        try {
            Class<?> cls = Class.forName(str.replace('/', C0494h.f686G));
            Class<?> cls2 = Class.forName(str2.replace('/', C0494h.f686G));
            if (cls.isAssignableFrom(cls2)) {
                return str;
            }
            if (cls2.isAssignableFrom(cls)) {
                return str2;
            }
            if (cls.isInterface() || cls2.isInterface()) {
                return "java/lang/Object";
            }
            do {
                cls = cls.getSuperclass();
            } while (!cls.isAssignableFrom(cls2));
            return cls.getName().replace(C0494h.f686G, '/');
        } catch (Exception e) {
            throw new RuntimeException(e.toString());
        }
    }

    public int newClass(String str) {
        return m251a(str).f36929a;
    }

    public int newConst(Object obj) {
        return m252a(obj).f36929a;
    }

    public int newField(String str, String str2, String str3) {
        return m248a(str, str2, str3).f36929a;
    }

    public int newMethod(String str, String str2, String str3, boolean z) {
        return m247a(str, str2, str3, z).f36929a;
    }

    public int newNameType(String str, String str2) {
        return m249a(str, str2).f36929a;
    }

    public int newUTF8(String str) {
        this.f36881g.m222a(1, str, null, null);
        Item m246a = m246a(this.f36881g);
        if (m246a == null) {
            this.f36878d.putByte(1).putUTF8(str);
            int i = this.f36877c;
            this.f36877c = i + 1;
            m246a = new Item(i, this.f36881g);
            m244b(m246a);
        }
        return m246a.f36929a;
    }

    public byte[] toByteArray() {
        int i;
        int i2 = (this.f36888n * 2) + 24;
        FieldWriter fieldWriter = this.f36899y;
        int i3 = 0;
        while (fieldWriter != null) {
            i2 += fieldWriter.m241a();
            fieldWriter = fieldWriter.f36904a;
            i3++;
        }
        MethodWriter methodWriter = this.f36867A;
        int i4 = 0;
        while (methodWriter != null) {
            i2 += methodWriter.m211a();
            methodWriter = methodWriter.f36969a;
            i4++;
        }
        if (this.f36886l != 0) {
            i = 1;
            i2 += 8;
            newUTF8(Consts.SIGNATURE);
        } else {
            i = 0;
        }
        if (this.f36890p != 0) {
            i++;
            i2 += 8;
            newUTF8("SourceFile");
        }
        if (this.f36891q != null) {
            i++;
            i2 += this.f36891q.f36860b + 4;
            newUTF8("SourceDebugExtension");
        }
        if (this.f36892r != 0) {
            i++;
            i2 += 10;
            newUTF8("EnclosingMethod");
        }
        if ((this.f36884j & 131072) != 0) {
            i++;
            i2 += 6;
            newUTF8("Deprecated");
        }
        if ((this.f36884j & 4096) != 0 && ((this.f36876b & 65535) < 49 || (this.f36884j & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) != 0)) {
            i++;
            i2 += 6;
            newUTF8("Synthetic");
        }
        if (this.f36898x != null) {
            i++;
            i2 += this.f36898x.f36860b + 8;
            newUTF8("InnerClasses");
        }
        if (this.f36894t != null) {
            i++;
            i2 += this.f36894t.m275a() + 8;
            newUTF8("RuntimeVisibleAnnotations");
        }
        if (this.f36895u != null) {
            i++;
            i2 += this.f36895u.m275a() + 8;
            newUTF8("RuntimeInvisibleAnnotations");
        }
        int i5 = i2;
        if (this.f36896v != null) {
            int m272a = i + this.f36896v.m272a();
            i5 += this.f36896v.m271a(this, null, 0, -1, -1);
            i = m272a;
        }
        ByteVector byteVector = new ByteVector(this.f36878d.f36860b + i5);
        byteVector.putInt(-889275714).putInt(this.f36876b);
        byteVector.putShort(this.f36877c).putByteArray(this.f36878d.f36859a, 0, this.f36878d.f36860b);
        byteVector.putShort(((393216 | ((this.f36884j & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) / 64)) ^ (-1)) & this.f36884j).putShort(this.f36885k).putShort(this.f36887m);
        byteVector.putShort(this.f36888n);
        for (int i6 = 0; i6 < this.f36888n; i6++) {
            byteVector.putShort(this.f36889o[i6]);
        }
        byteVector.putShort(i3);
        for (FieldWriter fieldWriter2 = this.f36899y; fieldWriter2 != null; fieldWriter2 = fieldWriter2.f36904a) {
            fieldWriter2.m240a(byteVector);
        }
        byteVector.putShort(i4);
        for (MethodWriter methodWriter2 = this.f36867A; methodWriter2 != null; methodWriter2 = methodWriter2.f36969a) {
            methodWriter2.m206a(byteVector);
        }
        byteVector.putShort(i);
        if (this.f36886l != 0) {
            byteVector.putShort(newUTF8(Consts.SIGNATURE)).putInt(2).putShort(this.f36886l);
        }
        if (this.f36890p != 0) {
            byteVector.putShort(newUTF8("SourceFile")).putInt(2).putShort(this.f36890p);
        }
        if (this.f36891q != null) {
            int i7 = this.f36891q.f36860b - 2;
            byteVector.putShort(newUTF8("SourceDebugExtension")).putInt(i7);
            byteVector.putByteArray(this.f36891q.f36859a, 2, i7);
        }
        if (this.f36892r != 0) {
            byteVector.putShort(newUTF8("EnclosingMethod")).putInt(4);
            byteVector.putShort(this.f36892r).putShort(this.f36893s);
        }
        if ((this.f36884j & 131072) != 0) {
            byteVector.putShort(newUTF8("Deprecated")).putInt(0);
        }
        if ((this.f36884j & 4096) != 0 && ((this.f36876b & 65535) < 49 || (this.f36884j & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) != 0)) {
            byteVector.putShort(newUTF8("Synthetic")).putInt(0);
        }
        if (this.f36898x != null) {
            byteVector.putShort(newUTF8("InnerClasses"));
            byteVector.putInt(this.f36898x.f36860b + 2).putShort(this.f36897w);
            byteVector.putByteArray(this.f36898x.f36859a, 0, this.f36898x.f36860b);
        }
        if (this.f36894t != null) {
            byteVector.putShort(newUTF8("RuntimeVisibleAnnotations"));
            this.f36894t.m274a(byteVector);
        }
        if (this.f36895u != null) {
            byteVector.putShort(newUTF8("RuntimeInvisibleAnnotations"));
            this.f36895u.m274a(byteVector);
        }
        if (this.f36896v != null) {
            this.f36896v.m270a(this, null, 0, -1, -1, byteVector);
        }
        if (this.f36874I) {
            ClassWriter classWriter = new ClassWriter(2);
            new ClassReader(byteVector.f36859a).accept(classWriter, 4);
            return classWriter.toByteArray();
        }
        return byteVector.f36859a;
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.ClassVisitor
    public void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
        this.f36876b = i;
        this.f36884j = i2;
        this.f36885k = newClass(str);
        this.f36871F = str;
        if (str2 != null) {
            this.f36886l = newUTF8(str2);
        }
        this.f36887m = str3 == null ? 0 : newClass(str3);
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        this.f36888n = strArr.length;
        this.f36889o = new int[this.f36888n];
        for (int i3 = 0; i3 < this.f36888n; i3++) {
            this.f36889o[i3] = newClass(strArr[i3]);
        }
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.ClassVisitor
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        byteVector.putShort(newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this, true, byteVector, byteVector, 2);
        if (z) {
            annotationWriter.f36855g = this.f36894t;
            this.f36894t = annotationWriter;
        } else {
            annotationWriter.f36855g = this.f36895u;
            this.f36895u = annotationWriter;
        }
        return annotationWriter;
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.ClassVisitor
    public void visitAttribute(Attribute attribute) {
        attribute.f36857a = this.f36896v;
        this.f36896v = attribute;
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.ClassVisitor
    public void visitEnd() {
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.ClassVisitor
    public FieldVisitor visitField(int i, String str, String str2, String str3, Object obj) {
        return new FieldWriter(this, i, str, str2, str3, obj);
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.ClassVisitor
    public void visitInnerClass(String str, String str2, String str3, int i) {
        int i2 = 0;
        if (this.f36898x == null) {
            this.f36898x = new ByteVector();
        }
        this.f36897w++;
        this.f36898x.putShort(str == null ? 0 : newClass(str));
        this.f36898x.putShort(str2 == null ? 0 : newClass(str2));
        ByteVector byteVector = this.f36898x;
        if (str3 != null) {
            i2 = newUTF8(str3);
        }
        byteVector.putShort(i2);
        this.f36898x.putShort(i);
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.ClassVisitor
    public MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
        return new MethodWriter(this, i, str, str2, str3, strArr, this.f36873H, this.f36872G);
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.ClassVisitor
    public void visitOuterClass(String str, String str2, String str3) {
        this.f36892r = newClass(str);
        if (str2 == null || str3 == null) {
            return;
        }
        this.f36893s = newNameType(str2, str3);
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.ClassVisitor
    public void visitSource(String str, String str2) {
        if (str != null) {
            this.f36890p = newUTF8(str);
        }
        if (str2 != null) {
            this.f36891q = new ByteVector().putUTF8(str2);
        }
    }
}

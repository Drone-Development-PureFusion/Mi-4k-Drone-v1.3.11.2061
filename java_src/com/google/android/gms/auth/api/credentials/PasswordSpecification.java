package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
/* loaded from: classes2.dex */
public final class PasswordSpecification extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final C4011i CREATOR = new C4011i();

    /* renamed from: a */
    public static final PasswordSpecification f15422a = new C4001a().m25772a(12, 16).m25771a("abcdefghijkmnopqrstxyzABCDEFGHJKLMNPQRSTXY3456789").m25770a("abcdefghijkmnopqrstxyz", 1).m25770a("ABCDEFGHJKLMNPQRSTXY", 1).m25770a("3456789", 1).m25773a();

    /* renamed from: b */
    public static final PasswordSpecification f15423b = new C4001a().m25772a(12, 16).m25771a("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890").m25770a("abcdefghijklmnopqrstuvwxyz", 1).m25770a("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 1).m25770a("1234567890", 1).m25773a();

    /* renamed from: c */
    final int f15424c;

    /* renamed from: d */
    final String f15425d;

    /* renamed from: e */
    final List<String> f15426e;

    /* renamed from: f */
    final List<Integer> f15427f;

    /* renamed from: g */
    final int f15428g;

    /* renamed from: h */
    final int f15429h;

    /* renamed from: i */
    private final int[] f15430i = m25779a();

    /* renamed from: j */
    private final Random f15431j = new SecureRandom();

    /* renamed from: com.google.android.gms.auth.api.credentials.PasswordSpecification$a */
    /* loaded from: classes2.dex */
    public static class C4001a {

        /* renamed from: a */
        private final TreeSet<Character> f15432a = new TreeSet<>();

        /* renamed from: b */
        private final List<String> f15433b = new ArrayList();

        /* renamed from: c */
        private final List<Integer> f15434c = new ArrayList();

        /* renamed from: d */
        private int f15435d = 12;

        /* renamed from: e */
        private int f15436e = 16;

        /* renamed from: a */
        private TreeSet<Character> m25769a(String str, String str2) {
            char[] charArray;
            if (TextUtils.isEmpty(str)) {
                throw new C4002b(String.valueOf(str2).concat(" cannot be null or empty"));
            }
            TreeSet<Character> treeSet = new TreeSet<>();
            for (char c : str.toCharArray()) {
                if (PasswordSpecification.m25775b(c, 32, 126)) {
                    throw new C4002b(String.valueOf(str2).concat(" must only contain ASCII printable characters"));
                }
                treeSet.add(Character.valueOf(c));
            }
            return treeSet;
        }

        /* renamed from: b */
        private void m25768b() {
            int i;
            int i2 = 0;
            Iterator<Integer> it2 = this.f15434c.iterator();
            while (true) {
                i = i2;
                if (!it2.hasNext()) {
                    break;
                }
                i2 = it2.next().intValue() + i;
            }
            if (i > this.f15436e) {
                throw new C4002b("required character count cannot be greater than the max password size");
            }
        }

        /* renamed from: c */
        private void m25767c() {
            boolean[] zArr = new boolean[95];
            for (String str : this.f15433b) {
                char[] charArray = str.toCharArray();
                for (char c : charArray) {
                    if (zArr[c - ' ']) {
                        throw new C4002b(new StringBuilder(58).append("character ").append(c).append(" occurs in more than one required character set").toString());
                    }
                    zArr[c - ' '] = true;
                }
            }
        }

        /* renamed from: a */
        public C4001a m25772a(int i, int i2) {
            if (i < 1) {
                throw new C4002b("minimumSize must be at least 1");
            }
            if (i > i2) {
                throw new C4002b("maximumSize must be greater than or equal to minimumSize");
            }
            this.f15435d = i;
            this.f15436e = i2;
            return this;
        }

        /* renamed from: a */
        public C4001a m25771a(@NonNull String str) {
            this.f15432a.addAll(m25769a(str, "allowedChars"));
            return this;
        }

        /* renamed from: a */
        public C4001a m25770a(@NonNull String str, int i) {
            if (i < 1) {
                throw new C4002b("count must be at least 1");
            }
            this.f15433b.add(PasswordSpecification.m25774b(m25769a(str, "requiredChars")));
            this.f15434c.add(Integer.valueOf(i));
            return this;
        }

        /* renamed from: a */
        public PasswordSpecification m25773a() {
            if (this.f15432a.isEmpty()) {
                throw new C4002b("no allowed characters specified");
            }
            m25768b();
            m25767c();
            return new PasswordSpecification(1, PasswordSpecification.m25774b(this.f15432a), this.f15433b, this.f15434c, this.f15435d, this.f15436e);
        }
    }

    /* renamed from: com.google.android.gms.auth.api.credentials.PasswordSpecification$b */
    /* loaded from: classes2.dex */
    public static class C4002b extends Error {
        public C4002b(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PasswordSpecification(int i, String str, List<String> list, List<Integer> list2, int i2, int i3) {
        this.f15424c = i;
        this.f15425d = str;
        this.f15426e = Collections.unmodifiableList(list);
        this.f15427f = Collections.unmodifiableList(list2);
        this.f15428g = i2;
        this.f15429h = i3;
    }

    /* renamed from: a */
    private int m25778a(char c) {
        return c - ' ';
    }

    /* renamed from: a */
    private int[] m25779a() {
        int[] iArr = new int[95];
        Arrays.fill(iArr, -1);
        int i = 0;
        for (String str : this.f15426e) {
            char[] charArray = str.toCharArray();
            for (char c : charArray) {
                iArr[m25778a(c)] = i;
            }
            i++;
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static String m25774b(Collection<Character> collection) {
        char[] cArr = new char[collection.size()];
        int i = 0;
        Iterator<Character> it2 = collection.iterator();
        while (true) {
            int i2 = i;
            if (it2.hasNext()) {
                i = i2 + 1;
                cArr[i2] = it2.next().charValue();
            } else {
                return new String(cArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m25775b(int i, int i2, int i3) {
        return i < i2 || i > i3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4011i.m25748a(this, parcel, i);
    }
}

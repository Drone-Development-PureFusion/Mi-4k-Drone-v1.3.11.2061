package com.google.firebase.messaging;

import java.util.Locale;
/* renamed from: com.google.firebase.messaging.b */
/* loaded from: classes.dex */
public final class C9922b extends Exception {

    /* renamed from: a */
    public static final int f30866a = 0;

    /* renamed from: b */
    public static final int f30867b = 1;

    /* renamed from: c */
    public static final int f30868c = 2;

    /* renamed from: d */
    public static final int f30869d = 3;

    /* renamed from: e */
    public static final int f30870e = 4;

    /* renamed from: f */
    private final int f30871f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9922b(String str) {
        super(str);
        this.f30871f = m6473a(str);
    }

    /* renamed from: a */
    private int m6473a(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        char c = 65535;
        switch (lowerCase.hashCode()) {
            case -1743242157:
                if (lowerCase.equals("service_not_available")) {
                    c = 3;
                    break;
                }
                break;
            case -1290953729:
                if (lowerCase.equals("toomanymessages")) {
                    c = 4;
                    break;
                }
                break;
            case -920906446:
                if (lowerCase.equals("invalid_parameters")) {
                    c = 0;
                    break;
                }
                break;
            case -617027085:
                if (lowerCase.equals("messagetoobig")) {
                    c = 2;
                    break;
                }
                break;
            case -95047692:
                if (lowerCase.equals("missing_to")) {
                    c = 1;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public int m6474a() {
        return this.f30871f;
    }
}

package com.google.android.gms.location.places;

import android.net.Uri;
import com.google.android.gms.common.data.AbstractC4527f;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
import java.util.Locale;
/* renamed from: com.google.android.gms.location.places.d */
/* loaded from: classes2.dex */
public interface AbstractC8240d extends AbstractC4527f<AbstractC8240d> {

    /* renamed from: A */
    public static final int f26918A = 26;

    /* renamed from: B */
    public static final int f26919B = 27;

    /* renamed from: C */
    public static final int f26920C = 28;

    /* renamed from: D */
    public static final int f26921D = 29;

    /* renamed from: E */
    public static final int f26922E = 30;

    /* renamed from: F */
    public static final int f26923F = 31;

    /* renamed from: G */
    public static final int f26924G = 32;

    /* renamed from: H */
    public static final int f26925H = 33;

    /* renamed from: I */
    public static final int f26926I = 34;

    /* renamed from: J */
    public static final int f26927J = 35;

    /* renamed from: K */
    public static final int f26928K = 36;

    /* renamed from: L */
    public static final int f26929L = 37;

    /* renamed from: M */
    public static final int f26930M = 38;

    /* renamed from: N */
    public static final int f26931N = 39;

    /* renamed from: O */
    public static final int f26932O = 40;

    /* renamed from: P */
    public static final int f26933P = 41;

    /* renamed from: Q */
    public static final int f26934Q = 42;

    /* renamed from: R */
    public static final int f26935R = 43;

    /* renamed from: S */
    public static final int f26936S = 44;

    /* renamed from: T */
    public static final int f26937T = 45;

    /* renamed from: U */
    public static final int f26938U = 46;

    /* renamed from: V */
    public static final int f26939V = 47;

    /* renamed from: W */
    public static final int f26940W = 48;

    /* renamed from: X */
    public static final int f26941X = 49;

    /* renamed from: Y */
    public static final int f26942Y = 50;

    /* renamed from: Z */
    public static final int f26943Z = 51;

    /* renamed from: a */
    public static final int f26944a = 0;

    /* renamed from: aA */
    public static final int f26945aA = 78;

    /* renamed from: aB */
    public static final int f26946aB = 79;

    /* renamed from: aC */
    public static final int f26947aC = 80;

    /* renamed from: aD */
    public static final int f26948aD = 81;

    /* renamed from: aE */
    public static final int f26949aE = 82;

    /* renamed from: aF */
    public static final int f26950aF = 83;

    /* renamed from: aG */
    public static final int f26951aG = 84;

    /* renamed from: aH */
    public static final int f26952aH = 85;

    /* renamed from: aI */
    public static final int f26953aI = 86;

    /* renamed from: aJ */
    public static final int f26954aJ = 87;

    /* renamed from: aK */
    public static final int f26955aK = 88;

    /* renamed from: aL */
    public static final int f26956aL = 89;

    /* renamed from: aM */
    public static final int f26957aM = 90;

    /* renamed from: aN */
    public static final int f26958aN = 91;

    /* renamed from: aO */
    public static final int f26959aO = 92;

    /* renamed from: aP */
    public static final int f26960aP = 93;

    /* renamed from: aQ */
    public static final int f26961aQ = 94;

    /* renamed from: aR */
    public static final int f26962aR = 95;

    /* renamed from: aS */
    public static final int f26963aS = 96;

    /* renamed from: aT */
    public static final int f26964aT = 1001;

    /* renamed from: aU */
    public static final int f26965aU = 1002;

    /* renamed from: aV */
    public static final int f26966aV = 1003;

    /* renamed from: aW */
    public static final int f26967aW = 1004;

    /* renamed from: aX */
    public static final int f26968aX = 1005;

    /* renamed from: aY */
    public static final int f26969aY = 1006;

    /* renamed from: aZ */
    public static final int f26970aZ = 1007;

    /* renamed from: aa */
    public static final int f26971aa = 52;

    /* renamed from: ab */
    public static final int f26972ab = 53;

    /* renamed from: ac */
    public static final int f26973ac = 54;

    /* renamed from: ad */
    public static final int f26974ad = 55;

    /* renamed from: ae */
    public static final int f26975ae = 56;

    /* renamed from: af */
    public static final int f26976af = 57;

    /* renamed from: ag */
    public static final int f26977ag = 58;

    /* renamed from: ah */
    public static final int f26978ah = 59;

    /* renamed from: ai */
    public static final int f26979ai = 60;

    /* renamed from: aj */
    public static final int f26980aj = 61;

    /* renamed from: ak */
    public static final int f26981ak = 62;

    /* renamed from: al */
    public static final int f26982al = 63;

    /* renamed from: am */
    public static final int f26983am = 64;

    /* renamed from: an */
    public static final int f26984an = 65;

    /* renamed from: ao */
    public static final int f26985ao = 66;

    /* renamed from: ap */
    public static final int f26986ap = 67;

    /* renamed from: aq */
    public static final int f26987aq = 68;

    /* renamed from: ar */
    public static final int f26988ar = 69;

    /* renamed from: as */
    public static final int f26989as = 70;

    /* renamed from: at */
    public static final int f26990at = 71;

    /* renamed from: au */
    public static final int f26991au = 72;

    /* renamed from: av */
    public static final int f26992av = 73;

    /* renamed from: aw */
    public static final int f26993aw = 74;

    /* renamed from: ax */
    public static final int f26994ax = 75;

    /* renamed from: ay */
    public static final int f26995ay = 76;

    /* renamed from: az */
    public static final int f26996az = 77;

    /* renamed from: b */
    public static final int f26997b = 1;

    /* renamed from: ba */
    public static final int f26998ba = 1008;

    /* renamed from: bb */
    public static final int f26999bb = 1009;

    /* renamed from: bc */
    public static final int f27000bc = 1010;

    /* renamed from: bd */
    public static final int f27001bd = 1011;

    /* renamed from: be */
    public static final int f27002be = 1012;

    /* renamed from: bf */
    public static final int f27003bf = 1013;

    /* renamed from: bg */
    public static final int f27004bg = 1014;

    /* renamed from: bh */
    public static final int f27005bh = 1015;

    /* renamed from: bi */
    public static final int f27006bi = 1016;

    /* renamed from: bj */
    public static final int f27007bj = 1017;

    /* renamed from: bk */
    public static final int f27008bk = 1018;

    /* renamed from: bl */
    public static final int f27009bl = 1019;

    /* renamed from: bm */
    public static final int f27010bm = 1020;

    /* renamed from: bn */
    public static final int f27011bn = 1021;

    /* renamed from: bo */
    public static final int f27012bo = 1022;

    /* renamed from: bp */
    public static final int f27013bp = 1023;

    /* renamed from: bq */
    public static final int f27014bq = 1024;

    /* renamed from: br */
    public static final int f27015br = 1025;

    /* renamed from: bs */
    public static final int f27016bs = 1026;

    /* renamed from: bt */
    public static final int f27017bt = 1027;

    /* renamed from: bu */
    public static final int f27018bu = 1028;

    /* renamed from: bv */
    public static final int f27019bv = 1029;

    /* renamed from: bw */
    public static final int f27020bw = 1030;

    /* renamed from: c */
    public static final int f27021c = 2;

    /* renamed from: d */
    public static final int f27022d = 3;

    /* renamed from: e */
    public static final int f27023e = 4;

    /* renamed from: f */
    public static final int f27024f = 5;

    /* renamed from: g */
    public static final int f27025g = 6;

    /* renamed from: h */
    public static final int f27026h = 7;

    /* renamed from: i */
    public static final int f27027i = 8;

    /* renamed from: j */
    public static final int f27028j = 9;

    /* renamed from: k */
    public static final int f27029k = 10;

    /* renamed from: l */
    public static final int f27030l = 11;

    /* renamed from: m */
    public static final int f27031m = 12;

    /* renamed from: n */
    public static final int f27032n = 13;

    /* renamed from: o */
    public static final int f27033o = 14;

    /* renamed from: p */
    public static final int f27034p = 15;

    /* renamed from: q */
    public static final int f27035q = 16;

    /* renamed from: r */
    public static final int f27036r = 17;

    /* renamed from: s */
    public static final int f27037s = 18;

    /* renamed from: t */
    public static final int f27038t = 19;

    /* renamed from: u */
    public static final int f27039u = 20;

    /* renamed from: v */
    public static final int f27040v = 21;

    /* renamed from: w */
    public static final int f27041w = 22;

    /* renamed from: x */
    public static final int f27042x = 23;

    /* renamed from: y */
    public static final int f27043y = 24;

    /* renamed from: z */
    public static final int f27044z = 25;

    /* renamed from: c */
    String mo12184c();

    /* renamed from: d */
    List<Integer> mo12183d();

    /* renamed from: e */
    CharSequence mo12182e();

    /* renamed from: f */
    Locale mo12181f();

    /* renamed from: g */
    CharSequence mo12180g();

    /* renamed from: h */
    LatLng mo12179h();

    /* renamed from: i */
    LatLngBounds mo12178i();

    /* renamed from: j */
    Uri mo12177j();

    /* renamed from: k */
    CharSequence mo12176k();

    /* renamed from: l */
    float mo12175l();

    /* renamed from: m */
    int mo12174m();

    /* renamed from: n */
    CharSequence mo12173n();
}

package com.fimi.soul.biz.camera;

import com.fimi.p140a.C1514f;
import com.fimi.p140a.p142b.EnumC1495b;
import com.fimi.soul.biz.p179g.C1846a;
/* renamed from: com.fimi.soul.biz.camera.e */
/* loaded from: classes.dex */
public class C1831e {

    /* renamed from: A */
    public static final int f4774A = 14;

    /* renamed from: B */
    public static final int f4775B = 15;

    /* renamed from: C */
    public static final int f4776C = 16;

    /* renamed from: D */
    public static final int f4777D = 257;

    /* renamed from: E */
    public static final int f4778E = 258;

    /* renamed from: F */
    public static final int f4779F = 259;

    /* renamed from: G */
    public static final int f4780G = 260;

    /* renamed from: H */
    public static final int f4781H = 261;

    /* renamed from: I */
    public static final int f4782I = 513;

    /* renamed from: J */
    public static final int f4783J = 514;

    /* renamed from: K */
    public static final int f4784K = 515;

    /* renamed from: L */
    public static final int f4785L = 516;

    /* renamed from: M */
    public static final int f4786M = 769;

    /* renamed from: N */
    public static final int f4787N = 770;

    /* renamed from: O */
    public static final int f4788O = 1025;

    /* renamed from: P */
    public static final int f4789P = 1026;

    /* renamed from: Q */
    public static final int f4790Q = 1027;

    /* renamed from: R */
    public static final int f4791R = 1281;

    /* renamed from: S */
    public static final int f4792S = 1282;

    /* renamed from: T */
    public static final int f4793T = 1283;

    /* renamed from: U */
    public static final int f4794U = 1284;

    /* renamed from: V */
    public static final int f4795V = 1285;

    /* renamed from: W */
    public static final int f4796W = 1286;

    /* renamed from: X */
    public static final int f4797X = 1287;

    /* renamed from: Y */
    public static final int f4798Y = 1537;

    /* renamed from: Z */
    public static final int f4799Z = 1538;

    /* renamed from: aA */
    public static final String f4801aA = "camera_connect_to_pc";

    /* renamed from: aB */
    public static final String f4802aB = "log_updated";

    /* renamed from: aC */
    public static final String f4803aC = "power_mode_change";

    /* renamed from: aD */
    public static final String f4804aD = "vf_start";

    /* renamed from: aE */
    public static final String f4805aE = "vf_stop";

    /* renamed from: aF */
    public static final String f4806aF = "auto_file_delete";

    /* renamed from: aG */
    public static final String f4807aG = "STORAGE_RUNOUT";

    /* renamed from: aH */
    public static final String f4808aH = "STORAGE_IO_ERROR";

    /* renamed from: aI */
    public static final String f4809aI = "LOW_SPEED_CARD";

    /* renamed from: aJ */
    public static final String f4810aJ = "MUXER_INDEX_LIMIT";

    /* renamed from: aK */
    public static final String f4811aK = "MUXER_FILE_SIZE_LIMIT";

    /* renamed from: aL */
    public static final String f4812aL = "CARD_REMOVED";

    /* renamed from: aM */
    public static final String f4813aM = "CARD_INSERT";

    /* renamed from: aN */
    public static final String f4814aN = "NOTIFY_CANNOT_ISSUE_PIV";

    /* renamed from: aO */
    public static final String f4815aO = "TAKE_PHOTO_FINISH";

    /* renamed from: aP */
    public static final String f4816aP = "CARD_FILE_SYS_ERROR";

    /* renamed from: aQ */
    public static final String f4817aQ = "CARD_PARAM_ERR";

    /* renamed from: aR */
    public static final String f4818aR = "CARD_NO_PROPOSE";

    /* renamed from: aS */
    public static final String f4819aS = "CARD_NO_PROPOSE_AND_PARAM_ERR";

    /* renamed from: aT */
    public static final String f4820aT = "CARD_WRITE_LOW";

    /* renamed from: aU */
    public static final String f4821aU = "CARD_WRITE_LOW_AND_PARAM_ERR";

    /* renamed from: aV */
    public static final String f4822aV = "CARD_SETROOT_ERROR";

    /* renamed from: aW */
    public static final String f4823aW = "STORAGE_WILL_RUNOUT";

    /* renamed from: aX */
    public static final String f4824aX = "get_file_complete";

    /* renamed from: aY */
    public static final String f4825aY = "get_file_downing";

    /* renamed from: aZ */
    public static final String f4826aZ = "put_file_complete";

    /* renamed from: aa */
    public static final int f4827aa = 1539;

    /* renamed from: ab */
    public static final int f4828ab = 17;

    /* renamed from: ac */
    public static final int f4829ac = 18;

    /* renamed from: ad */
    public static final int f4830ad = 19;

    /* renamed from: ae */
    public static final int f4831ae = 1793;

    /* renamed from: af */
    public static final int f4832af = 2;

    /* renamed from: ag */
    public static final int f4833ag = 254;

    /* renamed from: ah */
    public static final int f4834ah = 253;

    /* renamed from: ai */
    public static final int f4835ai = 10066329;

    /* renamed from: aj */
    public static final int f4836aj = 7829367;

    /* renamed from: ak */
    public static final int f4837ak = 8947848;

    /* renamed from: al */
    public static final int f4838al = 25725064;

    /* renamed from: am */
    public static final int f4839am = 10066328;

    /* renamed from: an */
    public static final String f4840an = "disconnet_HDMI";

    /* renamed from: ao */
    public static final String f4841ao = "disconnet_shutdown";

    /* renamed from: ap */
    public static final String f4842ap = "start_video_record";

    /* renamed from: aq */
    public static final String f4843aq = "video_record_complete";

    /* renamed from: ar */
    public static final String f4844ar = "photo_taken";

    /* renamed from: as */
    public static final String f4845as = "continue_capture_start";

    /* renamed from: at */
    public static final String f4846at = "continue_capture_stop";

    /* renamed from: au */
    public static final String f4847au = "continue_burst_start";

    /* renamed from: av */
    public static final String f4848av = "continue_burst_complete";

    /* renamed from: aw */
    public static final String f4849aw = "low_storage_warning";

    /* renamed from: ax */
    public static final String f4850ax = "low_batter_warning";

    /* renamed from: ay */
    public static final String f4851ay = "timelapse_video_status";

    /* renamed from: az */
    public static final String f4852az = "timelapse_photo_status";

    /* renamed from: bA */
    public static final int f4854bA = -26;

    /* renamed from: bB */
    public static final String f4855bB = "camera_clock";

    /* renamed from: bC */
    public static final String f4856bC = "ravl";

    /* renamed from: bD */
    public static final String f4857bD = "cur_time";

    /* renamed from: bE */
    public static final String f4858bE = "video_standard";

    /* renamed from: bF */
    public static final String f4859bF = "app_status";

    /* renamed from: bG */
    public static final String f4860bG = "stream_out_type";

    /* renamed from: bH */
    public static final String f4861bH = "save_low_resolution_clip";

    /* renamed from: bI */
    public static final String f4862bI = "video_resolution";

    /* renamed from: bJ */
    public static final String f4863bJ = "video_stamp";

    /* renamed from: bK */
    public static final String f4864bK = "video_quality";

    /* renamed from: bL */
    public static final String f4865bL = "timelapse_video";

    /* renamed from: bM */
    public static final String f4866bM = "capture_mode";

    /* renamed from: bN */
    public static final String f4867bN = "photo_size";

    /* renamed from: bO */
    public static final String f4868bO = "photo_stamp";

    /* renamed from: bP */
    public static final String f4869bP = "photo_quality";

    /* renamed from: bQ */
    public static final String f4870bQ = "timelapse_photo";

    /* renamed from: bR */
    public static final String f4871bR = "video_srt";

    /* renamed from: bS */
    public static final String f4872bS = "video_loop_back";

    /* renamed from: bT */
    public static final String f4873bT = "video_mode";

    /* renamed from: bU */
    public static final String f4874bU = "sd_status";

    /* renamed from: bV */
    public static final String f4875bV = "photo_format";

    /* renamed from: bW */
    public static final String f4876bW = "system_type";

    /* renamed from: bX */
    public static final String f4877bX = "default_system";

    /* renamed from: bY */
    public static final String f4878bY = "ae_bias";

    /* renamed from: bZ */
    public static final String f4879bZ = "saturation";

    /* renamed from: ba */
    public static final String f4880ba = "put_file_fail";

    /* renamed from: bb */
    public static final String f4881bb = "fw_upgrade_complete";

    /* renamed from: bc */
    public static final String f4882bc = "firmware_unzip_complete";

    /* renamed from: bd */
    public static final String f4883bd = "fw_unzip_finish";

    /* renamed from: be */
    public static final String f4884be = "progress";

    /* renamed from: bf */
    public static final String f4885bf = "FM_LS_END";

    /* renamed from: bg */
    public static final String f4886bg = "fw_unzipping";

    /* renamed from: bh */
    public static final int f4887bh = -1;

    /* renamed from: bi */
    public static final int f4888bi = -3;

    /* renamed from: bj */
    public static final int f4889bj = -4;

    /* renamed from: bk */
    public static final int f4890bk = -5;

    /* renamed from: bl */
    public static final int f4891bl = -7;

    /* renamed from: bm */
    public static final int f4892bm = -8;

    /* renamed from: bn */
    public static final int f4893bn = -9;

    /* renamed from: bo */
    public static final int f4894bo = -13;

    /* renamed from: bp */
    public static final int f4895bp = -14;

    /* renamed from: bq */
    public static final int f4896bq = -16;

    /* renamed from: br */
    public static final int f4897br = -17;

    /* renamed from: bs */
    public static final int f4898bs = -18;

    /* renamed from: bt */
    public static final int f4899bt = -19;

    /* renamed from: bu */
    public static final int f4900bu = -20;

    /* renamed from: bv */
    public static final int f4901bv = -21;

    /* renamed from: bw */
    public static final int f4902bw = -22;

    /* renamed from: bx */
    public static final int f4903bx = -23;

    /* renamed from: by */
    public static final int f4904by = -24;

    /* renamed from: bz */
    public static final int f4905bz = -25;

    /* renamed from: cA */
    public static final String f4907cA = "JPG+DNG";

    /* renamed from: cB */
    public static final String f4908cB = "NTSC";

    /* renamed from: cC */
    public static final String f4909cC = "PAL";

    /* renamed from: cD */
    public static final String f4910cD = "yes";

    /* renamed from: cE */
    public static final String f4911cE = "on";

    /* renamed from: cH */
    public static final String f4914cH = "photo";

    /* renamed from: cJ */
    public static final String f4916cJ = "burst quality cont.";

    /* renamed from: cK */
    public static final String f4917cK = "precise quality";

    /* renamed from: cL */
    public static final String f4918cL = "video_only";

    /* renamed from: cM */
    public static final String f4919cM = "video_av";

    /* renamed from: cN */
    public static final String f4920cN = "/tmp/SD0/DCIM/MEDIA";

    /* renamed from: cP */
    public static final String f4922cP = "/tmp/SD0";

    /* renamed from: ca */
    public static final String f4932ca = "contrast";

    /* renamed from: cb */
    public static final String f4933cb = "sharpness";

    /* renamed from: cc */
    public static final String f4934cc = "awb";

    /* renamed from: cd */
    public static final String f4935cd = "default_setting";

    /* renamed from: ce */
    public static final String f4936ce = "sync";

    /* renamed from: cf */
    public static final String f4937cf = "EVBIAS";

    /* renamed from: cg */
    public static final String f4938cg = "ae_bias";

    /* renamed from: ch */
    public static final String f4939ch = "1920x1080 30P 16:9";

    /* renamed from: ci */
    public static final String f4940ci = "1920x1080 60P 16:9";

    /* renamed from: cj */
    public static final String f4941cj = "1280x720 120P 16:9";

    /* renamed from: ck */
    public static final String f4942ck = "16M (4608x3456 4:3)";

    /* renamed from: cl */
    public static final String f4943cl = "12M (4608x2592 16:9)";

    /* renamed from: cm */
    public static final String f4944cm = "8M (3264x2448 4:3)";

    /* renamed from: cn */
    public static final String f4945cn = "3840x2160 30P 16:9";

    /* renamed from: co */
    public static final String f4946co = "2560x1440 60P 16:9";

    /* renamed from: cp */
    public static final String f4947cp = "1920x1080 100P 16:9";

    /* renamed from: cq */
    public static final String f4948cq = "1920x1080 60P 16:9";

    /* renamed from: cr */
    public static final String f4949cr = "1920x1080 30P 16:9";

    /* renamed from: cs */
    public static final String f4950cs = "3840x2160 25P 16:9";

    /* renamed from: ct */
    public static final String f4951ct = "2560x1440 50P 16:9";

    /* renamed from: cu */
    public static final String f4952cu = "1920x1080 100P 16:9";

    /* renamed from: cv */
    public static final String f4953cv = "1920x1080 50P 16:9";

    /* renamed from: cw */
    public static final String f4954cw = "1920x1080 25P 16:9";

    /* renamed from: cx */
    public static final String f4955cx = "12M (4000x3000 4:3)";

    /* renamed from: cy */
    public static final String f4956cy = "8M (3840x2160 16:9)";

    /* renamed from: cz */
    public static final String f4957cz = "JPG";

    /* renamed from: d */
    public static final int f4958d = 8787;

    /* renamed from: e */
    public static final int f4959e = 7878;

    /* renamed from: f */
    public static final int f4960f = 8080;

    /* renamed from: g */
    public static final int f4961g = 8080;

    /* renamed from: h */
    public static String f4962h = null;

    /* renamed from: i */
    public static String f4963i = null;

    /* renamed from: j */
    public static final String f4964j = "a71";

    /* renamed from: k */
    public static final String f4965k = "A12";

    /* renamed from: l */
    public static final int f4966l = 65;

    /* renamed from: m */
    public static final int f4967m = 66;

    /* renamed from: n */
    public static final int f4968n = 1;

    /* renamed from: o */
    public static final int f4969o = 2;

    /* renamed from: p */
    public static final int f4970p = 3;

    /* renamed from: q */
    public static final int f4971q = 4;

    /* renamed from: r */
    public static final int f4972r = 5;

    /* renamed from: s */
    public static final int f4973s = 6;

    /* renamed from: t */
    public static final int f4974t = 7;

    /* renamed from: u */
    public static final int f4975u = 8;

    /* renamed from: v */
    public static final int f4976v = 9;

    /* renamed from: w */
    public static final int f4977w = 10;

    /* renamed from: x */
    public static final int f4978x = 11;

    /* renamed from: y */
    public static final int f4979y = 12;

    /* renamed from: z */
    public static final int f4980z = 13;

    /* renamed from: a */
    public static String f4800a = "192.168.42.200";

    /* renamed from: b */
    public static String f4853b = "192.168.42.100";

    /* renamed from: c */
    public static String f4906c = "192.168.42.150";

    /* renamed from: cO */
    public static final String f4921cO = "/tmp/fuse_d/DCIM/100MEDIA";

    /* renamed from: cR */
    public static String f4924cR = f4921cO;

    /* renamed from: cQ */
    public static final String f4923cQ = "/tmp/fuse_d";

    /* renamed from: cS */
    public static String f4925cS = f4923cQ;

    /* renamed from: cT */
    public static String f4926cT = "/tmp/fuse_d/";

    /* renamed from: cU */
    public static String f4927cU = "free";

    /* renamed from: cV */
    public static String f4928cV = "total";

    /* renamed from: cI */
    public static final String f4915cI = "vf";

    /* renamed from: cW */
    public static String f4929cW = f4915cI;

    /* renamed from: cF */
    public static final String f4912cF = "idle";

    /* renamed from: cX */
    public static String f4930cX = f4912cF;

    /* renamed from: cG */
    public static final String f4913cG = "record";

    /* renamed from: cY */
    public static String f4931cY = f4913cG;

    /* renamed from: com.fimi.soul.biz.camera.e$a */
    /* loaded from: classes.dex */
    public enum EnumC1832a {
        StartRecord,
        TakePhote,
        StopRecord
    }

    /* renamed from: a */
    public static String m33977a() {
        if (C1846a.m33917a().m33915b() == 1) {
            f4800a = "192.168.42.200";
        } else if (C1514f.m35431a().m35429b() == EnumC1495b.X1BH) {
            f4800a = "192.168.42.1";
        } else {
            f4800a = "192.168.100.10";
        }
        return f4800a;
    }

    /* renamed from: b */
    public static String m33976b() {
        if (C1846a.m33917a().m33915b() == 1) {
            f4853b = "192.168.42.100";
        } else {
            f4853b = "192.168.100.1";
        }
        return f4853b;
    }

    /* renamed from: c */
    public static String m33975c() {
        if (C1846a.m33917a().m33915b() == 1) {
            f4906c = "192.168.42.150";
        } else {
            f4906c = "192.168.100.2";
        }
        return f4906c;
    }

    /* renamed from: d */
    public static String m33974d() {
        String format = String.format("rtsp://%s/live", m33977a());
        f4962h = format;
        return format;
    }

    /* renamed from: e */
    public static String m33973e() {
        return String.format("http://%s/mjpeg/list.lst", m33977a());
    }

    /* renamed from: f */
    private static String m33972f() {
        return C1783b.m34166a().m34157b() ? "192.168.40.1" : "192.168.42.200";
    }
}

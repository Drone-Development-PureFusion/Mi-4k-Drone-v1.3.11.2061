package com.mining.app.zxing.p257a;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Method;
import java.util.regex.Pattern;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.mining.app.zxing.a.b */
/* loaded from: classes2.dex */
public final class C10031b {

    /* renamed from: b */
    private static final int f30931b = 27;

    /* renamed from: c */
    private static final int f30932c = 30;

    /* renamed from: e */
    private final Context f30934e;

    /* renamed from: f */
    private Point f30935f;

    /* renamed from: g */
    private Point f30936g;

    /* renamed from: h */
    private int f30937h;

    /* renamed from: i */
    private String f30938i;

    /* renamed from: a */
    private static final String f30930a = C10031b.class.getSimpleName();

    /* renamed from: d */
    private static final Pattern f30933d = Pattern.compile(Constants.ACCEPT_TIME_SEPARATOR_SP);

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10031b(Context context) {
        this.f30934e = context;
    }

    /* renamed from: a */
    private static int m6424a(CharSequence charSequence, int i) {
        String[] split = f30933d.split(charSequence);
        int length = split.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            try {
                double parseDouble = Double.parseDouble(split[i2].trim());
                int i4 = (int) (10.0d * parseDouble);
                if (Math.abs(i - parseDouble) >= Math.abs(i - i3)) {
                    i4 = i3;
                }
                i2++;
                i3 = i4;
            } catch (NumberFormatException e) {
                return i;
            }
        }
        return i3;
    }

    /* renamed from: a */
    private static Point m6427a(Camera.Parameters parameters, Point point) {
        String str = parameters.get("preview-size-values");
        String str2 = str == null ? parameters.get("preview-size-value") : str;
        Point point2 = null;
        if (str2 != null) {
            Log.d(f30930a, "preview-size-values parameter: " + str2);
            point2 = m6423a(str2, point);
        }
        return point2 == null ? new Point((point.x >> 3) << 3, (point.y >> 3) << 3) : point2;
    }

    /* renamed from: a */
    private static Point m6423a(CharSequence charSequence, Point point) {
        int i;
        int i2;
        int i3;
        int i4;
        String[] split = f30933d.split(charSequence);
        int length = split.length;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = Integer.MAX_VALUE;
        while (true) {
            if (i5 >= length) {
                i = i6;
                i2 = i7;
                break;
            }
            String trim = split[i5].trim();
            int indexOf = trim.indexOf(120);
            if (indexOf < 0) {
                Log.w(f30930a, "Bad preview-size: " + trim);
                i3 = i6;
                i4 = i7;
            } else {
                try {
                    i2 = Integer.parseInt(trim.substring(0, indexOf));
                    i = Integer.parseInt(trim.substring(indexOf + 1));
                    int abs = Math.abs(i2 - point.x) + Math.abs(i - point.y);
                    if (abs == 0) {
                        break;
                    } else if (abs < i8) {
                        i8 = abs;
                        i4 = i2;
                        i3 = i;
                    } else {
                        i3 = i6;
                        i4 = i7;
                    }
                } catch (NumberFormatException e) {
                    Log.w(f30930a, "Bad preview-size: " + trim);
                    i3 = i6;
                    i4 = i7;
                }
            }
            i5++;
            i7 = i4;
            i6 = i3;
        }
        if (i2 <= 0 || i <= 0) {
            return null;
        }
        return new Point(i2, i);
    }

    /* renamed from: a */
    private void m6428a(Camera.Parameters parameters) {
        if (!Build.MODEL.contains("Behold II") || C10032c.f30939a != 3) {
            parameters.set("flash-value", 2);
        } else {
            parameters.set("flash-value", 1);
        }
        parameters.set("flash-mode", "off");
    }

    /* renamed from: b */
    private void m6421b(Camera.Parameters parameters) {
        String str = parameters.get("zoom-supported");
        if (str == null || Boolean.parseBoolean(str)) {
            int i = 27;
            String str2 = parameters.get("max-zoom");
            if (str2 != null) {
                try {
                    int parseDouble = (int) (Double.parseDouble(str2) * 10.0d);
                    if (27 <= parseDouble) {
                        parseDouble = 27;
                    }
                    i = parseDouble;
                } catch (NumberFormatException e) {
                    Log.w(f30930a, "Bad max-zoom: " + str2);
                }
            }
            String str3 = parameters.get("taking-picture-zoom-max");
            if (str3 != null) {
                try {
                    int parseInt = Integer.parseInt(str3);
                    if (i > parseInt) {
                        i = parseInt;
                    }
                } catch (NumberFormatException e2) {
                    Log.w(f30930a, "Bad taking-picture-zoom-max: " + str3);
                }
            }
            String str4 = parameters.get("mot-zoom-values");
            if (str4 != null) {
                i = m6424a(str4, i);
            }
            String str5 = parameters.get("mot-zoom-step");
            if (str5 != null) {
                try {
                    int parseDouble2 = (int) (Double.parseDouble(str5.trim()) * 10.0d);
                    if (parseDouble2 > 1) {
                        i -= i % parseDouble2;
                    }
                } catch (NumberFormatException e3) {
                }
            }
            if (str2 != null || str4 != null) {
                parameters.set("zoom", String.valueOf(i / 10.0d));
            }
            if (str3 == null) {
                return;
            }
            parameters.set("taking-picture-zoom", i);
        }
    }

    /* renamed from: e */
    public static int m6417e() {
        return 30;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Point m6429a() {
        return this.f30936g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m6426a(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        this.f30937h = parameters.getPreviewFormat();
        this.f30938i = parameters.get("preview-format");
        Log.d(f30930a, "Default preview format: " + this.f30937h + '/' + this.f30938i);
        Display defaultDisplay = ((WindowManager) this.f30934e.getSystemService("window")).getDefaultDisplay();
        this.f30935f = new Point(defaultDisplay.getWidth(), defaultDisplay.getHeight());
        Log.d(f30930a, "Screen resolution: " + this.f30935f);
        this.f30936g = m6427a(parameters, this.f30935f);
        Log.d(f30930a, "Camera resolution: " + this.f30935f);
    }

    /* renamed from: a */
    protected void m6425a(Camera camera, int i) {
        try {
            Method method = camera.getClass().getMethod("setDisplayOrientation", Integer.TYPE);
            if (method == null) {
                return;
            }
            method.invoke(camera, Integer.valueOf(i));
        } catch (Exception e) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Point m6422b() {
        return this.f30935f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m6420b(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        Log.d(f30930a, "Setting preview size: " + this.f30936g);
        parameters.setPreviewSize(this.f30936g.x, this.f30936g.y);
        m6428a(parameters);
        m6421b(parameters);
        m6425a(camera, 90);
        camera.setParameters(parameters);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m6419c() {
        return this.f30937h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public String m6418d() {
        return this.f30938i;
    }
}

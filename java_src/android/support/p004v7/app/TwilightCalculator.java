package android.support.p004v7.app;
/* renamed from: android.support.v7.app.TwilightCalculator */
/* loaded from: classes.dex */
class TwilightCalculator {
    private static final float ALTIDUTE_CORRECTION_CIVIL_TWILIGHT = -0.10471976f;

    /* renamed from: C1 */
    private static final float f126C1 = 0.0334196f;

    /* renamed from: C2 */
    private static final float f127C2 = 3.49066E-4f;

    /* renamed from: C3 */
    private static final float f128C3 = 5.236E-6f;
    public static final int DAY = 0;
    private static final float DEGREES_TO_RADIANS = 0.017453292f;

    /* renamed from: J0 */
    private static final float f129J0 = 9.0E-4f;
    public static final int NIGHT = 1;
    private static final float OBLIQUITY = 0.4092797f;
    private static final long UTC_2000 = 946728000000L;
    private static TwilightCalculator sInstance;
    public int state;
    public long sunrise;
    public long sunset;

    TwilightCalculator() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static TwilightCalculator getInstance() {
        if (sInstance == null) {
            sInstance = new TwilightCalculator();
        }
        return sInstance;
    }

    public void calculateTwilight(long j, double d, double d2) {
        float f = ((float) (j - UTC_2000)) / 8.64E7f;
        float f2 = 6.24006f + (0.01720197f * f);
        double sin = f2 + (0.03341960161924362d * Math.sin(f2)) + (3.4906598739326E-4d * Math.sin(2.0f * f2)) + (5.236000106378924E-6d * Math.sin(3.0f * f2)) + 1.796593063d + 3.141592653589793d;
        double d3 = (-d2) / 360.0d;
        double sin2 = (Math.sin(f2) * 0.0053d) + d3 + ((float) Math.round((f - f129J0) - d3)) + f129J0 + ((-0.0069d) * Math.sin(2.0d * sin));
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d4 = 0.01745329238474369d * d;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(d4) * Math.sin(asin))) / (Math.cos(asin) * Math.cos(d4));
        if (sin3 >= 1.0d) {
            this.state = 1;
            this.sunset = -1L;
            this.sunrise = -1L;
        } else if (sin3 <= -1.0d) {
            this.state = 0;
            this.sunset = -1L;
            this.sunrise = -1L;
        } else {
            float acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.sunset = Math.round((acos + sin2) * 8.64E7d) + UTC_2000;
            this.sunrise = Math.round((sin2 - acos) * 8.64E7d) + UTC_2000;
            if (this.sunrise >= j || this.sunset <= j) {
                this.state = 1;
            } else {
                this.state = 0;
            }
        }
    }
}

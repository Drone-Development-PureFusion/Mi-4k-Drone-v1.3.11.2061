.class public final Lcom/google/android/gms/internal/fm;
.super Ljava/lang/Object;


# direct methods
.method public static a(FFFF)F
    .locals 1

    cmpl-float v0, p0, p1

    if-lez v0, :cond_0

    cmpl-float v0, p0, p2

    if-lez v0, :cond_0

    cmpl-float v0, p0, p3

    if-lez v0, :cond_0

    :goto_0
    return p0

    :cond_0
    cmpl-float v0, p1, p2

    if-lez v0, :cond_1

    cmpl-float v0, p1, p3

    if-lez v0, :cond_1

    move p0, p1

    goto :goto_0

    :cond_1
    cmpl-float v0, p2, p3

    if-lez v0, :cond_2

    move p0, p2

    goto :goto_0

    :cond_2
    move p0, p3

    goto :goto_0
.end method

.method public static a(FFFFFF)F
    .locals 4

    invoke-static {p0, p1, p2, p3}, Lcom/google/android/gms/internal/fm;->b(FFFF)F

    move-result v0

    invoke-static {p0, p1, p4, p3}, Lcom/google/android/gms/internal/fm;->b(FFFF)F

    move-result v1

    invoke-static {p0, p1, p4, p5}, Lcom/google/android/gms/internal/fm;->b(FFFF)F

    move-result v2

    invoke-static {p0, p1, p2, p5}, Lcom/google/android/gms/internal/fm;->b(FFFF)F

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/internal/fm;->a(FFFF)F

    move-result v0

    return v0
.end method

.method public static b(FFFF)F
    .locals 4

    sub-float v0, p2, p0

    sub-float v1, p3, p1

    float-to-double v2, v0

    float-to-double v0, v1

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method

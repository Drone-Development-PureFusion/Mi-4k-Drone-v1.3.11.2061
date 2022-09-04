.class public Lcom/fimi/soul/biz/k/f;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(IIIFI)Lcom/google/android/gms/maps/model/CircleOptions;
    .locals 4

    new-instance v0, Lcom/google/android/gms/maps/model/CircleOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/CircleOptions;-><init>()V

    int-to-double v2, p0

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/maps/model/CircleOptions;->a(D)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/model/CircleOptions;->a(I)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/google/android/gms/maps/model/CircleOptions;->a(F)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/maps/model/CircleOptions;->b(I)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    int-to-float v1, p4

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/CircleOptions;->b(F)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    return-object v0
.end method

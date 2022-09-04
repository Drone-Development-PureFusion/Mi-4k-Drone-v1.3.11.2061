.class public Lcom/fimi/soul/biz/j/i;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/google/android/gms/maps/model/LatLng;I)Lcom/google/android/gms/maps/model/MarkerOptions;
    .locals 2

    new-instance v0, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/android/gms/maps/model/MarkerOptions;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    invoke-static {p1}, Lcom/fimi/soul/biz/j/j;->a(I)Lcom/google/android/gms/maps/model/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->a(Lcom/google/android/gms/maps/model/a;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->a(Z)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/maps/model/LatLng;Landroid/content/Context;FZI)Lcom/google/android/gms/maps/model/MarkerOptions;
    .locals 2

    new-instance v0, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/android/gms/maps/model/MarkerOptions;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    invoke-static {p1, p4, p2, p3}, Lcom/fimi/soul/biz/j/j;->a(Landroid/content/Context;IFZ)Lcom/google/android/gms/maps/model/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->a(Lcom/google/android/gms/maps/model/a;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->a(Z)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/util/List;II)Lcom/google/android/gms/maps/model/PolylineOptions;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;II)",
            "Lcom/google/android/gms/maps/model/PolylineOptions;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/maps/model/PolylineOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/PolylineOptions;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/android/gms/maps/model/PolylineOptions;->a(Ljava/lang/Iterable;)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/maps/model/PolylineOptions;->a(I)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    int-to-float v1, p1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->a(F)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    return-object v0
.end method

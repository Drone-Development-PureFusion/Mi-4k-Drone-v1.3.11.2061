.class public Lcom/google/android/gms/location/places/ui/b;
.super Lcom/google/android/gms/location/places/ui/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/location/places/ui/b$a;
    }
.end annotation


# static fields
.field public static final a:I = 0x2


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/location/places/ui/d;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/content/Intent;)Lcom/google/android/gms/location/places/d;
    .locals 1

    invoke-static {p0, p1}, Lcom/google/android/gms/location/places/ui/d;->c(Landroid/content/Context;Landroid/content/Intent;)Lcom/google/android/gms/location/places/d;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Intent;Landroid/content/Context;)Lcom/google/android/gms/location/places/d;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p1, p0}, Lcom/google/android/gms/location/places/ui/d;->c(Landroid/content/Context;Landroid/content/Intent;)Lcom/google/android/gms/location/places/d;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Intent;)Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "third_party_attributions"

    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/content/Intent;)Lcom/google/android/gms/maps/model/LatLngBounds;
    .locals 2

    const-string v0, "final_latlng_bounds"

    sget-object v1, Lcom/google/android/gms/maps/model/LatLngBounds;->CREATOR:Lcom/google/android/gms/maps/model/q;

    invoke-static {p0, v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/c;->a(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/LatLngBounds;

    return-object v0
.end method

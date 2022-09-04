.class public Lcom/google/android/gms/location/places/internal/k;
.super Lcom/google/android/gms/common/internal/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/location/places/internal/k$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/w",
        "<",
        "Lcom/google/android/gms/location/places/internal/f;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/location/places/internal/PlacesParams;

.field private final e:Ljava/util/Locale;


# direct methods
.method private constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/s;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;Ljava/lang/String;Lcom/google/android/gms/location/places/m;)V
    .locals 7

    const/16 v3, 0x43

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/common/internal/w;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/android/gms/common/internal/s;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)V

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/location/places/internal/k;->e:Ljava/util/Locale;

    const/4 v3, 0x0

    invoke-virtual {p3}, Lcom/google/android/gms/common/internal/s;->b()Landroid/accounts/Account;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p3}, Lcom/google/android/gms/common/internal/s;->b()Landroid/accounts/Account;

    move-result-object v0

    iget-object v3, v0, Landroid/accounts/Account;->name:Ljava/lang/String;

    :cond_0
    new-instance v0, Lcom/google/android/gms/location/places/internal/PlacesParams;

    iget-object v2, p0, Lcom/google/android/gms/location/places/internal/k;->e:Ljava/util/Locale;

    iget-object v4, p7, Lcom/google/android/gms/location/places/m;->b:Ljava/lang/String;

    iget v5, p7, Lcom/google/android/gms/location/places/m;->c:I

    move-object v1, p6

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/location/places/internal/PlacesParams;-><init>(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;I)V

    iput-object v0, p0, Lcom/google/android/gms/location/places/internal/k;->a:Lcom/google/android/gms/location/places/internal/PlacesParams;

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/s;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;Ljava/lang/String;Lcom/google/android/gms/location/places/m;Lcom/google/android/gms/location/places/internal/k$1;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, Lcom/google/android/gms/location/places/internal/k;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/s;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;Ljava/lang/String;Lcom/google/android/gms/location/places/m;)V

    return-void
.end method


# virtual methods
.method protected a(Landroid/os/IBinder;)Lcom/google/android/gms/location/places/internal/f;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/location/places/internal/f$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/location/places/internal/f;

    move-result-object v0

    return-object v0
.end method

.method protected a()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.location.places.PlaceDetectionApi"

    return-object v0
.end method

.method public a(Lcom/google/android/gms/location/places/y;Lcom/google/android/gms/location/places/PlaceFilter;)V
    .locals 2

    if-nez p2, :cond_0

    invoke-static {}, Lcom/google/android/gms/location/places/PlaceFilter;->d()Lcom/google/android/gms/location/places/PlaceFilter;

    move-result-object p2

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/k;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/places/internal/f;

    iget-object v1, p0, Lcom/google/android/gms/location/places/internal/k;->a:Lcom/google/android/gms/location/places/internal/PlacesParams;

    invoke-interface {v0, p2, v1, p1}, Lcom/google/android/gms/location/places/internal/f;->a(Lcom/google/android/gms/location/places/PlaceFilter;Lcom/google/android/gms/location/places/internal/PlacesParams;Lcom/google/android/gms/location/places/internal/i;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/location/places/y;Lcom/google/android/gms/location/places/PlaceReport;)V
    .locals 2

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/k;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/places/internal/f;

    iget-object v1, p0, Lcom/google/android/gms/location/places/internal/k;->a:Lcom/google/android/gms/location/places/internal/PlacesParams;

    invoke-interface {v0, p2, v1, p1}, Lcom/google/android/gms/location/places/internal/f;->a(Lcom/google/android/gms/location/places/PlaceReport;Lcom/google/android/gms/location/places/internal/PlacesParams;Lcom/google/android/gms/location/places/internal/i;)V

    return-void
.end method

.method protected synthetic b(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/places/internal/k;->a(Landroid/os/IBinder;)Lcom/google/android/gms/location/places/internal/f;

    move-result-object v0

    return-object v0
.end method

.method protected b()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.location.places.internal.IGooglePlaceDetectionService"

    return-object v0
.end method

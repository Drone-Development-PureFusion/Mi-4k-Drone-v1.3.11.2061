.class public Lcom/google/android/gms/location/places/internal/e;
.super Lcom/google/android/gms/common/internal/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/location/places/internal/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/w",
        "<",
        "Lcom/google/android/gms/location/places/internal/g;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/location/places/internal/PlacesParams;

.field private final e:Ljava/util/Locale;


# direct methods
.method private constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/s;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;Ljava/lang/String;Lcom/google/android/gms/location/places/m;)V
    .locals 7

    const/16 v3, 0x41

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/common/internal/w;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/android/gms/common/internal/s;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)V

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/location/places/internal/e;->e:Ljava/util/Locale;

    const/4 v3, 0x0

    invoke-virtual {p3}, Lcom/google/android/gms/common/internal/s;->b()Landroid/accounts/Account;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p3}, Lcom/google/android/gms/common/internal/s;->b()Landroid/accounts/Account;

    move-result-object v0

    iget-object v3, v0, Landroid/accounts/Account;->name:Ljava/lang/String;

    :cond_0
    new-instance v0, Lcom/google/android/gms/location/places/internal/PlacesParams;

    iget-object v2, p0, Lcom/google/android/gms/location/places/internal/e;->e:Ljava/util/Locale;

    iget-object v4, p7, Lcom/google/android/gms/location/places/m;->b:Ljava/lang/String;

    iget v5, p7, Lcom/google/android/gms/location/places/m;->c:I

    move-object v1, p6

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/location/places/internal/PlacesParams;-><init>(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;I)V

    iput-object v0, p0, Lcom/google/android/gms/location/places/internal/e;->a:Lcom/google/android/gms/location/places/internal/PlacesParams;

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/s;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;Ljava/lang/String;Lcom/google/android/gms/location/places/m;Lcom/google/android/gms/location/places/internal/e$1;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, Lcom/google/android/gms/location/places/internal/e;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/s;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;Ljava/lang/String;Lcom/google/android/gms/location/places/m;)V

    return-void
.end method


# virtual methods
.method protected a(Landroid/os/IBinder;)Lcom/google/android/gms/location/places/internal/g;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/location/places/internal/g$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/location/places/internal/g;

    move-result-object v0

    return-object v0
.end method

.method protected a()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.location.places.GeoDataApi"

    return-object v0
.end method

.method public a(Lcom/google/android/gms/location/places/s;Ljava/lang/String;)V
    .locals 2

    const-string v0, "placeId cannot be null"

    invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/e;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/places/internal/g;

    iget-object v1, p0, Lcom/google/android/gms/location/places/internal/e;->a:Lcom/google/android/gms/location/places/internal/PlacesParams;

    invoke-interface {v0, p2, v1, p1}, Lcom/google/android/gms/location/places/internal/g;->a(Ljava/lang/String;Lcom/google/android/gms/location/places/internal/PlacesParams;Lcom/google/android/gms/location/places/internal/h;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/location/places/s;Ljava/lang/String;III)V
    .locals 7

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v0, "fifeUrl cannot be null"

    invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-lez p3, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "width should be > 0"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    if-lez p3, :cond_1

    :goto_1
    const-string v0, "height should be > 0"

    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/e;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/places/internal/g;

    iget-object v5, p0, Lcom/google/android/gms/location/places/internal/e;->a:Lcom/google/android/gms/location/places/internal/PlacesParams;

    move-object v1, p2

    move v2, p3

    move v3, p4

    move v4, p5

    move-object v6, p1

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/location/places/internal/g;->a(Ljava/lang/String;IIILcom/google/android/gms/location/places/internal/PlacesParams;Lcom/google/android/gms/location/places/internal/h;)V

    return-void

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/location/places/y;Lcom/google/android/gms/location/places/AddPlaceRequest;)V
    .locals 2

    const-string v0, "userAddedPlace == null"

    invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/e;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/places/internal/g;

    iget-object v1, p0, Lcom/google/android/gms/location/places/internal/e;->a:Lcom/google/android/gms/location/places/internal/PlacesParams;

    invoke-interface {v0, p2, v1, p1}, Lcom/google/android/gms/location/places/internal/g;->a(Lcom/google/android/gms/location/places/AddPlaceRequest;Lcom/google/android/gms/location/places/internal/PlacesParams;Lcom/google/android/gms/location/places/internal/i;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/location/places/y;Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLngBounds;Lcom/google/android/gms/location/places/AutocompleteFilter;)V
    .locals 6
    .param p3    # Lcom/google/android/gms/maps/model/LatLngBounds;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/google/android/gms/location/places/AutocompleteFilter;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const-string v0, "callback == null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p2, :cond_1

    const-string v1, ""

    :goto_0
    if-nez p4, :cond_0

    new-instance v0, Lcom/google/android/gms/location/places/AutocompleteFilter$a;

    invoke-direct {v0}, Lcom/google/android/gms/location/places/AutocompleteFilter$a;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/location/places/AutocompleteFilter$a;->a()Lcom/google/android/gms/location/places/AutocompleteFilter;

    move-result-object v3

    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/e;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/places/internal/g;

    iget-object v4, p0, Lcom/google/android/gms/location/places/internal/e;->a:Lcom/google/android/gms/location/places/internal/PlacesParams;

    move-object v2, p3

    move-object v5, p1

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/location/places/internal/g;->a(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLngBounds;Lcom/google/android/gms/location/places/AutocompleteFilter;Lcom/google/android/gms/location/places/internal/PlacesParams;Lcom/google/android/gms/location/places/internal/i;)V

    return-void

    :cond_0
    move-object v3, p4

    goto :goto_1

    :cond_1
    move-object v1, p2

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/location/places/y;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/location/places/y;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/e;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/places/internal/g;

    iget-object v1, p0, Lcom/google/android/gms/location/places/internal/e;->a:Lcom/google/android/gms/location/places/internal/PlacesParams;

    invoke-interface {v0, p2, v1, p1}, Lcom/google/android/gms/location/places/internal/g;->b(Ljava/util/List;Lcom/google/android/gms/location/places/internal/PlacesParams;Lcom/google/android/gms/location/places/internal/i;)V

    return-void
.end method

.method protected synthetic b(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/places/internal/e;->a(Landroid/os/IBinder;)Lcom/google/android/gms/location/places/internal/g;

    move-result-object v0

    return-object v0
.end method

.method protected b()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.location.places.internal.IGooglePlacesService"

    return-object v0
.end method

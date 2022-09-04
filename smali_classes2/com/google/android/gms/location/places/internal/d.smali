.class public Lcom/google/android/gms/location/places/internal/d;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/location/places/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/location/places/AddPlaceRequest;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/location/places/AddPlaceRequest;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/location/places/e;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/location/places/internal/d$1;

    sget-object v1, Lcom/google/android/gms/location/places/l;->c:Lcom/google/android/gms/common/api/a;

    invoke-direct {v0, p0, v1, p1, p2}, Lcom/google/android/gms/location/places/internal/d$1;-><init>(Lcom/google/android/gms/location/places/internal/d;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/location/places/AddPlaceRequest;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/location/places/PlacePhotoMetadataResult;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/location/places/internal/d$2;

    sget-object v1, Lcom/google/android/gms/location/places/l;->c:Lcom/google/android/gms/common/api/a;

    invoke-direct {v0, p0, v1, p1, p2}, Lcom/google/android/gms/location/places/internal/d$2;-><init>(Lcom/google/android/gms/location/places/internal/d;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLngBounds;Lcom/google/android/gms/location/places/AutocompleteFilter;)Lcom/google/android/gms/common/api/i;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/maps/model/LatLngBounds;",
            "Lcom/google/android/gms/location/places/AutocompleteFilter;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/location/places/b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/location/places/internal/d$4;

    sget-object v2, Lcom/google/android/gms/location/places/l;->c:Lcom/google/android/gms/common/api/a;

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/location/places/internal/d$4;-><init>(Lcom/google/android/gms/location/places/internal/d;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLngBounds;Lcom/google/android/gms/location/places/AutocompleteFilter;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public varargs a(Lcom/google/android/gms/common/api/g;[Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "[",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/location/places/e;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    array-length v1, p2

    if-lt v1, v0, :cond_0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    new-instance v0, Lcom/google/android/gms/location/places/internal/d$3;

    sget-object v1, Lcom/google/android/gms/location/places/l;->c:Lcom/google/android/gms/common/api/a;

    invoke-direct {v0, p0, v1, p1, p2}, Lcom/google/android/gms/location/places/internal/d$3;-><init>(Lcom/google/android/gms/location/places/internal/d;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;[Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

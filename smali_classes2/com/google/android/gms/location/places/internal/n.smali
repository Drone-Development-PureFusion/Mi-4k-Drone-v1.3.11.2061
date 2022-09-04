.class public Lcom/google/android/gms/location/places/internal/n;
.super Lcom/google/android/gms/location/places/internal/t;

# interfaces
.implements Lcom/google/android/gms/location/places/g;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/location/places/internal/t;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    return-void
.end method


# virtual methods
.method public synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/n;->e()Lcom/google/android/gms/location/places/g;

    move-result-object v0

    return-object v0
.end method

.method public c()F
    .locals 2

    const-string v0, "place_likelihood"

    const/high16 v1, -0x40800000    # -1.0f

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/n;->a(Ljava/lang/String;F)F

    move-result v0

    return v0
.end method

.method public d()Lcom/google/android/gms/location/places/d;
    .locals 3

    new-instance v0, Lcom/google/android/gms/location/places/internal/r;

    iget-object v1, p0, Lcom/google/android/gms/location/places/internal/n;->c_:Lcom/google/android/gms/common/data/DataHolder;

    iget v2, p0, Lcom/google/android/gms/location/places/internal/n;->d_:I

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/location/places/internal/r;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    return-object v0
.end method

.method public e()Lcom/google/android/gms/location/places/g;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/n;->d()Lcom/google/android/gms/location/places/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/location/places/d;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/places/internal/PlaceEntity;

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/n;->c()F

    move-result v1

    invoke-static {v0, v1}, Lcom/google/android/gms/location/places/internal/PlaceLikelihoodEntity;->a(Lcom/google/android/gms/location/places/internal/PlaceEntity;F)Lcom/google/android/gms/location/places/internal/PlaceLikelihoodEntity;

    move-result-object v0

    return-object v0
.end method

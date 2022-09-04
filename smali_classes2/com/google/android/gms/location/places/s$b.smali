.class public abstract Lcom/google/android/gms/location/places/s$b;
.super Lcom/google/android/gms/location/places/y$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/location/places/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A::",
        "Lcom/google/android/gms/common/api/a$f;",
        ">",
        "Lcom/google/android/gms/location/places/y$b",
        "<",
        "Lcom/google/android/gms/location/places/PlacePhotoMetadataResult;",
        "TA;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/location/places/y$b;-><init>(Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/location/places/PlacePhotoMetadataResult;
    .locals 2

    new-instance v0, Lcom/google/android/gms/location/places/PlacePhotoMetadataResult;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/location/places/PlacePhotoMetadataResult;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/common/data/DataHolder;)V

    return-object v0
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/places/s$b;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/location/places/PlacePhotoMetadataResult;

    move-result-object v0

    return-object v0
.end method

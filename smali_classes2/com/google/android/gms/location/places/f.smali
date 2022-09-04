.class public interface abstract Lcom/google/android/gms/location/places/f;
.super Ljava/lang/Object;


# virtual methods
.method public abstract a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/location/places/PlaceFilter;)Lcom/google/android/gms/common/api/i;
    .param p2    # Lcom/google/android/gms/location/places/PlaceFilter;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/RequiresPermission;
        value = "android.permission.ACCESS_FINE_LOCATION"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/location/places/PlaceFilter;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/location/places/h;",
            ">;"
        }
    .end annotation
.end method

.method public abstract a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/location/places/PlaceReport;)Lcom/google/android/gms/common/api/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/location/places/PlaceReport;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation
.end method

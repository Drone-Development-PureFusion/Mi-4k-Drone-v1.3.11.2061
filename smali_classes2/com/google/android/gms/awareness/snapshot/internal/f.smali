.class public Lcom/google/android/gms/awareness/snapshot/internal/f;
.super Lcom/google/android/gms/common/data/k;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/data/k",
        "<",
        "Lcom/google/android/gms/awareness/snapshot/internal/PlacesData;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/awareness/snapshot/internal/PlacesData;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/common/data/k;-><init>(Lcom/google/android/gms/common/data/DataHolder;Landroid/os/Parcelable$Creator;)V

    return-void
.end method

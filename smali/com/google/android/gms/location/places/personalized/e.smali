.class public final Lcom/google/android/gms/location/places/personalized/e;
.super Lcom/google/android/gms/common/data/k;

# interfaces
.implements Lcom/google/android/gms/common/api/m;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/data/k",
        "<",
        "Lcom/google/android/gms/location/places/personalized/PlaceUserData;",
        ">;",
        "Lcom/google/android/gms/common/api/m;"
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private final b:Lcom/google/android/gms/common/api/Status;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->e()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/location/places/n;->c(I)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/location/places/personalized/e;-><init>(Lcom/google/android/gms/common/data/DataHolder;Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/common/data/DataHolder;Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/location/places/personalized/PlaceUserData;->CREATOR:Lcom/google/android/gms/location/places/personalized/f;

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/common/data/k;-><init>(Lcom/google/android/gms/common/data/DataHolder;Landroid/os/Parcelable$Creator;)V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->e()I

    move-result v0

    invoke-virtual {p2}, Lcom/google/android/gms/common/api/Status;->i()I

    move-result v1

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    iput-object p2, p0, Lcom/google/android/gms/location/places/personalized/e;->b:Lcom/google/android/gms/common/api/Status;

    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/places/personalized/e;->b:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

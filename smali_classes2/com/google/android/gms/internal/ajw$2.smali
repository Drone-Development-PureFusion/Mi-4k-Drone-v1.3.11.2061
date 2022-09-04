.class final Lcom/google/android/gms/internal/ajw$2;
.super Lcom/google/android/gms/drive/metadata/internal/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ajw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/drive/metadata/internal/k",
        "<",
        "Lcom/google/android/gms/common/data/BitmapTeleporter;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/drive/metadata/internal/k;-><init>(Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;I)V

    return-void
.end method


# virtual methods
.method protected synthetic c(Lcom/google/android/gms/common/data/DataHolder;II)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ajw$2;->d(Lcom/google/android/gms/common/data/DataHolder;II)Lcom/google/android/gms/common/data/BitmapTeleporter;

    move-result-object v0

    return-object v0
.end method

.method protected d(Lcom/google/android/gms/common/data/DataHolder;II)Lcom/google/android/gms/common/data/BitmapTeleporter;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Thumbnail field is write only"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

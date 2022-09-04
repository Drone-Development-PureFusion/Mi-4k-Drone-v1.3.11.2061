.class public Lcom/google/android/gms/common/api/s;
.super Lcom/google/android/gms/common/api/t;


# instance fields
.field private final a:Lcom/google/android/gms/common/ConnectionResult;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Landroid/support/v4/util/ArrayMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/Status;",
            "Landroid/support/v4/util/ArrayMap",
            "<",
            "Lcom/google/android/gms/internal/ahh",
            "<*>;",
            "Lcom/google/android/gms/common/ConnectionResult;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/common/api/t;-><init>(Lcom/google/android/gms/common/api/Status;Landroid/support/v4/util/ArrayMap;)V

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/support/v4/util/ArrayMap;->keyAt(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/support/v4/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/ConnectionResult;

    iput-object v0, p0, Lcom/google/android/gms/common/api/s;->a:Lcom/google/android/gms/common/ConnectionResult;

    return-void
.end method

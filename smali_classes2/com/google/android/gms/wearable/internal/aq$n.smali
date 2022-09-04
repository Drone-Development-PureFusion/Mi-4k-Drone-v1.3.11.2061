.class final Lcom/google/android/gms/wearable/internal/aq$n;
.super Lcom/google/android/gms/wearable/internal/aq$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wearable/internal/aq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "n"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wearable/internal/aq$b",
        "<",
        "Lcom/google/android/gms/wearable/p$b;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ahl$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/wearable/p$b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/wearable/internal/aq$b;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/wearable/internal/GetLocalNodeResponse;)V
    .locals 3

    new-instance v0, Lcom/google/android/gms/wearable/internal/ad$b;

    iget v1, p1, Lcom/google/android/gms/wearable/internal/GetLocalNodeResponse;->b:I

    invoke-static {v1}, Lcom/google/android/gms/wearable/internal/am;->a(I)Lcom/google/android/gms/common/api/Status;

    move-result-object v1

    iget-object v2, p1, Lcom/google/android/gms/wearable/internal/GetLocalNodeResponse;->c:Lcom/google/android/gms/wearable/internal/NodeParcelable;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wearable/internal/ad$b;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/wearable/o;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/internal/aq$n;->a(Ljava/lang/Object;)V

    return-void
.end method

.class final Lcom/google/android/gms/wearable/internal/aq$t;
.super Lcom/google/android/gms/wearable/internal/aq$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wearable/internal/aq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "t"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wearable/internal/aq$b",
        "<",
        "Lcom/google/android/gms/wearable/m$c;",
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
            "Lcom/google/android/gms/wearable/m$c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/wearable/internal/aq$b;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/wearable/internal/SendMessageResponse;)V
    .locals 3

    new-instance v0, Lcom/google/android/gms/wearable/internal/aa$b;

    iget v1, p1, Lcom/google/android/gms/wearable/internal/SendMessageResponse;->b:I

    invoke-static {v1}, Lcom/google/android/gms/wearable/internal/am;->a(I)Lcom/google/android/gms/common/api/Status;

    move-result-object v1

    iget v2, p1, Lcom/google/android/gms/wearable/internal/SendMessageResponse;->c:I

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wearable/internal/aa$b;-><init>(Lcom/google/android/gms/common/api/Status;I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/internal/aq$t;->a(Ljava/lang/Object;)V

    return-void
.end method

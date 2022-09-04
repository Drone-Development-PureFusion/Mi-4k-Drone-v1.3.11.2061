.class final Lcom/google/android/gms/wearable/internal/aq$g;
.super Lcom/google/android/gms/wearable/internal/aq$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wearable/internal/aq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wearable/internal/aq$b",
        "<",
        "Lcom/google/android/gms/wearable/a$e;",
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
            "Lcom/google/android/gms/wearable/a$e;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/wearable/internal/aq$b;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/wearable/internal/GetCapabilityResponse;)V
    .locals 4

    new-instance v0, Lcom/google/android/gms/wearable/internal/bb$e;

    iget v1, p1, Lcom/google/android/gms/wearable/internal/GetCapabilityResponse;->b:I

    invoke-static {v1}, Lcom/google/android/gms/wearable/internal/am;->a(I)Lcom/google/android/gms/common/api/Status;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/wearable/internal/bb$c;

    iget-object v3, p1, Lcom/google/android/gms/wearable/internal/GetCapabilityResponse;->c:Lcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;

    invoke-direct {v2, v3}, Lcom/google/android/gms/wearable/internal/bb$c;-><init>(Lcom/google/android/gms/wearable/b;)V

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wearable/internal/bb$e;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/wearable/b;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/internal/aq$g;->a(Ljava/lang/Object;)V

    return-void
.end method

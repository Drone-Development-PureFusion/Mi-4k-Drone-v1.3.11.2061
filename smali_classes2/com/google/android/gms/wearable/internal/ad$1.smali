.class Lcom/google/android/gms/wearable/internal/ad$1;
.super Lcom/google/android/gms/wearable/internal/ba;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/wearable/internal/ad;->a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wearable/internal/ba",
        "<",
        "Lcom/google/android/gms/wearable/p$b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/wearable/internal/ad;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/internal/ad;Lcom/google/android/gms/common/api/g;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/ad$1;->a:Lcom/google/android/gms/wearable/internal/ad;

    invoke-direct {p0, p2}, Lcom/google/android/gms/wearable/internal/ba;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/p$b;
    .locals 2

    new-instance v0, Lcom/google/android/gms/wearable/internal/ad$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/wearable/internal/ad$b;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/wearable/o;)V

    return-object v0
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/wearable/internal/ar;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/ad$1;->a(Lcom/google/android/gms/wearable/internal/ar;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/wearable/internal/ar;)V
    .locals 0

    invoke-virtual {p1, p0}, Lcom/google/android/gms/wearable/internal/ar;->b(Lcom/google/android/gms/internal/ahl$b;)V

    return-void
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/ad$1;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/p$b;

    move-result-object v0

    return-object v0
.end method

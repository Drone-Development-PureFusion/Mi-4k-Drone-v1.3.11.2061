.class Lcom/google/android/gms/wearable/internal/bp$9;
.super Lcom/google/android/gms/wearable/internal/ba;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/wearable/internal/bp;->b(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/e$b;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wearable/internal/ba",
        "<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/wearable/e$b;

.field final synthetic b:Lcom/google/android/gms/wearable/internal/bp;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/internal/bp;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/e$b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/bp$9;->b:Lcom/google/android/gms/wearable/internal/bp;

    iput-object p3, p0, Lcom/google/android/gms/wearable/internal/bp$9;->a:Lcom/google/android/gms/wearable/e$b;

    invoke-direct {p0, p2}, Lcom/google/android/gms/wearable/internal/ba;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;
    .locals 0

    return-object p1
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/wearable/internal/ar;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/bp$9;->a(Lcom/google/android/gms/wearable/internal/ar;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/wearable/internal/ar;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/bp$9;->a:Lcom/google/android/gms/wearable/e$b;

    invoke-virtual {p1, p0, v0}, Lcom/google/android/gms/wearable/internal/ar;->a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/wearable/e$b;)V

    return-void
.end method

.method public synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/bp$9;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    return-object v0
.end method

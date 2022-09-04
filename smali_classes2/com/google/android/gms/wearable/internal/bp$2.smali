.class Lcom/google/android/gms/wearable/internal/bp$2;
.super Lcom/google/android/gms/wearable/internal/ba;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/wearable/internal/bp;->a(Lcom/google/android/gms/common/api/g;Landroid/net/Uri;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wearable/internal/ba",
        "<",
        "Lcom/google/android/gms/wearable/e$a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/net/Uri;

.field final synthetic b:Lcom/google/android/gms/wearable/internal/bp;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/internal/bp;Lcom/google/android/gms/common/api/g;Landroid/net/Uri;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/bp$2;->b:Lcom/google/android/gms/wearable/internal/bp;

    iput-object p3, p0, Lcom/google/android/gms/wearable/internal/bp$2;->a:Landroid/net/Uri;

    invoke-direct {p0, p2}, Lcom/google/android/gms/wearable/internal/ba;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/e$a;
    .locals 2

    new-instance v0, Lcom/google/android/gms/wearable/internal/bp$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/wearable/internal/bp$a;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/wearable/h;)V

    return-object v0
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/wearable/internal/ar;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/bp$2;->a(Lcom/google/android/gms/wearable/internal/ar;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/wearable/internal/ar;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/bp$2;->a:Landroid/net/Uri;

    invoke-virtual {p1, p0, v0}, Lcom/google/android/gms/wearable/internal/ar;->a(Lcom/google/android/gms/internal/ahl$b;Landroid/net/Uri;)V

    return-void
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/bp$2;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/e$a;

    move-result-object v0

    return-object v0
.end method

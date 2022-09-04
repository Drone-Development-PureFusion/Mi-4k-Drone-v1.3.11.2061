.class abstract Lcom/google/android/gms/drive/internal/b$c;
.super Lcom/google/android/gms/drive/internal/bs;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/drive/internal/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/drive/internal/bs",
        "<",
        "Lcom/google/android/gms/drive/g$a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/google/android/gms/drive/internal/b;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/drive/internal/b;Lcom/google/android/gms/common/api/g;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/b$c;->b:Lcom/google/android/gms/drive/internal/b;

    invoke-direct {p0, p2}, Lcom/google/android/gms/drive/internal/bs;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/drive/g$a;
    .locals 3

    const/4 v2, 0x0

    new-instance v0, Lcom/google/android/gms/drive/internal/b$b;

    iget-object v1, p0, Lcom/google/android/gms/drive/internal/b$c;->b:Lcom/google/android/gms/drive/internal/b;

    invoke-direct {v0, v1, p1, v2, v2}, Lcom/google/android/gms/drive/internal/b$b;-><init>(Lcom/google/android/gms/drive/internal/b;Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/k;Lcom/google/android/gms/drive/internal/b$1;)V

    return-object v0
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/b$c;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/drive/g$a;

    move-result-object v0

    return-object v0
.end method

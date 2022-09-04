.class abstract Lcom/google/android/gms/drive/internal/bx$d;
.super Lcom/google/android/gms/drive/internal/bs;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/drive/internal/bx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/drive/internal/bs",
        "<",
        "Lcom/google/android/gms/drive/f$a;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/g;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/drive/internal/bs;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/drive/f$a;
    .locals 2

    new-instance v0, Lcom/google/android/gms/drive/internal/bx$c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/drive/internal/bx$c;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/e;)V

    return-object v0
.end method

.method public synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/bx$d;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/drive/f$a;

    move-result-object v0

    return-object v0
.end method

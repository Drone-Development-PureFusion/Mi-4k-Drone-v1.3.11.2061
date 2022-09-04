.class Lcom/google/android/gms/drive/internal/br$5;
.super Lcom/google/android/gms/drive/internal/bs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/br;->e(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/drive/internal/bs",
        "<",
        "Lcom/google/android/gms/common/api/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/drive/internal/br;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/br;Lcom/google/android/gms/common/api/g;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/br$5;->a:Lcom/google/android/gms/drive/internal/br;

    invoke-direct {p0, p2}, Lcom/google/android/gms/drive/internal/bs;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/e;
    .locals 2

    new-instance v0, Lcom/google/android/gms/common/api/e;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/common/api/e;-><init>(Lcom/google/android/gms/common/api/Status;Z)V

    return-object v0
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/drive/internal/bt;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/br$5;->a(Lcom/google/android/gms/drive/internal/bt;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/drive/internal/bt;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/bt;->i()Lcom/google/android/gms/drive/internal/n;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/drive/internal/br$5$1;

    invoke-direct {v1, p0, p0}, Lcom/google/android/gms/drive/internal/br$5$1;-><init>(Lcom/google/android/gms/drive/internal/br$5;Lcom/google/android/gms/drive/internal/bs;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/drive/internal/n;->e(Lcom/google/android/gms/drive/internal/o;)V

    return-void
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/br$5;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/e;

    move-result-object v0

    return-object v0
.end method

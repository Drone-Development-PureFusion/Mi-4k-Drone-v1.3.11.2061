.class Lcom/google/android/gms/drive/internal/b$1;
.super Lcom/google/android/gms/drive/internal/b$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/b;->a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/drive/internal/b;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/b;Lcom/google/android/gms/common/api/g;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/b$1;->a:Lcom/google/android/gms/drive/internal/b;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/drive/internal/b$c;-><init>(Lcom/google/android/gms/drive/internal/b;Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/drive/internal/bt;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/b$1;->a(Lcom/google/android/gms/drive/internal/bt;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/drive/internal/bt;)V
    .locals 4

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/bt;->i()Lcom/google/android/gms/drive/internal/n;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/drive/internal/b$a;

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/b$1;->a:Lcom/google/android/gms/drive/internal/b;

    const/4 v3, 0x0

    invoke-direct {v1, v2, p0, v3}, Lcom/google/android/gms/drive/internal/b$a;-><init>(Lcom/google/android/gms/drive/internal/b;Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/drive/internal/b$1;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/drive/internal/n;->d(Lcom/google/android/gms/drive/internal/o;)V

    return-void
.end method

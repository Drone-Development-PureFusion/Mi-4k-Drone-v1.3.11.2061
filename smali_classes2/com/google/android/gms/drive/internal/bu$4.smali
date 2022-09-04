.class Lcom/google/android/gms/drive/internal/bu$4;
.super Lcom/google/android/gms/drive/internal/bs$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/bu;->b(Lcom/google/android/gms/common/api/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/drive/internal/bu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/bu;Lcom/google/android/gms/common/api/g;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/bu$4;->a:Lcom/google/android/gms/drive/internal/bu;

    invoke-direct {p0, p2}, Lcom/google/android/gms/drive/internal/bs$a;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/drive/internal/bt;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/bu$4;->a(Lcom/google/android/gms/drive/internal/bt;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/drive/internal/bt;)V
    .locals 4

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/bt;->i()Lcom/google/android/gms/drive/internal/n;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/drive/internal/CloseContentsRequest;

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/bu$4;->a:Lcom/google/android/gms/drive/internal/bu;

    invoke-static {v2}, Lcom/google/android/gms/drive/internal/bu;->a(Lcom/google/android/gms/drive/internal/bu;)Lcom/google/android/gms/drive/Contents;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/drive/Contents;->f()I

    move-result v2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/drive/internal/CloseContentsRequest;-><init>(IZ)V

    new-instance v2, Lcom/google/android/gms/drive/internal/at;

    invoke-direct {v2, p0}, Lcom/google/android/gms/drive/internal/at;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/drive/internal/n;->a(Lcom/google/android/gms/drive/internal/CloseContentsRequest;Lcom/google/android/gms/drive/internal/o;)V

    return-void
.end method

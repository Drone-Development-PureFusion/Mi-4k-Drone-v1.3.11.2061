.class Lcom/google/android/gms/drive/internal/bu$1;
.super Lcom/google/android/gms/drive/internal/br$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/bu;->a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
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

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/bu$1;->a:Lcom/google/android/gms/drive/internal/bu;

    invoke-direct {p0, p2}, Lcom/google/android/gms/drive/internal/br$c;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/drive/internal/bt;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/bu$1;->a(Lcom/google/android/gms/drive/internal/bt;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/drive/internal/bt;)V
    .locals 5

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/bt;->i()Lcom/google/android/gms/drive/internal/n;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/drive/internal/OpenContentsRequest;

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/bu$1;->a:Lcom/google/android/gms/drive/internal/bu;

    invoke-virtual {v2}, Lcom/google/android/gms/drive/internal/bu;->a()Lcom/google/android/gms/drive/DriveId;

    move-result-object v2

    const/high16 v3, 0x20000000

    iget-object v4, p0, Lcom/google/android/gms/drive/internal/bu$1;->a:Lcom/google/android/gms/drive/internal/bu;

    invoke-static {v4}, Lcom/google/android/gms/drive/internal/bu;->a(Lcom/google/android/gms/drive/internal/bu;)Lcom/google/android/gms/drive/Contents;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/drive/Contents;->f()I

    move-result v4

    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/gms/drive/internal/OpenContentsRequest;-><init>(Lcom/google/android/gms/drive/DriveId;II)V

    new-instance v2, Lcom/google/android/gms/drive/internal/ak;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/google/android/gms/drive/internal/ak;-><init>(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/drive/e$a;)V

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/drive/internal/n;->a(Lcom/google/android/gms/drive/internal/OpenContentsRequest;Lcom/google/android/gms/drive/internal/o;)Lcom/google/android/gms/drive/internal/DriveServiceResponse;

    return-void
.end method

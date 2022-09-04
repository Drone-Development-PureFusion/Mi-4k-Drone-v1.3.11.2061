.class Lcom/google/android/gms/drive/internal/ak;
.super Lcom/google/android/gms/drive/internal/bc;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ahl$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/drive/c$a;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/android/gms/drive/e$a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/drive/e$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/drive/c$a;",
            ">;",
            "Lcom/google/android/gms/drive/e$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/drive/internal/bc;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/ak;->a:Lcom/google/android/gms/internal/ahl$b;

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/ak;->b:Lcom/google/android/gms/drive/e$a;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/ak;->a:Lcom/google/android/gms/internal/ahl$b;

    new-instance v1, Lcom/google/android/gms/drive/internal/br$b;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lcom/google/android/gms/drive/internal/br$b;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/d;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ahl$b;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/drive/internal/OnContentsResponse;)V
    .locals 5

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/OnContentsResponse;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/drive/internal/ak;->a:Lcom/google/android/gms/internal/ahl$b;

    new-instance v2, Lcom/google/android/gms/drive/internal/br$b;

    new-instance v3, Lcom/google/android/gms/drive/internal/bu;

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/OnContentsResponse;->a()Lcom/google/android/gms/drive/Contents;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/google/android/gms/drive/internal/bu;-><init>(Lcom/google/android/gms/drive/Contents;)V

    invoke-direct {v2, v0, v3}, Lcom/google/android/gms/drive/internal/br$b;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/d;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ahl$b;->a(Ljava/lang/Object;)V

    return-void

    :cond_0
    sget-object v0, Lcom/google/android/gms/common/api/Status;->a:Lcom/google/android/gms/common/api/Status;

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/drive/internal/OnDownloadProgressResponse;)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/ak;->b:Lcom/google/android/gms/drive/e$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/ak;->b:Lcom/google/android/gms/drive/e$a;

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/OnDownloadProgressResponse;->a()J

    move-result-wide v2

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/OnDownloadProgressResponse;->b()J

    move-result-wide v4

    invoke-interface {v0, v2, v3, v4, v5}, Lcom/google/android/gms/drive/e$a;->a(JJ)V

    :cond_0
    return-void
.end method

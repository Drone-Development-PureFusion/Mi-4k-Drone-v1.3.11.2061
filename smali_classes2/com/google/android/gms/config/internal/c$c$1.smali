.class Lcom/google/android/gms/config/internal/c$c$1;
.super Lcom/google/android/gms/config/internal/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/config/internal/c$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/config/internal/c$c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/config/internal/c$c;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/config/internal/c$c$1;->a:Lcom/google/android/gms/config/internal/c$c;

    invoke-direct {p0}, Lcom/google/android/gms/config/internal/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/config/internal/FetchConfigIpcResponse;)V
    .locals 6

    invoke-virtual {p2}, Lcom/google/android/gms/config/internal/FetchConfigIpcResponse;->b()I

    move-result v0

    const/16 v1, 0x1966

    if-eq v0, v1, :cond_0

    invoke-virtual {p2}, Lcom/google/android/gms/config/internal/FetchConfigIpcResponse;->b()I

    move-result v0

    const/16 v1, 0x196b

    if-ne v0, v1, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/config/internal/c$c$1;->a:Lcom/google/android/gms/config/internal/c$c;

    new-instance v1, Lcom/google/android/gms/config/internal/c$d;

    invoke-virtual {p2}, Lcom/google/android/gms/config/internal/FetchConfigIpcResponse;->b()I

    move-result v2

    invoke-static {v2}, Lcom/google/android/gms/config/internal/c;->a(I)Lcom/google/android/gms/common/api/Status;

    move-result-object v2

    invoke-static {p2}, Lcom/google/android/gms/config/internal/c;->a(Lcom/google/android/gms/config/internal/FetchConfigIpcResponse;)Ljava/util/HashMap;

    move-result-object v3

    invoke-virtual {p2}, Lcom/google/android/gms/config/internal/FetchConfigIpcResponse;->d()J

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/config/internal/c$d;-><init>(Lcom/google/android/gms/common/api/Status;Ljava/util/Map;J)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/config/internal/c$c;->b(Lcom/google/android/gms/common/api/m;)V

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/config/internal/c$c$1;->a:Lcom/google/android/gms/config/internal/c$c;

    new-instance v1, Lcom/google/android/gms/config/internal/c$d;

    invoke-virtual {p2}, Lcom/google/android/gms/config/internal/FetchConfigIpcResponse;->b()I

    move-result v2

    invoke-static {v2}, Lcom/google/android/gms/config/internal/c;->a(I)Lcom/google/android/gms/common/api/Status;

    move-result-object v2

    invoke-static {p2}, Lcom/google/android/gms/config/internal/c;->a(Lcom/google/android/gms/config/internal/FetchConfigIpcResponse;)Ljava/util/HashMap;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/config/internal/c$d;-><init>(Lcom/google/android/gms/common/api/Status;Ljava/util/Map;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/config/internal/c$c;->b(Lcom/google/android/gms/common/api/m;)V

    goto :goto_0
.end method

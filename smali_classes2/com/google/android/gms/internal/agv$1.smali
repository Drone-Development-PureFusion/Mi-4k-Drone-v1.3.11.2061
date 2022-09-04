.class Lcom/google/android/gms/internal/agv$1;
.super Lcom/google/android/gms/internal/agy$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/agv;->a(Lcom/google/android/gms/internal/agw;Lcom/google/android/gms/internal/agy;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/agy;

.field final synthetic b:Lcom/google/android/gms/internal/agv;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/agv;Lcom/google/android/gms/internal/agy;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/agv$1;->b:Lcom/google/android/gms/internal/agv;

    iput-object p2, p0, Lcom/google/android/gms/internal/agv$1;->a:Lcom/google/android/gms/internal/agy;

    invoke-direct {p0}, Lcom/google/android/gms/internal/agy$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 3

    invoke-static {}, Lcom/google/android/gms/internal/agv;->h()Lcom/google/android/gms/cast/internal/m;

    move-result-object v0

    const-string v1, "onRemoteDisplayEnded"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agv$1;->a:Lcom/google/android/gms/internal/agy;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/agv$1;->a:Lcom/google/android/gms/internal/agy;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/agy;->a(I)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/agv$1;->b:Lcom/google/android/gms/internal/agv;

    invoke-static {v0}, Lcom/google/android/gms/internal/agv;->a(Lcom/google/android/gms/internal/agv;)Lcom/google/android/gms/cast/d$b;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/agv$1;->b:Lcom/google/android/gms/internal/agv;

    invoke-static {v0}, Lcom/google/android/gms/internal/agv;->a(Lcom/google/android/gms/internal/agv;)Lcom/google/android/gms/cast/d$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    invoke-direct {v1, p1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/cast/d$b;->a(Lcom/google/android/gms/common/api/Status;)V

    :cond_1
    return-void
.end method

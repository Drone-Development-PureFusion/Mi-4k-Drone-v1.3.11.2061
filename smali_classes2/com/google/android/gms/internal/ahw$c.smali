.class Lcom/google/android/gms/internal/ahw$c;
.super Lcom/google/android/gms/internal/ahw$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ahw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ahw;

.field private final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/common/api/a$f;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ahw;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/common/api/a$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/ahw$c;->a:Lcom/google/android/gms/internal/ahw;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ahw$f;-><init>(Lcom/google/android/gms/internal/ahw;Lcom/google/android/gms/internal/ahw$1;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ahw$c;->c:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ahw$c;->a:Lcom/google/android/gms/internal/ahw;

    invoke-static {v0}, Lcom/google/android/gms/internal/ahw;->d(Lcom/google/android/gms/internal/ahw;)Lcom/google/android/gms/internal/aia;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/aia;->i:Lcom/google/android/gms/internal/ahy;

    iget-object v1, p0, Lcom/google/android/gms/internal/ahw$c;->a:Lcom/google/android/gms/internal/ahw;

    invoke-static {v1}, Lcom/google/android/gms/internal/ahw;->g(Lcom/google/android/gms/internal/ahw;)Ljava/util/Set;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/ahy;->f:Ljava/util/Set;

    iget-object v0, p0, Lcom/google/android/gms/internal/ahw$c;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/a$f;

    iget-object v2, p0, Lcom/google/android/gms/internal/ahw$c;->a:Lcom/google/android/gms/internal/ahw;

    invoke-static {v2}, Lcom/google/android/gms/internal/ahw;->h(Lcom/google/android/gms/internal/ahw;)Lcom/google/android/gms/common/internal/ac;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ahw$c;->a:Lcom/google/android/gms/internal/ahw;

    invoke-static {v3}, Lcom/google/android/gms/internal/ahw;->d(Lcom/google/android/gms/internal/ahw;)Lcom/google/android/gms/internal/aia;

    move-result-object v3

    iget-object v3, v3, Lcom/google/android/gms/internal/aia;->i:Lcom/google/android/gms/internal/ahy;

    iget-object v3, v3, Lcom/google/android/gms/internal/ahy;->f:Ljava/util/Set;

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/common/api/a$f;->a(Lcom/google/android/gms/common/internal/ac;Ljava/util/Set;)V

    goto :goto_0

    :cond_0
    return-void
.end method

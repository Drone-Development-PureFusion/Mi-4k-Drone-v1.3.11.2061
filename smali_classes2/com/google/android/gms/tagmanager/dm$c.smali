.class Lcom/google/android/gms/tagmanager/dm$c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/av;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/tagmanager/dm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tagmanager/av",
        "<",
        "Lcom/google/android/gms/internal/gi$j;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/tagmanager/dm;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/tagmanager/dm;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/dm$c;->a:Lcom/google/android/gms/tagmanager/dm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/tagmanager/dm;Lcom/google/android/gms/tagmanager/dm$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/tagmanager/dm$c;-><init>(Lcom/google/android/gms/tagmanager/dm;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/gi$j;)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm$c;->a:Lcom/google/android/gms/tagmanager/dm;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/dm;->c(Lcom/google/android/gms/tagmanager/dm;)Lcom/google/android/gms/tagmanager/dn;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/dn;->d()V

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/dm$c;->a:Lcom/google/android/gms/tagmanager/dm;

    monitor-enter v1

    :try_start_0
    iget-object v0, p1, Lcom/google/android/gms/internal/gi$j;->b:Lcom/google/android/gms/internal/gi$f;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm$c;->a:Lcom/google/android/gms/tagmanager/dm;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/dm;->f(Lcom/google/android/gms/tagmanager/dm;)Lcom/google/android/gms/internal/gi$j;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/gi$j;->b:Lcom/google/android/gms/internal/gi$f;

    if-nez v0, :cond_0

    const-string v0, "Current resource is null; network resource is also null"

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/aw;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm$c;->a:Lcom/google/android/gms/tagmanager/dm;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/dm;->c(Lcom/google/android/gms/tagmanager/dm;)Lcom/google/android/gms/tagmanager/dn;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/dn;->b()J

    move-result-wide v2

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm$c;->a:Lcom/google/android/gms/tagmanager/dm;

    invoke-static {v0, v2, v3}, Lcom/google/android/gms/tagmanager/dm;->a(Lcom/google/android/gms/tagmanager/dm;J)V

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm$c;->a:Lcom/google/android/gms/tagmanager/dm;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/dm;->f(Lcom/google/android/gms/tagmanager/dm;)Lcom/google/android/gms/internal/gi$j;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/gi$j;->b:Lcom/google/android/gms/internal/gi$f;

    iput-object v0, p1, Lcom/google/android/gms/internal/gi$j;->b:Lcom/google/android/gms/internal/gi$f;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm$c;->a:Lcom/google/android/gms/tagmanager/dm;

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/dm$c;->a:Lcom/google/android/gms/tagmanager/dm;

    invoke-static {v2}, Lcom/google/android/gms/tagmanager/dm;->d(Lcom/google/android/gms/tagmanager/dm;)Lcom/google/android/gms/common/util/e;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v2

    const/4 v4, 0x0

    invoke-static {v0, p1, v2, v3, v4}, Lcom/google/android/gms/tagmanager/dm;->a(Lcom/google/android/gms/tagmanager/dm;Lcom/google/android/gms/internal/gi$j;JZ)V

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm$c;->a:Lcom/google/android/gms/tagmanager/dm;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/dm;->g(Lcom/google/android/gms/tagmanager/dm;)J

    move-result-wide v2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v4, 0x3a

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "setting refresh time to current time: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/aw;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm$c;->a:Lcom/google/android/gms/tagmanager/dm;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/dm;->h(Lcom/google/android/gms/tagmanager/dm;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm$c;->a:Lcom/google/android/gms/tagmanager/dm;

    invoke-static {v0, p1}, Lcom/google/android/gms/tagmanager/dm;->a(Lcom/google/android/gms/tagmanager/dm;Lcom/google/android/gms/internal/gi$j;)V

    :cond_2
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Lcom/google/android/gms/tagmanager/av$a;)V
    .locals 4

    sget-object v0, Lcom/google/android/gms/tagmanager/av$a;->d:Lcom/google/android/gms/tagmanager/av$a;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm$c;->a:Lcom/google/android/gms/tagmanager/dm;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/dm;->c(Lcom/google/android/gms/tagmanager/dm;)Lcom/google/android/gms/tagmanager/dn;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/dn;->c()V

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/tagmanager/dm$c;->a:Lcom/google/android/gms/tagmanager/dm;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm$c;->a:Lcom/google/android/gms/tagmanager/dm;

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/dm;->i()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm$c;->a:Lcom/google/android/gms/tagmanager/dm;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/dm;->b(Lcom/google/android/gms/tagmanager/dm;)Lcom/google/android/gms/tagmanager/dl;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm$c;->a:Lcom/google/android/gms/tagmanager/dm;

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/dm$c;->a:Lcom/google/android/gms/tagmanager/dm;

    invoke-static {v2}, Lcom/google/android/gms/tagmanager/dm;->b(Lcom/google/android/gms/tagmanager/dm;)Lcom/google/android/gms/tagmanager/dl;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/tagmanager/dm;->b(Lcom/google/android/gms/common/api/m;)V

    :cond_1
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm$c;->a:Lcom/google/android/gms/tagmanager/dm;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/dm;->c(Lcom/google/android/gms/tagmanager/dm;)Lcom/google/android/gms/tagmanager/dn;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/dn;->b()J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/dm$c;->a:Lcom/google/android/gms/tagmanager/dm;

    invoke-static {v2, v0, v1}, Lcom/google/android/gms/tagmanager/dm;->a(Lcom/google/android/gms/tagmanager/dm;J)V

    return-void

    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm$c;->a:Lcom/google/android/gms/tagmanager/dm;

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/dm$c;->a:Lcom/google/android/gms/tagmanager/dm;

    sget-object v3, Lcom/google/android/gms/common/api/Status;->d:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/tagmanager/dm;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/tagmanager/b;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/tagmanager/dm;->b(Lcom/google/android/gms/common/api/m;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/gi$j;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/tagmanager/dm$c;->a(Lcom/google/android/gms/internal/gi$j;)V

    return-void
.end method

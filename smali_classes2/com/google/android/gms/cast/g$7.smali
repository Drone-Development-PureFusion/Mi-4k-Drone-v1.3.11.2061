.class Lcom/google/android/gms/cast/g$7;
.super Lcom/google/android/gms/cast/g$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/cast/g;->a(Lcom/google/android/gms/common/api/g;IJLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/google/android/gms/common/api/g;

.field final synthetic c:J

.field final synthetic d:Lorg/json/JSONObject;

.field final synthetic e:Lcom/google/android/gms/cast/g;


# direct methods
.method constructor <init>(Lcom/google/android/gms/cast/g;Lcom/google/android/gms/common/api/g;ILcom/google/android/gms/common/api/g;JLorg/json/JSONObject;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/cast/g$7;->e:Lcom/google/android/gms/cast/g;

    iput p3, p0, Lcom/google/android/gms/cast/g$7;->a:I

    iput-object p4, p0, Lcom/google/android/gms/cast/g$7;->b:Lcom/google/android/gms/common/api/g;

    iput-wide p5, p0, Lcom/google/android/gms/cast/g$7;->c:J

    iput-object p7, p0, Lcom/google/android/gms/cast/g$7;->d:Lorg/json/JSONObject;

    invoke-direct {p0, p2}, Lcom/google/android/gms/cast/g$g;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/cast/internal/e;)V
    .locals 11

    iget-object v0, p0, Lcom/google/android/gms/cast/g$7;->e:Lcom/google/android/gms/cast/g;

    invoke-static {v0}, Lcom/google/android/gms/cast/g;->e(Lcom/google/android/gms/cast/g;)Ljava/lang/Object;

    move-result-object v10

    monitor-enter v10

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/g$7;->e:Lcom/google/android/gms/cast/g;

    iget v1, p0, Lcom/google/android/gms/cast/g$7;->a:I

    invoke-static {v0, v1}, Lcom/google/android/gms/cast/g;->a(Lcom/google/android/gms/cast/g;I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/g$g;->b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/g$a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/g$7;->b(Lcom/google/android/gms/common/api/m;)V

    monitor-exit v10

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/cast/g$7;->e:Lcom/google/android/gms/cast/g;

    invoke-static {v0}, Lcom/google/android/gms/cast/g;->f(Lcom/google/android/gms/cast/g;)Lcom/google/android/gms/cast/g$f;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/cast/g$7;->b:Lcom/google/android/gms/common/api/g;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/g$f;->a(Lcom/google/android/gms/common/api/g;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/cast/g$7;->e:Lcom/google/android/gms/cast/g;

    invoke-static {v0}, Lcom/google/android/gms/cast/g;->g(Lcom/google/android/gms/cast/g;)Lcom/google/android/gms/cast/internal/n;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/cast/g$7;->h:Lcom/google/android/gms/cast/internal/p;

    iget v3, p0, Lcom/google/android/gms/cast/g$7;->a:I

    iget-wide v4, p0, Lcom/google/android/gms/cast/g$7;->c:J

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    iget-object v9, p0, Lcom/google/android/gms/cast/g$7;->d:Lorg/json/JSONObject;

    invoke-virtual/range {v1 .. v9}, Lcom/google/android/gms/cast/internal/n;->a(Lcom/google/android/gms/cast/internal/p;IJ[Lcom/google/android/gms/cast/MediaQueueItem;ILjava/lang/Integer;Lorg/json/JSONObject;)J
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/cast/g$7;->e:Lcom/google/android/gms/cast/g;

    invoke-static {v0}, Lcom/google/android/gms/cast/g;->f(Lcom/google/android/gms/cast/g;)Lcom/google/android/gms/cast/g$f;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/g$f;->a(Lcom/google/android/gms/common/api/g;)V

    :goto_1
    monitor-exit v10

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catch_0
    move-exception v0

    :try_start_3
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0x834

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/g$g;->b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/g$a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/g$7;->b(Lcom/google/android/gms/common/api/m;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    iget-object v0, p0, Lcom/google/android/gms/cast/g$7;->e:Lcom/google/android/gms/cast/g;

    invoke-static {v0}, Lcom/google/android/gms/cast/g;->f(Lcom/google/android/gms/cast/g;)Lcom/google/android/gms/cast/g$f;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/g$f;->a(Lcom/google/android/gms/common/api/g;)V

    goto :goto_1

    :catchall_1
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/cast/g$7;->e:Lcom/google/android/gms/cast/g;

    invoke-static {v1}, Lcom/google/android/gms/cast/g;->f(Lcom/google/android/gms/cast/g;)Lcom/google/android/gms/cast/g$f;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/google/android/gms/cast/g$f;->a(Lcom/google/android/gms/common/api/g;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/cast/internal/e;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/cast/g$7;->a(Lcom/google/android/gms/cast/internal/e;)V

    return-void
.end method

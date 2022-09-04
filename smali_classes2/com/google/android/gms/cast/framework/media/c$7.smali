.class Lcom/google/android/gms/cast/framework/media/c$7;
.super Lcom/google/android/gms/cast/framework/media/c$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/cast/framework/media/c;->a(IJLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:J

.field final synthetic c:Lorg/json/JSONObject;

.field final synthetic d:Lcom/google/android/gms/cast/framework/media/c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/cast/framework/media/c;Lcom/google/android/gms/common/api/g;IJLorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/media/c$7;->d:Lcom/google/android/gms/cast/framework/media/c;

    iput p3, p0, Lcom/google/android/gms/cast/framework/media/c$7;->a:I

    iput-wide p4, p0, Lcom/google/android/gms/cast/framework/media/c$7;->b:J

    iput-object p6, p0, Lcom/google/android/gms/cast/framework/media/c$7;->c:Lorg/json/JSONObject;

    invoke-direct {p0, p2}, Lcom/google/android/gms/cast/framework/media/c$f;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/cast/internal/e;)V
    .locals 11

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c$7;->d:Lcom/google/android/gms/cast/framework/media/c;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/media/c;->d(Lcom/google/android/gms/cast/framework/media/c;)Ljava/lang/Object;

    move-result-object v10

    monitor-enter v10

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c$7;->d:Lcom/google/android/gms/cast/framework/media/c;

    iget v1, p0, Lcom/google/android/gms/cast/framework/media/c$7;->a:I

    invoke-static {v0, v1}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c;I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/framework/media/c$f;->b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/media/c$b;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/framework/media/c$7;->b(Lcom/google/android/gms/common/api/m;)V

    monitor-exit v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c$7;->d:Lcom/google/android/gms/cast/framework/media/c;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/media/c;->e(Lcom/google/android/gms/cast/framework/media/c;)Lcom/google/android/gms/cast/internal/n;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/c$7;->g:Lcom/google/android/gms/cast/internal/p;

    iget v3, p0, Lcom/google/android/gms/cast/framework/media/c$7;->a:I

    iget-wide v4, p0, Lcom/google/android/gms/cast/framework/media/c$7;->b:J

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    iget-object v9, p0, Lcom/google/android/gms/cast/framework/media/c$7;->c:Lorg/json/JSONObject;

    invoke-virtual/range {v1 .. v9}, Lcom/google/android/gms/cast/internal/n;->a(Lcom/google/android/gms/cast/internal/p;IJ[Lcom/google/android/gms/cast/MediaQueueItem;ILjava/lang/Integer;Lorg/json/JSONObject;)J
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    :try_start_2
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

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/framework/media/c$f;->b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/media/c$b;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/framework/media/c$7;->b(Lcom/google/android/gms/common/api/m;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/cast/internal/e;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/cast/framework/media/c$7;->a(Lcom/google/android/gms/cast/internal/e;)V

    return-void
.end method

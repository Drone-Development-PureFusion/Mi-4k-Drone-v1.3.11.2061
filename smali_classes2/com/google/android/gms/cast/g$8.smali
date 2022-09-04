.class Lcom/google/android/gms/cast/g$8;
.super Lcom/google/android/gms/cast/g$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/cast/g;->a(Lcom/google/android/gms/common/api/g;IILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:I

.field final synthetic c:Lcom/google/android/gms/common/api/g;

.field final synthetic d:Lorg/json/JSONObject;

.field final synthetic e:Lcom/google/android/gms/cast/g;


# direct methods
.method constructor <init>(Lcom/google/android/gms/cast/g;Lcom/google/android/gms/common/api/g;IILcom/google/android/gms/common/api/g;Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/g$8;->e:Lcom/google/android/gms/cast/g;

    iput p3, p0, Lcom/google/android/gms/cast/g$8;->a:I

    iput p4, p0, Lcom/google/android/gms/cast/g$8;->b:I

    iput-object p5, p0, Lcom/google/android/gms/cast/g$8;->c:Lcom/google/android/gms/common/api/g;

    iput-object p6, p0, Lcom/google/android/gms/cast/g$8;->d:Lorg/json/JSONObject;

    invoke-direct {p0, p2}, Lcom/google/android/gms/cast/g$g;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/cast/internal/e;)V
    .locals 8

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/cast/g$8;->e:Lcom/google/android/gms/cast/g;

    invoke-static {v1}, Lcom/google/android/gms/cast/g;->e(Lcom/google/android/gms/cast/g;)Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/cast/g$8;->e:Lcom/google/android/gms/cast/g;

    iget v3, p0, Lcom/google/android/gms/cast/g$8;->a:I

    invoke-static {v1, v3}, Lcom/google/android/gms/cast/g;->a(Lcom/google/android/gms/cast/g;I)I

    move-result v1

    const/4 v3, -0x1

    if-ne v1, v3, :cond_0

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/g$g;->b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/g$a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/g$8;->b(Lcom/google/android/gms/common/api/m;)V

    monitor-exit v2

    :goto_0
    return-void

    :cond_0
    iget v3, p0, Lcom/google/android/gms/cast/g$8;->b:I

    if-gez v3, :cond_1

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0x7d1

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v4, "Invalid request: Invalid newIndex %d."

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    iget v7, p0, Lcom/google/android/gms/cast/g$8;->b:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/g$g;->b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/g$a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/g$8;->b(Lcom/google/android/gms/common/api/m;)V

    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :try_start_1
    iget v3, p0, Lcom/google/android/gms/cast/g$8;->b:I

    if-ne v1, v3, :cond_2

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/g$g;->b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/g$a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/g$8;->b(Lcom/google/android/gms/common/api/m;)V

    monitor-exit v2

    goto :goto_0

    :cond_2
    iget v3, p0, Lcom/google/android/gms/cast/g$8;->b:I

    if-le v3, v1, :cond_4

    iget v1, p0, Lcom/google/android/gms/cast/g$8;->b:I

    add-int/lit8 v1, v1, 0x1

    :goto_1
    iget-object v3, p0, Lcom/google/android/gms/cast/g$8;->e:Lcom/google/android/gms/cast/g;

    invoke-virtual {v3}, Lcom/google/android/gms/cast/g;->c()Lcom/google/android/gms/cast/MediaStatus;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/google/android/gms/cast/MediaStatus;->b(I)Lcom/google/android/gms/cast/MediaQueueItem;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/google/android/gms/cast/MediaQueueItem;->c()I

    move-result v0

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/cast/g$8;->e:Lcom/google/android/gms/cast/g;

    invoke-static {v1}, Lcom/google/android/gms/cast/g;->f(Lcom/google/android/gms/cast/g;)Lcom/google/android/gms/cast/g$f;

    move-result-object v1

    iget-object v3, p0, Lcom/google/android/gms/cast/g$8;->c:Lcom/google/android/gms/common/api/g;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/cast/g$f;->a(Lcom/google/android/gms/common/api/g;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v1, p0, Lcom/google/android/gms/cast/g$8;->e:Lcom/google/android/gms/cast/g;

    invoke-static {v1}, Lcom/google/android/gms/cast/g;->g(Lcom/google/android/gms/cast/g;)Lcom/google/android/gms/cast/internal/n;

    move-result-object v1

    iget-object v3, p0, Lcom/google/android/gms/cast/g$8;->h:Lcom/google/android/gms/cast/internal/p;

    const/4 v4, 0x1

    new-array v4, v4, [I

    const/4 v5, 0x0

    iget v6, p0, Lcom/google/android/gms/cast/g$8;->a:I

    aput v6, v4, v5

    iget-object v5, p0, Lcom/google/android/gms/cast/g$8;->d:Lorg/json/JSONObject;

    invoke-virtual {v1, v3, v4, v0, v5}, Lcom/google/android/gms/cast/internal/n;->a(Lcom/google/android/gms/cast/internal/p;[IILorg/json/JSONObject;)J
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    iget-object v0, p0, Lcom/google/android/gms/cast/g$8;->e:Lcom/google/android/gms/cast/g;

    invoke-static {v0}, Lcom/google/android/gms/cast/g;->f(Lcom/google/android/gms/cast/g;)Lcom/google/android/gms/cast/g$f;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/g$f;->a(Lcom/google/android/gms/common/api/g;)V

    :goto_2
    monitor-exit v2

    goto/16 :goto_0

    :cond_4
    iget v1, p0, Lcom/google/android/gms/cast/g$8;->b:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_4
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0x834

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/g$g;->b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/g$a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/g$8;->b(Lcom/google/android/gms/common/api/m;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    iget-object v0, p0, Lcom/google/android/gms/cast/g$8;->e:Lcom/google/android/gms/cast/g;

    invoke-static {v0}, Lcom/google/android/gms/cast/g;->f(Lcom/google/android/gms/cast/g;)Lcom/google/android/gms/cast/g$f;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/g$f;->a(Lcom/google/android/gms/common/api/g;)V

    goto :goto_2

    :catchall_1
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/cast/g$8;->e:Lcom/google/android/gms/cast/g;

    invoke-static {v1}, Lcom/google/android/gms/cast/g;->f(Lcom/google/android/gms/cast/g;)Lcom/google/android/gms/cast/g$f;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lcom/google/android/gms/cast/g$f;->a(Lcom/google/android/gms/common/api/g;)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/cast/internal/e;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/cast/g$8;->a(Lcom/google/android/gms/cast/internal/e;)V

    return-void
.end method

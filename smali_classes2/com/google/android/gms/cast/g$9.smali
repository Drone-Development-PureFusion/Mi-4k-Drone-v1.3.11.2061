.class Lcom/google/android/gms/cast/g$9;
.super Lcom/google/android/gms/cast/g$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/cast/g;->a(Lcom/google/android/gms/common/api/g;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/common/api/g;

.field final synthetic b:Lorg/json/JSONObject;

.field final synthetic c:Lcom/google/android/gms/cast/g;


# direct methods
.method constructor <init>(Lcom/google/android/gms/cast/g;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/common/api/g;Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/g$9;->c:Lcom/google/android/gms/cast/g;

    iput-object p3, p0, Lcom/google/android/gms/cast/g$9;->a:Lcom/google/android/gms/common/api/g;

    iput-object p4, p0, Lcom/google/android/gms/cast/g$9;->b:Lorg/json/JSONObject;

    invoke-direct {p0, p2}, Lcom/google/android/gms/cast/g$g;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/cast/internal/e;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/cast/g$9;->c:Lcom/google/android/gms/cast/g;

    invoke-static {v0}, Lcom/google/android/gms/cast/g;->e(Lcom/google/android/gms/cast/g;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/g$9;->c:Lcom/google/android/gms/cast/g;

    invoke-static {v0}, Lcom/google/android/gms/cast/g;->f(Lcom/google/android/gms/cast/g;)Lcom/google/android/gms/cast/g$f;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/cast/g$9;->a:Lcom/google/android/gms/common/api/g;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/cast/g$f;->a(Lcom/google/android/gms/common/api/g;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/cast/g$9;->c:Lcom/google/android/gms/cast/g;

    invoke-static {v0}, Lcom/google/android/gms/cast/g;->g(Lcom/google/android/gms/cast/g;)Lcom/google/android/gms/cast/internal/n;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/cast/g$9;->h:Lcom/google/android/gms/cast/internal/p;

    iget-object v3, p0, Lcom/google/android/gms/cast/g$9;->b:Lorg/json/JSONObject;

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/cast/internal/n;->a(Lcom/google/android/gms/cast/internal/p;Lorg/json/JSONObject;)J
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/cast/g$9;->c:Lcom/google/android/gms/cast/g;

    invoke-static {v0}, Lcom/google/android/gms/cast/g;->f(Lcom/google/android/gms/cast/g;)Lcom/google/android/gms/cast/g$f;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/cast/g$f;->a(Lcom/google/android/gms/common/api/g;)V

    :goto_0
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-void

    :catch_0
    move-exception v0

    :try_start_3
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v2, 0x834

    invoke-direct {v0, v2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/g$g;->b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/g$a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/g$9;->b(Lcom/google/android/gms/common/api/m;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    iget-object v0, p0, Lcom/google/android/gms/cast/g$9;->c:Lcom/google/android/gms/cast/g;

    invoke-static {v0}, Lcom/google/android/gms/cast/g;->f(Lcom/google/android/gms/cast/g;)Lcom/google/android/gms/cast/g$f;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/cast/g$f;->a(Lcom/google/android/gms/common/api/g;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0

    :catchall_1
    move-exception v0

    :try_start_5
    iget-object v2, p0, Lcom/google/android/gms/cast/g$9;->c:Lcom/google/android/gms/cast/g;

    invoke-static {v2}, Lcom/google/android/gms/cast/g;->f(Lcom/google/android/gms/cast/g;)Lcom/google/android/gms/cast/g$f;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/google/android/gms/cast/g$f;->a(Lcom/google/android/gms/common/api/g;)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/cast/internal/e;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/cast/g$9;->a(Lcom/google/android/gms/cast/internal/e;)V

    return-void
.end method

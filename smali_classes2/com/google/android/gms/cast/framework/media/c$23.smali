.class Lcom/google/android/gms/cast/framework/media/c$23;
.super Lcom/google/android/gms/cast/framework/media/c$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/cast/framework/media/c;->a([IILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:[I

.field final synthetic b:I

.field final synthetic c:Lorg/json/JSONObject;

.field final synthetic d:Lcom/google/android/gms/cast/framework/media/c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/cast/framework/media/c;Lcom/google/android/gms/common/api/g;[IILorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/media/c$23;->d:Lcom/google/android/gms/cast/framework/media/c;

    iput-object p3, p0, Lcom/google/android/gms/cast/framework/media/c$23;->a:[I

    iput p4, p0, Lcom/google/android/gms/cast/framework/media/c$23;->b:I

    iput-object p5, p0, Lcom/google/android/gms/cast/framework/media/c$23;->c:Lorg/json/JSONObject;

    invoke-direct {p0, p2}, Lcom/google/android/gms/cast/framework/media/c$f;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/cast/internal/e;)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c$23;->d:Lcom/google/android/gms/cast/framework/media/c;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/media/c;->d(Lcom/google/android/gms/cast/framework/media/c;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c$23;->d:Lcom/google/android/gms/cast/framework/media/c;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/media/c;->e(Lcom/google/android/gms/cast/framework/media/c;)Lcom/google/android/gms/cast/internal/n;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/c$23;->g:Lcom/google/android/gms/cast/internal/p;

    iget-object v3, p0, Lcom/google/android/gms/cast/framework/media/c$23;->a:[I

    iget v4, p0, Lcom/google/android/gms/cast/framework/media/c$23;->b:I

    iget-object v5, p0, Lcom/google/android/gms/cast/framework/media/c$23;->c:Lorg/json/JSONObject;

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/google/android/gms/cast/internal/n;->a(Lcom/google/android/gms/cast/internal/p;[IILorg/json/JSONObject;)J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    :try_start_1
    monitor-exit v1

    return-void

    :catch_0
    move-exception v0

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v2, 0x834

    invoke-direct {v0, v2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/framework/media/c$f;->b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/media/c$b;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/framework/media/c$23;->b(Lcom/google/android/gms/common/api/m;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/cast/internal/e;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/cast/framework/media/c$23;->a(Lcom/google/android/gms/cast/internal/e;)V

    return-void
.end method
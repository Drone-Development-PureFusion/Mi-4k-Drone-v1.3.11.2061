.class Lcom/google/android/gms/internal/agm$1;
.super Lcom/google/android/gms/internal/agm$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/agm;->a(Lcom/google/android/gms/cast/a/a;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/agm;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/agm;Lcom/google/android/gms/cast/a/a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/agm$1;->a:Lcom/google/android/gms/internal/agm;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/agm$c;-><init>(Lcom/google/android/gms/internal/agm;Lcom/google/android/gms/cast/a/a;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 5

    const/4 v4, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/agm$1;->a:Lcom/google/android/gms/internal/agm;

    invoke-static {v0}, Lcom/google/android/gms/internal/agm;->b(Lcom/google/android/gms/internal/agm;)Lcom/google/android/gms/cast/a$b;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/agm$1;->a:Lcom/google/android/gms/internal/agm;

    invoke-static {v1}, Lcom/google/android/gms/internal/agm;->a(Lcom/google/android/gms/internal/agm;)Lcom/google/android/gms/common/api/g;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/agm$1;->a:Lcom/google/android/gms/internal/agm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/agm;->b()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/agm$1$1;

    invoke-direct {v3, p0}, Lcom/google/android/gms/internal/agm$1$1;-><init>(Lcom/google/android/gms/internal/agm$1;)V

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/cast/a$b;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Lcom/google/android/gms/cast/a$e;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lcom/google/android/gms/internal/agm$1;->a:Lcom/google/android/gms/internal/agm;

    invoke-static {v0}, Lcom/google/android/gms/internal/agm;->c(Lcom/google/android/gms/internal/agm;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agm$1;->a:Lcom/google/android/gms/internal/agm;

    invoke-static {v0}, Lcom/google/android/gms/internal/agm;->d(Lcom/google/android/gms/internal/agm;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agm$1;->a:Lcom/google/android/gms/internal/agm;

    const/16 v1, 0x44c

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agm$1;->c()Lcom/google/android/gms/cast/internal/p;

    move-result-object v2

    invoke-static {v0, v4, v1, v4, v2}, Lcom/google/android/gms/internal/agm;->a(Lcom/google/android/gms/internal/agm;Ljava/lang/String;ILorg/json/JSONObject;Lcom/google/android/gms/cast/internal/p;)V

    :goto_0
    return-void

    :catch_0
    move-exception v0

    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/agm$1;->c()Lcom/google/android/gms/cast/internal/p;

    move-result-object v0

    const-wide/16 v2, -0x1

    const/16 v1, 0x8

    invoke-interface {v0, v2, v3, v1, v4}, Lcom/google/android/gms/cast/internal/p;->a(JILjava/lang/Object;)V

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1
.end method

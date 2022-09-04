.class Lcom/google/firebase/c/r;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Lcom/google/firebase/c/i;

.field private final b:Lcom/google/android/gms/g/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/g/g",
            "<",
            "Lcom/google/firebase/c/h;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/firebase/c/h;

.field private d:Lcom/google/firebase/c/h;

.field private e:Lcom/google/android/gms/internal/nb;


# direct methods
.method public constructor <init>(Lcom/google/firebase/c/i;Lcom/google/android/gms/g/g;Lcom/google/firebase/c/h;)V
    .locals 4
    .param p1    # Lcom/google/firebase/c/i;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/g/g;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/google/firebase/c/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/c/i;",
            "Lcom/google/android/gms/g/g",
            "<",
            "Lcom/google/firebase/c/h;",
            ">;",
            "Lcom/google/firebase/c/h;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/firebase/c/r;->d:Lcom/google/firebase/c/h;

    iput-object p1, p0, Lcom/google/firebase/c/r;->a:Lcom/google/firebase/c/i;

    iput-object p2, p0, Lcom/google/firebase/c/r;->b:Lcom/google/android/gms/g/g;

    iput-object p3, p0, Lcom/google/firebase/c/r;->c:Lcom/google/firebase/c/h;

    new-instance v0, Lcom/google/android/gms/internal/nb;

    iget-object v1, p0, Lcom/google/firebase/c/r;->a:Lcom/google/firebase/c/i;

    invoke-virtual {v1}, Lcom/google/firebase/c/i;->g()Lcom/google/firebase/b;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/c/r;->a:Lcom/google/firebase/c/i;

    invoke-virtual {v2}, Lcom/google/firebase/c/i;->f()Lcom/google/firebase/c/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/firebase/c/d;->d()J

    move-result-wide v2

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/nb;-><init>(Lcom/google/firebase/b;J)V

    iput-object v0, p0, Lcom/google/firebase/c/r;->e:Lcom/google/android/gms/internal/nb;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/c/r;->a:Lcom/google/firebase/c/i;

    invoke-virtual {v0}, Lcom/google/firebase/c/i;->h()Lcom/google/android/gms/internal/nj;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/c/r;->a:Lcom/google/firebase/c/i;

    invoke-virtual {v1}, Lcom/google/firebase/c/i;->o()Landroid/net/Uri;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/c/r;->c:Lcom/google/firebase/c/h;

    invoke-virtual {v2}, Lcom/google/firebase/c/h;->s()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/nj;->a(Landroid/net/Uri;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/nk;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    iget-object v0, p0, Lcom/google/firebase/c/r;->e:Lcom/google/android/gms/internal/nb;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/nb;->a(Lcom/google/android/gms/internal/nk;)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/nk;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_1
    new-instance v0, Lcom/google/firebase/c/h$a;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/nk;->d()Lorg/json/JSONObject;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/c/r;->a:Lcom/google/firebase/c/i;

    invoke-direct {v0, v2, v3}, Lcom/google/firebase/c/h$a;-><init>(Lorg/json/JSONObject;Lcom/google/firebase/c/i;)V

    invoke-virtual {v0}, Lcom/google/firebase/c/h$a;->a()Lcom/google/firebase/c/h;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/c/r;->d:Lcom/google/firebase/c/h;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/c/r;->b:Lcom/google/android/gms/g/g;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/c/r;->b:Lcom/google/android/gms/g/g;

    iget-object v2, p0, Lcom/google/firebase/c/r;->d:Lcom/google/firebase/c/h;

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/nk;->a(Lcom/google/android/gms/g/g;Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void

    :catch_0
    move-exception v0

    :goto_1
    const-string v1, "UpdateMetadataTask"

    const-string v2, "Unable to create the request from metadata."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v1, p0, Lcom/google/firebase/c/r;->b:Lcom/google/android/gms/g/g;

    invoke-static {v0}, Lcom/google/firebase/c/g;->a(Ljava/lang/Throwable;)Lcom/google/firebase/c/g;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/g/g;->a(Ljava/lang/Exception;)V

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_2
    const-string v2, "UpdateMetadataTask"

    const-string v3, "Unable to parse a valid JSON object from resulting metadata:"

    invoke-virtual {v1}, Lcom/google/android/gms/internal/nk;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_3
    invoke-static {v2, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v1, p0, Lcom/google/firebase/c/r;->b:Lcom/google/android/gms/g/g;

    invoke-static {v0}, Lcom/google/firebase/c/g;->a(Ljava/lang/Throwable;)Lcom/google/firebase/c/g;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/g/g;->a(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :catch_2
    move-exception v0

    goto :goto_2

    :catch_3
    move-exception v0

    goto :goto_1
.end method

.class Lcom/google/android/gms/cast/framework/media/c$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/cast/internal/n$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/cast/framework/media/c;-><init>(Lcom/google/android/gms/cast/internal/n;Lcom/google/android/gms/cast/a$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/cast/framework/media/c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/cast/framework/media/c;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/media/c$1;->a:Lcom/google/android/gms/cast/framework/media/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private e()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c$1;->a:Lcom/google/android/gms/cast/framework/media/c;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/media/c;->c(Lcom/google/android/gms/cast/framework/media/c;)Lcom/google/android/gms/cast/framework/media/c$c;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c$1;->a:Lcom/google/android/gms/cast/framework/media/c;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->g()Lcom/google/android/gms/cast/MediaStatus;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c$1;->a:Lcom/google/android/gms/cast/framework/media/c;

    invoke-static {v1}, Lcom/google/android/gms/cast/framework/media/c;->c(Lcom/google/android/gms/cast/framework/media/c;)Lcom/google/android/gms/cast/framework/media/c$c;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/google/android/gms/cast/framework/media/c$c;->a(Lcom/google/android/gms/cast/MediaStatus;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/MediaStatus;->a(Z)V

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c$1;->a:Lcom/google/android/gms/cast/framework/media/c;

    invoke-static {v1}, Lcom/google/android/gms/cast/framework/media/c;->c(Lcom/google/android/gms/cast/framework/media/c;)Lcom/google/android/gms/cast/framework/media/c$c;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/google/android/gms/cast/framework/media/c$c;->b(Lcom/google/android/gms/cast/MediaStatus;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c$1;->a:Lcom/google/android/gms/cast/framework/media/c;

    invoke-virtual {v1}, Lcom/google/android/gms/cast/framework/media/c;->h()Lcom/google/android/gms/cast/MediaInfo;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/cast/MediaInfo;->b(Ljava/util/List;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/c$1;->e()V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c$1;->a:Lcom/google/android/gms/cast/framework/media/c;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c$1;->a:Lcom/google/android/gms/cast/framework/media/c;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/media/c;->b(Lcom/google/android/gms/cast/framework/media/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/media/c$a;

    invoke-interface {v0}, Lcom/google/android/gms/cast/framework/media/c$a;->a()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/c$1;->e()V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c$1;->a:Lcom/google/android/gms/cast/framework/media/c;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/media/c;->b(Lcom/google/android/gms/cast/framework/media/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/media/c$a;

    invoke-interface {v0}, Lcom/google/android/gms/cast/framework/media/c$a;->b()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c$1;->a:Lcom/google/android/gms/cast/framework/media/c;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/media/c;->b(Lcom/google/android/gms/cast/framework/media/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/media/c$a;

    invoke-interface {v0}, Lcom/google/android/gms/cast/framework/media/c$a;->c()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c$1;->a:Lcom/google/android/gms/cast/framework/media/c;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/media/c;->b(Lcom/google/android/gms/cast/framework/media/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/media/c$a;

    invoke-interface {v0}, Lcom/google/android/gms/cast/framework/media/c$a;->d()V

    goto :goto_0

    :cond_0
    return-void
.end method

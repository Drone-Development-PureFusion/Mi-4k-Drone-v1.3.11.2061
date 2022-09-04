.class Lcom/google/android/gms/cast/framework/media/c$e;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/cast/internal/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/cast/framework/media/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/cast/framework/media/c$e$a;
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/cast/framework/media/c;

.field private b:Lcom/google/android/gms/common/api/g;

.field private c:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/cast/framework/media/c;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/media/c$e;->a:Lcom/google/android/gms/cast/framework/media/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/cast/framework/media/c$e;->c:J

    return-void
.end method


# virtual methods
.method public a()J
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/cast/framework/media/c$e;->c:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/google/android/gms/cast/framework/media/c$e;->c:J

    return-wide v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/media/c$e;->b:Lcom/google/android/gms/common/api/g;

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c$e;->b:Lcom/google/android/gms/common/api/g;

    if-nez v0, :cond_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "No GoogleApiClient available"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c$e;->a:Lcom/google/android/gms/cast/framework/media/c;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/media/c;->b(Lcom/google/android/gms/cast/framework/media/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/media/c$a;

    invoke-interface {v0}, Lcom/google/android/gms/cast/framework/media/c$a;->e()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c$e;->a:Lcom/google/android/gms/cast/framework/media/c;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/media/c;->f(Lcom/google/android/gms/cast/framework/media/c;)Lcom/google/android/gms/cast/a$b;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c$e;->b:Lcom/google/android/gms/common/api/g;

    invoke-interface {v0, v1, p1, p2}, Lcom/google/android/gms/cast/a$b;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/cast/framework/media/c$e$a;

    invoke-direct {v1, p0, p3, p4}, Lcom/google/android/gms/cast/framework/media/c$e$a;-><init>(Lcom/google/android/gms/cast/framework/media/c$e;J)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/i;->a(Lcom/google/android/gms/common/api/n;)V

    return-void
.end method

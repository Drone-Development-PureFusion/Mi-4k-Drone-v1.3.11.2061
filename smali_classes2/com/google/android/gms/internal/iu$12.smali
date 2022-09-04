.class Lcom/google/android/gms/internal/iu$12;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ia;Lcom/google/android/gms/internal/ia;JZ)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Ljava/util/List",
        "<+",
        "Lcom/google/android/gms/internal/kc;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/google/android/gms/internal/ij;

.field final synthetic c:Lcom/google/android/gms/internal/ia;

.field final synthetic d:J

.field final synthetic e:Lcom/google/android/gms/internal/ia;

.field final synthetic f:Lcom/google/android/gms/internal/iu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/iu;ZLcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ia;JLcom/google/android/gms/internal/ia;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/iu$12;->f:Lcom/google/android/gms/internal/iu;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/iu$12;->a:Z

    iput-object p3, p0, Lcom/google/android/gms/internal/iu$12;->b:Lcom/google/android/gms/internal/ij;

    iput-object p4, p0, Lcom/google/android/gms/internal/iu$12;->c:Lcom/google/android/gms/internal/ia;

    iput-wide p5, p0, Lcom/google/android/gms/internal/iu$12;->d:J

    iput-object p7, p0, Lcom/google/android/gms/internal/iu$12;->e:Lcom/google/android/gms/internal/ia;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/kc;",
            ">;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/gms/internal/iu$12;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/iu$12;->f:Lcom/google/android/gms/internal/iu;

    invoke-static {v0}, Lcom/google/android/gms/internal/iu;->b(Lcom/google/android/gms/internal/iu;)Lcom/google/android/gms/internal/jp;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/iu$12;->b:Lcom/google/android/gms/internal/ij;

    iget-object v2, p0, Lcom/google/android/gms/internal/iu$12;->c:Lcom/google/android/gms/internal/ia;

    iget-wide v4, p0, Lcom/google/android/gms/internal/iu$12;->d:J

    invoke-interface {v0, v1, v2, v4, v5}, Lcom/google/android/gms/internal/jp;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ia;J)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/iu$12;->f:Lcom/google/android/gms/internal/iu;

    invoke-static {v0}, Lcom/google/android/gms/internal/iu;->c(Lcom/google/android/gms/internal/iu;)Lcom/google/android/gms/internal/jb;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/iu$12;->b:Lcom/google/android/gms/internal/ij;

    iget-object v2, p0, Lcom/google/android/gms/internal/iu$12;->e:Lcom/google/android/gms/internal/ia;

    iget-wide v4, p0, Lcom/google/android/gms/internal/iu$12;->d:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/jb;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ia;Ljava/lang/Long;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/iu$12;->f:Lcom/google/android/gms/internal/iu;

    new-instance v1, Lcom/google/android/gms/internal/jg;

    sget-object v2, Lcom/google/android/gms/internal/ji;->a:Lcom/google/android/gms/internal/ji;

    iget-object v3, p0, Lcom/google/android/gms/internal/iu$12;->b:Lcom/google/android/gms/internal/ij;

    iget-object v4, p0, Lcom/google/android/gms/internal/iu$12;->e:Lcom/google/android/gms/internal/ia;

    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/gms/internal/jg;-><init>(Lcom/google/android/gms/internal/ji;Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ia;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/jh;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/iu$12;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

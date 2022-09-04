.class Lcom/google/android/gms/internal/ot$1;
.super Lcom/google/android/gms/internal/oj;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ot;->a(Lcom/google/android/gms/internal/nr;Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/oj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/oj",
        "<TT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Z

.field final synthetic c:Lcom/google/android/gms/internal/nr;

.field final synthetic d:Lcom/google/android/gms/internal/po;

.field final synthetic e:Lcom/google/android/gms/internal/ot;

.field private f:Lcom/google/android/gms/internal/oj;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/oj",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ot;ZZLcom/google/android/gms/internal/nr;Lcom/google/android/gms/internal/po;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ot$1;->e:Lcom/google/android/gms/internal/ot;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ot$1;->a:Z

    iput-boolean p3, p0, Lcom/google/android/gms/internal/ot$1;->b:Z

    iput-object p4, p0, Lcom/google/android/gms/internal/ot$1;->c:Lcom/google/android/gms/internal/nr;

    iput-object p5, p0, Lcom/google/android/gms/internal/ot$1;->d:Lcom/google/android/gms/internal/po;

    invoke-direct {p0}, Lcom/google/android/gms/internal/oj;-><init>()V

    return-void
.end method

.method private a()Lcom/google/android/gms/internal/oj;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/oj",
            "<TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ot$1;->f:Lcom/google/android/gms/internal/oj;

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ot$1;->c:Lcom/google/android/gms/internal/nr;

    iget-object v1, p0, Lcom/google/android/gms/internal/ot$1;->e:Lcom/google/android/gms/internal/ot;

    iget-object v2, p0, Lcom/google/android/gms/internal/ot$1;->d:Lcom/google/android/gms/internal/po;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/nr;->a(Lcom/google/android/gms/internal/ok;Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/oj;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ot$1;->f:Lcom/google/android/gms/internal/oj;

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ps;",
            "TT;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ot$1;->b:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->f()Lcom/google/android/gms/internal/ps;

    :goto_0
    return-void

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ot$1;->a()Lcom/google/android/gms/internal/oj;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/oj;->a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/pp;",
            ")TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ot$1;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->n()V

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ot$1;->a()Lcom/google/android/gms/internal/oj;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/oj;->b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

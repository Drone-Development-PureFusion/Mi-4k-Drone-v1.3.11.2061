.class public Lcom/google/firebase/database/l;
.super Ljava/lang/Object;


# instance fields
.field private a:Lcom/google/android/gms/internal/im;

.field private b:Lcom/google/android/gms/internal/ij;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/database/l;->a:Lcom/google/android/gms/internal/im;

    iput-object p2, p0, Lcom/google/firebase/database/l;->b:Lcom/google/android/gms/internal/ij;

    return-void
.end method

.method private a(Ljava/lang/Object;Lcom/google/android/gms/internal/lh;Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/g/f;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lcom/google/android/gms/internal/lh;",
            "Lcom/google/firebase/database/e$a;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/database/l;->b:Lcom/google/android/gms/internal/ij;

    invoke-static {v0}, Lcom/google/android/gms/internal/ml;->a(Lcom/google/android/gms/internal/ij;)V

    iget-object v0, p0, Lcom/google/firebase/database/l;->b:Lcom/google/android/gms/internal/ij;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/iz;->a(Lcom/google/android/gms/internal/ij;Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/mm;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ml;->a(Ljava/lang/Object;)V

    invoke-static {v0, p2}, Lcom/google/android/gms/internal/li;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-static {p3}, Lcom/google/android/gms/internal/mk;->a(Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/internal/mh;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/database/l;->a:Lcom/google/android/gms/internal/im;

    new-instance v3, Lcom/google/firebase/database/l$1;

    invoke-direct {v3, p0, v0, v1}, Lcom/google/firebase/database/l$1;-><init>(Lcom/google/firebase/database/l;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/mh;)V

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/im;->a(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mh;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/g/f;

    return-object v0
.end method

.method static synthetic a(Lcom/google/firebase/database/l;)Lcom/google/android/gms/internal/ij;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/l;->b:Lcom/google/android/gms/internal/ij;

    return-object v0
.end method

.method private b(Ljava/util/Map;Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/g/f;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/google/firebase/database/e$a;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/database/l;->b:Lcom/google/android/gms/internal/ij;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ml;->a(Lcom/google/android/gms/internal/ij;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-static {p2}, Lcom/google/android/gms/internal/mk;->a(Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/internal/mh;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/database/l;->a:Lcom/google/android/gms/internal/im;

    new-instance v3, Lcom/google/firebase/database/l$2;

    invoke-direct {v3, p0, v0, v1, p1}, Lcom/google/firebase/database/l$2;-><init>(Lcom/google/firebase/database/l;Ljava/util/Map;Lcom/google/android/gms/internal/mh;Ljava/util/Map;)V

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/im;->a(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mh;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/g/f;

    return-object v0
.end method

.method static synthetic b(Lcom/google/firebase/database/l;)Lcom/google/android/gms/internal/im;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/l;->a:Lcom/google/android/gms/internal/im;

    return-object v0
.end method

.method private c(Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/g/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/database/e$a;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/internal/mk;->a(Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/internal/mh;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/database/l;->a:Lcom/google/android/gms/internal/im;

    new-instance v2, Lcom/google/firebase/database/l$3;

    invoke-direct {v2, p0, v0}, Lcom/google/firebase/database/l$3;-><init>(Lcom/google/firebase/database/l;Lcom/google/android/gms/internal/mh;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/im;->a(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mh;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/g/f;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/g/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/firebase/database/l;->a(Ljava/lang/Object;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/Object;)Lcom/google/android/gms/g/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/internal/ll;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/google/firebase/database/l;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/lh;Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/Object;D)Lcom/google/android/gms/g/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "D)",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ll;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/google/firebase/database/l;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/lh;Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/Object;Ljava/lang/String;)Lcom/google/android/gms/g/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {p2}, Lcom/google/android/gms/internal/ll;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/google/firebase/database/l;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/lh;Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/util/Map;)Lcom/google/android/gms/g/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/firebase/database/l;->b(Ljava/util/Map;Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/firebase/database/e$a;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Lcom/google/firebase/database/l;->a(Ljava/lang/Object;Lcom/google/firebase/database/e$a;)V

    return-void
.end method

.method public a(Ljava/lang/Object;DLcom/google/firebase/database/e$a;)V
    .locals 2

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ll;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-direct {p0, p1, v0, p4}, Lcom/google/firebase/database/l;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/lh;Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/g/f;

    return-void
.end method

.method public a(Ljava/lang/Object;Lcom/google/firebase/database/e$a;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ll;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2}, Lcom/google/firebase/database/l;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/lh;Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/g/f;

    return-void
.end method

.method public a(Ljava/lang/Object;Ljava/lang/String;Lcom/google/firebase/database/e$a;)V
    .locals 1

    invoke-static {p2}, Lcom/google/android/gms/internal/ll;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-direct {p0, p1, v0, p3}, Lcom/google/firebase/database/l;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/lh;Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/g/f;

    return-void
.end method

.method public a(Ljava/lang/Object;Ljava/util/Map;Lcom/google/firebase/database/e$a;)V
    .locals 1

    invoke-static {p2}, Lcom/google/android/gms/internal/ll;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-direct {p0, p1, v0, p3}, Lcom/google/firebase/database/l;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/lh;Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/g/f;

    return-void
.end method

.method public a(Ljava/util/Map;Lcom/google/firebase/database/e$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/google/firebase/database/e$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/database/l;->b(Ljava/util/Map;Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/g/f;

    return-void
.end method

.method public b()Lcom/google/android/gms/g/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/firebase/database/l;->c(Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/firebase/database/e$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/database/l;->c(Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/g/f;

    return-void
.end method

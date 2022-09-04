.class public Lcom/google/android/gms/internal/hf;
.super Lcom/google/android/gms/internal/hg;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/hg",
        "<TK;TV;>;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)V"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/internal/hd;->a()Lcom/google/android/gms/internal/hd;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/hd;->a()Lcom/google/android/gms/internal/hd;

    move-result-object v1

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/google/android/gms/internal/hg;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/he;Lcom/google/android/gms/internal/he;)V

    return-void
.end method

.method constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/he;Lcom/google/android/gms/internal/he;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Lcom/google/android/gms/internal/he",
            "<TK;TV;>;",
            "Lcom/google/android/gms/internal/he",
            "<TK;TV;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/hg;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/he;Lcom/google/android/gms/internal/he;)V

    return-void
.end method


# virtual methods
.method protected a()Lcom/google/android/gms/internal/he$a;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/he$a;->a:Lcom/google/android/gms/internal/he$a;

    return-object v0
.end method

.method protected a(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/he;Lcom/google/android/gms/internal/he;)Lcom/google/android/gms/internal/hg;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Lcom/google/android/gms/internal/he",
            "<TK;TV;>;",
            "Lcom/google/android/gms/internal/he",
            "<TK;TV;>;)",
            "Lcom/google/android/gms/internal/hg",
            "<TK;TV;>;"
        }
    .end annotation

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/hf;->d()Ljava/lang/Object;

    move-result-object p1

    :cond_0
    if-nez p2, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/hf;->e()Ljava/lang/Object;

    move-result-object p2

    :cond_1
    if-nez p3, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/hf;->f()Lcom/google/android/gms/internal/he;

    move-result-object p3

    :cond_2
    if-nez p4, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/hf;->g()Lcom/google/android/gms/internal/he;

    move-result-object p4

    :cond_3
    new-instance v0, Lcom/google/android/gms/internal/hf;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/hf;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/he;Lcom/google/android/gms/internal/he;)V

    return-object v0
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

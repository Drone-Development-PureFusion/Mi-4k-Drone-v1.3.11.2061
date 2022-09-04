.class public Lcom/google/android/gms/internal/hd;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/he;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/he",
        "<TK;TV;>;"
    }
.end annotation


# static fields
.field private static final a:Lcom/google/android/gms/internal/hd;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/hd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/hd;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/hd;->a:Lcom/google/android/gms/internal/hd;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/hd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/android/gms/internal/hd",
            "<TK;TV;>;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/hd;->a:Lcom/google/android/gms/internal/hd;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/he$a;Lcom/google/android/gms/internal/he;Lcom/google/android/gms/internal/he;)Lcom/google/android/gms/internal/he;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Lcom/google/android/gms/internal/he$a;",
            "Lcom/google/android/gms/internal/he",
            "<TK;TV;>;",
            "Lcom/google/android/gms/internal/he",
            "<TK;TV;>;)",
            "Lcom/google/android/gms/internal/he",
            "<TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/internal/he;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Ljava/util/Comparator",
            "<TK;>;)",
            "Lcom/google/android/gms/internal/he",
            "<TK;TV;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/hf;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/hf;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public a(Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/internal/he;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/util/Comparator",
            "<TK;>;)",
            "Lcom/google/android/gms/internal/he",
            "<TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public a(Lcom/google/android/gms/internal/he$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/he$b",
            "<TK;TV;>;)V"
        }
    .end annotation

    return-void
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public c()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public d()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public e()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public f()Lcom/google/android/gms/internal/he;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/he",
            "<TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public g()Lcom/google/android/gms/internal/he;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/he",
            "<TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public h()Lcom/google/android/gms/internal/he;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/he",
            "<TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public i()Lcom/google/android/gms/internal/he;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/he",
            "<TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public j()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

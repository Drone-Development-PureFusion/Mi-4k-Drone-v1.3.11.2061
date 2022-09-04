.class final Lcom/google/android/gms/internal/pm;
.super Lcom/google/android/gms/internal/oj;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/oj",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/nr;

.field private final b:Lcom/google/android/gms/internal/oj;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/oj",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/reflect/Type;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/nr;Lcom/google/android/gms/internal/oj;Ljava/lang/reflect/Type;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/nr;",
            "Lcom/google/android/gms/internal/oj",
            "<TT;>;",
            "Ljava/lang/reflect/Type;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/oj;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/pm;->a:Lcom/google/android/gms/internal/nr;

    iput-object p2, p0, Lcom/google/android/gms/internal/pm;->b:Lcom/google/android/gms/internal/oj;

    iput-object p3, p0, Lcom/google/android/gms/internal/pm;->c:Ljava/lang/reflect/Type;

    return-void
.end method

.method private a(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/reflect/Type;
    .locals 1

    if-eqz p2, :cond_1

    const-class v0, Ljava/lang/Object;

    if-eq p1, v0, :cond_0

    instance-of v0, p1, Ljava/lang/reflect/TypeVariable;

    if-nez v0, :cond_0

    instance-of v0, p1, Ljava/lang/Class;

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    :cond_1
    return-object p1
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ps;",
            "TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/pm;->b:Lcom/google/android/gms/internal/oj;

    iget-object v1, p0, Lcom/google/android/gms/internal/pm;->c:Ljava/lang/reflect/Type;

    invoke-direct {p0, v1, p2}, Lcom/google/android/gms/internal/pm;->a(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/reflect/Type;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/pm;->c:Ljava/lang/reflect/Type;

    if-eq v1, v2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/pm;->a:Lcom/google/android/gms/internal/nr;

    invoke-static {v1}, Lcom/google/android/gms/internal/po;->a(Ljava/lang/reflect/Type;)Lcom/google/android/gms/internal/po;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/nr;->a(Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/oj;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/pj$a;

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/oj;->a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/pm;->b:Lcom/google/android/gms/internal/oj;

    instance-of v1, v1, Lcom/google/android/gms/internal/pj$a;

    if-nez v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/pm;->b:Lcom/google/android/gms/internal/oj;

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

    iget-object v0, p0, Lcom/google/android/gms/internal/pm;->b:Lcom/google/android/gms/internal/oj;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/oj;->b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.class public final Lcom/google/android/gms/internal/pe;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ok;


# instance fields
.field private final a:Lcom/google/android/gms/internal/os;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/os;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/pe;->a:Lcom/google/android/gms/internal/os;

    return-void
.end method

.method static a(Lcom/google/android/gms/internal/os;Lcom/google/android/gms/internal/nr;Lcom/google/android/gms/internal/po;Lcom/google/android/gms/internal/ol;)Lcom/google/android/gms/internal/oj;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/os;",
            "Lcom/google/android/gms/internal/nr;",
            "Lcom/google/android/gms/internal/po",
            "<*>;",
            "Lcom/google/android/gms/internal/ol;",
            ")",
            "Lcom/google/android/gms/internal/oj",
            "<*>;"
        }
    .end annotation

    invoke-interface {p3}, Lcom/google/android/gms/internal/ol;->a()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcom/google/android/gms/internal/oj;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/po;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/po;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/os;->a(Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/ox;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ox;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/oj;

    :goto_0
    return-object v0

    :cond_0
    const-class v1, Lcom/google/android/gms/internal/ok;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Lcom/google/android/gms/internal/po;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/po;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/os;->a(Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/ox;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ox;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ok;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ok;->a(Lcom/google/android/gms/internal/nr;Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/oj;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "@JsonAdapter value must be TypeAdapter or TypeAdapterFactory reference."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/nr;Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/oj;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/nr;",
            "Lcom/google/android/gms/internal/po",
            "<TT;>;)",
            "Lcom/google/android/gms/internal/oj",
            "<TT;>;"
        }
    .end annotation

    invoke-virtual {p2}, Lcom/google/android/gms/internal/po;->a()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcom/google/android/gms/internal/ol;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ol;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/pe;->a:Lcom/google/android/gms/internal/os;

    invoke-static {v1, p1, p2, v0}, Lcom/google/android/gms/internal/pe;->a(Lcom/google/android/gms/internal/os;Lcom/google/android/gms/internal/nr;Lcom/google/android/gms/internal/po;Lcom/google/android/gms/internal/ol;)Lcom/google/android/gms/internal/oj;

    move-result-object v0

    goto :goto_0
.end method

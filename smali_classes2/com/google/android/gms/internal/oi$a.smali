.class Lcom/google/android/gms/internal/oi$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ok;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/oi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/po;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/po",
            "<*>;"
        }
    .end annotation
.end field

.field private final b:Z

.field private final c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private final d:Lcom/google/android/gms/internal/of;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/of",
            "<*>;"
        }
    .end annotation
.end field

.field private final e:Lcom/google/android/gms/internal/nw;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/nw",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/lang/Object;Lcom/google/android/gms/internal/po;ZLjava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lcom/google/android/gms/internal/po",
            "<*>;Z",
            "Ljava/lang/Class",
            "<*>;)V"
        }
    .end annotation

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    instance-of v0, p1, Lcom/google/android/gms/internal/of;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/of;

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/internal/oi$a;->d:Lcom/google/android/gms/internal/of;

    instance-of v0, p1, Lcom/google/android/gms/internal/nw;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/google/android/gms/internal/nw;

    :goto_1
    iput-object p1, p0, Lcom/google/android/gms/internal/oi$a;->e:Lcom/google/android/gms/internal/nw;

    iget-object v0, p0, Lcom/google/android/gms/internal/oi$a;->d:Lcom/google/android/gms/internal/of;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/oi$a;->e:Lcom/google/android/gms/internal/nw;

    if-eqz v0, :cond_3

    :cond_0
    const/4 v0, 0x1

    :goto_2
    invoke-static {v0}, Lcom/google/android/gms/internal/op;->a(Z)V

    iput-object p2, p0, Lcom/google/android/gms/internal/oi$a;->a:Lcom/google/android/gms/internal/po;

    iput-boolean p3, p0, Lcom/google/android/gms/internal/oi$a;->b:Z

    iput-object p4, p0, Lcom/google/android/gms/internal/oi$a;->c:Ljava/lang/Class;

    return-void

    :cond_1
    move-object v0, v1

    goto :goto_0

    :cond_2
    move-object p1, v1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    goto :goto_2
.end method

.method synthetic constructor <init>(Ljava/lang/Object;Lcom/google/android/gms/internal/po;ZLjava/lang/Class;Lcom/google/android/gms/internal/oi$1;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/oi$a;-><init>(Ljava/lang/Object;Lcom/google/android/gms/internal/po;ZLjava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/nr;Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/oj;
    .locals 7
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

    const/4 v6, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/oi$a;->a:Lcom/google/android/gms/internal/po;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/oi$a;->a:Lcom/google/android/gms/internal/po;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/po;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/oi$a;->b:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/oi$a;->a:Lcom/google/android/gms/internal/po;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/po;->b()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/po;->a()Ljava/lang/Class;

    move-result-object v1

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_3

    new-instance v0, Lcom/google/android/gms/internal/oi;

    iget-object v1, p0, Lcom/google/android/gms/internal/oi$a;->d:Lcom/google/android/gms/internal/of;

    iget-object v2, p0, Lcom/google/android/gms/internal/oi$a;->e:Lcom/google/android/gms/internal/nw;

    move-object v3, p1

    move-object v4, p2

    move-object v5, p0

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/oi;-><init>(Lcom/google/android/gms/internal/of;Lcom/google/android/gms/internal/nw;Lcom/google/android/gms/internal/nr;Lcom/google/android/gms/internal/po;Lcom/google/android/gms/internal/ok;Lcom/google/android/gms/internal/oi$1;)V

    :goto_1
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/oi$a;->c:Ljava/lang/Class;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/po;->a()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    goto :goto_0

    :cond_3
    move-object v0, v6

    goto :goto_1
.end method

.class Lcom/google/android/gms/internal/pj$1;
.super Lcom/google/android/gms/internal/pj$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/pj;->a(Lcom/google/android/gms/internal/nr;Ljava/lang/reflect/Field;Ljava/lang/String;Lcom/google/android/gms/internal/po;ZZ)Lcom/google/android/gms/internal/pj$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final a:Lcom/google/android/gms/internal/oj;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/oj",
            "<*>;"
        }
    .end annotation
.end field

.field final synthetic b:Lcom/google/android/gms/internal/nr;

.field final synthetic c:Ljava/lang/reflect/Field;

.field final synthetic d:Lcom/google/android/gms/internal/po;

.field final synthetic e:Z

.field final synthetic f:Lcom/google/android/gms/internal/pj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/pj;Ljava/lang/String;ZZLcom/google/android/gms/internal/nr;Ljava/lang/reflect/Field;Lcom/google/android/gms/internal/po;Z)V
    .locals 4

    iput-object p1, p0, Lcom/google/android/gms/internal/pj$1;->f:Lcom/google/android/gms/internal/pj;

    iput-object p5, p0, Lcom/google/android/gms/internal/pj$1;->b:Lcom/google/android/gms/internal/nr;

    iput-object p6, p0, Lcom/google/android/gms/internal/pj$1;->c:Ljava/lang/reflect/Field;

    iput-object p7, p0, Lcom/google/android/gms/internal/pj$1;->d:Lcom/google/android/gms/internal/po;

    iput-boolean p8, p0, Lcom/google/android/gms/internal/pj$1;->e:Z

    invoke-direct {p0, p2, p3, p4}, Lcom/google/android/gms/internal/pj$b;-><init>(Ljava/lang/String;ZZ)V

    iget-object v0, p0, Lcom/google/android/gms/internal/pj$1;->f:Lcom/google/android/gms/internal/pj;

    iget-object v1, p0, Lcom/google/android/gms/internal/pj$1;->b:Lcom/google/android/gms/internal/nr;

    iget-object v2, p0, Lcom/google/android/gms/internal/pj$1;->c:Ljava/lang/reflect/Field;

    iget-object v3, p0, Lcom/google/android/gms/internal/pj$1;->d:Lcom/google/android/gms/internal/po;

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/internal/pj;->a(Lcom/google/android/gms/internal/pj;Lcom/google/android/gms/internal/nr;Ljava/lang/reflect/Field;Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/oj;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/pj$1;->a:Lcom/google/android/gms/internal/oj;

    return-void
.end method


# virtual methods
.method a(Lcom/google/android/gms/internal/pp;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/pj$1;->a:Lcom/google/android/gms/internal/oj;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/oj;->b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/pj$1;->e:Z

    if-nez v1, :cond_1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/pj$1;->c:Ljava/lang/reflect/Field;

    invoke-virtual {v1, p2, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/pj$1;->c:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/pm;

    iget-object v2, p0, Lcom/google/android/gms/internal/pj$1;->b:Lcom/google/android/gms/internal/nr;

    iget-object v3, p0, Lcom/google/android/gms/internal/pj$1;->a:Lcom/google/android/gms/internal/oj;

    iget-object v4, p0, Lcom/google/android/gms/internal/pj$1;->d:Lcom/google/android/gms/internal/po;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/po;->b()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/gms/internal/pm;-><init>(Lcom/google/android/gms/internal/nr;Lcom/google/android/gms/internal/oj;Ljava/lang/reflect/Type;)V

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/oj;->a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V

    return-void
.end method

.method public a(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/pj$1;->h:Z

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/pj$1;->c:Ljava/lang/reflect/Field;

    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eq v1, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

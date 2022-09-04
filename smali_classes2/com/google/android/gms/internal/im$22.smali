.class Lcom/google/android/gms/internal/im$22;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/hu;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/im;->a(Ljava/util/List;Lcom/google/android/gms/internal/ij;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ij;

.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lcom/google/android/gms/internal/im;

.field final synthetic d:Lcom/google/android/gms/internal/im;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;Ljava/util/List;Lcom/google/android/gms/internal/im;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/im$22;->d:Lcom/google/android/gms/internal/im;

    iput-object p2, p0, Lcom/google/android/gms/internal/im$22;->a:Lcom/google/android/gms/internal/ij;

    iput-object p3, p0, Lcom/google/android/gms/internal/im$22;->b:Ljava/util/List;

    iput-object p4, p0, Lcom/google/android/gms/internal/im$22;->c:Lcom/google/android/gms/internal/im;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 10

    const/4 v4, 0x0

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/im;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/database/c;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/internal/im$22;->d:Lcom/google/android/gms/internal/im;

    const-string v2, "Transaction"

    iget-object v3, p0, Lcom/google/android/gms/internal/im$22;->a:Lcom/google/android/gms/internal/ij;

    invoke-static {v0, v2, v3, v1}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/im;Ljava/lang/String;Lcom/google/android/gms/internal/ij;Lcom/google/firebase/database/c;)V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    if-nez v1, :cond_1

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/im$22;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/im$a;

    sget-object v1, Lcom/google/android/gms/internal/im$b;->d:Lcom/google/android/gms/internal/im$b;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/im$a;->a(Lcom/google/android/gms/internal/im$a;Lcom/google/android/gms/internal/im$b;)Lcom/google/android/gms/internal/im$b;

    iget-object v1, p0, Lcom/google/android/gms/internal/im$22;->d:Lcom/google/android/gms/internal/im;

    invoke-static {v1}, Lcom/google/android/gms/internal/im;->g(Lcom/google/android/gms/internal/im;)Lcom/google/android/gms/internal/iu;

    move-result-object v1

    invoke-static {v0}, Lcom/google/android/gms/internal/im$a;->c(Lcom/google/android/gms/internal/im$a;)J

    move-result-wide v2

    iget-object v5, p0, Lcom/google/android/gms/internal/im$22;->d:Lcom/google/android/gms/internal/im;

    invoke-static {v5}, Lcom/google/android/gms/internal/im;->h(Lcom/google/android/gms/internal/im;)Lcom/google/android/gms/internal/mg;

    move-result-object v6

    move v5, v4

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/iu;->a(JZZLcom/google/android/gms/internal/mc;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v7, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-static {v0}, Lcom/google/android/gms/internal/im$a;->h(Lcom/google/android/gms/internal/im$a;)Lcom/google/android/gms/internal/lh;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/im$22;->c:Lcom/google/android/gms/internal/im;

    invoke-static {v0}, Lcom/google/android/gms/internal/im$a;->f(Lcom/google/android/gms/internal/im$a;)Lcom/google/android/gms/internal/ij;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/firebase/database/s;->a(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;)Lcom/google/firebase/database/e;

    move-result-object v2

    invoke-static {v1}, Lcom/google/android/gms/internal/lc;->a(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lc;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/google/firebase/database/s;->a(Lcom/google/firebase/database/e;Lcom/google/android/gms/internal/lc;)Lcom/google/firebase/database/b;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/im$22$1;

    invoke-direct {v2, p0, v0, v1}, Lcom/google/android/gms/internal/im$22$1;-><init>(Lcom/google/android/gms/internal/im$22;Lcom/google/android/gms/internal/im$a;Lcom/google/firebase/database/b;)V

    invoke-interface {v8, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/im$22;->d:Lcom/google/android/gms/internal/im;

    new-instance v2, Lcom/google/android/gms/internal/ja;

    iget-object v3, p0, Lcom/google/android/gms/internal/im$22;->d:Lcom/google/android/gms/internal/im;

    invoke-static {v0}, Lcom/google/android/gms/internal/im$a;->j(Lcom/google/android/gms/internal/im$a;)Lcom/google/firebase/database/r;

    move-result-object v5

    invoke-static {v0}, Lcom/google/android/gms/internal/im$a;->f(Lcom/google/android/gms/internal/im$a;)Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/kg;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/kg;

    move-result-object v0

    invoke-direct {v2, v3, v5, v0}, Lcom/google/android/gms/internal/ja;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/firebase/database/r;Lcom/google/android/gms/internal/kg;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/ie;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/im$22;->d:Lcom/google/android/gms/internal/im;

    iget-object v1, p0, Lcom/google/android/gms/internal/im$22;->d:Lcom/google/android/gms/internal/im;

    invoke-static {v1}, Lcom/google/android/gms/internal/im;->i(Lcom/google/android/gms/internal/im;)Lcom/google/android/gms/internal/jw;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/im$22;->a:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/jw;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/jw;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/im;->b(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/jw;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/im$22;->d:Lcom/google/android/gms/internal/im;

    invoke-static {v0}, Lcom/google/android/gms/internal/im;->j(Lcom/google/android/gms/internal/im;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/im$22;->c:Lcom/google/android/gms/internal/im;

    invoke-static {v0, v7}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/im;Ljava/util/List;)V

    :goto_1
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_5

    iget-object v1, p0, Lcom/google/android/gms/internal/im$22;->d:Lcom/google/android/gms/internal/im;

    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/im;->b(Ljava/lang/Runnable;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/google/firebase/database/c;->a()I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/im$22;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/im$a;

    invoke-static {v0}, Lcom/google/android/gms/internal/im$a;->d(Lcom/google/android/gms/internal/im$a;)Lcom/google/android/gms/internal/im$b;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/im$b;->e:Lcom/google/android/gms/internal/im$b;

    if-ne v2, v3, :cond_2

    sget-object v2, Lcom/google/android/gms/internal/im$b;->f:Lcom/google/android/gms/internal/im$b;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/im$a;->a(Lcom/google/android/gms/internal/im$a;Lcom/google/android/gms/internal/im$b;)Lcom/google/android/gms/internal/im$b;

    goto :goto_2

    :cond_2
    sget-object v2, Lcom/google/android/gms/internal/im$b;->b:Lcom/google/android/gms/internal/im$b;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/im$a;->a(Lcom/google/android/gms/internal/im$a;Lcom/google/android/gms/internal/im$b;)Lcom/google/android/gms/internal/im$b;

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/im$22;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/im$a;

    sget-object v3, Lcom/google/android/gms/internal/im$b;->f:Lcom/google/android/gms/internal/im$b;

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/im$a;->a(Lcom/google/android/gms/internal/im$a;Lcom/google/android/gms/internal/im$b;)Lcom/google/android/gms/internal/im$b;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/im$a;->a(Lcom/google/android/gms/internal/im$a;Lcom/google/firebase/database/c;)Lcom/google/firebase/database/c;

    goto :goto_3

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/im$22;->d:Lcom/google/android/gms/internal/im;

    iget-object v1, p0, Lcom/google/android/gms/internal/im$22;->a:Lcom/google/android/gms/internal/ij;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ij;

    :cond_5
    return-void
.end method

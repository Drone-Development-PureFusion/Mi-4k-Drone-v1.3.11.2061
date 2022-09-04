.class public Lcom/b/a/d$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/b/a/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/b/a/d;

.field private b:Lcom/b/a/d$e;


# direct methods
.method constructor <init>(Lcom/b/a/d;Lcom/b/a/a;)V
    .locals 2

    iput-object p1, p0, Lcom/b/a/d$b;->a:Lcom/b/a/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/b/a/d;->b(Lcom/b/a/d;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/b/a/d$e;

    iput-object v0, p0, Lcom/b/a/d$b;->b:Lcom/b/a/d$e;

    iget-object v0, p0, Lcom/b/a/d$b;->b:Lcom/b/a/d$e;

    if-nez v0, :cond_0

    new-instance v0, Lcom/b/a/d$e;

    invoke-direct {v0, p2}, Lcom/b/a/d$e;-><init>(Lcom/b/a/a;)V

    iput-object v0, p0, Lcom/b/a/d$b;->b:Lcom/b/a/d$e;

    invoke-static {p1}, Lcom/b/a/d;->b(Lcom/b/a/d;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/b/a/d$b;->b:Lcom/b/a/d$e;

    invoke-virtual {v0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lcom/b/a/d;->d(Lcom/b/a/d;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/b/a/d$b;->b:Lcom/b/a/d$e;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public a(J)Lcom/b/a/d$b;
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Lcom/b/a/q;->b([F)Lcom/b/a/q;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/b/a/q;->d(J)Lcom/b/a/q;

    invoke-virtual {p0, v0}, Lcom/b/a/d$b;->c(Lcom/b/a/a;)Lcom/b/a/d$b;

    return-object p0

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public a(Lcom/b/a/a;)Lcom/b/a/d$b;
    .locals 4

    iget-object v0, p0, Lcom/b/a/d$b;->a:Lcom/b/a/d;

    invoke-static {v0}, Lcom/b/a/d;->b(Lcom/b/a/d;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/b/a/d$e;

    if-nez v0, :cond_0

    new-instance v0, Lcom/b/a/d$e;

    invoke-direct {v0, p1}, Lcom/b/a/d$e;-><init>(Lcom/b/a/a;)V

    iget-object v1, p0, Lcom/b/a/d$b;->a:Lcom/b/a/d;

    invoke-static {v1}, Lcom/b/a/d;->b(Lcom/b/a/d;)Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/b/a/d$b;->a:Lcom/b/a/d;

    invoke-static {v1}, Lcom/b/a/d;->d(Lcom/b/a/d;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    new-instance v1, Lcom/b/a/d$c;

    iget-object v2, p0, Lcom/b/a/d$b;->b:Lcom/b/a/d$e;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/b/a/d$c;-><init>(Lcom/b/a/d$e;I)V

    invoke-virtual {v0, v1}, Lcom/b/a/d$e;->a(Lcom/b/a/d$c;)V

    return-object p0
.end method

.method public b(Lcom/b/a/a;)Lcom/b/a/d$b;
    .locals 4

    iget-object v0, p0, Lcom/b/a/d$b;->a:Lcom/b/a/d;

    invoke-static {v0}, Lcom/b/a/d;->b(Lcom/b/a/d;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/b/a/d$e;

    if-nez v0, :cond_0

    new-instance v0, Lcom/b/a/d$e;

    invoke-direct {v0, p1}, Lcom/b/a/d$e;-><init>(Lcom/b/a/a;)V

    iget-object v1, p0, Lcom/b/a/d$b;->a:Lcom/b/a/d;

    invoke-static {v1}, Lcom/b/a/d;->b(Lcom/b/a/d;)Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/b/a/d$b;->a:Lcom/b/a/d;

    invoke-static {v1}, Lcom/b/a/d;->d(Lcom/b/a/d;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    new-instance v1, Lcom/b/a/d$c;

    iget-object v2, p0, Lcom/b/a/d$b;->b:Lcom/b/a/d$e;

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/b/a/d$c;-><init>(Lcom/b/a/d$e;I)V

    invoke-virtual {v0, v1}, Lcom/b/a/d$e;->a(Lcom/b/a/d$c;)V

    return-object p0
.end method

.method public c(Lcom/b/a/a;)Lcom/b/a/d$b;
    .locals 3

    iget-object v0, p0, Lcom/b/a/d$b;->a:Lcom/b/a/d;

    invoke-static {v0}, Lcom/b/a/d;->b(Lcom/b/a/d;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/b/a/d$e;

    if-nez v0, :cond_0

    new-instance v0, Lcom/b/a/d$e;

    invoke-direct {v0, p1}, Lcom/b/a/d$e;-><init>(Lcom/b/a/a;)V

    iget-object v1, p0, Lcom/b/a/d$b;->a:Lcom/b/a/d;

    invoke-static {v1}, Lcom/b/a/d;->b(Lcom/b/a/d;)Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/b/a/d$b;->a:Lcom/b/a/d;

    invoke-static {v1}, Lcom/b/a/d;->d(Lcom/b/a/d;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    new-instance v1, Lcom/b/a/d$c;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lcom/b/a/d$c;-><init>(Lcom/b/a/d$e;I)V

    iget-object v0, p0, Lcom/b/a/d$b;->b:Lcom/b/a/d$e;

    invoke-virtual {v0, v1}, Lcom/b/a/d$e;->a(Lcom/b/a/d$c;)V

    return-object p0
.end method

.class Lcom/b/c/c$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/b/a/a$a;
.implements Lcom/b/a/q$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/b/c/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/b/c/c;


# direct methods
.method private constructor <init>(Lcom/b/c/c;)V
    .locals 0

    iput-object p1, p0, Lcom/b/c/c$a;->a:Lcom/b/c/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/b/c/c;Lcom/b/c/c$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/b/c/c$a;-><init>(Lcom/b/c/c;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/b/a/a;)V
    .locals 1

    iget-object v0, p0, Lcom/b/c/c$a;->a:Lcom/b/c/c;

    invoke-static {v0}, Lcom/b/c/c;->b(Lcom/b/c/c;)Lcom/b/a/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/b/c/c$a;->a:Lcom/b/c/c;

    invoke-static {v0}, Lcom/b/c/c;->b(Lcom/b/c/c;)Lcom/b/a/a$a;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/b/a/a$a;->a(Lcom/b/a/a;)V

    :cond_0
    return-void
.end method

.method public b(Lcom/b/a/a;)V
    .locals 2

    iget-object v0, p0, Lcom/b/c/c$a;->a:Lcom/b/c/c;

    invoke-static {v0}, Lcom/b/c/c;->b(Lcom/b/c/c;)Lcom/b/a/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/b/c/c$a;->a:Lcom/b/c/c;

    invoke-static {v0}, Lcom/b/c/c;->b(Lcom/b/c/c;)Lcom/b/a/a$a;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/b/a/a$a;->b(Lcom/b/a/a;)V

    :cond_0
    iget-object v0, p0, Lcom/b/c/c$a;->a:Lcom/b/c/c;

    invoke-static {v0}, Lcom/b/c/c;->c(Lcom/b/c/c;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/b/c/c$a;->a:Lcom/b/c/c;

    invoke-static {v0}, Lcom/b/c/c;->c(Lcom/b/c/c;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/b/c/c$a;->a:Lcom/b/c/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/b/c/c;->a(Lcom/b/c/c;Lcom/b/a/a$a;)Lcom/b/a/a$a;

    :cond_1
    return-void
.end method

.method public c(Lcom/b/a/a;)V
    .locals 1

    iget-object v0, p0, Lcom/b/c/c$a;->a:Lcom/b/c/c;

    invoke-static {v0}, Lcom/b/c/c;->b(Lcom/b/c/c;)Lcom/b/a/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/b/c/c$a;->a:Lcom/b/c/c;

    invoke-static {v0}, Lcom/b/c/c;->b(Lcom/b/c/c;)Lcom/b/a/a$a;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/b/a/a$a;->c(Lcom/b/a/a;)V

    :cond_0
    return-void
.end method

.method public d(Lcom/b/a/a;)V
    .locals 1

    iget-object v0, p0, Lcom/b/c/c$a;->a:Lcom/b/c/c;

    invoke-static {v0}, Lcom/b/c/c;->b(Lcom/b/c/c;)Lcom/b/a/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/b/c/c$a;->a:Lcom/b/c/c;

    invoke-static {v0}, Lcom/b/c/c;->b(Lcom/b/c/c;)Lcom/b/a/a$a;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/b/a/a$a;->d(Lcom/b/a/a;)V

    :cond_0
    return-void
.end method

.method public onAnimationUpdate(Lcom/b/a/q;)V
    .locals 7

    invoke-virtual {p1}, Lcom/b/a/q;->A()F

    move-result v2

    iget-object v0, p0, Lcom/b/c/c$a;->a:Lcom/b/c/c;

    invoke-static {v0}, Lcom/b/c/c;->c(Lcom/b/c/c;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/b/c/c$c;

    iget v1, v0, Lcom/b/c/c$c;->a:I

    and-int/lit16 v1, v1, 0x1ff

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/b/c/c$a;->a:Lcom/b/c/c;

    invoke-static {v1}, Lcom/b/c/c;->d(Lcom/b/c/c;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    :cond_0
    iget-object v3, v0, Lcom/b/c/c$c;->b:Ljava/util/ArrayList;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v4, :cond_1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/b/c/c$b;

    iget v5, v0, Lcom/b/c/c$b;->b:F

    iget v6, v0, Lcom/b/c/c$b;->c:F

    mul-float/2addr v6, v2

    add-float/2addr v5, v6

    iget-object v6, p0, Lcom/b/c/c$a;->a:Lcom/b/c/c;

    iget v0, v0, Lcom/b/c/c$b;->a:I

    invoke-static {v6, v0, v5}, Lcom/b/c/c;->a(Lcom/b/c/c;IF)V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/b/c/c$a;->a:Lcom/b/c/c;

    invoke-static {v0}, Lcom/b/c/c;->d(Lcom/b/c/c;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    :cond_2
    return-void
.end method

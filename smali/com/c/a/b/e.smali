.class public final Lcom/c/a/b/e;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/a/b/e$1;,
        Lcom/c/a/b/e$c;,
        Lcom/c/a/b/e$b;,
        Lcom/c/a/b/e$a;
    }
.end annotation


# instance fields
.field final a:Landroid/content/res/Resources;

.field final b:I

.field final c:I

.field final d:I

.field final e:I

.field final f:Lcom/c/a/b/g/a;

.field final g:Ljava/util/concurrent/Executor;

.field final h:Ljava/util/concurrent/Executor;

.field final i:Z

.field final j:Z

.field final k:I

.field final l:I

.field final m:Lcom/c/a/b/a/g;

.field final n:Lcom/c/a/a/b/c;

.field final o:Lcom/c/a/a/a/a;

.field final p:Lcom/c/a/b/d/b;

.field final q:Lcom/c/a/b/b/b;

.field final r:Lcom/c/a/b/c;

.field final s:Lcom/c/a/b/d/b;

.field final t:Lcom/c/a/b/d/b;


# direct methods
.method private constructor <init>(Lcom/c/a/b/e$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/c/a/b/e$a;->a(Lcom/c/a/b/e$a;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lcom/c/a/b/e;->a:Landroid/content/res/Resources;

    invoke-static {p1}, Lcom/c/a/b/e$a;->b(Lcom/c/a/b/e$a;)I

    move-result v0

    iput v0, p0, Lcom/c/a/b/e;->b:I

    invoke-static {p1}, Lcom/c/a/b/e$a;->c(Lcom/c/a/b/e$a;)I

    move-result v0

    iput v0, p0, Lcom/c/a/b/e;->c:I

    invoke-static {p1}, Lcom/c/a/b/e$a;->d(Lcom/c/a/b/e$a;)I

    move-result v0

    iput v0, p0, Lcom/c/a/b/e;->d:I

    invoke-static {p1}, Lcom/c/a/b/e$a;->e(Lcom/c/a/b/e$a;)I

    move-result v0

    iput v0, p0, Lcom/c/a/b/e;->e:I

    invoke-static {p1}, Lcom/c/a/b/e$a;->f(Lcom/c/a/b/e$a;)Lcom/c/a/b/g/a;

    move-result-object v0

    iput-object v0, p0, Lcom/c/a/b/e;->f:Lcom/c/a/b/g/a;

    invoke-static {p1}, Lcom/c/a/b/e$a;->g(Lcom/c/a/b/e$a;)Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Lcom/c/a/b/e;->g:Ljava/util/concurrent/Executor;

    invoke-static {p1}, Lcom/c/a/b/e$a;->h(Lcom/c/a/b/e$a;)Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Lcom/c/a/b/e;->h:Ljava/util/concurrent/Executor;

    invoke-static {p1}, Lcom/c/a/b/e$a;->i(Lcom/c/a/b/e$a;)I

    move-result v0

    iput v0, p0, Lcom/c/a/b/e;->k:I

    invoke-static {p1}, Lcom/c/a/b/e$a;->j(Lcom/c/a/b/e$a;)I

    move-result v0

    iput v0, p0, Lcom/c/a/b/e;->l:I

    invoke-static {p1}, Lcom/c/a/b/e$a;->k(Lcom/c/a/b/e$a;)Lcom/c/a/b/a/g;

    move-result-object v0

    iput-object v0, p0, Lcom/c/a/b/e;->m:Lcom/c/a/b/a/g;

    invoke-static {p1}, Lcom/c/a/b/e$a;->l(Lcom/c/a/b/e$a;)Lcom/c/a/a/a/a;

    move-result-object v0

    iput-object v0, p0, Lcom/c/a/b/e;->o:Lcom/c/a/a/a/a;

    invoke-static {p1}, Lcom/c/a/b/e$a;->m(Lcom/c/a/b/e$a;)Lcom/c/a/a/b/c;

    move-result-object v0

    iput-object v0, p0, Lcom/c/a/b/e;->n:Lcom/c/a/a/b/c;

    invoke-static {p1}, Lcom/c/a/b/e$a;->n(Lcom/c/a/b/e$a;)Lcom/c/a/b/c;

    move-result-object v0

    iput-object v0, p0, Lcom/c/a/b/e;->r:Lcom/c/a/b/c;

    invoke-static {p1}, Lcom/c/a/b/e$a;->o(Lcom/c/a/b/e$a;)Lcom/c/a/b/d/b;

    move-result-object v0

    iput-object v0, p0, Lcom/c/a/b/e;->p:Lcom/c/a/b/d/b;

    invoke-static {p1}, Lcom/c/a/b/e$a;->p(Lcom/c/a/b/e$a;)Lcom/c/a/b/b/b;

    move-result-object v0

    iput-object v0, p0, Lcom/c/a/b/e;->q:Lcom/c/a/b/b/b;

    invoke-static {p1}, Lcom/c/a/b/e$a;->q(Lcom/c/a/b/e$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/c/a/b/e;->i:Z

    invoke-static {p1}, Lcom/c/a/b/e$a;->r(Lcom/c/a/b/e$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/c/a/b/e;->j:Z

    new-instance v0, Lcom/c/a/b/e$b;

    iget-object v1, p0, Lcom/c/a/b/e;->p:Lcom/c/a/b/d/b;

    invoke-direct {v0, v1}, Lcom/c/a/b/e$b;-><init>(Lcom/c/a/b/d/b;)V

    iput-object v0, p0, Lcom/c/a/b/e;->s:Lcom/c/a/b/d/b;

    new-instance v0, Lcom/c/a/b/e$c;

    iget-object v1, p0, Lcom/c/a/b/e;->p:Lcom/c/a/b/d/b;

    invoke-direct {v0, v1}, Lcom/c/a/b/e$c;-><init>(Lcom/c/a/b/d/b;)V

    iput-object v0, p0, Lcom/c/a/b/e;->t:Lcom/c/a/b/d/b;

    invoke-static {p1}, Lcom/c/a/b/e$a;->s(Lcom/c/a/b/e$a;)Z

    move-result v0

    invoke-static {v0}, Lcom/c/a/c/d;->a(Z)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/c/a/b/e$a;Lcom/c/a/b/e$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/c/a/b/e;-><init>(Lcom/c/a/b/e$a;)V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/c/a/b/e;
    .locals 1

    new-instance v0, Lcom/c/a/b/e$a;

    invoke-direct {v0, p0}, Lcom/c/a/b/e$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/c/a/b/e$a;->c()Lcom/c/a/b/e;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method a()Lcom/c/a/b/a/e;
    .locals 3

    iget-object v0, p0, Lcom/c/a/b/e;->a:Landroid/content/res/Resources;

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v0, p0, Lcom/c/a/b/e;->b:I

    if-gtz v0, :cond_0

    iget v0, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    :cond_0
    iget v1, p0, Lcom/c/a/b/e;->c:I

    if-gtz v1, :cond_1

    iget v1, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    :cond_1
    new-instance v2, Lcom/c/a/b/a/e;

    invoke-direct {v2, v0, v1}, Lcom/c/a/b/a/e;-><init>(II)V

    return-object v2
.end method

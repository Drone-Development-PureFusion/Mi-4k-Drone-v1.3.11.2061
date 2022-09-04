.class final Lcom/c/a/b/b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final a:Ljava/lang/String; = "Display image in ImageAware (loaded from %1$s) [%2$s]"

.field private static final b:Ljava/lang/String; = "ImageAware is reused for another image. Task is cancelled. [%s]"

.field private static final c:Ljava/lang/String; = "ImageAware was collected by GC. Task is cancelled. [%s]"


# instance fields
.field private final d:Landroid/graphics/Bitmap;

.field private final e:Ljava/lang/String;

.field private final f:Lcom/c/a/b/e/a;

.field private final g:Ljava/lang/String;

.field private final h:Lcom/c/a/b/c/a;

.field private final i:Lcom/c/a/b/f/a;

.field private final j:Lcom/c/a/b/f;

.field private final k:Lcom/c/a/b/a/f;


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;Lcom/c/a/b/g;Lcom/c/a/b/f;Lcom/c/a/b/a/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/c/a/b/b;->d:Landroid/graphics/Bitmap;

    iget-object v0, p2, Lcom/c/a/b/g;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/c/a/b/b;->e:Ljava/lang/String;

    iget-object v0, p2, Lcom/c/a/b/g;->c:Lcom/c/a/b/e/a;

    iput-object v0, p0, Lcom/c/a/b/b;->f:Lcom/c/a/b/e/a;

    iget-object v0, p2, Lcom/c/a/b/g;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/c/a/b/b;->g:Ljava/lang/String;

    iget-object v0, p2, Lcom/c/a/b/g;->e:Lcom/c/a/b/c;

    invoke-virtual {v0}, Lcom/c/a/b/c;->q()Lcom/c/a/b/c/a;

    move-result-object v0

    iput-object v0, p0, Lcom/c/a/b/b;->h:Lcom/c/a/b/c/a;

    iget-object v0, p2, Lcom/c/a/b/g;->f:Lcom/c/a/b/f/a;

    iput-object v0, p0, Lcom/c/a/b/b;->i:Lcom/c/a/b/f/a;

    iput-object p3, p0, Lcom/c/a/b/b;->j:Lcom/c/a/b/f;

    iput-object p4, p0, Lcom/c/a/b/b;->k:Lcom/c/a/b/a/f;

    return-void
.end method

.method private a()Z
    .locals 2

    iget-object v0, p0, Lcom/c/a/b/b;->j:Lcom/c/a/b/f;

    iget-object v1, p0, Lcom/c/a/b/b;->f:Lcom/c/a/b/e/a;

    invoke-virtual {v0, v1}, Lcom/c/a/b/f;->a(Lcom/c/a/b/e/a;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/c/a/b/b;->g:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public run()V
    .locals 5

    const/4 v4, 0x1

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/c/a/b/b;->f:Lcom/c/a/b/e/a;

    invoke-interface {v0}, Lcom/c/a/b/e/a;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "ImageAware was collected by GC. Task is cancelled. [%s]"

    new-array v1, v4, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/c/a/b/b;->g:Ljava/lang/String;

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lcom/c/a/c/d;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/c/a/b/b;->i:Lcom/c/a/b/f/a;

    iget-object v1, p0, Lcom/c/a/b/b;->e:Ljava/lang/String;

    iget-object v2, p0, Lcom/c/a/b/b;->f:Lcom/c/a/b/e/a;

    invoke-interface {v2}, Lcom/c/a/b/e/a;->d()Landroid/view/View;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/c/a/b/f/a;->b(Ljava/lang/String;Landroid/view/View;)V

    :goto_0
    return-void

    :cond_0
    invoke-direct {p0}, Lcom/c/a/b/b;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "ImageAware is reused for another image. Task is cancelled. [%s]"

    new-array v1, v4, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/c/a/b/b;->g:Ljava/lang/String;

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lcom/c/a/c/d;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/c/a/b/b;->i:Lcom/c/a/b/f/a;

    iget-object v1, p0, Lcom/c/a/b/b;->e:Ljava/lang/String;

    iget-object v2, p0, Lcom/c/a/b/b;->f:Lcom/c/a/b/e/a;

    invoke-interface {v2}, Lcom/c/a/b/e/a;->d()Landroid/view/View;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/c/a/b/f/a;->b(Ljava/lang/String;Landroid/view/View;)V

    goto :goto_0

    :cond_1
    const-string v0, "Display image in ImageAware (loaded from %1$s) [%2$s]"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/c/a/b/b;->k:Lcom/c/a/b/a/f;

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/c/a/b/b;->g:Ljava/lang/String;

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Lcom/c/a/c/d;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/c/a/b/b;->h:Lcom/c/a/b/c/a;

    iget-object v1, p0, Lcom/c/a/b/b;->d:Landroid/graphics/Bitmap;

    iget-object v2, p0, Lcom/c/a/b/b;->f:Lcom/c/a/b/e/a;

    iget-object v3, p0, Lcom/c/a/b/b;->k:Lcom/c/a/b/a/f;

    invoke-interface {v0, v1, v2, v3}, Lcom/c/a/b/c/a;->a(Landroid/graphics/Bitmap;Lcom/c/a/b/e/a;Lcom/c/a/b/a/f;)V

    iget-object v0, p0, Lcom/c/a/b/b;->j:Lcom/c/a/b/f;

    iget-object v1, p0, Lcom/c/a/b/b;->f:Lcom/c/a/b/e/a;

    invoke-virtual {v0, v1}, Lcom/c/a/b/f;->b(Lcom/c/a/b/e/a;)V

    iget-object v0, p0, Lcom/c/a/b/b;->i:Lcom/c/a/b/f/a;

    iget-object v1, p0, Lcom/c/a/b/b;->e:Ljava/lang/String;

    iget-object v2, p0, Lcom/c/a/b/b;->f:Lcom/c/a/b/e/a;

    invoke-interface {v2}, Lcom/c/a/b/e/a;->d()Landroid/view/View;

    move-result-object v2

    iget-object v3, p0, Lcom/c/a/b/b;->d:Landroid/graphics/Bitmap;

    invoke-interface {v0, v1, v2, v3}, Lcom/c/a/b/f/a;->a(Ljava/lang/String;Landroid/view/View;Landroid/graphics/Bitmap;)V

    goto :goto_0
.end method

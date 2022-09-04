.class public Lcom/fimi/soul/utils/aq;
.super Landroid/app/Dialog;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/utils/aq$a;
    }
.end annotation


# instance fields
.field a:Landroid/app/Dialog;

.field b:Ljava/lang/Runnable;

.field private c:Lcom/fimi/soul/utils/aq$a;

.field private d:Landroid/content/Context;

.field private e:I

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/ImageView;

.field private i:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/fimi/soul/utils/aq$a;I)V
    .locals 2

    const v0, 0x7f0c004e

    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/utils/aq;->i:Landroid/os/Handler;

    new-instance v0, Lcom/fimi/soul/utils/aq$1;

    invoke-direct {v0, p0}, Lcom/fimi/soul/utils/aq$1;-><init>(Lcom/fimi/soul/utils/aq;)V

    iput-object v0, p0, Lcom/fimi/soul/utils/aq;->b:Ljava/lang/Runnable;

    iput-object p1, p0, Lcom/fimi/soul/utils/aq;->d:Landroid/content/Context;

    iput-object p2, p0, Lcom/fimi/soul/utils/aq;->c:Lcom/fimi/soul/utils/aq$a;

    iput p3, p0, Lcom/fimi/soul/utils/aq;->e:I

    iget-object v0, p0, Lcom/fimi/soul/utils/aq;->i:Landroid/os/Handler;

    iget-object v1, p0, Lcom/fimi/soul/utils/aq;->b:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/utils/aq;)I
    .locals 2

    iget v0, p0, Lcom/fimi/soul/utils/aq;->e:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lcom/fimi/soul/utils/aq;->e:I

    return v0
.end method

.method static synthetic b(Lcom/fimi/soul/utils/aq;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/utils/aq;->e:I

    return v0
.end method

.method static synthetic c(Lcom/fimi/soul/utils/aq;)Lcom/fimi/soul/utils/aq$a;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/utils/aq;->c:Lcom/fimi/soul/utils/aq$a;

    return-object v0
.end method

.method static synthetic d(Lcom/fimi/soul/utils/aq;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/utils/aq;->i:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/utils/aq;->h:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/utils/aq;->h:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/utils/aq;->f:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/utils/aq;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/utils/aq;->f:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/utils/aq;->g:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5

    const/4 v4, 0x1

    const/4 v3, 0x0

    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/fimi/soul/utils/aq;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3, v3, v3, v3}, Landroid/view/View;->setPadding(IIII)V

    invoke-virtual {p0}, Lcom/fimi/soul/utils/aq;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    const/4 v1, -0x1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    const/4 v1, -0x2

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    invoke-virtual {p0}, Lcom/fimi/soul/utils/aq;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    const v0, 0x7f0400b5

    invoke-virtual {p0, v0}, Lcom/fimi/soul/utils/aq;->setContentView(I)V

    const v0, 0x7f100408

    invoke-virtual {p0, v0}, Lcom/fimi/soul/utils/aq;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/utils/aq;->h:Landroid/widget/ImageView;

    const v0, 0x7f10009c

    invoke-virtual {p0, v0}, Lcom/fimi/soul/utils/aq;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/utils/aq;->f:Landroid/widget/TextView;

    const v0, 0x7f100409

    invoke-virtual {p0, v0}, Lcom/fimi/soul/utils/aq;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/utils/aq;->g:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/fimi/soul/utils/aq;->f:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    iget-object v0, p0, Lcom/fimi/soul/utils/aq;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Landroid/view/View;

    iget-object v2, p0, Lcom/fimi/soul/utils/aq;->f:Landroid/widget/TextView;

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/fimi/soul/utils/aq;->g:Landroid/widget/TextView;

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Lcom/fimi/soul/utils/au;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    const/4 v0, 0x4

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/utils/aq;->c:Lcom/fimi/soul/utils/aq$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/utils/aq;->c:Lcom/fimi/soul/utils/aq$a;

    invoke-interface {v0}, Lcom/fimi/soul/utils/aq$a;->a()V

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

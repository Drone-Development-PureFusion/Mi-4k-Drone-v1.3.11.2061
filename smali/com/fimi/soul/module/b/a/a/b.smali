.class public Lcom/fimi/soul/module/b/a/a/b;
.super Lcom/fimi/soul/module/b/c;

# interfaces
.implements Landroid/text/TextWatcher;
.implements Landroid/view/View$OnClickListener;
.implements Ljava/lang/Runnable;


# instance fields
.field protected a:Lcn/sharesdk/framework/Platform;

.field protected b:Lcn/sharesdk/framework/Platform$ShareParams;

.field protected c:Landroid/widget/LinearLayout;

.field protected d:Landroid/widget/RelativeLayout;

.field protected e:Landroid/widget/ScrollView;

.field protected f:Landroid/widget/EditText;

.field protected g:Landroid/widget/TextView;

.field protected h:Landroid/widget/TextView;

.field protected i:Landroid/widget/RelativeLayout;

.field protected j:Lcom/mob/tools/gui/AsyncImageView;

.field protected k:Lcom/fimi/soul/module/b/a/a/l;

.field protected l:Landroid/widget/LinearLayout;

.field protected m:Landroid/widget/TextView;

.field protected n:Landroid/widget/TextView;

.field protected o:Landroid/graphics/Bitmap;

.field protected p:I

.field private q:Lcom/fimi/soul/module/b/e;


# direct methods
.method public constructor <init>(Lcom/fimi/soul/module/b/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/b/c;-><init>(Lcom/fimi/soul/module/b/e;)V

    iput-object p1, p0, Lcom/fimi/soul/module/b/a/a/b;->q:Lcom/fimi/soul/module/b/e;

    return-void
.end method

.method private a(Ljava/util/HashMap;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const/4 v2, 0x0

    if-eqz p1, :cond_2

    const-string v0, "selected"

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "selected"

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    const-string v1, "platform"

    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcn/sharesdk/framework/Platform;

    invoke-virtual {v1}, Lcn/sharesdk/framework/Platform;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v3, "FacebookMessenger"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v0, v2

    :goto_0
    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/16 v3, 0x40

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v3, 0x20

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, v2

    goto :goto_0
.end method

.method private a(Landroid/graphics/Bitmap;)V
    .locals 3

    new-instance v0, Lcom/fimi/soul/module/b/a/a/h;

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b;->q:Lcom/fimi/soul/module/b/e;

    invoke-direct {v0, v1}, Lcom/fimi/soul/module/b/a/a/h;-><init>(Lcom/fimi/soul/module/b/e;)V

    invoke-virtual {v0, p1}, Lcom/fimi/soul/module/b/a/a/h;->a(Landroid/graphics/Bitmap;)V

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b;->activity:Landroid/app/Activity;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/module/b/a/a/h;->show(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method private i()V
    .locals 2

    const/4 v0, 0x5

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b;->a:Lcn/sharesdk/framework/Platform;

    invoke-static {v0, v1}, Lcn/sharesdk/framework/ShareSDK;->logDemoEvent(ILcn/sharesdk/framework/Platform;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/b;->finish()V

    return-void
.end method

.method private j()V
    .locals 3

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b;->activity:Landroid/app/Activity;

    const-string v1, "ssdk_oks_sharing"

    invoke-static {v0, v1}, Lcom/mob/tools/utils/R;->getStringRes(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b;->activity:Landroid/app/Activity;

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_0
    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/b;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b;->a:Lcn/sharesdk/framework/Platform;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcn/sharesdk/framework/Platform;->SSOSetting(Z)V

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b;->a:Lcn/sharesdk/framework/Platform;

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/b;->f()Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcn/sharesdk/framework/Platform;->setPlatformActionListener(Lcn/sharesdk/framework/PlatformActionListener;)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b;->a:Lcn/sharesdk/framework/Platform;

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b;->b:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-virtual {v0, v1}, Lcn/sharesdk/framework/Platform;->share(Lcn/sharesdk/framework/Platform$ShareParams;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/b;->finish()V

    return-void
.end method

.method private k()V
    .locals 2

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b;->b:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-virtual {v0, v1}, Lcn/sharesdk/framework/Platform$ShareParams;->setImageArray([Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b;->b:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-virtual {v0, v1}, Lcn/sharesdk/framework/Platform$ShareParams;->setImageData(Landroid/graphics/Bitmap;)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b;->b:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-virtual {v0, v1}, Lcn/sharesdk/framework/Platform$ShareParams;->setImagePath(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b;->b:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-virtual {v0, v1}, Lcn/sharesdk/framework/Platform$ShareParams;->setImageUrl(Ljava/lang/String;)V

    return-void
.end method

.method private l()V
    .locals 3

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    new-instance v0, Lcom/fimi/soul/module/b/a/a/b/b;

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b;->q:Lcom/fimi/soul/module/b/e;

    invoke-direct {v0, v1}, Lcom/fimi/soul/module/b/a/a/b/b;-><init>(Lcom/fimi/soul/module/b/e;)V

    :goto_0
    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b;->a:Lcn/sharesdk/framework/Platform;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/b/a/a/e;->d(Lcn/sharesdk/framework/Platform;)V

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b;->a:Lcn/sharesdk/framework/Platform;

    invoke-virtual {v1}, Lcn/sharesdk/framework/Platform;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p0}, Lcom/fimi/soul/module/b/a/a/e;->showForResult(Landroid/content/Context;Landroid/content/Intent;Lcom/mob/tools/FakeActivity;)V

    return-void

    :cond_0
    new-instance v0, Lcom/fimi/soul/module/b/a/a/a/b;

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b;->q:Lcom/fimi/soul/module/b/e;

    invoke-direct {v0, v1}, Lcom/fimi/soul/module/b/a/a/a/b;-><init>(Lcom/fimi/soul/module/b/e;)V

    goto :goto_0
.end method


# virtual methods
.method public a(Lcn/sharesdk/framework/Platform$ShareParams;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/b/a/a/b;->b:Lcn/sharesdk/framework/Platform$ShareParams;

    return-void
.end method

.method protected a(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "SinaWeibo"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "TencentWeibo"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Facebook"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Twitter"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public d(Lcn/sharesdk/framework/Platform;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/b/a/a/b;->a:Lcn/sharesdk/framework/Platform;

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b;->g:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/fimi/soul/module/b/a/a/b;->i()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b;->h:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b;->b:Lcn/sharesdk/framework/Platform$ShareParams;

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b;->f:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcn/sharesdk/framework/Platform$ShareParams;->setText(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/fimi/soul/module/b/a/a/b;->j()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b;->j:Lcom/mob/tools/gui/AsyncImageView;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b;->o:Landroid/graphics/Bitmap;

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/b/a/a/b;->a(Landroid/graphics/Bitmap;)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b;->k:Lcom/fimi/soul/module/b/a/a/l;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iput v2, p0, Lcom/fimi/soul/module/b/a/a/b;->p:I

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b;->i:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2, v2}, Landroid/widget/LinearLayout;->measure(II)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b;->f:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {p0, v0, v2, v2, v2}, Lcom/fimi/soul/module/b/a/a/b;->onTextChanged(Ljava/lang/CharSequence;III)V

    invoke-direct {p0}, Lcom/fimi/soul/module/b/a/a/b;->k()V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b;->m:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/fimi/soul/module/b/a/a/b;->l()V

    goto :goto_0
.end method

.method public onCreate()V
    .locals 3

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const v2, -0xc0c0d

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public onPause()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b;->activity:Landroid/app/Activity;

    invoke-static {v0}, Lcom/mob/tools/utils/DeviceHelper;->getInstance(Landroid/content/Context;)Lcom/mob/tools/utils/DeviceHelper;

    move-result-object v0

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/b;->getContentView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mob/tools/utils/DeviceHelper;->hideSoftInput(Landroid/view/View;)V

    invoke-super {p0}, Lcom/fimi/soul/module/b/c;->onPause()V

    return-void
.end method

.method public onResult(Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/b/a/a/b;->a(Ljava/util/HashMap;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b;->f:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->append(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b;->n:Landroid/widget/TextView;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget v0, p0, Lcom/fimi/soul/module/b/a/a/b;->p:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getHeight()I

    move-result v0

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getHeight()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/fimi/soul/module/b/a/a/b;->p:I

    :cond_0
    iget v0, p0, Lcom/fimi/soul/module/b/a/a/b;->p:I

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b;->e:Landroid/widget/ScrollView;

    invoke-virtual {v0, p0}, Landroid/widget/ScrollView;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method

.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b;->e:Landroid/widget/ScrollView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v1

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b;->e:Landroid/widget/ScrollView;

    invoke-virtual {v0}, Landroid/widget/ScrollView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-static {v0}, Lcom/mob/tools/utils/R;->forceCast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    iget v2, p0, Lcom/fimi/soul/module/b/a/a/b;->p:I

    if-le v1, v2, :cond_1

    iget v2, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    iget v3, p0, Lcom/fimi/soul/module/b/a/a/b;->p:I

    if-eq v2, v3, :cond_1

    iget v1, p0, Lcom/fimi/soul/module/b/a/a/b;->p:I

    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b;->e:Landroid/widget/ScrollView;

    invoke-virtual {v1, v0}, Landroid/widget/ScrollView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget v2, p0, Lcom/fimi/soul/module/b/a/a/b;->p:I

    if-ge v1, v2, :cond_0

    iget v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    iget v2, p0, Lcom/fimi/soul/module/b/a/a/b;->p:I

    if-ne v1, v2, :cond_0

    const/4 v1, -0x2

    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b;->e:Landroid/widget/ScrollView;

    invoke-virtual {v1, v0}, Landroid/widget/ScrollView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0
.end method

.method public setActivity(Landroid/app/Activity;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/fimi/soul/module/b/c;->setActivity(Landroid/app/Activity;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v1, "Theme classic does not support dialog mode!"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x25

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    return-void
.end method

.class public abstract Lcom/fimi/soul/module/b/a/a/e;
.super Lcom/fimi/soul/module/b/c;

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/AdapterView$OnItemClickListener;


# static fields
.field private static final a:I = 0x28


# instance fields
.field private b:Lcn/sharesdk/framework/Platform;

.field private c:Landroid/widget/LinearLayout;

.field private d:Landroid/widget/RelativeLayout;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Lcom/fimi/soul/module/b/a/a/c;

.field private h:I

.field private i:I


# direct methods
.method public constructor <init>(Lcom/fimi/soul/module/b/e;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/b/c;-><init>(Lcom/fimi/soul/module/b/e;)V

    const/4 v0, -0x1

    iput v0, p0, Lcom/fimi/soul/module/b/a/a/e;->h:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/fimi/soul/module/b/a/a/e;->i:I

    return-void
.end method

.method private a(Landroid/widget/RelativeLayout;F)V
    .locals 9

    const/16 v8, 0x11

    const/4 v7, 0x2

    const/4 v6, -0x1

    const/4 v5, -0x2

    const/4 v4, 0x0

    new-instance v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/e;->activity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/fimi/soul/module/b/a/a/e;->e:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/e;->e:Landroid/widget/TextView;

    const v1, -0xc4c4c5

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/e;->e:Landroid/widget/TextView;

    const/high16 v1, 0x41900000    # 18.0f

    invoke-virtual {v0, v7, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/e;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setGravity(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/e;->activity:Landroid/app/Activity;

    const-string v1, "ssdk_oks_cancel"

    invoke-static {v0, v1}, Lcom/mob/tools/utils/R;->getStringRes(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/e;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    :cond_0
    const/high16 v0, 0x42200000    # 40.0f

    mul-float/2addr v0, p2

    float-to-int v0, v0

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/e;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v0, v4, v0, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v1, v5, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/e;->e:Landroid/widget/TextView;

    invoke-virtual {p1, v2, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/e;->e:Landroid/widget/TextView;

    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v1, Landroid/widget/TextView;

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/e;->activity:Landroid/app/Activity;

    invoke-direct {v1, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const v2, -0xc4c4c5

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v2, 0x41b00000    # 22.0f

    invoke-virtual {v1, v7, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setGravity(I)V

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/e;->activity:Landroid/app/Activity;

    const-string v3, "ssdk_oks_contacts"

    invoke-static {v2, v3}, Lcom/mob/tools/utils/R;->getStringRes(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    if-lez v2, :cond_1

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    :cond_1
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v2, v5, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v3, 0xd

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    invoke-virtual {p1, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v1, Landroid/widget/TextView;

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/e;->activity:Landroid/app/Activity;

    invoke-direct {v1, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/fimi/soul/module/b/a/a/e;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/e;->f:Landroid/widget/TextView;

    const v2, -0x92ef

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/e;->f:Landroid/widget/TextView;

    const/high16 v2, 0x41900000    # 18.0f

    invoke-virtual {v1, v7, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/e;->f:Landroid/widget/TextView;

    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setGravity(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/e;->activity:Landroid/app/Activity;

    const-string v2, "ssdk_oks_confirm"

    invoke-static {v1, v2}, Lcom/mob/tools/utils/R;->getStringRes(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-lez v1, :cond_2

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/e;->f:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(I)V

    :cond_2
    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/e;->f:Landroid/widget/TextView;

    invoke-virtual {v1, v0, v4, v0, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, v5, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/e;->f:Landroid/widget/TextView;

    invoke-virtual {p1, v1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/e;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private k()V
    .locals 3

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/e;->activity:Landroid/app/Activity;

    const-string v1, "ssdk_oks_confirm"

    invoke-static {v0, v1}, Lcom/mob/tools/utils/R;->getStringRes(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const-string v0, "Confirm"

    if-lez v1, :cond_0

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/e;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :cond_0
    iget v1, p0, Lcom/fimi/soul/module/b/a/a/e;->i:I

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/e;->f:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    iget v1, p0, Lcom/fimi/soul/module/b/a/a/e;->i:I

    if-lez v1, :cond_1

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/e;->f:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "("

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v2, p0, Lcom/fimi/soul/module/b/a/a/e;->i:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method


# virtual methods
.method public d(Lcn/sharesdk/framework/Platform;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/b/a/a/e;->b:Lcn/sharesdk/framework/Platform;

    return-void
.end method

.method protected abstract i()F
.end method

.method protected abstract j()I
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/e;->e:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/e;->finish()V

    :goto_0
    return-void

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/e;->g:Lcom/fimi/soul/module/b/a/a/c;

    invoke-virtual {v2}, Lcom/fimi/soul/module/b/a/a/c;->getCount()I

    move-result v2

    :goto_1
    if-ge v0, v2, :cond_2

    iget-object v3, p0, Lcom/fimi/soul/module/b/a/a/e;->g:Lcom/fimi/soul/module/b/a/a/c;

    invoke-virtual {v3, v0}, Lcom/fimi/soul/module/b/a/a/c;->a(I)Lcom/fimi/soul/module/b/a/a/c$b;

    move-result-object v3

    iget-boolean v3, v3, Lcom/fimi/soul/module/b/a/a/c$b;->a:Z

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/fimi/soul/module/b/a/a/e;->g:Lcom/fimi/soul/module/b/a/a/c;

    invoke-virtual {v3, v0}, Lcom/fimi/soul/module/b/a/a/c;->a(I)Lcom/fimi/soul/module/b/a/a/c$b;

    move-result-object v3

    iget-object v3, v3, Lcom/fimi/soul/module/b/a/a/c$b;->f:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v2, "selected"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "platform"

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/e;->b:Lcn/sharesdk/framework/Platform;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/b/a/a/e;->setResult(Ljava/util/HashMap;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/e;->finish()V

    goto :goto_0
.end method

.method public onCreate()V
    .locals 7

    const/4 v6, 0x1

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v5, -0x1

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/e;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    const v3, -0xc0c0d

    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    new-instance v0, Landroid/widget/LinearLayout;

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/e;->activity:Landroid/app/Activity;

    invoke-direct {v0, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/fimi/soul/module/b/a/a/e;->c:Landroid/widget/LinearLayout;

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/e;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/e;->activity:Landroid/app/Activity;

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/e;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    new-instance v0, Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/e;->activity:Landroid/app/Activity;

    invoke-direct {v0, v2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/fimi/soul/module/b/a/a/e;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/e;->i()F

    move-result v2

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/e;->j()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, v2

    float-to-int v0, v0

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v3, v5, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/e;->c:Landroid/widget/LinearLayout;

    iget-object v4, p0, Lcom/fimi/soul/module/b/a/a/e;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v4, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/e;->d:Landroid/widget/RelativeLayout;

    invoke-direct {p0, v0, v2}, Lcom/fimi/soul/module/b/a/a/e;->a(Landroid/widget/RelativeLayout;F)V

    new-instance v3, Landroid/view/View;

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/e;->activity:Landroid/app/Activity;

    invoke-direct {v3, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    cmpg-float v0, v2, v1

    if-gez v0, :cond_0

    move v0, v1

    :goto_0
    float-to-int v0, v0

    invoke-direct {v4, v5, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const v0, -0x252627

    invoke-virtual {v3, v0}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/e;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/e;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v0, v3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x2

    invoke-direct {v3, v5, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput v1, v3, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    invoke-virtual {v0, v3}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/e;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    new-instance v1, Lcom/mob/tools/gui/PullToRequestView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/e;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v1, v3}, Lcom/mob/tools/gui/PullToRequestView;-><init>(Landroid/content/Context;)V

    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v3, v5, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v3}, Lcom/mob/tools/gui/PullToRequestView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    new-instance v0, Lcom/fimi/soul/module/b/a/a/c;

    invoke-direct {v0, p0, v1}, Lcom/fimi/soul/module/b/a/a/c;-><init>(Lcom/fimi/soul/module/b/a/a/e;Lcom/mob/tools/gui/PullToRequestView;)V

    iput-object v0, p0, Lcom/fimi/soul/module/b/a/a/e;->g:Lcom/fimi/soul/module/b/a/a/c;

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/e;->g:Lcom/fimi/soul/module/b/a/a/c;

    iget-object v3, p0, Lcom/fimi/soul/module/b/a/a/e;->b:Lcn/sharesdk/framework/Platform;

    invoke-virtual {v0, v3}, Lcom/fimi/soul/module/b/a/a/c;->a(Lcn/sharesdk/framework/Platform;)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/e;->g:Lcom/fimi/soul/module/b/a/a/c;

    invoke-virtual {v0, v2}, Lcom/fimi/soul/module/b/a/a/c;->a(F)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/e;->g:Lcom/fimi/soul/module/b/a/a/c;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/module/b/a/a/c;->a(Landroid/widget/AdapterView$OnItemClickListener;)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/e;->g:Lcom/fimi/soul/module/b/a/a/c;

    invoke-virtual {v1, v0}, Lcom/mob/tools/gui/PullToRequestView;->setAdapter(Lcom/mob/tools/gui/PullToRequestAdatper;)V

    invoke-virtual {v1, v6}, Lcom/mob/tools/gui/PullToRequestView;->performPullingDown(Z)V

    return-void

    :cond_0
    move v0, v2

    goto :goto_0
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    const/4 v0, 0x0

    const-string v1, "FacebookMessenger"

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/e;->b:Lcn/sharesdk/framework/Platform;

    invoke-virtual {v2}, Lcn/sharesdk/framework/Platform;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/fimi/soul/module/b/a/a/e;->h:I

    if-ltz v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/e;->g:Lcom/fimi/soul/module/b/a/a/c;

    iget v2, p0, Lcom/fimi/soul/module/b/a/a/e;->h:I

    invoke-virtual {v1, v2}, Lcom/fimi/soul/module/b/a/a/c;->a(I)Lcom/fimi/soul/module/b/a/a/c$b;

    move-result-object v1

    iput-boolean v0, v1, Lcom/fimi/soul/module/b/a/a/c$b;->a:Z

    :cond_0
    iput p3, p0, Lcom/fimi/soul/module/b/a/a/e;->h:I

    :cond_1
    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/e;->g:Lcom/fimi/soul/module/b/a/a/c;

    invoke-virtual {v1, p3}, Lcom/fimi/soul/module/b/a/a/c;->a(I)Lcom/fimi/soul/module/b/a/a/c$b;

    move-result-object v1

    iget-boolean v2, v1, Lcom/fimi/soul/module/b/a/a/c$b;->a:Z

    if-nez v2, :cond_2

    const/4 v0, 0x1

    :cond_2
    iput-boolean v0, v1, Lcom/fimi/soul/module/b/a/a/c$b;->a:Z

    iget-boolean v0, v1, Lcom/fimi/soul/module/b/a/a/c$b;->a:Z

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/fimi/soul/module/b/a/a/e;->i:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/fimi/soul/module/b/a/a/e;->i:I

    :goto_0
    invoke-direct {p0}, Lcom/fimi/soul/module/b/a/a/e;->k()V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/e;->g:Lcom/fimi/soul/module/b/a/a/c;

    invoke-virtual {v0}, Lcom/fimi/soul/module/b/a/a/c;->notifyDataSetChanged()V

    return-void

    :cond_3
    iget v0, p0, Lcom/fimi/soul/module/b/a/a/e;->i:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/fimi/soul/module/b/a/a/e;->i:I

    goto :goto_0
.end method

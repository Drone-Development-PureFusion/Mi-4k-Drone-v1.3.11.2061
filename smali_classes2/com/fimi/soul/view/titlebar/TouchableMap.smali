.class public Lcom/fimi/soul/view/titlebar/TouchableMap;
.super Landroid/widget/FrameLayout;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/view/titlebar/TouchableMap$a;
    }
.end annotation


# instance fields
.field private a:Lcom/fimi/soul/view/titlebar/TouchableMap$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/view/titlebar/TouchableMap;->a:Lcom/fimi/soul/view/titlebar/TouchableMap$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/view/titlebar/TouchableMap;->a:Lcom/fimi/soul/view/titlebar/TouchableMap$a;

    invoke-interface {v0, p1}, Lcom/fimi/soul/view/titlebar/TouchableMap$a;->a(Landroid/view/MotionEvent;)V

    :cond_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public setNonConsumingTouchListener(Lcom/fimi/soul/view/titlebar/TouchableMap$a;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/view/titlebar/TouchableMap;->a:Lcom/fimi/soul/view/titlebar/TouchableMap$a;

    return-void
.end method

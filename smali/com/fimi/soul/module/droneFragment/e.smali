.class public abstract Lcom/fimi/soul/module/droneFragment/e;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field private final a:Landroid/view/View;

.field private final b:Landroid/graphics/drawable/Drawable;

.field private final c:Landroid/graphics/drawable/Drawable;

.field private final d:Landroid/os/Handler;

.field private e:Lcom/google/android/gms/maps/model/g;

.field private f:Z

.field private final g:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/e;->d:Landroid/os/Handler;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/e;->f:Z

    new-instance v0, Lcom/fimi/soul/module/droneFragment/e$1;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/droneFragment/e$1;-><init>(Lcom/fimi/soul/module/droneFragment/e;)V

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/e;->g:Ljava/lang/Runnable;

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/e;->a:Landroid/view/View;

    iput-object p2, p0, Lcom/fimi/soul/module/droneFragment/e;->b:Landroid/graphics/drawable/Drawable;

    iput-object p3, p0, Lcom/fimi/soul/module/droneFragment/e;->c:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method private a()V
    .locals 2

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/e;->f:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/e;->f:Z

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/e;->d:Landroid/os/Handler;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/e;->g:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/e;->a:Landroid/view/View;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/e;->c:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/e;->e:Lcom/google/android/gms/maps/model/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/e;->e:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->h()V

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneFragment/e;)Z
    .locals 1

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/e;->b()Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/fimi/soul/module/droneFragment/e;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/e;->a:Landroid/view/View;

    return-object v0
.end method

.method private b()Z
    .locals 2

    const/4 v0, 0x0

    iget-boolean v1, p0, Lcom/fimi/soul/module/droneFragment/e;->f:Z

    if-eqz v1, :cond_1

    iput-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/e;->f:Z

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/e;->d:Landroid/os/Handler;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/e;->g:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/e;->a:Landroid/view/View;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/e;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/e;->e:Lcom/google/android/gms/maps/model/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/e;->e:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->h()V

    :cond_0
    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method static synthetic c(Lcom/fimi/soul/module/droneFragment/e;)Lcom/google/android/gms/maps/model/g;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/e;->e:Lcom/google/android/gms/maps/model/g;

    return-object v0
.end method


# virtual methods
.method protected abstract a(Landroid/view/View;Lcom/google/android/gms/maps/model/g;)V
.end method

.method public a(Lcom/google/android/gms/maps/model/g;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/e;->e:Lcom/google/android/gms/maps/model/g;

    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    const/4 v2, 0x0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    cmpg-float v0, v2, v0

    if-gtz v0, :cond_0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/e;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    cmpg-float v0, v2, v0

    if-gtz v0, :cond_0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/e;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :goto_0
    :pswitch_0
    const/4 v0, 0x0

    return v0

    :pswitch_1
    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/e;->a()V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/e;->d:Landroid/os/Handler;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/e;->g:Ljava/lang/Runnable;

    const-wide/16 v2, 0x96

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :pswitch_3
    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/e;->b()Z

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/e;->b()Z

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

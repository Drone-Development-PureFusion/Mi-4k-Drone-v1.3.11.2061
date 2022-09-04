.class public Lcom/fimi/soul/biz/n/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/biz/n/a$a;
    }
.end annotation


# static fields
.field private static e:Lcom/fimi/soul/biz/n/a;


# instance fields
.field public volatile a:Lcom/fimi/soul/biz/n/a$a;

.field private b:Landroid/widget/ImageButton;

.field private c:Lcom/fimi/soul/drone/a;

.field private d:I

.field private f:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/widget/ImageButton;",
            ">;"
        }
    .end annotation
.end field

.field private volatile g:Z

.field private h:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/fimi/soul/biz/n/a$a;->b:Lcom/fimi/soul/biz/n/a$a;

    iput-object v0, p0, Lcom/fimi/soul/biz/n/a;->a:Lcom/fimi/soul/biz/n/a$a;

    const/4 v0, 0x0

    iput v0, p0, Lcom/fimi/soul/biz/n/a;->d:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/biz/n/a;->g:Z

    const/16 v0, 0x12

    iput v0, p0, Lcom/fimi/soul/biz/n/a;->h:I

    return-void
.end method

.method public static a()Lcom/fimi/soul/biz/n/a;
    .locals 1

    sget-object v0, Lcom/fimi/soul/biz/n/a;->e:Lcom/fimi/soul/biz/n/a;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/soul/biz/n/a;

    invoke-direct {v0}, Lcom/fimi/soul/biz/n/a;-><init>()V

    sput-object v0, Lcom/fimi/soul/biz/n/a;->e:Lcom/fimi/soul/biz/n/a;

    :cond_0
    sget-object v0, Lcom/fimi/soul/biz/n/a;->e:Lcom/fimi/soul/biz/n/a;

    return-object v0
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/n/a;->b:Landroid/widget/ImageButton;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/fimi/soul/biz/n/a;->d:I

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/n/a;->b:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setImageResource(I)V

    iput p1, p0, Lcom/fimi/soul/biz/n/a;->d:I

    :cond_0
    return-void
.end method

.method public a(Landroid/widget/ImageButton;Lcom/fimi/soul/drone/a;)V
    .locals 1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/fimi/soul/biz/n/a;->f:Ljava/lang/ref/WeakReference;

    iget-object v0, p0, Lcom/fimi/soul/biz/n/a;->f:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/fimi/soul/biz/n/a;->b:Landroid/widget/ImageButton;

    iput-object p2, p0, Lcom/fimi/soul/biz/n/a;->c:Lcom/fimi/soul/drone/a;

    invoke-virtual {p0}, Lcom/fimi/soul/biz/n/a;->b()V

    return-void
.end method

.method public a(Lcom/fimi/soul/biz/n/a$a;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/n/a;->a:Lcom/fimi/soul/biz/n/a$a;

    return-void
.end method

.method public a(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/biz/n/a;->c:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->aj()Lcom/google/android/gms/maps/c;

    move-result-object v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/google/android/gms/maps/b;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/a;

    move-result-object v1

    const/16 v2, 0x12c

    new-instance v3, Lcom/fimi/soul/biz/n/a$1;

    invoke-direct {v3, p0}, Lcom/fimi/soul/biz/n/a$1;-><init>(Lcom/fimi/soul/biz/n/a;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/a;ILcom/google/android/gms/maps/c$a;)V

    :cond_0
    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/biz/n/a;->g:Z

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/biz/n/a;->c:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/biz/n/a;->c:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/i/aq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/aq;->d()B

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/biz/n/a;->a:Lcom/fimi/soul/biz/n/a$a;

    sget-object v1, Lcom/fimi/soul/biz/n/a$a;->c:Lcom/fimi/soul/biz/n/a$a;

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/fimi/soul/biz/n/a$a;->c:Lcom/fimi/soul/biz/n/a$a;

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/n/a;->a(Lcom/fimi/soul/biz/n/a$a;)V

    const v0, 0x7f030002

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/n/a;->a(I)V

    :goto_0
    return-void

    :cond_0
    sget-object v0, Lcom/fimi/soul/biz/n/a$a;->b:Lcom/fimi/soul/biz/n/a$a;

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/n/a;->a(Lcom/fimi/soul/biz/n/a$a;)V

    const v0, 0x7f030003

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/n/a;->a(I)V

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/fimi/soul/biz/n/a$a;->a:Lcom/fimi/soul/biz/n/a$a;

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/n/a;->a(Lcom/fimi/soul/biz/n/a$a;)V

    const v0, 0x7f02034a

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/n/a;->a(I)V

    goto :goto_0
.end method

.method public c()Lcom/fimi/soul/biz/n/a$a;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/n/a;->a:Lcom/fimi/soul/biz/n/a$a;

    return-object v0
.end method

.method public d()V
    .locals 8

    iget-object v0, p0, Lcom/fimi/soul/biz/n/a;->c:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->aj()Lcom/google/android/gms/maps/c;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lcom/fimi/soul/biz/n/a$2;->a:[I

    iget-object v2, p0, Lcom/fimi/soul/biz/n/a;->a:Lcom/fimi/soul/biz/n/a$a;

    invoke-virtual {v2}, Lcom/fimi/soul/biz/n/a$a;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    const v1, 0x7f030002

    invoke-virtual {p0, v1}, Lcom/fimi/soul/biz/n/a;->a(I)V

    sget-object v1, Lcom/fimi/soul/biz/n/a$a;->c:Lcom/fimi/soul/biz/n/a$a;

    invoke-virtual {p0, v1}, Lcom/fimi/soul/biz/n/a;->a(Lcom/fimi/soul/biz/n/a$a;)V

    iget v1, p0, Lcom/fimi/soul/biz/n/a;->h:I

    int-to-float v1, v1

    invoke-static {v1}, Lcom/google/android/gms/maps/b;->b(F)Lcom/google/android/gms/maps/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/a;)V

    goto :goto_0

    :pswitch_1
    iget-object v1, p0, Lcom/fimi/soul/biz/n/a;->c:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->b()Landroid/location/Location;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v4

    invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v6

    invoke-direct {v2, v4, v5, v6, v7}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    const/high16 v1, 0x41900000    # 18.0f

    invoke-static {v2, v1}, Lcom/google/android/gms/maps/b;->a(Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/c;->b(Lcom/google/android/gms/maps/a;)V

    goto :goto_0

    :pswitch_2
    const v0, 0x7f030003

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/n/a;->a(I)V

    sget-object v0, Lcom/fimi/soul/biz/n/a$a;->b:Lcom/fimi/soul/biz/n/a$a;

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/n/a;->a(Lcom/fimi/soul/biz/n/a$a;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/biz/n/a;->g:Z

    return v0
.end method

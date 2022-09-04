.class public Lcom/google/android/gms/internal/aga;
.super Lcom/google/android/gms/cast/framework/media/a/a;


# static fields
.field private static final a:Lcom/google/android/gms/cast/internal/m;


# instance fields
.field private final b:Landroid/widget/ImageView;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Landroid/content/Context;

.field private final f:Lcom/google/android/gms/cast/a$d;

.field private final g:Landroid/view/View$OnClickListener;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/cast/internal/m;

    const-string v1, "MuteToggleUIController"

    invoke-direct {v0, v1}, Lcom/google/android/gms/cast/internal/m;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/aga;->a:Lcom/google/android/gms/cast/internal/m;

    return-void
.end method

.method public constructor <init>(Landroid/widget/ImageView;Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/a/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/aga;->b:Landroid/widget/ImageView;

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/aga;->e:Landroid/content/Context;

    iget-object v0, p0, Lcom/google/android/gms/internal/aga;->e:Landroid/content/Context;

    sget v1, Lcom/google/android/gms/R$string;->cast_mute:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/aga;->c:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/aga;->e:Landroid/content/Context;

    sget v1, Lcom/google/android/gms/R$string;->cast_unmute:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/aga;->d:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/aga$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/aga$1;-><init>(Lcom/google/android/gms/internal/aga;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/aga;->f:Lcom/google/android/gms/cast/a$d;

    new-instance v0, Lcom/google/android/gms/internal/aga$2;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/aga$2;-><init>(Lcom/google/android/gms/internal/aga;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/aga;->g:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/aga;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/aga;->f()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/aga;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/aga;->a(Z)V

    return-void
.end method

.method private a(Z)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/aga;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setSelected(Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/aga;->b:Landroid/widget/ImageView;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/aga;->c:Ljava/lang/String;

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/aga;->d:Ljava/lang/String;

    goto :goto_0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/aga;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aga;->e:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e()Lcom/google/android/gms/cast/internal/m;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/aga;->a:Lcom/google/android/gms/cast/internal/m;

    return-object v0
.end method

.method private f()V
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/aga;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/c;->a(Landroid/content/Context;)Lcom/google/android/gms/cast/framework/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/c;->b()Lcom/google/android/gms/cast/framework/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/k;->b()Lcom/google/android/gms/cast/framework/d;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/d;->o()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/aga;->b:Landroid/widget/ImageView;

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setEnabled(Z)V

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/d;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/aga;->a(Z)V

    :goto_0
    return-void

    :cond_0
    invoke-direct {p0, v3}, Lcom/google/android/gms/internal/aga;->a(Z)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/aga;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setEnabled(Z)V

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/cast/framework/d;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/google/android/gms/cast/framework/media/a/a;->a(Lcom/google/android/gms/cast/framework/d;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/aga;->b:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/google/android/gms/internal/aga;->g:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/aga;->f:Lcom/google/android/gms/cast/a$d;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/cast/framework/d;->a(Lcom/google/android/gms/cast/a$d;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/aga;->f()V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/aga;->b:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-super {p0}, Lcom/google/android/gms/cast/framework/media/a/a;->b()V

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/aga;->b:Landroid/widget/ImageView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setEnabled(Z)V

    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/aga;->b:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setEnabled(Z)V

    return-void
.end method

.class public Lcom/google/android/gms/internal/fj;
.super Lcom/google/android/gms/internal/fi;


# instance fields
.field protected final a:Landroid/animation/Animator;

.field private final b:Lcom/google/android/gms/internal/fk;

.field private final c:Ljava/lang/Runnable;

.field private d:Lcom/google/android/gms/internal/fk$a;


# direct methods
.method private constructor <init>(Landroid/animation/Animator;Ljava/lang/Runnable;)V
    .locals 1
    .param p2    # Ljava/lang/Runnable;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/google/android/gms/internal/fi;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/fj$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/fj$1;-><init>(Lcom/google/android/gms/internal/fj;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/fj;->d:Lcom/google/android/gms/internal/fk$a;

    iput-object p1, p0, Lcom/google/android/gms/internal/fj;->a:Landroid/animation/Animator;

    iput-object p2, p0, Lcom/google/android/gms/internal/fj;->c:Ljava/lang/Runnable;

    invoke-static {}, Lcom/google/android/gms/internal/fk;->a()Lcom/google/android/gms/internal/fk;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/fj;->b:Lcom/google/android/gms/internal/fk;

    return-void
.end method

.method public static a(Landroid/animation/Animator;Ljava/lang/Runnable;)Lcom/google/android/gms/internal/fj;
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    new-instance v0, Lcom/google/android/gms/internal/fj;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/fj;-><init>(Landroid/animation/Animator;Ljava/lang/Runnable;)V

    invoke-virtual {p0, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/fj;)Ljava/lang/Runnable;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/fj;->c:Ljava/lang/Runnable;

    return-object v0
.end method

.method public static b(Landroid/animation/Animator;)Lcom/google/android/gms/internal/fj;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/fj;->a(Landroid/animation/Animator;Ljava/lang/Runnable;)Lcom/google/android/gms/internal/fj;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/fj;->a(Landroid/animation/Animator;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/fj;->b:Lcom/google/android/gms/internal/fk;

    iget-object v1, p0, Lcom/google/android/gms/internal/fj;->d:Lcom/google/android/gms/internal/fk$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/fk;->a(Lcom/google/android/gms/internal/fk$a;)V

    :cond_0
    return-void
.end method

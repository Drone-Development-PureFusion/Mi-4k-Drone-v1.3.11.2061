.class public final Lcom/google/android/gms/common/images/ImageManager;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/common/images/ImageManager$b;,
        Lcom/google/android/gms/common/images/ImageManager$c;,
        Lcom/google/android/gms/common/images/ImageManager$f;,
        Lcom/google/android/gms/common/images/ImageManager$g;,
        Lcom/google/android/gms/common/images/ImageManager$d;,
        Lcom/google/android/gms/common/images/ImageManager$ImageReceiver;,
        Lcom/google/android/gms/common/images/ImageManager$e;,
        Lcom/google/android/gms/common/images/ImageManager$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/Object;

.field private static b:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field

.field private static c:Lcom/google/android/gms/common/images/ImageManager;

.field private static d:Lcom/google/android/gms/common/images/ImageManager;


# instance fields
.field private final e:Landroid/content/Context;

.field private final f:Landroid/os/Handler;

.field private final g:Ljava/util/concurrent/ExecutorService;

.field private final h:Lcom/google/android/gms/common/images/ImageManager$c;

.field private final i:Lcom/google/android/gms/internal/zzrv;

.field private final j:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/common/images/b;",
            "Lcom/google/android/gms/common/images/ImageManager$ImageReceiver;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Landroid/net/Uri;",
            "Lcom/google/android/gms/common/images/ImageManager$ImageReceiver;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Landroid/net/Uri;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/common/images/ImageManager;->a:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lcom/google/android/gms/common/images/ImageManager;->b:Ljava/util/HashSet;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Z)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/common/images/ImageManager;->e:Landroid/content/Context;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/google/android/gms/common/images/ImageManager;->f:Landroid/os/Handler;

    const/4 v0, 0x4

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/common/images/ImageManager;->g:Ljava/util/concurrent/ExecutorService;

    if-eqz p2, :cond_1

    new-instance v0, Lcom/google/android/gms/common/images/ImageManager$c;

    iget-object v1, p0, Lcom/google/android/gms/common/images/ImageManager;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/images/ImageManager$c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/common/images/ImageManager;->h:Lcom/google/android/gms/common/images/ImageManager$c;

    invoke-static {}, Lcom/google/android/gms/common/util/s;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/common/images/ImageManager;->c()V

    :cond_0
    :goto_0
    new-instance v0, Lcom/google/android/gms/internal/zzrv;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzrv;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/common/images/ImageManager;->i:Lcom/google/android/gms/internal/zzrv;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/common/images/ImageManager;->j:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/common/images/ImageManager;->k:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/common/images/ImageManager;->l:Ljava/util/Map;

    return-void

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/common/images/ImageManager;->h:Lcom/google/android/gms/common/images/ImageManager$c;

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/common/images/ImageManager;Lcom/google/android/gms/common/images/b$a;)Landroid/graphics/Bitmap;
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/common/images/ImageManager;->a(Lcom/google/android/gms/common/images/b$a;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/google/android/gms/common/images/b$a;)Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager;->h:Lcom/google/android/gms/common/images/ImageManager$c;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager;->h:Lcom/google/android/gms/common/images/ImageManager$c;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/images/ImageManager$c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;)Lcom/google/android/gms/common/images/ImageManager;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/google/android/gms/common/images/ImageManager;->a(Landroid/content/Context;Z)Lcom/google/android/gms/common/images/ImageManager;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;Z)Lcom/google/android/gms/common/images/ImageManager;
    .locals 2

    if-eqz p1, :cond_1

    sget-object v0, Lcom/google/android/gms/common/images/ImageManager;->d:Lcom/google/android/gms/common/images/ImageManager;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/common/images/ImageManager;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/common/images/ImageManager;-><init>(Landroid/content/Context;Z)V

    sput-object v0, Lcom/google/android/gms/common/images/ImageManager;->d:Lcom/google/android/gms/common/images/ImageManager;

    :cond_0
    sget-object v0, Lcom/google/android/gms/common/images/ImageManager;->d:Lcom/google/android/gms/common/images/ImageManager;

    :goto_0
    return-object v0

    :cond_1
    sget-object v0, Lcom/google/android/gms/common/images/ImageManager;->c:Lcom/google/android/gms/common/images/ImageManager;

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/gms/common/images/ImageManager;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/common/images/ImageManager;-><init>(Landroid/content/Context;Z)V

    sput-object v0, Lcom/google/android/gms/common/images/ImageManager;->c:Lcom/google/android/gms/common/images/ImageManager;

    :cond_2
    sget-object v0, Lcom/google/android/gms/common/images/ImageManager;->c:Lcom/google/android/gms/common/images/ImageManager;

    goto :goto_0
.end method

.method static synthetic a()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/google/android/gms/common/images/ImageManager;->a:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/common/images/ImageManager;)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager;->j:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/common/images/ImageManager;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager;->e:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b()Ljava/util/HashSet;
    .locals 1

    sget-object v0, Lcom/google/android/gms/common/images/ImageManager;->b:Ljava/util/HashSet;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/common/images/ImageManager;)Lcom/google/android/gms/internal/zzrv;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager;->i:Lcom/google/android/gms/internal/zzrv;

    return-object v0
.end method

.method private c()V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager;->e:Landroid/content/Context;

    new-instance v1, Lcom/google/android/gms/common/images/ImageManager$f;

    iget-object v2, p0, Lcom/google/android/gms/common/images/ImageManager;->h:Lcom/google/android/gms/common/images/ImageManager$c;

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/images/ImageManager$f;-><init>(Lcom/google/android/gms/common/images/ImageManager$c;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    return-void
.end method

.method static synthetic d(Lcom/google/android/gms/common/images/ImageManager;)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager;->l:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic e(Lcom/google/android/gms/common/images/ImageManager;)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager;->k:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic f(Lcom/google/android/gms/common/images/ImageManager;)Ljava/util/concurrent/ExecutorService;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager;->g:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method static synthetic g(Lcom/google/android/gms/common/images/ImageManager;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager;->f:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic h(Lcom/google/android/gms/common/images/ImageManager;)Lcom/google/android/gms/common/images/ImageManager$c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager;->h:Lcom/google/android/gms/common/images/ImageManager$c;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/widget/ImageView;I)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/common/images/b$b;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/common/images/b$b;-><init>(Landroid/widget/ImageView;I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/images/ImageManager;->a(Lcom/google/android/gms/common/images/b;)V

    return-void
.end method

.method public a(Landroid/widget/ImageView;Landroid/net/Uri;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/common/images/b$b;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/common/images/b$b;-><init>(Landroid/widget/ImageView;Landroid/net/Uri;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/images/ImageManager;->a(Lcom/google/android/gms/common/images/b;)V

    return-void
.end method

.method public a(Landroid/widget/ImageView;Landroid/net/Uri;I)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/common/images/b$b;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/common/images/b$b;-><init>(Landroid/widget/ImageView;Landroid/net/Uri;)V

    invoke-virtual {v0, p3}, Lcom/google/android/gms/common/images/b;->a(I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/images/ImageManager;->a(Lcom/google/android/gms/common/images/b;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/common/images/ImageManager$a;Landroid/net/Uri;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/common/images/b$c;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/common/images/b$c;-><init>(Lcom/google/android/gms/common/images/ImageManager$a;Landroid/net/Uri;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/images/ImageManager;->a(Lcom/google/android/gms/common/images/b;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/common/images/ImageManager$a;Landroid/net/Uri;I)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/common/images/b$c;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/common/images/b$c;-><init>(Lcom/google/android/gms/common/images/ImageManager$a;Landroid/net/Uri;)V

    invoke-virtual {v0, p3}, Lcom/google/android/gms/common/images/b;->a(I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/images/ImageManager;->a(Lcom/google/android/gms/common/images/b;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/common/images/b;)V
    .locals 1

    const-string v0, "ImageManager.loadImage() must be called in the main thread"

    invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->a(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/common/images/ImageManager$e;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/common/images/ImageManager$e;-><init>(Lcom/google/android/gms/common/images/ImageManager;Lcom/google/android/gms/common/images/b;)V

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

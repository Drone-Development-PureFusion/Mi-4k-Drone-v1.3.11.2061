.class public Lcom/google/android/gms/wearable/internal/as;
.super Lcom/google/android/gms/wearable/internal/x$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/wearable/internal/x$a;"
    }
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/internal/ail;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/google/android/gms/internal/ail;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/google/android/gms/internal/ail;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/wearable/e$b;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lcom/google/android/gms/internal/ail;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/wearable/m$b;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lcom/google/android/gms/internal/ail;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/wearable/p$c;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lcom/google/android/gms/internal/ail;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lcom/google/android/gms/internal/ail;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/wearable/c$a;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lcom/google/android/gms/internal/ail;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/wearable/a$c;",
            ">;"
        }
    .end annotation
.end field

.field private final i:[Landroid/content/IntentFilter;

.field private final j:Ljava/lang/String;


# direct methods
.method private constructor <init>([Landroid/content/IntentFilter;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/wearable/internal/x$a;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/content/IntentFilter;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/as;->i:[Landroid/content/IntentFilter;

    iput-object p2, p0, Lcom/google/android/gms/wearable/internal/as;->j:Ljava/lang/String;

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/ail;Ljava/lang/String;[Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/as;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/wearable/c$a;",
            ">;",
            "Ljava/lang/String;",
            "[",
            "Landroid/content/IntentFilter;",
            ")",
            "Lcom/google/android/gms/wearable/internal/as",
            "<",
            "Lcom/google/android/gms/wearable/c$a;",
            ">;"
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/wearable/internal/as;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v1, p2, v0}, Lcom/google/android/gms/wearable/internal/as;-><init>([Landroid/content/IntentFilter;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ail;

    iput-object v0, v1, Lcom/google/android/gms/wearable/internal/as;->g:Lcom/google/android/gms/internal/ail;

    return-object v1
.end method

.method public static a(Lcom/google/android/gms/internal/ail;[Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/as;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/wearable/e$b;",
            ">;[",
            "Landroid/content/IntentFilter;",
            ")",
            "Lcom/google/android/gms/wearable/internal/as",
            "<",
            "Lcom/google/android/gms/wearable/e$b;",
            ">;"
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/wearable/internal/as;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/wearable/internal/as;-><init>([Landroid/content/IntentFilter;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ail;

    iput-object v0, v1, Lcom/google/android/gms/wearable/internal/as;->c:Lcom/google/android/gms/internal/ail;

    return-object v1
.end method

.method private static a(Lcom/google/android/gms/internal/ail;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ail",
            "<*>;)V"
        }
    .end annotation

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ail;->a()V

    :cond_0
    return-void
.end method

.method private static b(Lcom/google/android/gms/common/data/DataHolder;)Lcom/google/android/gms/internal/ail$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/data/DataHolder;",
            ")",
            "Lcom/google/android/gms/internal/ail$c",
            "<",
            "Lcom/google/android/gms/wearable/e$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/wearable/internal/as$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/wearable/internal/as$1;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    return-object v0
.end method

.method private static b(Lcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;)Lcom/google/android/gms/internal/ail$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;",
            ")",
            "Lcom/google/android/gms/internal/ail$c",
            "<",
            "Lcom/google/android/gms/wearable/a$c;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/wearable/internal/as$6;

    invoke-direct {v0, p0}, Lcom/google/android/gms/wearable/internal/as$6;-><init>(Lcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;)V

    return-object v0
.end method

.method private static b(Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;)Lcom/google/android/gms/internal/ail$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;",
            ")",
            "Lcom/google/android/gms/internal/ail$c",
            "<",
            "Lcom/google/android/gms/wearable/c$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/wearable/internal/as$5;

    invoke-direct {v0, p0}, Lcom/google/android/gms/wearable/internal/as$5;-><init>(Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;)V

    return-object v0
.end method

.method private static b(Lcom/google/android/gms/wearable/internal/MessageEventParcelable;)Lcom/google/android/gms/internal/ail$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/internal/MessageEventParcelable;",
            ")",
            "Lcom/google/android/gms/internal/ail$c",
            "<",
            "Lcom/google/android/gms/wearable/m$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/wearable/internal/as$2;

    invoke-direct {v0, p0}, Lcom/google/android/gms/wearable/internal/as$2;-><init>(Lcom/google/android/gms/wearable/internal/MessageEventParcelable;)V

    return-object v0
.end method

.method public static b(Lcom/google/android/gms/internal/ail;[Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/as;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/wearable/m$b;",
            ">;[",
            "Landroid/content/IntentFilter;",
            ")",
            "Lcom/google/android/gms/wearable/internal/as",
            "<",
            "Lcom/google/android/gms/wearable/m$b;",
            ">;"
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/wearable/internal/as;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/wearable/internal/as;-><init>([Landroid/content/IntentFilter;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ail;

    iput-object v0, v1, Lcom/google/android/gms/wearable/internal/as;->d:Lcom/google/android/gms/internal/ail;

    return-object v1
.end method

.method private static c(Lcom/google/android/gms/wearable/internal/NodeParcelable;)Lcom/google/android/gms/internal/ail$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/internal/NodeParcelable;",
            ")",
            "Lcom/google/android/gms/internal/ail$c",
            "<",
            "Lcom/google/android/gms/wearable/p$c;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/wearable/internal/as$3;

    invoke-direct {v0, p0}, Lcom/google/android/gms/wearable/internal/as$3;-><init>(Lcom/google/android/gms/wearable/internal/NodeParcelable;)V

    return-object v0
.end method

.method public static c(Lcom/google/android/gms/internal/ail;[Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/as;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/wearable/p$c;",
            ">;[",
            "Landroid/content/IntentFilter;",
            ")",
            "Lcom/google/android/gms/wearable/internal/as",
            "<",
            "Lcom/google/android/gms/wearable/p$c;",
            ">;"
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/wearable/internal/as;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/wearable/internal/as;-><init>([Landroid/content/IntentFilter;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ail;

    iput-object v0, v1, Lcom/google/android/gms/wearable/internal/as;->e:Lcom/google/android/gms/internal/ail;

    return-object v1
.end method

.method private static d(Lcom/google/android/gms/wearable/internal/NodeParcelable;)Lcom/google/android/gms/internal/ail$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/internal/NodeParcelable;",
            ")",
            "Lcom/google/android/gms/internal/ail$c",
            "<",
            "Lcom/google/android/gms/wearable/p$c;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/wearable/internal/as$4;

    invoke-direct {v0, p0}, Lcom/google/android/gms/wearable/internal/as$4;-><init>(Lcom/google/android/gms/wearable/internal/NodeParcelable;)V

    return-object v0
.end method

.method public static d(Lcom/google/android/gms/internal/ail;[Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/as;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/wearable/c$a;",
            ">;[",
            "Landroid/content/IntentFilter;",
            ")",
            "Lcom/google/android/gms/wearable/internal/as",
            "<",
            "Lcom/google/android/gms/wearable/c$a;",
            ">;"
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/wearable/internal/as;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/wearable/internal/as;-><init>([Landroid/content/IntentFilter;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ail;

    iput-object v0, v1, Lcom/google/android/gms/wearable/internal/as;->g:Lcom/google/android/gms/internal/ail;

    return-object v1
.end method

.method public static e(Lcom/google/android/gms/internal/ail;[Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/as;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/wearable/a$c;",
            ">;[",
            "Landroid/content/IntentFilter;",
            ")",
            "Lcom/google/android/gms/wearable/internal/as",
            "<",
            "Lcom/google/android/gms/wearable/a$c;",
            ">;"
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/wearable/internal/as;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/wearable/internal/as;-><init>([Landroid/content/IntentFilter;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ail;

    iput-object v0, v1, Lcom/google/android/gms/wearable/internal/as;->h:Lcom/google/android/gms/internal/ail;

    return-object v1
.end method


# virtual methods
.method public a()V
    .locals 2

    const/4 v1, 0x0

    invoke-static {v1}, Lcom/google/android/gms/wearable/internal/as;->a(Lcom/google/android/gms/internal/ail;)V

    iput-object v1, p0, Lcom/google/android/gms/wearable/internal/as;->a:Lcom/google/android/gms/internal/ail;

    invoke-static {v1}, Lcom/google/android/gms/wearable/internal/as;->a(Lcom/google/android/gms/internal/ail;)V

    iput-object v1, p0, Lcom/google/android/gms/wearable/internal/as;->b:Lcom/google/android/gms/internal/ail;

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/as;->c:Lcom/google/android/gms/internal/ail;

    invoke-static {v0}, Lcom/google/android/gms/wearable/internal/as;->a(Lcom/google/android/gms/internal/ail;)V

    iput-object v1, p0, Lcom/google/android/gms/wearable/internal/as;->c:Lcom/google/android/gms/internal/ail;

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/as;->d:Lcom/google/android/gms/internal/ail;

    invoke-static {v0}, Lcom/google/android/gms/wearable/internal/as;->a(Lcom/google/android/gms/internal/ail;)V

    iput-object v1, p0, Lcom/google/android/gms/wearable/internal/as;->d:Lcom/google/android/gms/internal/ail;

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/as;->e:Lcom/google/android/gms/internal/ail;

    invoke-static {v0}, Lcom/google/android/gms/wearable/internal/as;->a(Lcom/google/android/gms/internal/ail;)V

    iput-object v1, p0, Lcom/google/android/gms/wearable/internal/as;->e:Lcom/google/android/gms/internal/ail;

    invoke-static {v1}, Lcom/google/android/gms/wearable/internal/as;->a(Lcom/google/android/gms/internal/ail;)V

    iput-object v1, p0, Lcom/google/android/gms/wearable/internal/as;->f:Lcom/google/android/gms/internal/ail;

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/as;->g:Lcom/google/android/gms/internal/ail;

    invoke-static {v0}, Lcom/google/android/gms/wearable/internal/as;->a(Lcom/google/android/gms/internal/ail;)V

    iput-object v1, p0, Lcom/google/android/gms/wearable/internal/as;->g:Lcom/google/android/gms/internal/ail;

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/as;->h:Lcom/google/android/gms/internal/ail;

    invoke-static {v0}, Lcom/google/android/gms/wearable/internal/as;->a(Lcom/google/android/gms/internal/ail;)V

    iput-object v1, p0, Lcom/google/android/gms/wearable/internal/as;->h:Lcom/google/android/gms/internal/ail;

    return-void
.end method

.method public a(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/as;->c:Lcom/google/android/gms/internal/ail;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/as;->c:Lcom/google/android/gms/internal/ail;

    invoke-static {p1}, Lcom/google/android/gms/wearable/internal/as;->b(Lcom/google/android/gms/common/data/DataHolder;)Lcom/google/android/gms/internal/ail$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->close()V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;)V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/wearable/internal/AncsNotificationParcelable;)V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/as;->h:Lcom/google/android/gms/internal/ail;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/as;->h:Lcom/google/android/gms/internal/ail;

    invoke-static {p1}, Lcom/google/android/gms/wearable/internal/as;->b(Lcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;)Lcom/google/android/gms/internal/ail$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/as;->g:Lcom/google/android/gms/internal/ail;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/as;->g:Lcom/google/android/gms/internal/ail;

    invoke-static {p1}, Lcom/google/android/gms/wearable/internal/as;->b(Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;)Lcom/google/android/gms/internal/ail$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/wearable/internal/MessageEventParcelable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/as;->d:Lcom/google/android/gms/internal/ail;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/as;->d:Lcom/google/android/gms/internal/ail;

    invoke-static {p1}, Lcom/google/android/gms/wearable/internal/as;->b(Lcom/google/android/gms/wearable/internal/MessageEventParcelable;)Lcom/google/android/gms/internal/ail$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/wearable/internal/NodeParcelable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/as;->e:Lcom/google/android/gms/internal/ail;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/as;->e:Lcom/google/android/gms/internal/ail;

    invoke-static {p1}, Lcom/google/android/gms/wearable/internal/as;->c(Lcom/google/android/gms/wearable/internal/NodeParcelable;)Lcom/google/android/gms/internal/ail$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    :cond_0
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/wearable/internal/NodeParcelable;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public b(Lcom/google/android/gms/wearable/internal/NodeParcelable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/as;->e:Lcom/google/android/gms/internal/ail;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/as;->e:Lcom/google/android/gms/internal/ail;

    invoke-static {p1}, Lcom/google/android/gms/wearable/internal/as;->d(Lcom/google/android/gms/wearable/internal/NodeParcelable;)Lcom/google/android/gms/internal/ail$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    :cond_0
    return-void
.end method

.method public b()[Landroid/content/IntentFilter;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/as;->i:[Landroid/content/IntentFilter;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/as;->j:Ljava/lang/String;

    return-object v0
.end method

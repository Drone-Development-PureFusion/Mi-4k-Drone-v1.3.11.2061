.class public Lcom/google/android/gms/tagmanager/h;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/aa;


# static fields
.field private static a:Lcom/google/android/gms/tagmanager/h;

.field private static final b:Ljava/lang/Object;


# instance fields
.field private c:Lcom/google/android/gms/tagmanager/bu;

.field private d:Lcom/google/android/gms/tagmanager/ab;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/tagmanager/h;->b:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-static {p1}, Lcom/google/android/gms/tagmanager/ac;->a(Landroid/content/Context;)Lcom/google/android/gms/tagmanager/ac;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/tagmanager/ck;

    invoke-direct {v1}, Lcom/google/android/gms/tagmanager/ck;-><init>()V

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/tagmanager/h;-><init>(Lcom/google/android/gms/tagmanager/ab;Lcom/google/android/gms/tagmanager/bu;)V

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/tagmanager/ab;Lcom/google/android/gms/tagmanager/bu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/h;->d:Lcom/google/android/gms/tagmanager/ab;

    iput-object p2, p0, Lcom/google/android/gms/tagmanager/h;->c:Lcom/google/android/gms/tagmanager/bu;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/google/android/gms/tagmanager/aa;
    .locals 2

    sget-object v1, Lcom/google/android/gms/tagmanager/h;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/tagmanager/h;->a:Lcom/google/android/gms/tagmanager/h;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/tagmanager/h;

    invoke-direct {v0, p0}, Lcom/google/android/gms/tagmanager/h;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/google/android/gms/tagmanager/h;->a:Lcom/google/android/gms/tagmanager/h;

    :cond_0
    sget-object v0, Lcom/google/android/gms/tagmanager/h;->a:Lcom/google/android/gms/tagmanager/h;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/h;->c:Lcom/google/android/gms/tagmanager/bu;

    invoke-interface {v0}, Lcom/google/android/gms/tagmanager/bu;->a()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Too many urls sent too quickly with the TagManagerSender, rate limiting invoked."

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/aw;->b(Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/h;->d:Lcom/google/android/gms/tagmanager/ab;

    invoke-interface {v0, p1}, Lcom/google/android/gms/tagmanager/ab;->a(Ljava/lang/String;)V

    const/4 v0, 0x1

    goto :goto_0
.end method

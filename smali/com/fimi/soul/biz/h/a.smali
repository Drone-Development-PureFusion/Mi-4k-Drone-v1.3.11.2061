.class public Lcom/fimi/soul/biz/h/a;
.super Ljava/lang/Object;


# static fields
.field private static b:Lcom/fimi/soul/biz/h/a;


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/fimi/soul/biz/h/a;
    .locals 2

    sget-object v0, Lcom/fimi/soul/biz/h/a;->b:Lcom/fimi/soul/biz/h/a;

    if-nez v0, :cond_1

    const-class v1, Lcom/fimi/soul/biz/h/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/fimi/soul/biz/h/a;->b:Lcom/fimi/soul/biz/h/a;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/soul/biz/h/a;

    invoke-direct {v0}, Lcom/fimi/soul/biz/h/a;-><init>()V

    sput-object v0, Lcom/fimi/soul/biz/h/a;->b:Lcom/fimi/soul/biz/h/a;

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sget-object v0, Lcom/fimi/soul/biz/h/a;->b:Lcom/fimi/soul/biz/h/a;

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method public a(Lcom/fimi/soul/drone/i/ab;)V
    .locals 1

    if-eqz p1, :cond_0

    new-instance v0, Lcom/fimi/soul/biz/h/a$1;

    invoke-direct {v0, p0, p1}, Lcom/fimi/soul/biz/h/a$1;-><init>(Lcom/fimi/soul/biz/h/a;Lcom/fimi/soul/drone/i/ab;)V

    invoke-static {v0}, Lcom/fimi/kernel/utils/x;->b(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/h/a;->a:Ljava/lang/String;

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/h/a;->a:Ljava/lang/String;

    return-object v0
.end method

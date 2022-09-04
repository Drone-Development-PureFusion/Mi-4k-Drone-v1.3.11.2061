.class public Lcom/fimi/soul/biz/k/e;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/biz/k/e$a;
    }
.end annotation


# static fields
.field public static a:Lcom/fimi/soul/biz/k/e;

.field private static d:Lcom/fimi/soul/biz/k/e$a;


# instance fields
.field private b:D

.field private c:D


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/fimi/soul/biz/k/e$a;->a:Lcom/fimi/soul/biz/k/e$a;

    sput-object v0, Lcom/fimi/soul/biz/k/e;->d:Lcom/fimi/soul/biz/k/e$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/fimi/soul/biz/k/e;
    .locals 2

    sget-object v0, Lcom/fimi/soul/biz/k/e;->a:Lcom/fimi/soul/biz/k/e;

    if-nez v0, :cond_1

    const-class v1, Lcom/fimi/soul/biz/k/e;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/fimi/soul/biz/k/e;->a:Lcom/fimi/soul/biz/k/e;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/soul/biz/k/e;

    invoke-direct {v0}, Lcom/fimi/soul/biz/k/e;-><init>()V

    sput-object v0, Lcom/fimi/soul/biz/k/e;->a:Lcom/fimi/soul/biz/k/e;

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sget-object v0, Lcom/fimi/soul/biz/k/e;->a:Lcom/fimi/soul/biz/k/e;

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
.method public a(D)V
    .locals 1

    iput-wide p1, p0, Lcom/fimi/soul/biz/k/e;->b:D

    return-void
.end method

.method public a(Lcom/fimi/soul/biz/k/e$a;)V
    .locals 0

    sput-object p1, Lcom/fimi/soul/biz/k/e;->d:Lcom/fimi/soul/biz/k/e$a;

    return-void
.end method

.method public b()Lcom/fimi/soul/biz/k/e$a;
    .locals 1

    sget-object v0, Lcom/fimi/soul/biz/k/e;->d:Lcom/fimi/soul/biz/k/e$a;

    return-object v0
.end method

.method public b(D)V
    .locals 1

    iput-wide p1, p0, Lcom/fimi/soul/biz/k/e;->c:D

    return-void
.end method

.method public c()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/biz/k/e;->b:D

    return-wide v0
.end method

.method public d()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/biz/k/e;->c:D

    return-wide v0
.end method

.class public Lcom/xiaomi/mistatistic/sdk/controller/t;
.super Ljava/lang/Object;


# static fields
.field private static b:Z


# instance fields
.field private a:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-boolean v0, Lcom/xiaomi/mistatistic/sdk/controller/t;->b:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/xiaomi/mistatistic/sdk/controller/t;J)J
    .locals 1

    iput-wide p1, p0, Lcom/xiaomi/mistatistic/sdk/controller/t;->a:J

    return-wide p1
.end method

.method static synthetic a(Lcom/xiaomi/mistatistic/sdk/controller/t;)V
    .locals 0

    invoke-direct {p0}, Lcom/xiaomi/mistatistic/sdk/controller/t;->d()V

    return-void
.end method

.method static synthetic a(Lcom/xiaomi/mistatistic/sdk/controller/t;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/xiaomi/mistatistic/sdk/controller/t;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/b;->b()Lcom/xiaomi/mistatistic/sdk/controller/b;

    move-result-object v0

    new-instance v1, Lcom/xiaomi/mistatistic/sdk/controller/a/d;

    new-instance v2, Lcom/xiaomi/mistatistic/sdk/controller/v;

    invoke-direct {v2, p0}, Lcom/xiaomi/mistatistic/sdk/controller/v;-><init>(Lcom/xiaomi/mistatistic/sdk/controller/t;)V

    invoke-direct {v1, p1, v2}, Lcom/xiaomi/mistatistic/sdk/controller/a/d;-><init>(Ljava/lang/String;Lcom/xiaomi/mistatistic/sdk/controller/a/e;)V

    invoke-virtual {v0, v1}, Lcom/xiaomi/mistatistic/sdk/controller/b;->a(Lcom/xiaomi/mistatistic/sdk/controller/e;)V

    return-void
.end method

.method static synthetic a(Z)Z
    .locals 0

    sput-boolean p0, Lcom/xiaomi/mistatistic/sdk/controller/t;->b:Z

    return p0
.end method

.method static synthetic b(Lcom/xiaomi/mistatistic/sdk/controller/t;)J
    .locals 2

    iget-wide v0, p0, Lcom/xiaomi/mistatistic/sdk/controller/t;->a:J

    return-wide v0
.end method

.method public static b()Z
    .locals 1

    sget-boolean v0, Lcom/xiaomi/mistatistic/sdk/controller/t;->b:Z

    return v0
.end method

.method private c()V
    .locals 5

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/b;->a()Lcom/xiaomi/mistatistic/sdk/controller/b;

    move-result-object v0

    new-instance v1, Lcom/xiaomi/mistatistic/sdk/controller/a/b;

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/ab;->a()Lcom/xiaomi/mistatistic/sdk/controller/ab;

    move-result-object v2

    invoke-virtual {v2}, Lcom/xiaomi/mistatistic/sdk/controller/ab;->e()J

    move-result-wide v2

    new-instance v4, Lcom/xiaomi/mistatistic/sdk/controller/u;

    invoke-direct {v4, p0}, Lcom/xiaomi/mistatistic/sdk/controller/u;-><init>(Lcom/xiaomi/mistatistic/sdk/controller/t;)V

    invoke-direct {v1, v2, v3, v4}, Lcom/xiaomi/mistatistic/sdk/controller/a/b;-><init>(JLcom/xiaomi/mistatistic/sdk/controller/a/c;)V

    invoke-virtual {v0, v1}, Lcom/xiaomi/mistatistic/sdk/controller/b;->a(Lcom/xiaomi/mistatistic/sdk/controller/e;)V

    return-void
.end method

.method private d()V
    .locals 2

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/b;->a()Lcom/xiaomi/mistatistic/sdk/controller/b;

    move-result-object v0

    new-instance v1, Lcom/xiaomi/mistatistic/sdk/controller/w;

    invoke-direct {v1, p0}, Lcom/xiaomi/mistatistic/sdk/controller/w;-><init>(Lcom/xiaomi/mistatistic/sdk/controller/t;)V

    invoke-virtual {v0, v1}, Lcom/xiaomi/mistatistic/sdk/controller/b;->a(Lcom/xiaomi/mistatistic/sdk/controller/e;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, Lcom/xiaomi/mistatistic/sdk/controller/t;->b:Z

    invoke-direct {p0}, Lcom/xiaomi/mistatistic/sdk/controller/t;->c()V

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/ab;->a()Lcom/xiaomi/mistatistic/sdk/controller/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xiaomi/mistatistic/sdk/controller/ab;->c()V

    return-void
.end method

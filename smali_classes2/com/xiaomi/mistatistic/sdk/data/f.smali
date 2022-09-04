.class public Lcom/xiaomi/mistatistic/sdk/data/f;
.super Lcom/xiaomi/mistatistic/sdk/data/a;


# instance fields
.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/xiaomi/mistatistic/sdk/data/a;-><init>()V

    iput-object p1, p0, Lcom/xiaomi/mistatistic/sdk/data/f;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lcom/xiaomi/mistatistic/sdk/data/h;
    .locals 4

    new-instance v0, Lcom/xiaomi/mistatistic/sdk/data/h;

    invoke-direct {v0}, Lcom/xiaomi/mistatistic/sdk/data/h;-><init>()V

    invoke-virtual {p0}, Lcom/xiaomi/mistatistic/sdk/data/f;->b()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/xiaomi/mistatistic/sdk/data/h;->a:Ljava/lang/String;

    iget-wide v2, p0, Lcom/xiaomi/mistatistic/sdk/data/f;->a:J

    iput-wide v2, v0, Lcom/xiaomi/mistatistic/sdk/data/h;->b:J

    iget-object v1, p0, Lcom/xiaomi/mistatistic/sdk/data/f;->b:Ljava/lang/String;

    iput-object v1, v0, Lcom/xiaomi/mistatistic/sdk/data/h;->e:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    const-string v0, "mistat_pv"

    return-object v0
.end method

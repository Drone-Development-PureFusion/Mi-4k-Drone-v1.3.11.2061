.class public Lcom/xiaomi/mistatistic/sdk/data/g;
.super Lcom/xiaomi/mistatistic/sdk/data/a;


# instance fields
.field private b:J

.field private c:J

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>(JJLjava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lcom/xiaomi/mistatistic/sdk/data/a;-><init>()V

    iput-wide p1, p0, Lcom/xiaomi/mistatistic/sdk/data/g;->b:J

    iput-wide p3, p0, Lcom/xiaomi/mistatistic/sdk/data/g;->c:J

    iput-object p5, p0, Lcom/xiaomi/mistatistic/sdk/data/g;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lcom/xiaomi/mistatistic/sdk/data/h;
    .locals 4

    new-instance v0, Lcom/xiaomi/mistatistic/sdk/data/h;

    invoke-direct {v0}, Lcom/xiaomi/mistatistic/sdk/data/h;-><init>()V

    invoke-virtual {p0}, Lcom/xiaomi/mistatistic/sdk/data/g;->b()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/xiaomi/mistatistic/sdk/data/h;->a:Ljava/lang/String;

    iget-wide v2, p0, Lcom/xiaomi/mistatistic/sdk/data/g;->a:J

    iput-wide v2, v0, Lcom/xiaomi/mistatistic/sdk/data/h;->b:J

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v2, p0, Lcom/xiaomi/mistatistic/sdk/data/g;->b:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lcom/xiaomi/mistatistic/sdk/data/g;->c:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/xiaomi/mistatistic/sdk/data/h;->e:Ljava/lang/String;

    iget-object v1, p0, Lcom/xiaomi/mistatistic/sdk/data/g;->d:Ljava/lang/String;

    iput-object v1, v0, Lcom/xiaomi/mistatistic/sdk/data/h;->f:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    const-string v0, "mistat_session"

    return-object v0
.end method

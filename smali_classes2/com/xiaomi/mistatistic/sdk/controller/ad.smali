.class Lcom/xiaomi/mistatistic/sdk/controller/ad;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/xiaomi/mistatistic/sdk/controller/e;


# instance fields
.field final synthetic a:I

.field final synthetic b:J

.field final synthetic c:Lcom/xiaomi/mistatistic/sdk/controller/ab;


# direct methods
.method constructor <init>(Lcom/xiaomi/mistatistic/sdk/controller/ab;IJ)V
    .locals 1

    iput-object p1, p0, Lcom/xiaomi/mistatistic/sdk/controller/ad;->c:Lcom/xiaomi/mistatistic/sdk/controller/ab;

    iput p2, p0, Lcom/xiaomi/mistatistic/sdk/controller/ad;->a:I

    iput-wide p3, p0, Lcom/xiaomi/mistatistic/sdk/controller/ad;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    const/4 v4, 0x4

    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/controller/ad;->c:Lcom/xiaomi/mistatistic/sdk/controller/ab;

    iget v1, p0, Lcom/xiaomi/mistatistic/sdk/controller/ad;->a:I

    invoke-static {v0, v1}, Lcom/xiaomi/mistatistic/sdk/controller/ab;->a(Lcom/xiaomi/mistatistic/sdk/controller/ab;I)I

    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/controller/ad;->c:Lcom/xiaomi/mistatistic/sdk/controller/ab;

    invoke-static {v0}, Lcom/xiaomi/mistatistic/sdk/controller/ab;->a(Lcom/xiaomi/mistatistic/sdk/controller/ab;)I

    move-result v0

    if-ne v0, v4, :cond_1

    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/controller/ad;->c:Lcom/xiaomi/mistatistic/sdk/controller/ab;

    iget-wide v2, p0, Lcom/xiaomi/mistatistic/sdk/controller/ad;->b:J

    invoke-static {v0, v2, v3}, Lcom/xiaomi/mistatistic/sdk/controller/ab;->a(Lcom/xiaomi/mistatistic/sdk/controller/ab;J)J

    :goto_0
    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/a;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "upload_policy"

    iget-object v2, p0, Lcom/xiaomi/mistatistic/sdk/controller/ad;->c:Lcom/xiaomi/mistatistic/sdk/controller/ab;

    invoke-static {v2}, Lcom/xiaomi/mistatistic/sdk/controller/ab;->a(Lcom/xiaomi/mistatistic/sdk/controller/ab;)I

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/xiaomi/mistatistic/sdk/controller/s;->b(Landroid/content/Context;Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/controller/ad;->c:Lcom/xiaomi/mistatistic/sdk/controller/ab;

    invoke-static {v0}, Lcom/xiaomi/mistatistic/sdk/controller/ab;->a(Lcom/xiaomi/mistatistic/sdk/controller/ab;)I

    move-result v0

    if-ne v0, v4, :cond_0

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/a;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "upload_interval"

    iget-object v2, p0, Lcom/xiaomi/mistatistic/sdk/controller/ad;->c:Lcom/xiaomi/mistatistic/sdk/controller/ab;

    invoke-static {v2}, Lcom/xiaomi/mistatistic/sdk/controller/ab;->b(Lcom/xiaomi/mistatistic/sdk/controller/ab;)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/xiaomi/mistatistic/sdk/controller/s;->b(Landroid/content/Context;Ljava/lang/String;J)V

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/b;->a()Lcom/xiaomi/mistatistic/sdk/controller/b;

    move-result-object v0

    new-instance v1, Lcom/xiaomi/mistatistic/sdk/controller/ae;

    invoke-direct {v1, p0}, Lcom/xiaomi/mistatistic/sdk/controller/ae;-><init>(Lcom/xiaomi/mistatistic/sdk/controller/ad;)V

    iget-object v2, p0, Lcom/xiaomi/mistatistic/sdk/controller/ad;->c:Lcom/xiaomi/mistatistic/sdk/controller/ab;

    invoke-static {v2}, Lcom/xiaomi/mistatistic/sdk/controller/ab;->b(Lcom/xiaomi/mistatistic/sdk/controller/ab;)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/xiaomi/mistatistic/sdk/controller/b;->a(Lcom/xiaomi/mistatistic/sdk/controller/e;J)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/controller/ad;->c:Lcom/xiaomi/mistatistic/sdk/controller/ab;

    const-wide/16 v2, -0x1

    invoke-static {v0, v2, v3}, Lcom/xiaomi/mistatistic/sdk/controller/ab;->a(Lcom/xiaomi/mistatistic/sdk/controller/ab;J)J

    goto :goto_0
.end method

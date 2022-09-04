.class Lcom/xiaomi/mistatistic/sdk/controller/n;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/xiaomi/mistatistic/sdk/controller/e;


# instance fields
.field private a:Lcom/xiaomi/mistatistic/sdk/data/a;


# direct methods
.method public constructor <init>(Lcom/xiaomi/mistatistic/sdk/data/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/xiaomi/mistatistic/sdk/controller/n;->a:Lcom/xiaomi/mistatistic/sdk/data/a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/controller/n;->a:Lcom/xiaomi/mistatistic/sdk/data/a;

    invoke-virtual {v0}, Lcom/xiaomi/mistatistic/sdk/data/a;->a()Lcom/xiaomi/mistatistic/sdk/data/h;

    move-result-object v0

    new-instance v1, Lcom/xiaomi/mistatistic/sdk/controller/i;

    invoke-direct {v1}, Lcom/xiaomi/mistatistic/sdk/controller/i;-><init>()V

    iget-object v2, p0, Lcom/xiaomi/mistatistic/sdk/controller/n;->a:Lcom/xiaomi/mistatistic/sdk/data/a;

    instance-of v2, v2, Lcom/xiaomi/mistatistic/sdk/data/f;

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/xiaomi/mistatistic/sdk/controller/n;->a:Lcom/xiaomi/mistatistic/sdk/data/a;

    instance-of v2, v2, Lcom/xiaomi/mistatistic/sdk/data/g;

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/xiaomi/mistatistic/sdk/controller/n;->a:Lcom/xiaomi/mistatistic/sdk/data/a;

    instance-of v2, v2, Lcom/xiaomi/mistatistic/sdk/data/c;

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/xiaomi/mistatistic/sdk/controller/n;->a:Lcom/xiaomi/mistatistic/sdk/data/a;

    instance-of v2, v2, Lcom/xiaomi/mistatistic/sdk/data/b;

    if-eqz v2, :cond_2

    :cond_0
    invoke-virtual {v1, v0}, Lcom/xiaomi/mistatistic/sdk/controller/i;->a(Lcom/xiaomi/mistatistic/sdk/data/h;)V

    :goto_0
    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/ab;->a()Lcom/xiaomi/mistatistic/sdk/controller/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xiaomi/mistatistic/sdk/controller/ab;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/xiaomi/mistatistic/sdk/controller/t;

    invoke-direct {v0}, Lcom/xiaomi/mistatistic/sdk/controller/t;-><init>()V

    invoke-virtual {v0}, Lcom/xiaomi/mistatistic/sdk/controller/t;->a()V

    :cond_1
    return-void

    :cond_2
    iget-object v2, v0, Lcom/xiaomi/mistatistic/sdk/data/h;->c:Ljava/lang/String;

    iget-object v3, v0, Lcom/xiaomi/mistatistic/sdk/data/h;->a:Ljava/lang/String;

    invoke-virtual {v1, v3, v2}, Lcom/xiaomi/mistatistic/sdk/controller/i;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/xiaomi/mistatistic/sdk/data/h;

    move-result-object v4

    if-eqz v4, :cond_3

    iget-object v5, v0, Lcom/xiaomi/mistatistic/sdk/data/h;->d:Ljava/lang/String;

    iget-object v4, v4, Lcom/xiaomi/mistatistic/sdk/data/h;->d:Ljava/lang/String;

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    :cond_3
    invoke-virtual {v1, v0}, Lcom/xiaomi/mistatistic/sdk/controller/i;->a(Lcom/xiaomi/mistatistic/sdk/data/h;)V

    goto :goto_0

    :cond_4
    iget-object v0, v0, Lcom/xiaomi/mistatistic/sdk/data/h;->e:Ljava/lang/String;

    invoke-virtual {v1, v2, v3, v0}, Lcom/xiaomi/mistatistic/sdk/controller/i;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

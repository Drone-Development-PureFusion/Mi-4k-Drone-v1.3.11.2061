.class final Lcom/xiaomi/push/service/ab;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/xiaomi/push/service/ak$b$a;


# instance fields
.field final synthetic a:Lcom/xiaomi/push/service/XMPushService;


# direct methods
.method constructor <init>(Lcom/xiaomi/push/service/XMPushService;)V
    .locals 0

    iput-object p1, p0, Lcom/xiaomi/push/service/ab;->a:Lcom/xiaomi/push/service/XMPushService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/xiaomi/push/service/ak$c;Lcom/xiaomi/push/service/ak$c;I)V
    .locals 3

    sget-object v0, Lcom/xiaomi/push/service/ak$c;->c:Lcom/xiaomi/push/service/ak$c;

    if-ne p2, v0, :cond_1

    iget-object v0, p0, Lcom/xiaomi/push/service/ab;->a:Lcom/xiaomi/push/service/XMPushService;

    invoke-static {v0}, Lcom/xiaomi/push/service/r;->a(Lcom/xiaomi/push/service/XMPushService;)V

    iget-object v0, p0, Lcom/xiaomi/push/service/ab;->a:Lcom/xiaomi/push/service/XMPushService;

    invoke-static {v0}, Lcom/xiaomi/push/service/r;->b(Lcom/xiaomi/push/service/XMPushService;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    sget-object v0, Lcom/xiaomi/push/service/ak$c;->a:Lcom/xiaomi/push/service/ak$c;

    if-ne p2, v0, :cond_0

    iget-object v0, p0, Lcom/xiaomi/push/service/ab;->a:Lcom/xiaomi/push/service/XMPushService;

    const v1, 0x42c1d81

    const-string v2, " the push is not connected."

    invoke-static {v0, v1, v2}, Lcom/xiaomi/push/service/r;->a(Landroid/content/Context;ILjava/lang/String;)V

    goto :goto_0
.end method

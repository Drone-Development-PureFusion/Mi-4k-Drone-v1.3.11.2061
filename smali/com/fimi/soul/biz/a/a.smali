.class public Lcom/fimi/soul/biz/a/a;
.super Ljava/lang/Object;


# instance fields
.field private a:Lcom/fimi/kernel/b/e/b;

.field private b:Lcom/fimi/soul/entity/UpdateDroneInforBean;

.field private c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/biz/a/a;->a:Lcom/fimi/kernel/b/e/b;

    iput-object p1, p0, Lcom/fimi/soul/biz/a/a;->c:Landroid/content/Context;

    sget-object v0, Lcom/fimi/kernel/b/d;->b:Lcom/fimi/kernel/b/d;

    invoke-static {v0}, Lcom/fimi/kernel/c;->a(Lcom/fimi/kernel/b/d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/kernel/b/e/b;

    iput-object v0, p0, Lcom/fimi/soul/biz/a/a;->a:Lcom/fimi/kernel/b/e/b;

    invoke-static {}, Lcom/fimi/kernel/c;->c()Lcom/fimi/kernel/c/a;

    move-result-object v0

    const-string v1, "flyinfo"

    const-class v2, Lcom/fimi/soul/entity/UpdateDroneInforBean;

    invoke-interface {v0, v1, v2}, Lcom/fimi/kernel/c/a;->a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/UpdateDroneInforBean;

    iput-object v0, p0, Lcom/fimi/soul/biz/a/a;->b:Lcom/fimi/soul/entity/UpdateDroneInforBean;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    iget-object v0, p0, Lcom/fimi/soul/biz/a/a;->b:Lcom/fimi/soul/entity/UpdateDroneInforBean;

    if-eqz v0, :cond_0

    const-string v0, ""

    iget-object v1, p0, Lcom/fimi/soul/biz/a/a;->b:Lcom/fimi/soul/entity/UpdateDroneInforBean;

    invoke-virtual {v1}, Lcom/fimi/soul/entity/UpdateDroneInforBean;->getPlaneID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "commandCode"

    const-string v3, "commitDeviceVersion"

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "userID"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/fimi/soul/biz/a/a;->b:Lcom/fimi/soul/entity/UpdateDroneInforBean;

    invoke-virtual {v4}, Lcom/fimi/soul/entity/UpdateDroneInforBean;->getUserID()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "planeID"

    iget-object v3, p0, Lcom/fimi/soul/biz/a/a;->b:Lcom/fimi/soul/entity/UpdateDroneInforBean;

    invoke-virtual {v3}, Lcom/fimi/soul/entity/UpdateDroneInforBean;->getPlaneID()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lcom/fimi/soul/biz/b/d;->a()Lcom/fimi/soul/biz/b/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/b/d;->k()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "fcType"

    const-string v3, "F11B-C"

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    iget-object v2, p0, Lcom/fimi/soul/biz/a/a;->b:Lcom/fimi/soul/entity/UpdateDroneInforBean;

    invoke-virtual {v2}, Lcom/fimi/soul/entity/UpdateDroneInforBean;->getmDroneInfoBean()Lcom/fimi/soul/entity/DroneInfoBean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    new-instance v2, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "jsonStr"

    iget-object v4, p0, Lcom/fimi/soul/biz/a/a;->b:Lcom/fimi/soul/entity/UpdateDroneInforBean;

    invoke-virtual {v4}, Lcom/fimi/soul/entity/UpdateDroneInforBean;->getmDroneInfoBean()Lcom/fimi/soul/entity/DroneInfoBean;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lcom/fimi/kernel/c;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/fimi/soul/utils/NetUtil;->a(Ljava/util/List;Landroid/content/Context;)V

    const-string v1, "UTF-8"

    invoke-static {v0, v1}, Lorg/apache/http/client/utils/URLEncodedUtils;->format(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "%s?%s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "https://fimiservice-us.mi-ae.com/android/fimi.service"

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/biz/a/a;->a:Lcom/fimi/kernel/b/e/b;

    new-instance v2, Lcom/fimi/soul/biz/a/a$1;

    invoke-direct {v2, p0}, Lcom/fimi/soul/biz/a/a$1;-><init>(Lcom/fimi/soul/biz/a/a;)V

    invoke-virtual {v1, v0, v2}, Lcom/fimi/kernel/b/e/b;->a(Ljava/lang/String;Lcom/fimi/kernel/b/e;)V

    :cond_0
    return-void

    :cond_1
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "fcType"

    const-string v3, "F11B-A"

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

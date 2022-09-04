.class public Lcom/fimi/soul/service/FlyInforService;
.super Landroid/app/Service;


# instance fields
.field private a:Lcom/fimi/soul/entity/DroneInfoBean;

.field private b:Lcom/fimi/kernel/c/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    new-instance v0, Lcom/fimi/soul/entity/DroneInfoBean;

    invoke-direct {v0}, Lcom/fimi/soul/entity/DroneInfoBean;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/service/FlyInforService;->a:Lcom/fimi/soul/entity/DroneInfoBean;

    return-void
.end method

.method private a()V
    .locals 6

    new-instance v1, Lcom/fimi/soul/entity/UpdateDroneInforBean;

    invoke-direct {v1}, Lcom/fimi/soul/entity/UpdateDroneInforBean;-><init>()V

    invoke-static {p0}, Lcom/fimi/soul/base/a;->c(Landroid/content/Context;)Lcom/fimi/soul/entity/User;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/User;->getUserID()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v2, ""

    invoke-virtual {v0}, Lcom/fimi/soul/entity/User;->getUserID()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/User;->getUserID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/fimi/soul/entity/UpdateDroneInforBean;->setUserID(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/service/FlyInforService;->b:Lcom/fimi/kernel/c/c;

    const-string v2, "0"

    const-class v3, Lcom/fimi/soul/drone/f/a;

    invoke-virtual {v0, v2, v3}, Lcom/fimi/kernel/c/c;->a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/drone/f/a;

    if-eqz v0, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/fimi/soul/drone/f/a;->d()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Lcom/fimi/soul/drone/f/a;->e()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Lcom/fimi/soul/drone/f/a;->g()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/entity/UpdateDroneInforBean;->setPlaneID(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/fimi/soul/service/FlyInforService;->a:Lcom/fimi/soul/entity/DroneInfoBean;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/f/a;->c()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/fimi/soul/entity/DroneInfoBean;->setFlySoftVersion(I)V

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/service/FlyInforService;->b:Lcom/fimi/kernel/c/c;

    const-string v2, "1"

    const-class v3, Lcom/fimi/soul/drone/f/a;

    invoke-virtual {v0, v2, v3}, Lcom/fimi/kernel/c/c;->a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/drone/f/a;

    if-eqz v0, :cond_2

    iget-object v2, p0, Lcom/fimi/soul/service/FlyInforService;->a:Lcom/fimi/soul/entity/DroneInfoBean;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/fimi/soul/drone/f/a;->d()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Lcom/fimi/soul/drone/f/a;->e()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Lcom/fimi/soul/drone/f/a;->g()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/fimi/soul/entity/DroneInfoBean;->setRemoteId(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/fimi/soul/service/FlyInforService;->a:Lcom/fimi/soul/entity/DroneInfoBean;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/f/a;->c()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/fimi/soul/entity/DroneInfoBean;->setRemoteSoftVersion(I)V

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/service/FlyInforService;->b:Lcom/fimi/kernel/c/c;

    const-string v2, "3"

    const-class v3, Lcom/fimi/soul/drone/f/a;

    invoke-virtual {v0, v2, v3}, Lcom/fimi/kernel/c/c;->a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/drone/f/a;

    if-eqz v0, :cond_3

    iget-object v2, p0, Lcom/fimi/soul/service/FlyInforService;->a:Lcom/fimi/soul/entity/DroneInfoBean;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/fimi/soul/drone/f/a;->d()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Lcom/fimi/soul/drone/f/a;->e()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Lcom/fimi/soul/drone/f/a;->g()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/fimi/soul/entity/DroneInfoBean;->setCoulidId(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/fimi/soul/service/FlyInforService;->a:Lcom/fimi/soul/entity/DroneInfoBean;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/f/a;->c()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/fimi/soul/entity/DroneInfoBean;->setCloudSoftVersion(I)V

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/service/FlyInforService;->b:Lcom/fimi/kernel/c/c;

    const-string v2, "9"

    const-class v3, Lcom/fimi/soul/drone/f/a;

    invoke-virtual {v0, v2, v3}, Lcom/fimi/kernel/c/c;->a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/drone/f/a;

    if-eqz v0, :cond_4

    iget-object v2, p0, Lcom/fimi/soul/service/FlyInforService;->a:Lcom/fimi/soul/entity/DroneInfoBean;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/f/a;->c()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/fimi/soul/entity/DroneInfoBean;->setLightStreamVersion(I)V

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/service/FlyInforService;->a:Lcom/fimi/soul/entity/DroneInfoBean;

    invoke-virtual {v1, v0}, Lcom/fimi/soul/entity/UpdateDroneInforBean;->setmDroneInfoBean(Lcom/fimi/soul/entity/DroneInfoBean;)V

    iget-object v0, p0, Lcom/fimi/soul/service/FlyInforService;->b:Lcom/fimi/kernel/c/c;

    const-string v2, "flyinfo"

    invoke-virtual {v0, v2, v1}, Lcom/fimi/kernel/c/c;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 5

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    invoke-static {}, Lcom/fimi/kernel/c/c;->a()Lcom/fimi/kernel/c/c;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/service/FlyInforService;->b:Lcom/fimi/kernel/c/c;

    iget-object v0, p0, Lcom/fimi/soul/service/FlyInforService;->a:Lcom/fimi/soul/entity/DroneInfoBean;

    invoke-virtual {p0}, Lcom/fimi/soul/service/FlyInforService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/fimi/soul/utils/au;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/fimi/soul/service/FlyInforService;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/fimi/soul/utils/au;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    const-string v4, ","

    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/DroneInfoBean;->setPhoneDevice(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/service/FlyInforService;->a:Lcom/fimi/soul/entity/DroneInfoBean;

    invoke-virtual {p0}, Lcom/fimi/soul/service/FlyInforService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/fimi/soul/utils/au;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/fimi/soul/service/FlyInforService;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/fimi/soul/utils/au;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/DroneInfoBean;->setTelePhoneId(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/service/FlyInforService;->a:Lcom/fimi/soul/entity/DroneInfoBean;

    invoke-virtual {p0}, Lcom/fimi/soul/service/FlyInforService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/fimi/soul/utils/au;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/DroneInfoBean;->setAppSoftVersion(Ljava/lang/String;)V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 2

    invoke-virtual {p0}, Lcom/fimi/soul/service/FlyInforService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    invoke-virtual {p0}, Lcom/fimi/soul/service/FlyInforService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/utils/au;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/fimi/soul/biz/a/a;

    invoke-virtual {p0}, Lcom/fimi/soul/service/FlyInforService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/fimi/soul/biz/a/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/fimi/soul/biz/a/a;->a()V

    :cond_0
    invoke-direct {p0}, Lcom/fimi/soul/service/FlyInforService;->a()V

    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result v0

    return v0
.end method

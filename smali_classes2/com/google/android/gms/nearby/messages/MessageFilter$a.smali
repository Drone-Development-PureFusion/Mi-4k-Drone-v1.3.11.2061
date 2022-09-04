.class public final Lcom/google/android/gms/nearby/messages/MessageFilter$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/nearby/messages/MessageFilter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/nearby/messages/internal/MessageType;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceFilter;",
            ">;"
        }
    .end annotation
.end field

.field private c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/MessageFilter$a;->a:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/MessageFilter$a;->b:Ljava/util/List;

    return-void
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/nearby/messages/MessageFilter$a;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/MessageFilter$a;->a:Ljava/util/List;

    new-instance v1, Lcom/google/android/gms/nearby/messages/internal/MessageType;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/nearby/messages/internal/MessageType;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/nearby/messages/MessageFilter$a;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/nearby/messages/MessageFilter$a;->c:Z

    return-object p0
.end method

.method public a(Lcom/google/android/gms/nearby/messages/MessageFilter;)Lcom/google/android/gms/nearby/messages/MessageFilter$a;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/MessageFilter$a;->a:Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/android/gms/nearby/messages/MessageFilter;->a()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/MessageFilter$a;->b:Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/android/gms/nearby/messages/MessageFilter;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-boolean v0, p0, Lcom/google/android/gms/nearby/messages/MessageFilter$a;->c:Z

    invoke-virtual {p1}, Lcom/google/android/gms/nearby/messages/MessageFilter;->b()Z

    move-result v1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/google/android/gms/nearby/messages/MessageFilter$a;->c:Z

    return-object p0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/nearby/messages/MessageFilter$a;
    .locals 5

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "*"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "namespace(%s) cannot be null, empty or contain (*)."

    new-array v4, v1, [Ljava/lang/Object;

    aput-object p1, v4, v2

    invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    if-eqz p2, :cond_1

    const-string v0, "*"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    move v0, v1

    :goto_1
    const-string v3, "type(%s) cannot be null or contain (*)."

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p2, v1, v2

    invoke-static {v0, v3, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/nearby/messages/MessageFilter$a;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/nearby/messages/MessageFilter$a;

    move-result-object v0

    return-object v0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1
.end method

.method public a(Ljava/util/UUID;Ljava/lang/Short;Ljava/lang/Short;)Lcom/google/android/gms/nearby/messages/MessageFilter$a;
    .locals 2
    .param p2    # Ljava/lang/Short;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Short;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const-string v0, "__reserved_namespace"

    const-string v1, "__i_beacon_id"

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/nearby/messages/MessageFilter$a;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/nearby/messages/MessageFilter$a;

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/MessageFilter$a;->b:Ljava/util/List;

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceFilter;->a(Ljava/util/UUID;Ljava/lang/Short;Ljava/lang/Short;)Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceFilter;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/nearby/messages/MessageFilter$a;
    .locals 2
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const-string v0, "__reserved_namespace"

    const-string v1, "__eddystone_uid"

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/nearby/messages/MessageFilter$a;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/nearby/messages/MessageFilter$a;

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/MessageFilter$a;->b:Ljava/util/List;

    invoke-static {p1, p2}, Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceFilter;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceFilter;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b()Lcom/google/android/gms/nearby/messages/MessageFilter;
    .locals 5

    iget-boolean v0, p0, Lcom/google/android/gms/nearby/messages/MessageFilter$a;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/MessageFilter$a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    const-string v1, "At least one of the include methods must be called."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    new-instance v0, Lcom/google/android/gms/nearby/messages/MessageFilter;

    iget-object v1, p0, Lcom/google/android/gms/nearby/messages/MessageFilter$a;->a:Ljava/util/List;

    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/MessageFilter$a;->b:Ljava/util/List;

    iget-boolean v3, p0, Lcom/google/android/gms/nearby/messages/MessageFilter$a;->c:Z

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/nearby/messages/MessageFilter;-><init>(Ljava/util/List;Ljava/util/List;ZLcom/google/android/gms/nearby/messages/MessageFilter$1;)V

    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

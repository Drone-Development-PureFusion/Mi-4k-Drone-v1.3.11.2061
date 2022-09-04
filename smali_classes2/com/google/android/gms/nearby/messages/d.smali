.class public Lcom/google/android/gms/nearby/messages/d;
.super Ljava/lang/Object;


# static fields
.field public static final a:I = 0x14


# instance fields
.field private final b:Lcom/google/android/gms/nearby/messages/internal/i;


# direct methods
.method public constructor <init>(Ljava/util/UUID;SS)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/i;

    invoke-static {p2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v2

    invoke-direct {v0, p1, v1, v2}, Lcom/google/android/gms/nearby/messages/internal/i;-><init>(Ljava/util/UUID;Ljava/lang/Short;Ljava/lang/Short;)V

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/d;->b:Lcom/google/android/gms/nearby/messages/internal/i;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/i;

    invoke-static {p1}, Lcom/google/android/gms/nearby/messages/d;->a([B)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/nearby/messages/internal/i;-><init>([B)V

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/d;->b:Lcom/google/android/gms/nearby/messages/internal/i;

    return-void
.end method

.method public static a(Lcom/google/android/gms/nearby/messages/Message;)Lcom/google/android/gms/nearby/messages/d;
    .locals 4

    const-string v0, "__i_beacon_id"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/nearby/messages/Message;->a(Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/gms/nearby/messages/Message;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x37

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Message type \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\' is not Message.MESSAGE_TYPE_I_BEACON_ID"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    new-instance v0, Lcom/google/android/gms/nearby/messages/d;

    invoke-virtual {p0}, Lcom/google/android/gms/nearby/messages/Message;->d()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/nearby/messages/d;-><init>([B)V

    return-object v0
.end method

.method private static a([B)[B
    .locals 2

    array-length v0, p0

    const/16 v1, 0x14

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "iBeacon ID must be a UUID, a major, and a minor (20 total bytes)."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    return-object p0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/d;->b:Lcom/google/android/gms/nearby/messages/internal/i;

    invoke-virtual {v0}, Lcom/google/android/gms/nearby/messages/internal/i;->c()Ljava/util/UUID;

    move-result-object v0

    return-object v0
.end method

.method public b()S
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/d;->b:Lcom/google/android/gms/nearby/messages/internal/i;

    invoke-virtual {v0}, Lcom/google/android/gms/nearby/messages/internal/i;->d()Ljava/lang/Short;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Short;->shortValue()S

    move-result v0

    return v0
.end method

.method public c()S
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/d;->b:Lcom/google/android/gms/nearby/messages/internal/i;

    invoke-virtual {v0}, Lcom/google/android/gms/nearby/messages/internal/i;->e()Ljava/lang/Short;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Short;->shortValue()S

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/nearby/messages/d;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/google/android/gms/nearby/messages/d;

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/d;->b:Lcom/google/android/gms/nearby/messages/internal/i;

    iget-object v1, p1, Lcom/google/android/gms/nearby/messages/d;->b:Lcom/google/android/gms/nearby/messages/internal/i;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/d;->b:Lcom/google/android/gms/nearby/messages/internal/i;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Lcom/google/android/gms/nearby/messages/d;->a()Ljava/util/UUID;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/nearby/messages/d;->b()S

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/gms/nearby/messages/d;->c()S

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x35

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "IBeaconId{proximityUuid="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", major="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", minor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class final Lcom/google/android/gms/wearable/internal/al;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/wearable/c$a;


# instance fields
.field private final e:Ljava/lang/String;

.field private final f:Lcom/google/android/gms/wearable/c$a;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/google/android/gms/wearable/c$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/al;->e:Ljava/lang/String;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/c$a;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/al;->f:Lcom/google/android/gms/wearable/c$a;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/wearable/Channel;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/al;->f:Lcom/google/android/gms/wearable/c$a;

    invoke-interface {v0, p1}, Lcom/google/android/gms/wearable/c$a;->a(Lcom/google/android/gms/wearable/Channel;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/wearable/Channel;II)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/al;->f:Lcom/google/android/gms/wearable/c$a;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/wearable/c$a;->a(Lcom/google/android/gms/wearable/Channel;II)V

    return-void
.end method

.method public b(Lcom/google/android/gms/wearable/Channel;II)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/al;->f:Lcom/google/android/gms/wearable/c$a;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/wearable/c$a;->b(Lcom/google/android/gms/wearable/Channel;II)V

    return-void
.end method

.method public c(Lcom/google/android/gms/wearable/Channel;II)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/al;->f:Lcom/google/android/gms/wearable/c$a;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/wearable/c$a;->c(Lcom/google/android/gms/wearable/Channel;II)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/wearable/internal/al;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/wearable/internal/al;

    iget-object v2, p0, Lcom/google/android/gms/wearable/internal/al;->f:Lcom/google/android/gms/wearable/c$a;

    iget-object v3, p1, Lcom/google/android/gms/wearable/internal/al;->f:Lcom/google/android/gms/wearable/c$a;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/wearable/internal/al;->e:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/wearable/internal/al;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/al;->e:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/wearable/internal/al;->f:Lcom/google/android/gms/wearable/c$a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

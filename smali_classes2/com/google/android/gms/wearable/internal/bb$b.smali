.class Lcom/google/android/gms/wearable/internal/bb$b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/wearable/a$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wearable/internal/bb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field final a:Lcom/google/android/gms/wearable/a$c;

.field final b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/a$c;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/bb$b;->a:Lcom/google/android/gms/wearable/a$c;

    iput-object p2, p0, Lcom/google/android/gms/wearable/internal/bb$b;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/wearable/b;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/bb$b;->a:Lcom/google/android/gms/wearable/a$c;

    invoke-interface {v0, p1}, Lcom/google/android/gms/wearable/a$c;->a(Lcom/google/android/gms/wearable/b;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-ne p0, p1, :cond_1

    const/4 v0, 0x1

    :cond_0
    :goto_0
    return v0

    :cond_1
    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v1, v2, :cond_0

    check-cast p1, Lcom/google/android/gms/wearable/internal/bb$b;

    iget-object v1, p0, Lcom/google/android/gms/wearable/internal/bb$b;->a:Lcom/google/android/gms/wearable/a$c;

    iget-object v2, p1, Lcom/google/android/gms/wearable/internal/bb$b;->a:Lcom/google/android/gms/wearable/a$c;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/bb$b;->b:Ljava/lang/String;

    iget-object v1, p1, Lcom/google/android/gms/wearable/internal/bb$b;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/bb$b;->a:Lcom/google/android/gms/wearable/a$c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/wearable/internal/bb$b;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.class public Lcom/google/android/gms/wearable/internal/bb$e;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/wearable/a$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wearable/internal/bb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/wearable/b;

.field private final b:Lcom/google/android/gms/common/api/Status;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/wearable/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/bb$e;->b:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lcom/google/android/gms/wearable/internal/bb$e;->a:Lcom/google/android/gms/wearable/b;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/bb$e;->b:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public b()Lcom/google/android/gms/wearable/b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/bb$e;->a:Lcom/google/android/gms/wearable/b;

    return-object v0
.end method

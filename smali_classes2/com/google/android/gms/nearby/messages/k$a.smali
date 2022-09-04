.class public Lcom/google/android/gms/nearby/messages/k$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/nearby/messages/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/nearby/messages/Strategy;

.field private b:Lcom/google/android/gms/nearby/messages/j;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/google/android/gms/nearby/messages/Strategy;->i:Lcom/google/android/gms/nearby/messages/Strategy;

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/k$a;->a:Lcom/google/android/gms/nearby/messages/Strategy;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/nearby/messages/Strategy;)Lcom/google/android/gms/nearby/messages/k$a;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/nearby/messages/Strategy;

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/k$a;->a:Lcom/google/android/gms/nearby/messages/Strategy;

    return-object p0
.end method

.method public a(Lcom/google/android/gms/nearby/messages/j;)Lcom/google/android/gms/nearby/messages/k$a;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/nearby/messages/j;

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/k$a;->b:Lcom/google/android/gms/nearby/messages/j;

    return-object p0
.end method

.method public a()Lcom/google/android/gms/nearby/messages/k;
    .locals 4

    new-instance v0, Lcom/google/android/gms/nearby/messages/k;

    iget-object v1, p0, Lcom/google/android/gms/nearby/messages/k$a;->a:Lcom/google/android/gms/nearby/messages/Strategy;

    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/k$a;->b:Lcom/google/android/gms/nearby/messages/j;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/nearby/messages/k;-><init>(Lcom/google/android/gms/nearby/messages/Strategy;Lcom/google/android/gms/nearby/messages/j;Lcom/google/android/gms/nearby/messages/k$1;)V

    return-object v0
.end method

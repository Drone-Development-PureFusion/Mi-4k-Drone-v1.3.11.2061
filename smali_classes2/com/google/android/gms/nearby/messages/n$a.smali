.class public Lcom/google/android/gms/nearby/messages/n$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/nearby/messages/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/nearby/messages/Strategy;

.field private b:Lcom/google/android/gms/nearby/messages/MessageFilter;

.field private c:Lcom/google/android/gms/nearby/messages/m;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/google/android/gms/nearby/messages/Strategy;->i:Lcom/google/android/gms/nearby/messages/Strategy;

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/n$a;->a:Lcom/google/android/gms/nearby/messages/Strategy;

    sget-object v0, Lcom/google/android/gms/nearby/messages/MessageFilter;->a:Lcom/google/android/gms/nearby/messages/MessageFilter;

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/n$a;->b:Lcom/google/android/gms/nearby/messages/MessageFilter;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/nearby/messages/MessageFilter;)Lcom/google/android/gms/nearby/messages/n$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/n$a;->b:Lcom/google/android/gms/nearby/messages/MessageFilter;

    return-object p0
.end method

.method public a(Lcom/google/android/gms/nearby/messages/Strategy;)Lcom/google/android/gms/nearby/messages/n$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/n$a;->a:Lcom/google/android/gms/nearby/messages/Strategy;

    return-object p0
.end method

.method public a(Lcom/google/android/gms/nearby/messages/m;)Lcom/google/android/gms/nearby/messages/n$a;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/nearby/messages/m;

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/n$a;->c:Lcom/google/android/gms/nearby/messages/m;

    return-object p0
.end method

.method public a()Lcom/google/android/gms/nearby/messages/n;
    .locals 6

    new-instance v0, Lcom/google/android/gms/nearby/messages/n;

    iget-object v1, p0, Lcom/google/android/gms/nearby/messages/n$a;->a:Lcom/google/android/gms/nearby/messages/Strategy;

    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/n$a;->b:Lcom/google/android/gms/nearby/messages/MessageFilter;

    iget-object v3, p0, Lcom/google/android/gms/nearby/messages/n$a;->c:Lcom/google/android/gms/nearby/messages/m;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/nearby/messages/n;-><init>(Lcom/google/android/gms/nearby/messages/Strategy;Lcom/google/android/gms/nearby/messages/MessageFilter;Lcom/google/android/gms/nearby/messages/m;ZLcom/google/android/gms/nearby/messages/n$1;)V

    return-object v0
.end method
